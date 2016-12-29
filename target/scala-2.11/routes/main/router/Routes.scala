
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/mayteecheverry/MyGitRepos/play/Recetas/conf/routes
// @DATE:Wed Dec 28 22:19:41 CET 2016

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:2
  HomeController_0: controllers.HomeController,
  // @LINE:4
  Assets_3: controllers.Assets,
  // @LINE:6
  IngredientesController_1: controllers.IngredientesController,
  // @LINE:8
  TasksController_4: controllers.TasksController,
  // @LINE:11
  RecetasController_2: controllers.RecetasController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:2
    HomeController_0: controllers.HomeController,
    // @LINE:4
    Assets_3: controllers.Assets,
    // @LINE:6
    IngredientesController_1: controllers.IngredientesController,
    // @LINE:8
    TasksController_4: controllers.TasksController,
    // @LINE:11
    RecetasController_2: controllers.RecetasController
  ) = this(errorHandler, HomeController_0, Assets_3, IngredientesController_1, TasksController_4, RecetasController_2, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, Assets_3, IngredientesController_1, TasksController_4, RecetasController_2, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ingredientes""", """controllers.IngredientesController.list"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tasks""", """controllers.TasksController.list"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """recetas""", """controllers.RecetasController.list"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """receta/""" + "$" + """id<[^/]+>""", """controllers.RecetasController.retrieve(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """recetacache/""" + "$" + """id<[^/]+>""", """controllers.RecetasController.retrieveCache(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """recetas""", """controllers.RecetasController.create"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """receta/name/""" + "$" + """name<[^/]+>""", """controllers.RecetasController.getByName(name:String)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """receta/""" + "$" + """id<[^/]+>""", """controllers.RecetasController.remove(id:Long)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """receta/""" + "$" + """id<[^/]+>""", """controllers.RecetasController.update(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """receta/tag/""" + "$" + """name<[^/]+>""", """controllers.RecetasController.getRecipesByTag(name:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:2
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_0.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      """ An example controller showing a sample home page""",
      this.prefix + """"""
    )
  )

  // @LINE:4
  private[this] lazy val controllers_Assets_versioned1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned1_invoker = createInvoker(
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

  // @LINE:6
  private[this] lazy val controllers_IngredientesController_list2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ingredientes")))
  )
  private[this] lazy val controllers_IngredientesController_list2_invoker = createInvoker(
    IngredientesController_1.list,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.IngredientesController",
      "list",
      Nil,
      "GET",
      """""",
      this.prefix + """ingredientes"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_TasksController_list3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tasks")))
  )
  private[this] lazy val controllers_TasksController_list3_invoker = createInvoker(
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

  // @LINE:11
  private[this] lazy val controllers_RecetasController_list4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("recetas")))
  )
  private[this] lazy val controllers_RecetasController_list4_invoker = createInvoker(
    RecetasController_2.list,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RecetasController",
      "list",
      Nil,
      "GET",
      """ listar todas las recetas""",
      this.prefix + """recetas"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_RecetasController_retrieve5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("receta/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RecetasController_retrieve5_invoker = createInvoker(
    RecetasController_2.retrieve(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RecetasController",
      "retrieve",
      Seq(classOf[Long]),
      "GET",
      """ obtener datos de una receta""",
      this.prefix + """receta/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_RecetasController_retrieveCache6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("recetacache/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RecetasController_retrieveCache6_invoker = createInvoker(
    RecetasController_2.retrieveCache(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RecetasController",
      "retrieveCache",
      Seq(classOf[Long]),
      "GET",
      """ obtener datos de una receta de la caché""",
      this.prefix + """recetacache/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:20
  private[this] lazy val controllers_RecetasController_create7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("recetas")))
  )
  private[this] lazy val controllers_RecetasController_create7_invoker = createInvoker(
    RecetasController_2.create,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RecetasController",
      "create",
      Nil,
      "POST",
      """ crear un receta""",
      this.prefix + """recetas"""
    )
  )

  // @LINE:23
  private[this] lazy val controllers_RecetasController_getByName8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("receta/name/"), DynamicPart("name", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RecetasController_getByName8_invoker = createInvoker(
    RecetasController_2.getByName(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RecetasController",
      "getByName",
      Seq(classOf[String]),
      "GET",
      """Return the recipe with the given name""",
      this.prefix + """receta/name/""" + "$" + """name<[^/]+>"""
    )
  )

  // @LINE:26
  private[this] lazy val controllers_RecetasController_remove9_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("receta/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RecetasController_remove9_invoker = createInvoker(
    RecetasController_2.remove(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RecetasController",
      "remove",
      Seq(classOf[Long]),
      "DELETE",
      """Delete the recipe with the given id""",
      this.prefix + """receta/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:29
  private[this] lazy val controllers_RecetasController_update10_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("receta/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RecetasController_update10_invoker = createInvoker(
    RecetasController_2.update(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RecetasController",
      "update",
      Seq(classOf[Long]),
      "PUT",
      """Update the recipe with the given id""",
      this.prefix + """receta/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:32
  private[this] lazy val controllers_RecetasController_getRecipesByTag11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("receta/tag/"), DynamicPart("name", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RecetasController_getRecipesByTag11_invoker = createInvoker(
    RecetasController_2.getRecipesByTag(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RecetasController",
      "getRecipesByTag",
      Seq(classOf[String]),
      "GET",
      """Return a list of recipes with the given tag""",
      this.prefix + """receta/tag/""" + "$" + """name<[^/]+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:2
    case controllers_HomeController_index0_route(params) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_0.index)
      }
  
    // @LINE:4
    case controllers_Assets_versioned1_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned1_invoker.call(Assets_3.versioned(path, file))
      }
  
    // @LINE:6
    case controllers_IngredientesController_list2_route(params) =>
      call { 
        controllers_IngredientesController_list2_invoker.call(IngredientesController_1.list)
      }
  
    // @LINE:8
    case controllers_TasksController_list3_route(params) =>
      call { 
        controllers_TasksController_list3_invoker.call(TasksController_4.list)
      }
  
    // @LINE:11
    case controllers_RecetasController_list4_route(params) =>
      call { 
        controllers_RecetasController_list4_invoker.call(RecetasController_2.list)
      }
  
    // @LINE:14
    case controllers_RecetasController_retrieve5_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_RecetasController_retrieve5_invoker.call(RecetasController_2.retrieve(id))
      }
  
    // @LINE:17
    case controllers_RecetasController_retrieveCache6_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_RecetasController_retrieveCache6_invoker.call(RecetasController_2.retrieveCache(id))
      }
  
    // @LINE:20
    case controllers_RecetasController_create7_route(params) =>
      call { 
        controllers_RecetasController_create7_invoker.call(RecetasController_2.create)
      }
  
    // @LINE:23
    case controllers_RecetasController_getByName8_route(params) =>
      call(params.fromPath[String]("name", None)) { (name) =>
        controllers_RecetasController_getByName8_invoker.call(RecetasController_2.getByName(name))
      }
  
    // @LINE:26
    case controllers_RecetasController_remove9_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_RecetasController_remove9_invoker.call(RecetasController_2.remove(id))
      }
  
    // @LINE:29
    case controllers_RecetasController_update10_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_RecetasController_update10_invoker.call(RecetasController_2.update(id))
      }
  
    // @LINE:32
    case controllers_RecetasController_getRecipesByTag11_route(params) =>
      call(params.fromPath[String]("name", None)) { (name) =>
        controllers_RecetasController_getRecipesByTag11_invoker.call(RecetasController_2.getRecipesByTag(name))
      }
  }
}
