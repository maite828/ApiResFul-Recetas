
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/mayteecheverry/MyGitRepos/play/Recetas/conf/routes
// @DATE:Fri Dec 30 01:03:30 CET 2016

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseIngredientesController IngredientesController = new controllers.ReverseIngredientesController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseTasksController TasksController = new controllers.ReverseTasksController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseRecetasController RecetasController = new controllers.ReverseRecetasController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseIngredientesController IngredientesController = new controllers.javascript.ReverseIngredientesController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseTasksController TasksController = new controllers.javascript.ReverseTasksController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseRecetasController RecetasController = new controllers.javascript.ReverseRecetasController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
  }

}
