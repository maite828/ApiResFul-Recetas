package helpers;

import java.util.List;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import models.Ingredient;
import models.Recipe;
import play.cache.CacheApi;
import play.libs.Json;
import play.mvc.Http.Request;
import play.mvc.Result;
import play.mvc.Results;

public class ControllerHelper {
	
	public static Result recipesJsonXml(Request request, List<Recipe> recipes) {
		if (request.accepts("application/json")) {
			return showAllJson(recipes);
		} else if (request.accepts("application/xml")) {
			return play.mvc.Results.ok(views.xml.recipes.render(recipes));
		} else {
			return Results.status(406);
		}
	}
	
	public static Result showAllJson(List<Recipe> recipes){
		new play.libs.Json();
		ArrayNode array = Json.newArray();
		for (Recipe recipe : recipes) {
			array.add(recipe.toJsonList());
		}
		return play.mvc.Results.ok(array);
	}
	
	public static Result recipeJsonXml(Request request, Recipe recipe){
		if (request.accepts("application/json")) {
			return play.mvc.Results.ok(recipe.toJsonList());
		} else if (request.accepts("application/xml")) {
			return play.mvc.Results.ok(views.xml.recipe.render(recipe));
		} else {
			return Results.badRequest("Unsupported format");
		}
	}

	public static Result recipeCacheJsonXml(Request request, Recipe recipe, Long id, CacheApi cache) {
		if (request.accepts("application/xml")) {
			return play.mvc.Results.ok(views.xml.recipe.render(recipe));
		} else if (request.accepts("application/json")) {
			JsonNode node = cache.get("recipe-" + id + "-json");
			if (node == null) {
				node = recipe.toJsonList();
				cache.set("recipe-" + id + "-json", node, 60);
			}
			return play.mvc.Results.ok(node);
		}
		return Results.status(406);
	}
	
	public static Result ingredientJsonXml(Request request, Ingredient ing){
		if (request.accepts("application/json")) {
			return play.mvc.Results.ok(ing.toJsonList());
		} else if (request.accepts("application/xml")) {
			return play.mvc.Results.ok(views.xml.ingredient.render(ing));
		} else {
			return Results.badRequest("Unsupported format");
		}
	}
	
	public static Result ingredientsJsonXml(Request request, List<Ingredient> ingredients) {
		if (request.accepts("application/json")) {
			return showAllIngJson(ingredients);
		} else if (request.accepts("application/xml")) {
			return play.mvc.Results.ok(views.xml.ingredients.render(ingredients));
		} else {
			return Results.status(406);
		}
	}
	
	public static Result showAllIngJson(List<Ingredient> ingredients){
		new play.libs.Json();
		ArrayNode array = Json.newArray();
		for (Ingredient ingredient : ingredients) {
			array.add(ingredient.toJsonList());
		}
		return play.mvc.Results.ok(array);
	}
	
	public static JsonNode errorJson(Integer code, String message, JsonNode errors) {
		ObjectNode node = Json.newObject();
		node.put("code", code);
		node.put("message", message);
		node.putPOJO("errors", errors);
		return node;
	}
}