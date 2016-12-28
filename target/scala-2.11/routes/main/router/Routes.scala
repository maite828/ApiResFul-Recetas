
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/mayteecheverry/MyGitRepos/play/Recetas/conf/routes
// @DATE:Wed Dec 28 17:01:51 CET 2016

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_1: controllers.HomeController,
  // @LINE:8
  CountController_0: controllers.CountController,
  // @LINE:10
  AsyncController_2: controllers.AsyncController,
  // @LINE:13
  Assets_4: controllers.Assets,
  // @LINE:16
  RecetasController_3: controllers.RecetasController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_1: controllers.HomeController,
    // @LINE:8
    CountController_0: controllers.CountController,
    // @LINE:10
    AsyncController_2: controllers.AsyncController,
    // @LINE:13
    Assets_4: controllers.Assets,
    // @LINE:16
    RecetasController_3: controllers.RecetasController
  ) = this(errorHandler, HomeController_1, CountController_0, AsyncController_2, Assets_4, RecetasController_3, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_1, CountController_0, AsyncController_2, Assets_4, RecetasController_3, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """count""", """controllers.CountController.count"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """message""", """controllers.AsyncController.message"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """recetas""", """controllers.RecetasController.list"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """receta/""" + "$" + """id<[^/]+>""", """controllers.RecetasController.retrieve(id:Long)"""),
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


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_1.index,
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

  // @LINE:8
  private[this] lazy val controllers_CountController_count1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("count")))
  )
  private[this] lazy val controllers_CountController_count1_invoker = createInvoker(
    CountController_0.count,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CountController",
      "count",
      Nil,
      "GET",
      """ An example controller showing how to use dependency injection""",
      this.prefix + """count"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_AsyncController_message2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("message")))
  )
  private[this] lazy val controllers_AsyncController_message2_invoker = createInvoker(
    AsyncController_2.message,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AsyncController",
      "message",
      Nil,
      "GET",
      """ An example controller showing how to write asynchronous code""",
      this.prefix + """message"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_Assets_versioned3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned3_invoker = createInvoker(
    Assets_4.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_RecetasController_list4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("recetas")))
  )
  private[this] lazy val controllers_RecetasController_list4_invoker = createInvoker(
    RecetasController_3.list,
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

  // @LINE:19
  private[this] lazy val controllers_RecetasController_retrieve5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("receta/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RecetasController_retrieve5_invoker = createInvoker(
    RecetasController_3.retrieve(fakeValue[Long]),
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

  // @LINE:24
  private[this] lazy val controllers_RecetasController_create6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("recetas")))
  )
  private[this] lazy val controllers_RecetasController_create6_invoker = createInvoker(
    RecetasController_3.create,
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

  // @LINE:27
  private[this] lazy val controllers_RecetasController_getByName7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("receta/name/"), DynamicPart("name", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RecetasController_getByName7_invoker = createInvoker(
    RecetasController_3.getByName(fakeValue[String]),
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

  // @LINE:30
  private[this] lazy val controllers_RecetasController_remove8_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("receta/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RecetasController_remove8_invoker = createInvoker(
    RecetasController_3.remove(fakeValue[Long]),
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

  // @LINE:33
  private[this] lazy val controllers_RecetasController_update9_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("receta/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RecetasController_update9_invoker = createInvoker(
    RecetasController_3.update(fakeValue[Long]),
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

  // @LINE:36
  private[this] lazy val controllers_RecetasController_getRecipesByTag10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("receta/tag/"), DynamicPart("name", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RecetasController_getRecipesByTag10_invoker = createInvoker(
    RecetasController_3.getRecipesByTag(fakeValue[String]),
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
  
    // @LINE:6
    case controllers_HomeController_index0_route(params) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_1.index)
      }
  
    // @LINE:8
    case controllers_CountController_count1_route(params) =>
      call { 
        controllers_CountController_count1_invoker.call(CountController_0.count)
      }
  
    // @LINE:10
    case controllers_AsyncController_message2_route(params) =>
      call { 
        controllers_AsyncController_message2_invoker.call(AsyncController_2.message)
      }
  
    // @LINE:13
    case controllers_Assets_versioned3_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned3_invoker.call(Assets_4.versioned(path, file))
      }
  
    // @LINE:16
    case controllers_RecetasController_list4_route(params) =>
      call { 
        controllers_RecetasController_list4_invoker.call(RecetasController_3.list)
      }
  
    // @LINE:19
    case controllers_RecetasController_retrieve5_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_RecetasController_retrieve5_invoker.call(RecetasController_3.retrieve(id))
      }
  
    // @LINE:24
    case controllers_RecetasController_create6_route(params) =>
      call { 
        controllers_RecetasController_create6_invoker.call(RecetasController_3.create)
      }
  
    // @LINE:27
    case controllers_RecetasController_getByName7_route(params) =>
      call(params.fromPath[String]("name", None)) { (name) =>
        controllers_RecetasController_getByName7_invoker.call(RecetasController_3.getByName(name))
      }
  
    // @LINE:30
    case controllers_RecetasController_remove8_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_RecetasController_remove8_invoker.call(RecetasController_3.remove(id))
      }
  
    // @LINE:33
    case controllers_RecetasController_update9_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_RecetasController_update9_invoker.call(RecetasController_3.update(id))
      }
  
    // @LINE:36
    case controllers_RecetasController_getRecipesByTag10_route(params) =>
      call(params.fromPath[String]("name", None)) { (name) =>
        controllers_RecetasController_getRecipesByTag10_invoker.call(RecetasController_3.getRecipesByTag(name))
      }
  }
}
