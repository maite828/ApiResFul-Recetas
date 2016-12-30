
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/mayteecheverry/MyGitRepos/play/Recetas/conf/routes
// @DATE:Fri Dec 30 07:18:23 CET 2016

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:1
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:52
  class ReverseTasksController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:52
    def createTask: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TasksController.createTask",
      """
        function(idRec0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "recipes/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("idRec", idRec0) + "/createTask"})
        }
      """
    )
  
  }

  // @LINE:1
  class ReverseApp(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:1
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.App.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:7
  class ReverseRecipesController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:19
    def retrieve: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RecipesController.retrieve",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "recipe/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:31
    def recipesByTag: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RecipesController.recipesByTag",
      """
        function(name0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "recipe/tag/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("name", encodeURIComponent(name0))})
        }
      """
    )
  
    // @LINE:10
    def createFactory: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RecipesController.createFactory",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "recipesF"})
        }
      """
    )
  
    // @LINE:7
    def createJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RecipesController.createJson",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "recipesJ"})
        }
      """
    )
  
    // @LINE:28
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RecipesController.update",
      """
        function(id0) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "recipe/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:16
    def list: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RecipesController.list",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "recipes"})
        }
      """
    )
  
    // @LINE:25
    def remove: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RecipesController.remove",
      """
        function(id0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "recipe/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:13
    def retrieveCache: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RecipesController.retrieveCache",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "recipe_cache/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:22
    def recipesByName: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RecipesController.recipesByName",
      """
        function(name0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "recipe/name/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("name", encodeURIComponent(name0))})
        }
      """
    )
  
  }

  // @LINE:37
  class ReverseIngredientsController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:43
    def createIngTask: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.IngredientsController.createIngTask",
      """
        function(idIng0,idTask1) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "ingredients/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("idIng", idIng0) + "/task/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("idTask", idTask1)})
        }
      """
    )
  
    // @LINE:39
    def getIngId: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.IngredientsController.getIngId",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ingredients/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:37
    def createF: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.IngredientsController.createF",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "ingredients"})
        }
      """
    )
  
    // @LINE:41
    def getIngredients: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.IngredientsController.getIngredients",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ingredients"})
        }
      """
    )
  
    // @LINE:45
    def addRecipe: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.IngredientsController.addRecipe",
      """
        function(idIng0,idRec1) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "ingredients/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("idIng", idIng0) + "/recipe/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("idRec", idRec1)})
        }
      """
    )
  
  }


}
