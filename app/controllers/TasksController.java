package controllers;

import java.util.List;

import javax.inject.Inject;

import helpers.ControllerHelper;
import models.Recipe;
import models.Task;
import play.data.Form;
import play.data.FormFactory;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

public class TasksController extends Controller{
	
	@Inject
	private FormFactory f;
	
	public Result createTask(Long idRecipe) {
		Form<Task> form = f.form(Task.class).bindFromRequest();
		if (form.hasErrors()) {
			return badRequest(ControllerHelper.errorJson(2, "Datos incorrectos", form.errorsAsJson()));
		}
		Recipe recipe = Recipe.findById(idRecipe);
		if(recipe == null){
			return notFound("La receta no existe");
		}
		Task task = form.get();
		task.recipe = recipe;
		task.save();
		if(request().accepts("application/json")){
    		return ok(Json.toJson(task));
    	}
    	return badRequest("Unsupported format");
    }
	
	public Result getTask(Long idTask) {
		Task task = Task.findById(idTask);
		if(task == null){
			return badRequest("La tarea no existe");
		}
		if(request().accepts("application/json")){
    		return ok(Json.toJson(task));
    	}
    	return badRequest("Unsupported format");
    }
	
	public Result getTasks(Long idRecipe){
		
		Recipe recipe = Recipe.findById(idRecipe);
		if(recipe == null){
			return badRequest("La receta no existe");
		}
		
		List<Task> taskList = recipe.tasks;
		if(taskList.isEmpty()){
			return badRequest("No se han encontrado resultados en la búsqueda");
		}else{
			if(request().accepts("application/json")){
	    		return ok(Json.toJson(taskList));
	    	}
	    	return badRequest("Unsupported format");
		}
    }

}

