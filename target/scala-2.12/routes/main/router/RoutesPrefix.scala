
// @GENERATOR:play-routes-compiler
// @SOURCE:/media/sf_D_DRIVE/itt/wmdd1_ft_2017/WMDD12017CoreDesign/conf/routes
// @DATE:Wed Nov 15 10:37:10 GMT 2017


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
