
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/mayteecheverry/MyGitRepos/play/Recetas/conf/routes
// @DATE:Sun Jan 01 19:22:59 CET 2017


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
