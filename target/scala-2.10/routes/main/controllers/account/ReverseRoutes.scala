
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/WebDev/workspace/RookieCards/conf/routes
// @DATE:Mon Jan 30 14:14:46 MST 2017

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:47
package controllers.account {

  // @LINE:47
  class ReverseSignup(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:93
    def create(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "signup")
    }
  
    // @LINE:47
    def createUser(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "adduser")
    }
  
    // @LINE:48
    def saveUser(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "adduser")
    }
  
    // @LINE:97
    def confirm(confirmToken:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "confirm/" + implicitly[PathBindable[String]].unbind("confirmToken", dynamicString(confirmToken)))
    }
  
    // @LINE:94
    def save(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "signup")
    }
  
  }

  // @LINE:80
  class ReverseReset(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:104
    def reset(token:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "reset/" + implicitly[PathBindable[String]].unbind("token", dynamicString(token)))
    }
  
    // @LINE:81
    def runResetUser(token:String): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "resetuser/" + implicitly[PathBindable[String]].unbind("token", dynamicString(token)))
    }
  
    // @LINE:105
    def runReset(token:String): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "reset/" + implicitly[PathBindable[String]].unbind("token", dynamicString(token)))
    }
  
    // @LINE:80
    def resetUser(token:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "resetuser/" + implicitly[PathBindable[String]].unbind("token", dynamicString(token)))
    }
  
    // @LINE:100
    def ask(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "reset/ask")
    }
  
    // @LINE:101
    def runAsk(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "reset/ask")
    }
  
  }


}