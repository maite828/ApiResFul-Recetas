
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/mayteecheverry/MyGitRepos/play/Recetas/conf/routes
// @DATE:Wed Dec 28 22:19:41 CET 2016


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
