package controllers;

import java.util.List;

import javax.inject.Inject;

import helpers.ControllerHelper;
import models.Recipe;
import models.Task;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Http.Request;
import play.mvc.Result;

public class TasksController extends Controller {

	@Inject
	private FormFactory f;

	public Result createTask(Long idRecipe) {
		Form<Task> form = f.form(Task.class).bindFromRequest();
		if (form.hasErrors()) {
			return badRequest(ControllerHelper.errorJson(2, "incorrect data", form.errorsAsJson()));
		}
		Recipe recipe = Recipe.findById(idRecipe);
		if (recipe == null) {
			return notFound("The recipe does not exist");
		}
		Task task = form.get();
		task.recipe = recipe;
		task.save();
		
		Request request = request();
		return ControllerHelper.taskJsonXml(request, task);
	}

	public Result getTask(Long idTask) {
		Task task = Task.findById(idTask);
		if (task == null) {
			return badRequest("The task does not exist");
		}
		Request request = request();
		return ControllerHelper.taskJsonXml(request, task);
	}

	public Result getTasks(Long idRecipe) {

		Recipe recipe = Recipe.findById(idRecipe);
		if (recipe == null) {
			return badRequest("The recipe does not exist");
		}

		List<Task> tasks = recipe.tasks;
		if (tasks.isEmpty()) {
			return badRequest("Have not been results in the search");
		} else {
			Request request = request();
			return ControllerHelper.tasksJsonXml(request, tasks);
		}
	}

}
