package controllers;

import java.util.List;

import javax.inject.Inject;

import helpers.ControllerHelper;
import models.Ingredient;
import models.IngredientTask;
import models.Recipe;
import models.Task;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Http.Request;
import play.mvc.Result;
import play.mvc.Results;

public class IngredientsController extends Controller {

	@Inject
	private FormFactory f;

	public Result createF() {
		Form<Ingredient> form = f.form(Ingredient.class).bindFromRequest();
		if (form.hasErrors()) {
			return badRequest(ControllerHelper.errorJson(2, "Incorrect data", form.errorsAsJson()));
		}
		Ingredient ingredient = form.get();
		ingredient.save();

		Request request = request();
		return ControllerHelper.ingredientJsonXml(request, ingredient);
	}

	public Result getIngId(Long id) {
		Ingredient ingredient = Ingredient.findById(id);
		if (ingredient == null) {
			return badRequest("The ingredient does not exist");
		}

		Request request = request();
		return ControllerHelper.ingredientJsonXml(request, ingredient);

	}

	public Result getIngredients() {
		List<Ingredient> ingredients = Ingredient.findAll();
		if (ingredients.isEmpty()) {
			return badRequest("No data");
		} else {
			Request request = request();
			return ControllerHelper.ingredientsJsonXml(request, ingredients);
		}
	}

	public Result createIngTask(Long idIng, Long idTask) {
		Form<IngredientTask> form = f.form(IngredientTask.class).bindFromRequest();
		if (form.hasErrors()) {
			return Results.badRequest("incorrect data");
		}
		Ingredient ingredient = Ingredient.findById(idIng);
		if (ingredient == null) {
			return notFound("The ingredient does not exist");
		}
		Task task = Task.findById(idTask);
		if (task == null) {
			return notFound("The task does not exist");
		}
		IngredientTask ingTask = form.get();
		ingTask.ingredient = ingredient;
		ingTask.task = task;
		ingTask.save();

		Request request = request();
		return ControllerHelper.ingredientJsonXml(request, ingredient);
	}

	//relacion de receta e ingrediente
	public Result addRecipe(Long idIng, Long idRec) {
		Recipe recipe = Recipe.findById(idRec);
		if (recipe == null) {
			return notFound("The recipe does not exist");
		}

		Ingredient ingredient = Ingredient.findById(idIng);
		if (ingredient == null) {
			return notFound("The ingredient does not exist");
		}

		recipe.ingredients.add(ingredient);
		recipe.update();
		if (request().accepts("application/json")) {
			return ok("Ingredient assigned to recipe");
		}
		return badRequest("Unsupported format");
	}
}