
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/WebDev/workspace/RookieCards/conf/routes
// @DATE:Tue Jan 31 12:38:12 MST 2017

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:109
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:109
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.at",
      """
        function(file) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseApplication(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:60
    def updateUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.updateUser",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updateuser"})
        }
      """
    )
  
    // @LINE:55
    def deleteCard: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.deleteCard",
      """
        function(cardkey) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "deletecard/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("cardkey", encodeURIComponent(cardkey))})
        }
      """
    )
  
    // @LINE:71
    def openLookup: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.openLookup",
      """
        function(lookupkey) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "openlookup/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("lookupkey", encodeURIComponent(lookupkey))})
        }
      """
    )
  
    // @LINE:74
    def filterLookups: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.filterLookups",
      """
        function(type,value) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "filterlookups" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("type", type), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("value", value)])})
        }
      """
    )
  
    // @LINE:66
    def openUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.openUser",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "openuser"})
        }
      """
    )
  
    // @LINE:68
    def addLookup: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.addLookup",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addlookup"})
        }
      """
    )
  
    // @LINE:30
    def searchAllCards: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.searchAllCards",
      """
        function(searchText) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "mainsearch/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("searchText", encodeURIComponent(searchText))})
        }
      """
    )
  
    // @LINE:43
    def adminHome: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.adminHome",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin"})
        }
      """
    )
  
    // @LINE:33
    def updateCard: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.updateCard",
      """
        function(cardkey) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "opencard/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("cardkey", encodeURIComponent(cardkey))})
        }
      """
    )
  
    // @LINE:72
    def updateLookup: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.updateLookup",
      """
        function(lookupkey) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "openlookup/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("lookupkey", encodeURIComponent(lookupkey))})
        }
      """
    )
  
    // @LINE:82
    def initializeRecordUniqueKeys: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.initializeRecordUniqueKeys",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "initkeys"})
        }
      """
    )
  
    // @LINE:64
    def exportOpenFile: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.exportOpenFile",
      """
        function(fileName) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "exportOpenFile/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("fileName", encodeURIComponent(fileName))})
        }
      """
    )
  
    // @LINE:12
    def contactSend: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.contactSend",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "contact"})
        }
      """
    )
  
    // @LINE:22
    def saveCard: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.saveCard",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addcard"})
        }
      """
    )
  
    // @LINE:35
    def addComments: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.addComments",
      """
        function(uniquekey,comment) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addcomments" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("uniquekey", uniquekey), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("comment", comment)])})
        }
      """
    )
  
    // @LINE:54
    def deleteCardConfirm: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.deleteCardConfirm",
      """
        function(cardkey) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deletecard/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("cardkey", encodeURIComponent(cardkey))})
        }
      """
    )
  
    // @LINE:24
    def searchCards: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.searchCards",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "searchcards"})
        }
      """
    )
  
    // @LINE:26
    def userHome: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.userHome",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "user"})
        }
      """
    )
  
    // @LINE:58
    def getUserByEmailWildcard: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.getUserByEmailWildcard",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "finduser"})
        }
      """
    )
  
    // @LINE:9
    def logout: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.logout",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
        }
      """
    )
  
    // @LINE:28
    def filterCardSearch: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.filterCardSearch",
      """
        function(type,value) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "filtersearch" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("type", type), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("value", value)])})
        }
      """
    )
  
    // @LINE:50
    def userMaintenance: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.userMaintenance",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "adminuser"})
        }
      """
    )
  
    // @LINE:48
    def lookupMaintenance: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.lookupMaintenance",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tablemaint"})
        }
      """
    )
  
    // @LINE:15
    def openLogin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.openLogin",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "auth"})
        }
      """
    )
  
    // @LINE:18
    def accessDenied: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.accessDenied",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "accessdenied"})
        }
      """
    )
  
    // @LINE:37
    def reportsCreate: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.reportsCreate",
      """
        function(reportType) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "reports/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("reportType", encodeURIComponent(reportType))})
        }
      """
    )
  
    // @LINE:21
    def addCard: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.addCard",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addcard"})
        }
      """
    )
  
    // @LINE:76
    def deleteUserConfirm: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.deleteUserConfirm",
      """
        function(userkey) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deleteuser/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("userkey", encodeURIComponent(userkey))})
        }
      """
    )
  
    // @LINE:57
    def findUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.findUser",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "finduser"})
        }
      """
    )
  
    // @LINE:32
    def openCard: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.openCard",
      """
        function(cardkey) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "opencard/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("cardkey", encodeURIComponent(cardkey))})
        }
      """
    )
  
    // @LINE:77
    def deleteUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.deleteUser",
      """
        function(userkey) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "deleteuser/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("userkey", encodeURIComponent(userkey))})
        }
      """
    )
  
    // @LINE:8
    def authenticate: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.authenticate",
      """
        function() {
        
          if (true) {
            return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
          }
        
        }
      """
    )
  
    // @LINE:52
    def getAllUsers: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.getAllUsers",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "search"})
        }
      """
    )
  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:11
    def contact: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.contact",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "contact"})
        }
      """
    )
  
    // @LINE:39
    def openUserAccount: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.openUserAccount",
      """
        function(email) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "useraccount" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("email", email)])})
        }
      """
    )
  
    // @LINE:40
    def updateUserAccount: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.updateUserAccount",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "useraccount"})
        }
      """
    )
  
    // @LINE:69
    def saveLookup: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.saveLookup",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addlookup"})
        }
      """
    )
  
    // @LINE:62
    def exportUsers: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.exportUsers",
      """
        function(data) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "exportusers/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("data", encodeURIComponent(data))})
        }
      """
    )
  
  }


}