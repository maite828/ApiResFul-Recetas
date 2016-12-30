package controllers;


import play.mvc.*;
import views.html.index;


public class App extends Controller {

    /**
     * Get the index page
     *
     * @return Result
     */
    public Result index() {
        return ok(index.render("API REST for JAVA Play Framework"));
    }

}