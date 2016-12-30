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
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Results;
import play.mvc.Http.Request;

public class IngredientsController extends Controller{
	
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
		if(ingredient == null){
			return badRequest("El ingrediente no existe");
		}
		
		Request request = request();
		return ControllerHelper.ingredientJsonXml(request, ingredient);
		
    }
	
	public Result getIngredients(){
		List<Ingredient> ingredients = Ingredient.findAll();
		if(ingredients.isEmpty()){
			return badRequest("No data");
		}else{
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
		if(ingredient == null){
			return notFound("El ingrediente no existe");
		}
		Task task = Task.findById(idTask);
		if(task == null){
			return notFound("La tarea no existe");
		}
		IngredientTask ingTask = form.get();
		ingTask.ingredient = ingredient;
		ingTask.task = task;
		ingTask.save();
	
		Request request = request();
		return ControllerHelper.ingredientJsonXml(request, ingredient);
    }
	
	public Result addRecipe(Long idIng, Long idRec) {
		Recipe recipe = Recipe.findById(idRec);
		if(recipe == null){
			return notFound("La receta no existe");
		}
		
		Ingredient ingredient = Ingredient.findById(idIng);
		if(ingredient == null){
			return notFound("El ingrediente no existe");
		}
		
		recipe.ingredients.add(ingredient);
		recipe.update();
		if(request().accepts("application/json")){
    		return ok("Ingredient assigned to recipe");
    	}
    	return badRequest("Unsupported format");
    }
}