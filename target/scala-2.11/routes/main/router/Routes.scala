
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/mayteecheverry/MyGitRepos/play/Recetas/conf/routes
// @DATE:Fri Dec 30 01:03:30 CET 2016

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
  Assets_0: controllers.Assets,
  // @LINE:4
  RecetasController_2: controllers.RecetasController,
  // @LINE:27
  IngredientesController_1: controllers.IngredientesController,
  // @LINE:29
  TasksController_3: controllers.TasksController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:1
    Assets_0: controllers.Assets,
    // @LINE:4
    RecetasController_2: controllers.RecetasController,
    // @LINE:27
    IngredientesController_1: controllers.IngredientesController,
    // @LINE:29
    TasksController_3: controllers.TasksController
  ) = this(errorHandler, Assets_0, RecetasController_2, IngredientesController_1, TasksController_3, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Assets_0, RecetasController_2, IngredientesController_1, TasksController_3, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """recetas""", """controllers.RecetasController.create"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """recetacache/""" + "$" + """id<[^/]+>""", """controllers.RecetasController.retrieveCache(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """recetas""", """controllers.RecetasController.list"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """receta/""" + "$" + """id<[^/]+>""", """controllers.RecetasController.retrieve(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """receta/name/""" + "$" + """name<[^/]+>""", """controllers.RecetasController.recetasByName(name:String)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """receta/""" + "$" + """id<[^/]+>""", """controllers.RecetasController.remove(id:Long)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """receta/""" + "$" + """id<[^/]+>""", """controllers.RecetasController.update(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """receta/tag/""" + "$" + """name<[^/]+>""", """controllers.RecetasController.recetasByTag(name:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ingredientes""", """controllers.IngredientesController.list"""),
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
    Assets_0.versioned(fakeValue[String], fakeValue[Asset]),
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

  // @LINE:4
  private[this] lazy val controllers_RecetasController_create1_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("recetas")))
  )
  private[this] lazy val controllers_RecetasController_create1_invoker = createInvoker(
    RecetasController_2.create,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RecetasController",
      "create",
      Nil,
      "POST",
      """ CREAR RECETA""",
      this.prefix + """recetas"""
    )
  )

  // @LINE:7
  private[this] lazy val controllers_RecetasController_retrieveCache2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("recetacache/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RecetasController_retrieveCache2_invoker = createInvoker(
    RecetasController_2.retrieveCache(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RecetasController",
      "retrieveCache",
      Seq(classOf[Long]),
      "GET",
      """ RECETA POR ID EN CACHÉ""",
      this.prefix + """recetacache/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_RecetasController_list3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("recetas")))
  )
  private[this] lazy val controllers_RecetasController_list3_invoker = createInvoker(
    RecetasController_2.list,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RecetasController",
      "list",
      Nil,
      "GET",
      """ LISTA DE RECETAS""",
      this.prefix + """recetas"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_RecetasController_retrieve4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("receta/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RecetasController_retrieve4_invoker = createInvoker(
    RecetasController_2.retrieve(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RecetasController",
      "retrieve",
      Seq(classOf[Long]),
      "GET",
      """ RECETAS POR ID""",
      this.prefix + """receta/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_RecetasController_recetasByName5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("receta/name/"), DynamicPart("name", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RecetasController_recetasByName5_invoker = createInvoker(
    RecetasController_2.recetasByName(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RecetasController",
      "recetasByName",
      Seq(classOf[String]),
      "GET",
      """ RECETAS POR NOMBRE""",
      this.prefix + """receta/name/""" + "$" + """name<[^/]+>"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_RecetasController_remove6_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("receta/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RecetasController_remove6_invoker = createInvoker(
    RecetasController_2.remove(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RecetasController",
      "remove",
      Seq(classOf[Long]),
      "DELETE",
      """ ELEIMINAR RECETA POR ID""",
      this.prefix + """receta/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_RecetasController_update7_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("receta/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RecetasController_update7_invoker = createInvoker(
    RecetasController_2.update(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RecetasController",
      "update",
      Seq(classOf[Long]),
      "PUT",
      """ ACTUALIZAR RECETA POR ID""",
      this.prefix + """receta/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:25
  private[this] lazy val controllers_RecetasController_recetasByTag8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("receta/tag/"), DynamicPart("name", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RecetasController_recetasByTag8_invoker = createInvoker(
    RecetasController_2.recetasByTag(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RecetasController",
      "recetasByTag",
      Seq(classOf[String]),
      "GET",
      """ RECETAS POR TAG""",
      this.prefix + """receta/tag/""" + "$" + """name<[^/]+>"""
    )
  )

  // @LINE:27
  private[this] lazy val controllers_IngredientesController_list9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ingredientes")))
  )
  private[this] lazy val controllers_IngredientesController_list9_invoker = createInvoker(
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

  // @LINE:29
  private[this] lazy val controllers_TasksController_list10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tasks")))
  )
  private[this] lazy val controllers_TasksController_list10_invoker = createInvoker(
    TasksController_3.list,
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
        controllers_Assets_versioned0_invoker.call(Assets_0.versioned(path, file))
      }
  
    // @LINE:4
    case controllers_RecetasController_create1_route(params) =>
      call { 
        controllers_RecetasController_create1_invoker.call(RecetasController_2.create)
      }
  
    // @LINE:7
    case controllers_RecetasController_retrieveCache2_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_RecetasController_retrieveCache2_invoker.call(RecetasController_2.retrieveCache(id))
      }
  
    // @LINE:10
    case controllers_RecetasController_list3_route(params) =>
      call { 
        controllers_RecetasController_list3_invoker.call(RecetasController_2.list)
      }
  
    // @LINE:13
    case controllers_RecetasController_retrieve4_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_RecetasController_retrieve4_invoker.call(RecetasController_2.retrieve(id))
      }
  
    // @LINE:16
    case controllers_RecetasController_recetasByName5_route(params) =>
      call(params.fromPath[String]("name", None)) { (name) =>
        controllers_RecetasController_recetasByName5_invoker.call(RecetasController_2.recetasByName(name))
      }
  
    // @LINE:19
    case controllers_RecetasController_remove6_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_RecetasController_remove6_invoker.call(RecetasController_2.remove(id))
      }
  
    // @LINE:22
    case controllers_RecetasController_update7_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_RecetasController_update7_invoker.call(RecetasController_2.update(id))
      }
  
    // @LINE:25
    case controllers_RecetasController_recetasByTag8_route(params) =>
      call(params.fromPath[String]("name", None)) { (name) =>
        controllers_RecetasController_recetasByTag8_invoker.call(RecetasController_2.recetasByTag(name))
      }
  
    // @LINE:27
    case controllers_IngredientesController_list9_route(params) =>
      call { 
        controllers_IngredientesController_list9_invoker.call(IngredientesController_1.list)
      }
  
    // @LINE:29
    case controllers_TasksController_list10_route(params) =>
      call { 
        controllers_TasksController_list10_invoker.call(TasksController_3.list)
      }
  }
}
