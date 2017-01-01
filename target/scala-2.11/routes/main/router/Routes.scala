
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/mayteecheverry/MyGitRepos/play/Recetas/conf/routes
// @DATE:Sat Dec 31 23:44:37 CET 2016

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
  Assets_3: controllers.Assets,
  // @LINE:2
  App_1: controllers.App,
  // @LINE:8
  RecipesController_0: controllers.RecipesController,
  // @LINE:32
  IngredientsController_2: controllers.IngredientsController,
  // @LINE:43
  TasksController_4: controllers.TasksController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:1
    Assets_3: controllers.Assets,
    // @LINE:2
    App_1: controllers.App,
    // @LINE:8
    RecipesController_0: controllers.RecipesController,
    // @LINE:32
    IngredientsController_2: controllers.IngredientsController,
    // @LINE:43
    TasksController_4: controllers.TasksController
  ) = this(errorHandler, Assets_3, App_1, RecipesController_0, IngredientsController_2, TasksController_4, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Assets_3, App_1, RecipesController_0, IngredientsController_2, TasksController_4, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix, """controllers.App.index()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """recipesJ""", """controllers.RecipesController.createJson"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """recipe_cache/""" + "$" + """id<[^/]+>""", """controllers.RecipesController.retrieveCache(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """recipes""", """controllers.RecipesController.list"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """recipe/""" + "$" + """id<[^/]+>""", """controllers.RecipesController.retrieve(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """recipe/name/""" + "$" + """name<[^/]+>""", """controllers.RecipesController.recipesByName(name:String)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """recipe/""" + "$" + """id<[^/]+>""", """controllers.RecipesController.remove(id:Long)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """recipe/""" + "$" + """id<[^/]+>""", """controllers.RecipesController.update(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """recipe/tag/""" + "$" + """name<[^/]+>""", """controllers.RecipesController.recipesByTag(name:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """recipesF""", """controllers.RecipesController.createFactory"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ingredients""", """controllers.IngredientsController.createF"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ingredients/""" + "$" + """id<[^/]+>""", """controllers.IngredientsController.getIngId(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ingredients""", """controllers.IngredientsController.getIngredients"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ingredients/""" + "$" + """idI<[^/]+>/recipe/""" + "$" + """idR<[^/]+>""", """controllers.IngredientsController.addRecipe(idI:Long, idR:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ingredients/""" + "$" + """idI<[^/]+>/task/""" + "$" + """idT<[^/]+>""", """controllers.IngredientsController.createIngTask(idI:Long, idT:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """recipes/""" + "$" + """idRec<[^/]+>/task""", """controllers.TasksController.createTask(idRec:Long)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:1
  private[this] lazy val controllers_Assets_versioned0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned0_invoker = createInvoker(
    Assets_3.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )

  // @LINE:2
  private[this] lazy val controllers_App_index1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_App_index1_invoker = createInvoker(
    App_1.index(),
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

  // @LINE:8
  private[this] lazy val controllers_RecipesController_createJson2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("recipesJ")))
  )
  private[this] lazy val controllers_RecipesController_createJson2_invoker = createInvoker(
    RecipesController_0.createJson,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RecipesController",
      "createJson",
      Nil,
      "POST",
      """ Recipes""",
      this.prefix + """recipesJ"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_RecipesController_retrieveCache3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("recipe_cache/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RecipesController_retrieveCache3_invoker = createInvoker(
    RecipesController_0.retrieveCache(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RecipesController",
      "retrieveCache",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """recipe_cache/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_RecipesController_list4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("recipes")))
  )
  private[this] lazy val controllers_RecipesController_list4_invoker = createInvoker(
    RecipesController_0.list,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RecipesController",
      "list",
      Nil,
      "GET",
      """""",
      this.prefix + """recipes"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_RecipesController_retrieve5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("recipe/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RecipesController_retrieve5_invoker = createInvoker(
    RecipesController_0.retrieve(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RecipesController",
      "retrieve",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """recipe/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_RecipesController_recipesByName6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("recipe/name/"), DynamicPart("name", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RecipesController_recipesByName6_invoker = createInvoker(
    RecipesController_0.recipesByName(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RecipesController",
      "recipesByName",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """recipe/name/""" + "$" + """name<[^/]+>"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_RecipesController_remove7_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("recipe/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RecipesController_remove7_invoker = createInvoker(
    RecipesController_0.remove(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RecipesController",
      "remove",
      Seq(classOf[Long]),
      "DELETE",
      """""",
      this.prefix + """recipe/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:20
  private[this] lazy val controllers_RecipesController_update8_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("recipe/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RecipesController_update8_invoker = createInvoker(
    RecipesController_0.update(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RecipesController",
      "update",
      Seq(classOf[Long]),
      "PUT",
      """""",
      this.prefix + """recipe/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_RecipesController_recipesByTag9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("recipe/tag/"), DynamicPart("name", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RecipesController_recipesByTag9_invoker = createInvoker(
    RecipesController_0.recipesByTag(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RecipesController",
      "recipesByTag",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """recipe/tag/""" + "$" + """name<[^/]+>"""
    )
  )

  // @LINE:29
  private[this] lazy val controllers_RecipesController_createFactory10_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("recipesF")))
  )
  private[this] lazy val controllers_RecipesController_createFactory10_invoker = createInvoker(
    RecipesController_0.createFactory,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RecipesController",
      "createFactory",
      Nil,
      "POST",
      """ Recipes""",
      this.prefix + """recipesF"""
    )
  )

  // @LINE:32
  private[this] lazy val controllers_IngredientsController_createF11_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ingredients")))
  )
  private[this] lazy val controllers_IngredientsController_createF11_invoker = createInvoker(
    IngredientsController_2.createF,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.IngredientsController",
      "createF",
      Nil,
      "POST",
      """ Ingredients""",
      this.prefix + """ingredients"""
    )
  )

  // @LINE:34
  private[this] lazy val controllers_IngredientsController_getIngId12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ingredients/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_IngredientsController_getIngId12_invoker = createInvoker(
    IngredientsController_2.getIngId(fakeValue[Long]),
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

  // @LINE:36
  private[this] lazy val controllers_IngredientsController_getIngredients13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ingredients")))
  )
  private[this] lazy val controllers_IngredientsController_getIngredients13_invoker = createInvoker(
    IngredientsController_2.getIngredients,
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

  // @LINE:38
  private[this] lazy val controllers_IngredientsController_addRecipe14_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ingredients/"), DynamicPart("idI", """[^/]+""",true), StaticPart("/recipe/"), DynamicPart("idR", """[^/]+""",true)))
  )
  private[this] lazy val controllers_IngredientsController_addRecipe14_invoker = createInvoker(
    IngredientsController_2.addRecipe(fakeValue[Long], fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.IngredientsController",
      "addRecipe",
      Seq(classOf[Long], classOf[Long]),
      "PUT",
      """""",
      this.prefix + """ingredients/""" + "$" + """idI<[^/]+>/recipe/""" + "$" + """idR<[^/]+>"""
    )
  )

  // @LINE:40
  private[this] lazy val controllers_IngredientsController_createIngTask15_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ingredients/"), DynamicPart("idI", """[^/]+""",true), StaticPart("/task/"), DynamicPart("idT", """[^/]+""",true)))
  )
  private[this] lazy val controllers_IngredientsController_createIngTask15_invoker = createInvoker(
    IngredientsController_2.createIngTask(fakeValue[Long], fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.IngredientsController",
      "createIngTask",
      Seq(classOf[Long], classOf[Long]),
      "POST",
      """""",
      this.prefix + """ingredients/""" + "$" + """idI<[^/]+>/task/""" + "$" + """idT<[^/]+>"""
    )
  )

  // @LINE:43
  private[this] lazy val controllers_TasksController_createTask16_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("recipes/"), DynamicPart("idRec", """[^/]+""",true), StaticPart("/task")))
  )
  private[this] lazy val controllers_TasksController_createTask16_invoker = createInvoker(
    TasksController_4.createTask(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TasksController",
      "createTask",
      Seq(classOf[Long]),
      "POST",
      """ Tasks""",
      this.prefix + """recipes/""" + "$" + """idRec<[^/]+>/task"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:1
    case controllers_Assets_versioned0_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned0_invoker.call(Assets_3.versioned(path, file))
      }
  
    // @LINE:2
    case controllers_App_index1_route(params) =>
      call { 
        controllers_App_index1_invoker.call(App_1.index())
      }
  
    // @LINE:8
    case controllers_RecipesController_createJson2_route(params) =>
      call { 
        controllers_RecipesController_createJson2_invoker.call(RecipesController_0.createJson)
      }
  
    // @LINE:10
    case controllers_RecipesController_retrieveCache3_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_RecipesController_retrieveCache3_invoker.call(RecipesController_0.retrieveCache(id))
      }
  
    // @LINE:12
    case controllers_RecipesController_list4_route(params) =>
      call { 
        controllers_RecipesController_list4_invoker.call(RecipesController_0.list)
      }
  
    // @LINE:14
    case controllers_RecipesController_retrieve5_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_RecipesController_retrieve5_invoker.call(RecipesController_0.retrieve(id))
      }
  
    // @LINE:16
    case controllers_RecipesController_recipesByName6_route(params) =>
      call(params.fromPath[String]("name", None)) { (name) =>
        controllers_RecipesController_recipesByName6_invoker.call(RecipesController_0.recipesByName(name))
      }
  
    // @LINE:18
    case controllers_RecipesController_remove7_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_RecipesController_remove7_invoker.call(RecipesController_0.remove(id))
      }
  
    // @LINE:20
    case controllers_RecipesController_update8_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_RecipesController_update8_invoker.call(RecipesController_0.update(id))
      }
  
    // @LINE:22
    case controllers_RecipesController_recipesByTag9_route(params) =>
      call(params.fromPath[String]("name", None)) { (name) =>
        controllers_RecipesController_recipesByTag9_invoker.call(RecipesController_0.recipesByTag(name))
      }
  
    // @LINE:29
    case controllers_RecipesController_createFactory10_route(params) =>
      call { 
        controllers_RecipesController_createFactory10_invoker.call(RecipesController_0.createFactory)
      }
  
    // @LINE:32
    case controllers_IngredientsController_createF11_route(params) =>
      call { 
        controllers_IngredientsController_createF11_invoker.call(IngredientsController_2.createF)
      }
  
    // @LINE:34
    case controllers_IngredientsController_getIngId12_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_IngredientsController_getIngId12_invoker.call(IngredientsController_2.getIngId(id))
      }
  
    // @LINE:36
    case controllers_IngredientsController_getIngredients13_route(params) =>
      call { 
        controllers_IngredientsController_getIngredients13_invoker.call(IngredientsController_2.getIngredients)
      }
  
    // @LINE:38
    case controllers_IngredientsController_addRecipe14_route(params) =>
      call(params.fromPath[Long]("idI", None), params.fromPath[Long]("idR", None)) { (idI, idR) =>
        controllers_IngredientsController_addRecipe14_invoker.call(IngredientsController_2.addRecipe(idI, idR))
      }
  
    // @LINE:40
    case controllers_IngredientsController_createIngTask15_route(params) =>
      call(params.fromPath[Long]("idI", None), params.fromPath[Long]("idT", None)) { (idI, idT) =>
        controllers_IngredientsController_createIngTask15_invoker.call(IngredientsController_2.createIngTask(idI, idT))
      }
  
    // @LINE:43
    case controllers_TasksController_createTask16_route(params) =>
      call(params.fromPath[Long]("idRec", None)) { (idRec) =>
        controllers_TasksController_createTask16_invoker.call(TasksController_4.createTask(idRec))
      }
  }
}
