package controllers;

import java.util.LinkedList;
import java.util.List;

import javax.inject.Inject;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;

import models.Ingrediente;
import models.Receta;
import models.Tag;
import play.cache.CacheApi;
import play.data.FormFactory;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Results;

public class RecetasController extends Controller {

	//@Inject
	//private FormFactory formFactory;

	@Inject
	private CacheApi cache;

	public Result list() {
		List<Receta> recetas = Receta.findAll();
		if (request().accepts("application/json")) {
			new play.libs.Json();
			ArrayNode array = Json.newArray();
			for (Receta receta : recetas) {
				array.add(receta.toJson());
			}
			return ok(array);
		} else if (request().accepts("application/xml")) {
			return ok(views.xml.recetas.render(recetas));
		} else {
			return Results.status(406);
		}
	}

	public Result create() {
		/*
		 * JsonNode json = request().body().asJson(); Receta rec = new Receta();
		 * rec.setName(json.findPath("name").asText()); /* for (JsonNode
		 * ingrediente : json.withArray("ingredientes")) { Ingrediente ingre =
		 * new Ingrediente(); ingre.setName(ingrediente.get("name").asText());
		 * ingre.save();
		 * 
		 * //ingre.addReceta(rec); rec.addIngredient(ingre); }
		 * 
		 * rec.save();
		 * 
		 * Form<Receta> f = formFactory.form(Receta.class).bindFromRequest(); if
		 * (f.hasErrors()) { return
		 * Results.badRequest(ControllerHelper.errorJson(2, "Datos incorrectos",
		 * f.errorsAsJson())); } Ingrediente ingre = new Ingrediente();
		 * ingre.save(); Receta rec = f.get();
		 */
		JsonNode body = request().body().asJson();
		if (body.isNull()) {
			return Results.badRequest();
		}

		List<Receta> listRecipes = Receta.getByName(body.get("name").asText());
		if (!listRecipes.isEmpty()) {
			return Results.status(CONFLICT);
		}

		Receta recipe = new Receta();
		recipe.setName(body.get("name").asText());

		Ingrediente newIngredient = new Ingrediente();
		ArrayNode array = (ArrayNode) body.get("ingredientes");
		for (JsonNode node1 : array) {
			List<Ingrediente> ingredientList = Ingrediente.getByName(node1.get("name").asText().trim().toLowerCase());
			if (ingredientList.isEmpty()) {
				newIngredient = new Ingrediente();
				newIngredient.setName(node1.get("name").asText().trim().toLowerCase());
				newIngredient.save();

				recipe.addIngredient(newIngredient);
			} else {
				System.out.println("Ingredient ya en la db");
				recipe.addIngredient(ingredientList.get(0));
			}
		}

		ArrayNode arrayTags = (ArrayNode) body.get("tags");
		for (JsonNode node2 : arrayTags) {
			List<Tag> tagsList = Tag.getByName(node2.get("name").asText().trim().toLowerCase());
			if (tagsList.isEmpty()) {
				Tag tag = new Tag();
				tag.setName(node2.get("name").asText().trim().toLowerCase());
				tag.save();
				recipe.addTag(tag);
			} else {
				System.out.println("Ingredient ya en la db");
				recipe.addTag(tagsList.get(0));
			}
		}

		recipe.save();

		if (request().accepts("application/json")) {
			return Results.status(CREATED, recipe.toJson());
		} else if (request().accepts("application/xml")) {
			return ok(views.xml.receta.render(recipe));
		} else {
			return Results.badRequest("Unsupported format");
		}
	}

	public Result retrieve(Long id) {
		Receta receta = Receta.findById(id);
		if (receta != null) {// Recipe Exist
			if (request().accepts("application/json")) {
				return ok(receta.toJsonList());
			} else if (request().accepts("application/xml")) {
				return ok(views.xml.receta.render(receta));
			} else {
				return Results.status(406);
			}
		}
		return Results.notFound();
	}

