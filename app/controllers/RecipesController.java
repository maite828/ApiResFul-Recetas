package controllers;

import java.util.LinkedList;
import java.util.List;

import javax.inject.Inject;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;

import helpers.ControllerHelper;
import models.Ingredient;
import models.Recipe;
import models.Tag;
import play.cache.CacheApi;
import play.mvc.Controller;
import play.mvc.Http.Request;
import play.mvc.Result;
import play.mvc.Results;

public class RecipesController extends Controller {

	@Inject
	private CacheApi cache;
	

	public Result list() {
		List<Recipe> recipes = Recipe.findAll();
		if (recipes.isEmpty()) {
			return Results.notFound();
		}
		
		Request request = request();
		return ControllerHelper.recipesJsonXml(request,recipes);
	}
	

	public Result create() {
		JsonNode json = request().body().asJson();
		if (json.isNull()) {
			return Results.badRequest("incorrect data");
		}

		Recipe recipe = new Recipe();
		recipe.setName(json.get("name").asText().trim().toUpperCase());

		ArrayNode arrayIngr = (ArrayNode) json.get("ingredient");
		if (arrayIngr.isNull()) {
			return Results.badRequest("incorrect data");
		}else{
			for (JsonNode nodeIng : arrayIngr) {
				Ingredient ingredient = new Ingredient();
				ingredient.setName(nodeIng.get("name").asText().trim().toLowerCase());
				ingredient.save();
				recipe.addIngrRec(ingredient);
			}
		}
		
		ArrayNode arrayTags = (ArrayNode) json.get("tags");
		if (arrayTags.isNull()) {
			return Results.badRequest("incorrect data");
		}else{
			for (JsonNode nodeTag : arrayTags) {
				Tag tag = new Tag();
				tag.setName(nodeTag.get("name").asText().trim().toLowerCase());
				tag.save();
				recipe.addTagRec(tag);
			}	
		}
		recipe.save();

		Request request = request();
		return ControllerHelper.recipeJsonXml(request,recipe);
	}
	

	public Result retrieve(Long id) {
		Recipe recipe = Recipe.findById(id);
		if (recipe != null) {
			Request request = request();
			return ControllerHelper.recipeJsonXml(request,recipe);
		}
		return Results.notFound();
	}
	

	public Result retrieveCache(Long id) {
		Recipe recipe = cache.get("Recipe-" + id);
		if (recipe == null) {
			recipe = Recipe.findById(id);
			cache.set("Recipe-" + id, recipe);
		}

		if (recipe == null) {
			return notFound();
		}
		
		Request request = request();
		return ControllerHelper.recipeCacheJsonXml(request,recipe,id,cache);	
	}
	

	public Result recipesByName(String name) {
		List<Recipe> recipes = Recipe.findByName(name.trim().toUpperCase());
		if (recipes.isEmpty()) {
			return Results.notFound();
		}else{
			Request request = request();
			return ControllerHelper.recipesJsonXml(request,recipes);
		}
	}
	

	public Result recipesByTag(String name) {
		List<Tag> tag = Tag.findByName(name.trim().toLowerCase());
		if (tag.isEmpty()) {
			return Results.notFound();
		} else {
			List<Recipe> recipes = Recipe.findRecipesByTag(tag.get(0));
			Request request = request();
			return ControllerHelper.recipesJsonXml(request,recipes);
		}
	}
	

	public Result update(Long id) {
		Recipe recipe = Recipe.findById(id);
		if (recipe == null) {
			return Results.notFound();
		}
		
		JsonNode json = request().body().asJson();
		if (json.has("name")) {
			recipe.setName(json.get("name").asText().trim().toLowerCase());
		}
		/*
		 * if (body.has("preparationTime")) {
		 * recipe.setPreparationTime(body.get("preparationTime").asText()); } if
		 * (body.has("description")) {
		 * recipe.setDescription(body.get("description").asText());
		 */
		if (json.has("ingredient")) {
			List<Ingredient> ingredients = new LinkedList<>();
			ArrayNode array = (ArrayNode) json.get("ingredient");
			for (JsonNode nodeIng : array) {

				List<Ingredient> ingredients2 = Ingredient.findByName(nodeIng.get("name").asText().trim().toLowerCase());
				if (ingredients2.isEmpty()) {
					Ingredient ingredient = new Ingredient();
					ingredient.setName(nodeIng.get("name").asText().trim().toLowerCase());
					ingredient.save();
					ingredients.add(ingredient);
				} else {
					ingredients.add(ingredients2.get(0));
				}
			}
			recipe.setIngredients(ingredients);
		}
		
		if (json.has("tags")) {
			List<Tag> tags = new LinkedList<>();
			ArrayNode array = (ArrayNode) json.get("tags");
			for (JsonNode nodeTag : array) {
				List<Tag> tags2 = Tag.findByName(nodeTag.get("name").asText().trim().toLowerCase());
				if (tags2.isEmpty()) {
					Tag tag = new Tag();
					tag.setName(nodeTag.get("name").asText().trim().toLowerCase());
					tag.save();
					tags.add(tag);
				} else {
					tags.add(tags2.get(0));
				}
			}
			recipe.setTags(tags);
		}
		recipe.save();
		
		Request request = request();
		return ControllerHelper.recipeJsonXml(request,recipe);
	}
	
	
	public Result remove(Long id) {
		Recipe recipe = Recipe.findById(id);
		if (recipe != null) {
			if (recipe.delete()) {
				List<Recipe> recipes = Recipe.findAll();
				Request request = request();
				return ControllerHelper.recipesJsonXml(request,recipes);
			} else {
				return internalServerError();
			}
		}
		return Results.notFound();
	}
	
	
}
