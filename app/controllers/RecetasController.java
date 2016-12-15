package controllers;

import javax.inject.Inject;

import play.cache.CacheApi;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;

public class RecetasController extends Controller  {
	
	@Inject
	private FormFactory formFactory;

	@Inject
	private CacheApi cache;
	
	
	public Result list() {
		return ok("Fine");
	}

/*
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

	@Transactional
	public Result create() {
		Form<Receta> f = formFactory.form(Receta.class).bindFromRequest();

		if (f.hasErrors()) {
			return Results.badRequest(f.errorsAsJson());
		}

		Ingrediente ingre = new Ingrediente();
		ingre.setPasswordHash(String.valueOf(System.currentTimeMillis()));
		ingre.save();

		Receta rec = f.get();

		rec.setIngrediente(ingre);
		ingre.setReceta(rec);

		rec.save();
		ingre.save();

		return Results.status(CREATED, rec.toJson());
	}

	public Result update(Integer id) {
		// TODO
		return ok();
	}

	public Result remove(Integer id) {
		Receta receta = Receta.findById(Long.valueOf(id));
		if (receta == null) {
			return notFound();
		}

		if (receta.delete()) {
			cache.remove("receta-" + id);
			return ok();
		} else {
			return internalServerError();
		}
	}*/
	
	
	
	
	
	
	
	
	
	
	
	/*
	User user = new User();
	Service service = new Service();
	UserService userService = new UserService();

	user.addUserService(userService);
	userService.setUser(user);

	service.addUserService(userService);
	userService.setService(service);

	session.save(user);
	session.save(service);
	session.save(userService);
	*/
	


}