	public Result retrieveCache(Long id) {
		Receta receta = cache.get("Receta-" + id);
		if (receta == null) {
			receta = Receta.findById(id);
			cache.set("Receta-" + id, receta);
		}

		if (receta == null) {
			return notFound();
		}

		if (request().accepts("application/xml")) {
			return ok(views.xml.receta.render(receta));
		} else if (request().accepts("application/json")) {
			JsonNode node = cache.get("receta-" + id + "-json");
			if (node == null) {
				node = receta.toJsonList();
				cache.set("receta-" + id + "-json", node, 60);
			}
			return ok(node);
		}
		return Results.status(406);
	}

	public Result remove(Long id) {
		Receta recipe = Receta.findById(id);
		List<Ingrediente> ingredientsList = recipe.getIngredientes();
		if (recipe != null) {// Existe la receta
			if (recipe.delete()) {
				return ok();
			} else {
				return internalServerError();
			}
		}
		return Results.notFound();
	}

	public Result listRecipes() {

		List<Receta> recipes = Receta.findAll();
		if (request().accepts("application/json")) {
			ArrayNode array = new play.libs.Json().newArray();
			for (Receta recipe1 : recipes) {
				array.add(recipe1.toJsonList());
			}
			return ok(array);
		} else if (request().accepts("application/xml")) {
			return ok(views.xml.recetas.render(recipes));
		} else {
			return Results.status(406);
		}
	}

	public Result update(Long id) {
		Receta recipe = Receta.findById(id);
		JsonNode body = request().body().asJson();

		if (recipe == null) {
			return Results.notFound();
		}
		if (body.has("name")) {
			recipe.setName(body.get("name").asText());
		}
		/*
		 * if (body.has("preparationTime")) {
		 * recipe.setPreparationTime(body.get("preparationTime").asText()); } if
		 * (body.has("description")) {
		 * recipe.setDescription(body.get("description").asText());
		 * System.out.println("Description"); }
		 */
		if (body.has("ingredientes")) {
			ArrayNode array = (ArrayNode) body.get("ingredientes");
			List<Ingrediente> listIngredients = new LinkedList<>();
			for (JsonNode node1 : array) {

				List<Ingrediente> ingredientList = Ingrediente.getByName(node1.get("name").asText().trim().toLowerCase());
				if (ingredientList.isEmpty()) {
					Ingrediente newIngredient = new Ingrediente();
					newIngredient.setName(node1.get("name").asText().trim().toLowerCase());
					newIngredient.save();

					listIngredients.add(newIngredient);
				} else {
					listIngredients.add(ingredientList.get(0));
				}
			}
			recipe.setIngredients(listIngredients);
		}
		recipe.save();
		return ok();
	}

	public Result getByName(String name) {
		List<Receta> listRecipes = Receta.getByName(name);

		if (listRecipes.isEmpty()) { // No hemos encontrado la receta
			return Results.notFound();
		} else { // Receta encontrada
			Receta recipe = listRecipes.get(0);
			if (request().accepts("application/json")) {
				return ok(recipe.toJsonList());
			} else if (request().accepts("application/xml")) {
				return ok(views.xml.receta.render(recipe));
			} else {
				return Results.status(406);
			}
		}
	}

	public Result getRecipesByTag(String tagName) {
		List<Tag> tag = Tag.getByName(tagName);
		if (tag.isEmpty()) {
			return Results.notFound();
		} else {
			List<Receta> recipes = Receta.findRecipesByTag(tag.get(0));

			if (request().accepts("application/json")) {
				ArrayNode array = new Json().newArray();

				for (Receta recipe1 : recipes) {
					array.add(recipe1.toJsonList());
				}
				return ok(array);
			} else if (request().accepts("application/xml")) {
				return ok(views.xml.recetas.render(recipes));
			} else {
				return Results.status(406);
			}
		}
	}

}
