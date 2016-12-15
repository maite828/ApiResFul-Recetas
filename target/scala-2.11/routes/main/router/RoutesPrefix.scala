
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/mayteecheverry/MyGitRepos/play/Recetas/conf/routes
// @DATE:Thu Dec 15 13:51:37 CET 2016


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
