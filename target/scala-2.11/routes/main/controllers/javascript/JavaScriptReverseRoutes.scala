
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/mayteecheverry/MyGitRepos/play/Recetas/conf/routes
// @DATE:Tue Jan 03 03:16:25 CET 2017

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:1
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:1
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:1
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:2
  class ReverseApp(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:2
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.App.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:8
  class ReverseRecipesController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def retrieve: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RecipesController.retrieve",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "recipe/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:22
    def recipesByTag: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RecipesController.recipesByTag",
      """
        function(name0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "recipe/tag/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("name", encodeURIComponent(name0))})
        }
      """
    )
  
    // @LINE:29
    def createFactory: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RecipesController.createFactory",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "recipesF"})
        }
      """
    )
  
    // @LINE:8
    def createJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RecipesController.createJson",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "recipesJ"})
        }
      """
    )
  
    // @LINE:20
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RecipesController.update",
      """
        function(id0) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "recipe/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:12
    def list: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RecipesController.list",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "recipes"})
        }
      """
    )
  
    // @LINE:18
    def remove: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RecipesController.remove",
      """
        function(id0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "recipe/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:10
    def retrieveCache: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RecipesController.retrieveCache",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "recipe_cache/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:16
    def recipesByName: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RecipesController.recipesByName",
      """
        function(name0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "recipe/name/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("name", encodeURIComponent(name0))})
        }
      """
    )
  
  }

  // @LINE:43
  class ReverseTasksController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:43
    def createTask: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TasksController.createTask",
      """
        function(idRec0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "recipes/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("idRec", idRec0) + "/task"})
        }
      """
    )
  
  }

  // @LINE:32
  class ReverseIngredientsController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:40
    def createIngTask: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.IngredientsController.createIngTask",
      """
        function(idI0,idT1) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "ingredients/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("idI", idI0) + "/task/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("idT", idT1)})
        }
      """
    )
  
    // @LINE:34
    def getIngId: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.IngredientsController.getIngId",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ingredients/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:32
    def createF: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.IngredientsController.createF",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "ingredients"})
        }
      """
    )
  
    // @LINE:36
    def getIngredients: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.IngredientsController.getIngredients",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ingredients"})
        }
      """
    )
  
    // @LINE:38
    def addRecipe: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.IngredientsController.addRecipe",
      """
        function(idI0,idR1) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "ingredients/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("idI", idI0) + "/recipe/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("idR", idR1)})
        }
      """
    )
  
  }


}
