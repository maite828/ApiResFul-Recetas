
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/mayteecheverry/MyGitRepos/play/Recetas/conf/routes
// @DATE:Fri Dec 30 07:18:23 CET 2016

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:1
  App_2: controllers.App,
  // @LINE:7
  RecipesController_1: controllers.RecipesController,
  // @LINE:37
  IngredientsController_0: controllers.IngredientsController,
  // @LINE:52
  TasksController_3: controllers.TasksController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:1
    App_2: controllers.App,
    // @LINE:7
    RecipesController_1: controllers.RecipesController,
    // @LINE:37
    IngredientsController_0: controllers.IngredientsController,
    // @LINE:52
    TasksController_3: controllers.TasksController
  ) = this(errorHandler, App_2, RecipesController_1, IngredientsController_0, TasksController_3, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, App_2, RecipesController_1, IngredientsController_0, TasksController_3, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.App.index()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """recipesJ""", """controllers.RecipesController.createJson"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """recipesF""", """controllers.RecipesController.createFactory"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """recipe_cache/""" + "$" + """id<[^/]+>""", """controllers.RecipesController.retrieveCache(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """recipes""", """controllers.RecipesController.list"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """recipe/""" + "$" + """id<[^/]+>""", """controllers.RecipesController.retrieve(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """recipe/name/""" + "$" + """name<[^/]+>""", """controllers.RecipesController.recipesByName(name:String)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """recipe/""" + "$" + """id<[^/]+>""", """controllers.RecipesController.remove(id:Long)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """recipe/""" + "$" + """id<[^/]+>""", """controllers.RecipesController.update(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """recipe/tag/""" + "$" + """name<[^/]+>""", """controllers.RecipesController.recipesByTag(name:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ingredients""", """controllers.IngredientsController.createF"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ingredients/""" + "$" + """id<[^/]+>""", """controllers.IngredientsController.getIngId(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ingredients""", """controllers.IngredientsController.getIngredients"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ingredients/""" + "$" + """idIng<[^/]+>/task/""" + "$" + """idTask<[^/]+>""", """controllers.IngredientsController.createIngTask(idIng:Long, idTask:Long)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ingredients/""" + "$" + """idIng<[^/]+>/recipe/""" + "$" + """idRec<[^/]+>""", """controllers.IngredientsController.addRecipe(idIng:Long, idRec:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """recipes/""" + "$" + """idRec<[^/]+>/createTask""", """controllers.TasksController.createTask(idRec:Long)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:1
  private[this] lazy val controllers_App_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_App_index0_invoker = createInvoker(
    App_2.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.App",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """"""
    )
  )

  // @LINE:7
  private[this] lazy val controllers_RecipesController_createJson1_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("recipesJ")))
  )
  private[this] lazy val controllers_RecipesController_createJson1_invoker = createInvoker(
    RecipesController_1.createJson,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RecipesController",
      "createJson",
      Nil,
      "POST",
      """ CREAR RECETA CON JSON""",
      this.prefix + """recipesJ"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_RecipesController_createFactory2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("recipesF")))
  )
  private[this] lazy val controllers_RecipesController_createFactory2_invoker = createInvoker(
    RecipesController_1.createFactory,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RecipesController",
      "createFactory",
      Nil,
      "POST",
      """ CREAR RECETA CON FACTORY""",
      this.prefix + """recipesF"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_RecipesController_retrieveCache3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("recipe_cache/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RecipesController_retrieveCache3_invoker = createInvoker(
    RecipesController_1.retrieveCache(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RecipesController",
      "retrieveCache",
      Seq(classOf[Long]),
      "GET",
      """ RECETA POR ID EN CACHÉ""",
      this.prefix + """recipe_cache/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_RecipesController_list4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("recipes")))
  )
  private[this] lazy val controllers_RecipesController_list4_invoker = createInvoker(
    RecipesController_1.list,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RecipesController",
      "list",
      Nil,
      "GET",
      """ LISTA DE RECETAS""",
      this.prefix + """recipes"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_RecipesController_retrieve5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("recipe/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RecipesController_retrieve5_invoker = createInvoker(
    RecipesController_1.retrieve(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RecipesController",
      "retrieve",
      Seq(classOf[Long]),
      "GET",
      """ RECETAS POR ID""",
      this.prefix + """recipe/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_RecipesController_recipesByName6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("recipe/name/"), DynamicPart("name", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RecipesController_recipesByName6_invoker = createInvoker(
    RecipesController_1.recipesByName(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RecipesController",
      "recipesByName",
      Seq(classOf[String]),
      "GET",
      """ RECETAS POR NOMBRE""",
      this.prefix + """recipe/name/""" + "$" + """name<[^/]+>"""
    )
  )

  // @LINE:25
  private[this] lazy val controllers_RecipesController_remove7_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("recipe/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RecipesController_remove7_invoker = createInvoker(
    RecipesController_1.remove(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RecipesController",
      "remove",
      Seq(classOf[Long]),
      "DELETE",
      """ ELIMINAR RECETA POR ID""",
      this.prefix + """recipe/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:28
  private[this] lazy val controllers_RecipesController_update8_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("recipe/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RecipesController_update8_invoker = createInvoker(
    RecipesController_1.update(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RecipesController",
      "update",
      Seq(classOf[Long]),
      "PUT",
      """ ACTUALIZAR RECETA POR ID""",
      this.prefix + """recipe/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:31
  private[this] lazy val controllers_RecipesController_recipesByTag9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("recipe/tag/"), DynamicPart("name", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RecipesController_recipesByTag9_invoker = createInvoker(
    RecipesController_1.recipesByTag(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RecipesController",
      "recipesByTag",
      Seq(classOf[String]),
      "GET",
      """ RECETAS POR TAG""",
      this.prefix + """recipe/tag/""" + "$" + """name<[^/]+>"""
    )
  )

  // @LINE:37
  private[this] lazy val controllers_IngredientsController_createF10_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ingredients")))
  )
  private[this] lazy val controllers_IngredientsController_createF10_invoker = createInvoker(
    IngredientsController_0.createF,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.IngredientsController",
      "createF",
      Nil,
      "POST",
      """""",
      this.prefix + """ingredients"""
    )
  )

  // @LINE:39
  private[this] lazy val controllers_IngredientsController_getIngId11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ingredients/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_IngredientsController_getIngId11_invoker = createInvoker(
    IngredientsController_0.getIngId(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.IngredientsController",
      "getIngId",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """ingredients/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:41
  private[this] lazy val controllers_IngredientsController_getIngredients12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ingredients")))
  )
  private[this] lazy val controllers_IngredientsController_getIngredients12_invoker = createInvoker(
    IngredientsController_0.getIngredients,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.IngredientsController",
      "getIngredients",
      Nil,
      "GET",
      """""",
      this.prefix + """ingredients"""
    )
  )

  // @LINE:43
  private[this] lazy val controllers_IngredientsController_createIngTask13_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ingredients/"), DynamicPart("idIng", """[^/]+""",true), StaticPart("/task/"), DynamicPart("idTask", """[^/]+""",true)))
  )
  private[this] lazy val controllers_IngredientsController_createIngTask13_invoker = createInvoker(
    IngredientsController_0.createIngTask(fakeValue[Long], fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.IngredientsController",
      "createIngTask",
      Seq(classOf[Long], classOf[Long]),
      "POST",
      """""",
      this.prefix + """ingredients/""" + "$" + """idIng<[^/]+>/task/""" + "$" + """idTask<[^/]+>"""
    )
  )

  // @LINE:45
  private[this] lazy val controllers_IngredientsController_addRecipe14_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ingredients/"), DynamicPart("idIng", """[^/]+""",true), StaticPart("/recipe/"), DynamicPart("idRec", """[^/]+""",true)))
  )
  private[this] lazy val controllers_IngredientsController_addRecipe14_invoker = createInvoker(
    IngredientsController_0.addRecipe(fakeValue[Long], fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.IngredientsController",
      "addRecipe",
      Seq(classOf[Long], classOf[Long]),
      "PUT",
      """""",
      this.prefix + """ingredients/""" + "$" + """idIng<[^/]+>/recipe/""" + "$" + """idRec<[^/]+>"""
    )
  )

  // @LINE:52
  private[this] lazy val controllers_TasksController_createTask15_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("recipes/"), DynamicPart("idRec", """[^/]+""",true), StaticPart("/createTask")))
  )
  private[this] lazy val controllers_TasksController_createTask15_invoker = createInvoker(
    TasksController_3.createTask(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TasksController",
      "createTask",
      Seq(classOf[Long]),
      "POST",
      """""",
      this.prefix + """recipes/""" + "$" + """idRec<[^/]+>/createTask"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:1
    case controllers_App_index0_route(params) =>
      call { 
        controllers_App_index0_invoker.call(App_2.index())
      }
  
    // @LINE:7
    case controllers_RecipesController_createJson1_route(params) =>
      call { 
        controllers_RecipesController_createJson1_invoker.call(RecipesController_1.createJson)
      }
  
    // @LINE:10
    case controllers_RecipesController_createFactory2_route(params) =>
      call { 
        controllers_RecipesController_createFactory2_invoker.call(RecipesController_1.createFactory)
      }
  
    // @LINE:13
    case controllers_RecipesController_retrieveCache3_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_RecipesController_retrieveCache3_invoker.call(RecipesController_1.retrieveCache(id))
      }
  
    // @LINE:16
    case controllers_RecipesController_list4_route(params) =>
      call { 
        controllers_RecipesController_list4_invoker.call(RecipesController_1.list)
      }
  
    // @LINE:19
    case controllers_RecipesController_retrieve5_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_RecipesController_retrieve5_invoker.call(RecipesController_1.retrieve(id))
      }
  
    // @LINE:22
    case controllers_RecipesController_recipesByName6_route(params) =>
      call(params.fromPath[String]("name", None)) { (name) =>
        controllers_RecipesController_recipesByName6_invoker.call(RecipesController_1.recipesByName(name))
      }
  
    // @LINE:25
    case controllers_RecipesController_remove7_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_RecipesController_remove7_invoker.call(RecipesController_1.remove(id))
      }
  
    // @LINE:28
    case controllers_RecipesController_update8_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_RecipesController_update8_invoker.call(RecipesController_1.update(id))
      }
  
    // @LINE:31
    case controllers_RecipesController_recipesByTag9_route(params) =>
      call(params.fromPath[String]("name", None)) { (name) =>
        controllers_RecipesController_recipesByTag9_invoker.call(RecipesController_1.recipesByTag(name))
      }
  
    // @LINE:37
    case controllers_IngredientsController_createF10_route(params) =>
      call { 
        controllers_IngredientsController_createF10_invoker.call(IngredientsController_0.createF)
      }
  
    // @LINE:39
    case controllers_IngredientsController_getIngId11_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_IngredientsController_getIngId11_invoker.call(IngredientsController_0.getIngId(id))
      }
  
    // @LINE:41
    case controllers_IngredientsController_getIngredients12_route(params) =>
      call { 
        controllers_IngredientsController_getIngredients12_invoker.call(IngredientsController_0.getIngredients)
      }
  
    // @LINE:43
    case controllers_IngredientsController_createIngTask13_route(params) =>
      call(params.fromPath[Long]("idIng", None), params.fromPath[Long]("idTask", None)) { (idIng, idTask) =>
        controllers_IngredientsController_createIngTask13_invoker.call(IngredientsController_0.createIngTask(idIng, idTask))
      }
  
    // @LINE:45
    case controllers_IngredientsController_addRecipe14_route(params) =>
      call(params.fromPath[Long]("idIng", None), params.fromPath[Long]("idRec", None)) { (idIng, idRec) =>
        controllers_IngredientsController_addRecipe14_invoker.call(IngredientsController_0.addRecipe(idIng, idRec))
      }
  
    // @LINE:52
    case controllers_TasksController_createTask15_route(params) =>
      call(params.fromPath[Long]("idRec", None)) { (idRec) =>
        controllers_TasksController_createTask15_invoker.call(TasksController_3.createTask(idRec))
      }
  }
}
