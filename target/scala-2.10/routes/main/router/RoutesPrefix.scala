
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/WebDev/workspace/RookieCards/conf/routes
// @DATE:Wed Feb 01 08:35:04 MST 2017


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
