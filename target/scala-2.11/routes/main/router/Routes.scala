
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/mayteecheverry/MyGitRepos/play/Recetas/conf/routes
// @DATE:Fri Dec 30 02:55:28 CET 2016

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
  // @LINE:5
  RecipesController_0: controllers.RecipesController,
  // @LINE:28
  IngredientsController_2: controllers.IngredientsController,
  // @LINE:30
  TasksController_4: controllers.TasksController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:1
    Assets_3: controllers.Assets,
    // @LINE:2
    App_1: controllers.App,
    // @LINE:5
    RecipesController_0: controllers.RecipesController,
    // @LINE:28
    IngredientsController_2: controllers.IngredientsController,
    // @LINE:30
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
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """recipes""", """controllers.RecipesController.create"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """recipecache/""" + "$" + """id<[^/]+>""", """controllers.RecipesController.retrieveCache(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """recipes""", """controllers.RecipesController.list"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """recipe/""" + "$" + """id<[^/]+>""", """controllers.RecipesController.retrieve(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """recipe/name/""" + "$" + """name<[^/]+>""", """controllers.RecipesController.recipesByName(name:String)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """recipe/""" + "$" + """id<[^/]+>""", """controllers.RecipesController.remove(id:Long)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """recipe/""" + "$" + """id<[^/]+>""", """controllers.RecipesController.update(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """recipe/tag/""" + "$" + """name<[^/]+>""", """controllers.RecipesController.recipesByTag(name:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ingredients""", """controllers.IngredientsController.list"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tasks""", """controllers.TasksController.list"""),
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

  // @LINE:5
  private[this] lazy val controllers_RecipesController_create2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("recipes")))
  )
  private[this] lazy val controllers_RecipesController_create2_invoker = createInvoker(
    RecipesController_0.create,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RecipesController",
      "create",
      Nil,
      "POST",
      """ CREAR RECETA""",
      this.prefix + """recipes"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_RecipesController_retrieveCache3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("recipecache/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RecipesController_retrieveCache3_invoker = createInvoker(
    RecipesController_0.retrieveCache(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RecipesController",
      "retrieveCache",
      Seq(classOf[Long]),
      "GET",
      """ RECETA POR ID EN CACHÉ""",
      this.prefix + """recipecache/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:11
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
      """ LISTA DE RECETAS""",
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
      """ RECETAS POR ID""",
      this.prefix + """recipe/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:17
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
      """ RECETAS POR NOMBRE""",
      this.prefix + """recipe/name/""" + "$" + """name<[^/]+>"""
    )
  )

  // @LINE:20
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
      """ ELEIMINAR RECETA POR ID""",
      this.prefix + """recipe/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:23
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
      """ ACTUALIZAR RECETA POR ID""",
      this.prefix + """recipe/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:26
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
      """ RECETAS POR TAG""",
      this.prefix + """recipe/tag/""" + "$" + """name<[^/]+>"""
    )
  )

  // @LINE:28
  private[this] lazy val controllers_IngredientsController_list10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ingredients")))
  )
  private[this] lazy val controllers_IngredientsController_list10_invoker = createInvoker(
    IngredientsController_2.list,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.IngredientsController",
      "list",
      Nil,
      "GET",
      """""",
      this.prefix + """ingredients"""
    )
  )

  // @LINE:30
  private[this] lazy val controllers_TasksController_list11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tasks")))
  )
  private[this] lazy val controllers_TasksController_list11_invoker = createInvoker(
    TasksController_4.list,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TasksController",
      "list",
      Nil,
      "GET",
      """""",
      this.prefix + """tasks"""
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
  
    // @LINE:5
    case controllers_RecipesController_create2_route(params) =>
      call { 
        controllers_RecipesController_create2_invoker.call(RecipesController_0.create)
      }
  
    // @LINE:8
    case controllers_RecipesController_retrieveCache3_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_RecipesController_retrieveCache3_invoker.call(RecipesController_0.retrieveCache(id))
      }
  
    // @LINE:11
    case controllers_RecipesController_list4_route(params) =>
      call { 
        controllers_RecipesController_list4_invoker.call(RecipesController_0.list)
      }
  
    // @LINE:14
    case controllers_RecipesController_retrieve5_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_RecipesController_retrieve5_invoker.call(RecipesController_0.retrieve(id))
      }
  
    // @LINE:17
    case controllers_RecipesController_recipesByName6_route(params) =>
      call(params.fromPath[String]("name", None)) { (name) =>
        controllers_RecipesController_recipesByName6_invoker.call(RecipesController_0.recipesByName(name))
      }
  
    // @LINE:20
    case controllers_RecipesController_remove7_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_RecipesController_remove7_invoker.call(RecipesController_0.remove(id))
      }
  
    // @LINE:23
    case controllers_RecipesController_update8_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_RecipesController_update8_invoker.call(RecipesController_0.update(id))
      }
  
    // @LINE:26
    case controllers_RecipesController_recipesByTag9_route(params) =>
      call(params.fromPath[String]("name", None)) { (name) =>
        controllers_RecipesController_recipesByTag9_invoker.call(RecipesController_0.recipesByTag(name))
      }
  
    // @LINE:28
    case controllers_IngredientsController_list10_route(params) =>
      call { 
        controllers_IngredientsController_list10_invoker.call(IngredientsController_2.list)
      }
  
    // @LINE:30
    case controllers_TasksController_list11_route(params) =>
      call { 
        controllers_TasksController_list11_invoker.call(TasksController_4.list)
      }
  }
}
