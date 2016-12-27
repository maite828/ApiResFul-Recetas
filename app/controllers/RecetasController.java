package controllers;

import java.util.List;

import javax.inject.Inject;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;

import models.Ingrediente;
import models.RecIngre;
import models.Receta;
import play.cache.CacheApi;
import play.data.Form;
import play.data.FormFactory;
import play.db.ebean.Transactional;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Results;

public class RecetasController extends Controller {

	@Inject
	private FormFactory formFactory;

	@Inject
	private CacheApi cache;

	public Result list() {
		List<Receta> recetas = Receta.findAll();
		if (request().accepts("application/json")){
			ArrayNode array = new play.libs.Json().newArray();
			for (Receta receta : recetas){	
				array.add(receta.toJsonList());
			}
			return ok (array);
		}else if(request().accepts("application/xml")){	
			return ok(views.xml.recetas.render(recetas));
		}else{	
			return Results.status(406);
		}
	}

	@Transactional
	public Result create() {
		Form<Receta> f = formFactory.form(Receta.class).bindFromRequest();

		if (f.hasErrors()) {
			return Results.badRequest(f.errorsAsJson());
		}

		Ingrediente ingre = new Ingrediente();
		ingre.setId(System.currentTimeMillis());
		ingre.save();

		Receta rec = f.get();
		rec.setId(System.currentTimeMillis());
		rec.save();

		RecIngre recing = new RecIngre(rec, ingre);
		recing.save();

		return Results.status(CREATED, recing.toJson());
	}

	public Result retrieve(Long id) {
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
				node = receta.toJson();
				cache.set("receta-" + id + "-json", node, 60);
			}
			return ok(node);
		}
		return Results.status(406);
	}

	/*
	 * public Result update(Integer id) { // TODO return ok(); }
	 * 
	 * public Result remove(Integer id) { Receta receta =
	 * Receta.findById(Long.valueOf(id)); if (receta == null) { return
	 * notFound(); }
	 * 
	 * if (receta.delete()) { cache.remove("receta-" + id); return ok(); } else
	 * { return internalServerError(); } }
	 */

	/*
	 * User user = new User(); Service service = new Service(); UserService
	 * userService = new UserService();
	 * 
	 * user.addUserService(userService); userService.setUser(user);
	 * 
	 * service.addUserService(userService); userService.setService(service);
	 * 
	 * session.save(user); session.save(service); session.save(userService);
	 */

}
