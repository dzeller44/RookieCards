
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/WebDev/workspace/RookieCards/conf/routes
// @DATE:Mon Jan 30 14:14:46 MST 2017

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:86
package controllers.account.settings.javascript {
  import ReverseRouteContext.empty

  // @LINE:89
  class ReverseEmail(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:107
    def validateEmail: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.account.settings.Email.validateEmail",
      """
        function(token) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "email/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("token", encodeURIComponent(token))})
        }
      """
    )
  
    // @LINE:90
    def runEmail: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.account.settings.Email.runEmail",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "settings/email"})
        }
      """
    )
  
    // @LINE:89
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.account.settings.Email.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "settings/email"})
        }
      """
    )
  
  }

  // @LINE:87
  class ReversePassword(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:87
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.account.settings.Password.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "settings/password"})
        }
      """
    )
  
    // @LINE:88
    def runPassword: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.account.settings.Password.runPassword",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "settings/password"})
        }
      """
    )
  
  }

  // @LINE:86
  class ReverseIndex(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:86
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.account.settings.Index.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "settings"})
        }
      """
    )
  
  }


}