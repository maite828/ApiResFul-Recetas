
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/mayteecheverry/MyGitRepos/play/Recetas/conf/routes
// @DATE:Fri Dec 30 07:23:31 CET 2016

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:1
package controllers {

  // @LINE:1
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:1
    def versioned(file:Asset): Call = {
      implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:2
  class ReverseApp(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:2
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix)
    }
  
  }

  // @LINE:7
  class ReverseRecipesController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def retrieve(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "recipe/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:23
    def recipesByTag(name:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "recipe/tag/" + implicitly[PathBindable[String]].unbind("name", dynamicString(name)))
    }
  
    // @LINE:9
    def createFactory(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "recipesF")
    }
  
    // @LINE:7
    def createJson(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "recipesJ")
    }
  
    // @LINE:21
    def update(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "recipe/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:13
    def list(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "recipes")
    }
  
    // @LINE:19
    def remove(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("DELETE", _prefix + { _defaultPrefix } + "recipe/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:11
    def retrieveCache(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "recipe_cache/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:17
    def recipesByName(name:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "recipe/name/" + implicitly[PathBindable[String]].unbind("name", dynamicString(name)))
    }
  
  }

  // @LINE:41
  class ReverseTasksController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:41
    def createTask(idRec:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "recipes/" + implicitly[PathBindable[Long]].unbind("idRec", idRec) + "/createTask")
    }
  
  }

  // @LINE:28
  class ReverseIngredientsController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:34
    def createIngTask(idIng:Long, idTask:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "ingredients/" + implicitly[PathBindable[Long]].unbind("idIng", idIng) + "/task/" + implicitly[PathBindable[Long]].unbind("idTask", idTask))
    }
  
    // @LINE:30
    def getIngId(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "ingredients/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:28
    def createF(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "ingredients")
    }
  
    // @LINE:32
    def getIngredients(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "ingredients")
    }
  
    // @LINE:36
    def addRecipe(idIng:Long, idRec:Long): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "ingredients/" + implicitly[PathBindable[Long]].unbind("idIng", idIng) + "/recipe/" + implicitly[PathBindable[Long]].unbind("idRec", idRec))
    }
  
  }


}
