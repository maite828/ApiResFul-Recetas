
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/mayteecheverry/MyGitRepos/play/Recetas/conf/routes
// @DATE:Sat Dec 31 23:19:45 CET 2016

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

  // @LINE:8
  class ReverseRecipesController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def retrieve(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "recipe/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:22
    def recipesByTag(name:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "recipe/tag/" + implicitly[PathBindable[String]].unbind("name", dynamicString(name)))
    }
  
    // @LINE:29
    def createFactory(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "recipesF")
    }
  
    // @LINE:8
    def createJson(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "recipesJ")
    }
  
    // @LINE:20
    def update(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "recipe/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:12
    def list(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "recipes")
    }
  
    // @LINE:18
    def remove(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("DELETE", _prefix + { _defaultPrefix } + "recipe/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:10
    def retrieveCache(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "recipe_cache/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:16
    def recipesByName(name:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "recipe/name/" + implicitly[PathBindable[String]].unbind("name", dynamicString(name)))
    }
  
  }

  // @LINE:43
  class ReverseTasksController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:43
    def createTask(idRec:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "recipes/" + implicitly[PathBindable[Long]].unbind("idRec", idRec) + "/task")
    }
  
  }

  // @LINE:32
  class ReverseIngredientsController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:40
    def createIngTask(idI:Long, idT:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "ingredients/" + implicitly[PathBindable[Long]].unbind("idI", idI) + "/task/" + implicitly[PathBindable[Long]].unbind("idT", idT))
    }
  
    // @LINE:34
    def getIngId(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "ingredients/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:32
    def createF(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "ingredients")
    }
  
    // @LINE:36
    def getIngredients(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "ingredients")
    }
  
    // @LINE:38
    def addRecipe(idI:Long, idR:Long): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "ingredients/" + implicitly[PathBindable[Long]].unbind("idI", idI) + "/recipe/" + implicitly[PathBindable[Long]].unbind("idR", idR))
    }
  
  }


}
