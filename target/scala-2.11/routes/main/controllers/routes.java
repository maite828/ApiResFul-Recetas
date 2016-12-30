
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/mayteecheverry/MyGitRepos/play/Recetas/conf/routes
// @DATE:Fri Dec 30 02:31:56 CET 2016

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseTasksController TasksController = new controllers.ReverseTasksController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseRecipesController RecipesController = new controllers.ReverseRecipesController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseIngredientsController IngredientsController = new controllers.ReverseIngredientsController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseTasksController TasksController = new controllers.javascript.ReverseTasksController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseRecipesController RecipesController = new controllers.javascript.ReverseRecipesController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseIngredientsController IngredientsController = new controllers.javascript.ReverseIngredientsController(RoutesPrefix.byNamePrefix());
  }

}
