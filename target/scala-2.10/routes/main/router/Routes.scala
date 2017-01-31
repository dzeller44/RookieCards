
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/WebDev/workspace/RookieCards/conf/routes
// @DATE:Tue Jan 31 12:38:12 MST 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  Application_5: controllers.Application,
  // @LINE:45
  Signup_4: controllers.account.Signup,
  // @LINE:79
  Reset_0: controllers.account.Reset,
  // @LINE:85
  Index_6: controllers.account.settings.Index,
  // @LINE:86
  Password_1: controllers.account.settings.Password,
  // @LINE:88
  Email_2: controllers.account.settings.Email,
  // @LINE:109
  Assets_3: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Application_5: controllers.Application,
    // @LINE:45
    Signup_4: controllers.account.Signup,
    // @LINE:79
    Reset_0: controllers.account.Reset,
    // @LINE:85
    Index_6: controllers.account.settings.Index,
    // @LINE:86
    Password_1: controllers.account.settings.Password,
    // @LINE:88
    Email_2: controllers.account.settings.Email,
    // @LINE:109
    Assets_3: controllers.Assets
  ) = this(errorHandler, Application_5, Signup_4, Reset_0, Index_6, Password_1, Email_2, Assets_3, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_5, Signup_4, Reset_0, Index_6, Password_1, Email_2, Assets_3, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Application.index()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.Application.authenticate()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.Application.logout()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """contact""", """controllers.Application.contact()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """contact""", """controllers.Application.contactSend()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """auth""", """controllers.Application.openLogin()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """auth""", """controllers.Application.authenticate()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """accessdenied""", """controllers.Application.accessDenied()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addcard""", """controllers.Application.addCard()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addcard""", """controllers.Application.saveCard()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """searchcards""", """controllers.Application.searchCards()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user""", """controllers.Application.userHome()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """filtersearch""", """controllers.Application.filterCardSearch(type:String, value:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """mainsearch/$searchText<[^/]+>""", """controllers.Application.searchAllCards(searchText:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """opencard/$cardkey<[^/]+>""", """controllers.Application.openCard(cardkey:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """opencard/$cardkey<[^/]+>""", """controllers.Application.updateCard(cardkey:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addcomments""", """controllers.Application.addComments(uniquekey:String, comment:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """reports/$reportType<[^/]+>""", """controllers.Application.reportsCreate(reportType:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """useraccount""", """controllers.Application.openUserAccount(email:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """useraccount""", """controllers.Application.updateUserAccount()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin""", """controllers.Application.adminHome()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """adduser""", """controllers.account.Signup.createUser()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """adduser""", """controllers.account.Signup.saveUser()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tablemaint""", """controllers.Application.lookupMaintenance()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """adminuser""", """controllers.Application.userMaintenance()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """search""", """controllers.Application.getAllUsers()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deletecard/$cardkey<[^/]+>""", """controllers.Application.deleteCardConfirm(cardkey:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deletecard/$cardkey<[^/]+>""", """controllers.Application.deleteCard(cardkey:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """finduser""", """controllers.Application.findUser()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """finduser""", """controllers.Application.getUserByEmailWildcard()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateuser""", """controllers.Application.updateUser()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """exportusers/$data<[^/]+>""", """controllers.Application.exportUsers(data:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """exportOpenFile/$fileName<[^/]+>""", """controllers.Application.exportOpenFile(fileName:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """openuser""", """controllers.Application.openUser()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addlookup""", """controllers.Application.addLookup()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addlookup""", """controllers.Application.saveLookup()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """openlookup/$lookupkey<[^/]+>""", """controllers.Application.openLookup(lookupkey:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """openlookup/$lookupkey<[^/]+>""", """controllers.Application.updateLookup(lookupkey:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """filterlookups""", """controllers.Application.filterLookups(type:String, value:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deleteuser/$userkey<[^/]+>""", """controllers.Application.deleteUserConfirm(userkey:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deleteuser/$userkey<[^/]+>""", """controllers.Application.deleteUser(userkey:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """resetuser/$token<[^/]+>""", """controllers.account.Reset.resetUser(token:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """resetuser/$token<[^/]+>""", """controllers.account.Reset.runResetUser(token:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """initkeys""", """controllers.Application.initializeRecordUniqueKeys()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """settings""", """controllers.account.settings.Index.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """settings/password""", """controllers.account.settings.Password.index()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """settings/password""", """controllers.account.settings.Password.runPassword()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """settings/email""", """controllers.account.settings.Email.index()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """settings/email""", """controllers.account.settings.Email.runEmail()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signup""", """controllers.account.Signup.create()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signup""", """controllers.account.Signup.save()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """confirm/$confirmToken<[^/]+>""", """controllers.account.Signup.confirm(confirmToken:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """reset/ask""", """controllers.account.Reset.ask()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """reset/ask""", """controllers.account.Reset.runAsk()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """reset/$token<[^/]+>""", """controllers.account.Reset.reset(token:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """reset/$token<[^/]+>""", """controllers.account.Reset.runReset(token:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """email/$token<[^/]+>""", """controllers.account.settings.Email.validateEmail(token:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""", """controllers.Assets.at(path:String = "/public", file:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_Application_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_index0_invoker = createInvoker(
    Application_5.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index",
      Nil,
      "GET",
      """ Home page""",
      this.prefix + """"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_Application_authenticate1_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_Application_authenticate1_invoker = createInvoker(
    Application_5.authenticate(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "authenticate",
      Nil,
      "POST",
      """""",
      this.prefix + """login"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_Application_logout2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_Application_logout2_invoker = createInvoker(
    Application_5.logout(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "logout",
      Nil,
      "GET",
      """""",
      this.prefix + """logout"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_Application_contact3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("contact")))
  )
  private[this] lazy val controllers_Application_contact3_invoker = createInvoker(
    Application_5.contact(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "contact",
      Nil,
      "GET",
      """""",
      this.prefix + """contact"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_Application_contactSend4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("contact")))
  )
  private[this] lazy val controllers_Application_contactSend4_invoker = createInvoker(
    Application_5.contactSend(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "contactSend",
      Nil,
      "POST",
      """""",
      this.prefix + """contact"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_Application_openLogin5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("auth")))
  )
  private[this] lazy val controllers_Application_openLogin5_invoker = createInvoker(
    Application_5.openLogin(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "openLogin",
      Nil,
      "GET",
      """ Authenticates/Logins the user...""",
      this.prefix + """auth"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_Application_authenticate6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("auth")))
  )
  private[this] lazy val controllers_Application_authenticate6_invoker = createInvoker(
    Application_5.authenticate(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "authenticate",
      Nil,
      "POST",
      """""",
      this.prefix + """auth"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_Application_accessDenied7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("accessdenied")))
  )
  private[this] lazy val controllers_Application_accessDenied7_invoker = createInvoker(
    Application_5.accessDenied(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "accessDenied",
      Nil,
      "GET",
      """""",
      this.prefix + """accessdenied"""
    )
  )

  // @LINE:21
  private[this] lazy val controllers_Application_addCard8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addcard")))
  )
  private[this] lazy val controllers_Application_addCard8_invoker = createInvoker(
    Application_5.addCard(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "addCard",
      Nil,
      "GET",
      """ User pages...""",
      this.prefix + """addcard"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_Application_saveCard9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addcard")))
  )
  private[this] lazy val controllers_Application_saveCard9_invoker = createInvoker(
    Application_5.saveCard(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "saveCard",
      Nil,
      "POST",
      """""",
      this.prefix + """addcard"""
    )
  )

  // @LINE:24
  private[this] lazy val controllers_Application_searchCards10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("searchcards")))
  )
  private[this] lazy val controllers_Application_searchCards10_invoker = createInvoker(
    Application_5.searchCards(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "searchCards",
      Nil,
      "GET",
      """""",
      this.prefix + """searchcards"""
    )
  )

  // @LINE:26
  private[this] lazy val controllers_Application_userHome11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user")))
  )
  private[this] lazy val controllers_Application_userHome11_invoker = createInvoker(
    Application_5.userHome(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "userHome",
      Nil,
      "GET",
      """""",
      this.prefix + """user"""
    )
  )

  // @LINE:28
  private[this] lazy val controllers_Application_filterCardSearch12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("filtersearch")))
  )
  private[this] lazy val controllers_Application_filterCardSearch12_invoker = createInvoker(
    Application_5.filterCardSearch(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "filterCardSearch",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """filtersearch"""
    )
  )

  // @LINE:30
  private[this] lazy val controllers_Application_searchAllCards13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("mainsearch/"), DynamicPart("searchText", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_searchAllCards13_invoker = createInvoker(
    Application_5.searchAllCards(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "searchAllCards",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """mainsearch/$searchText<[^/]+>"""
    )
  )

  // @LINE:32
  private[this] lazy val controllers_Application_openCard14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("opencard/"), DynamicPart("cardkey", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_openCard14_invoker = createInvoker(
    Application_5.openCard(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "openCard",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """opencard/$cardkey<[^/]+>"""
    )
  )

  // @LINE:33
  private[this] lazy val controllers_Application_updateCard15_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("opencard/"), DynamicPart("cardkey", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_updateCard15_invoker = createInvoker(
    Application_5.updateCard(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "updateCard",
      Seq(classOf[String]),
      "POST",
      """""",
      this.prefix + """opencard/$cardkey<[^/]+>"""
    )
  )

  // @LINE:35
  private[this] lazy val controllers_Application_addComments16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addcomments")))
  )
  private[this] lazy val controllers_Application_addComments16_invoker = createInvoker(
    Application_5.addComments(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "addComments",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """addcomments"""
    )
  )

  // @LINE:37
  private[this] lazy val controllers_Application_reportsCreate17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("reports/"), DynamicPart("reportType", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_reportsCreate17_invoker = createInvoker(
    Application_5.reportsCreate(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "reportsCreate",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """reports/$reportType<[^/]+>"""
    )
  )

  // @LINE:39
  private[this] lazy val controllers_Application_openUserAccount18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("useraccount")))
  )
  private[this] lazy val controllers_Application_openUserAccount18_invoker = createInvoker(
    Application_5.openUserAccount(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "openUserAccount",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """useraccount"""
    )
  )

  // @LINE:40
  private[this] lazy val controllers_Application_updateUserAccount19_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("useraccount")))
  )
  private[this] lazy val controllers_Application_updateUserAccount19_invoker = createInvoker(
    Application_5.updateUserAccount(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "updateUserAccount",
      Nil,
      "POST",
      """""",
      this.prefix + """useraccount"""
    )
  )

  // @LINE:43
  private[this] lazy val controllers_Application_adminHome20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin")))
  )
  private[this] lazy val controllers_Application_adminHome20_invoker = createInvoker(
    Application_5.adminHome(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "adminHome",
      Nil,
      "GET",
      """ Admin pages...""",
      this.prefix + """admin"""
    )
  )

  // @LINE:45
  private[this] lazy val controllers_account_Signup_createUser21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("adduser")))
  )
  private[this] lazy val controllers_account_Signup_createUser21_invoker = createInvoker(
    Signup_4.createUser(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.account.Signup",
      "createUser",
      Nil,
      "GET",
      """""",
      this.prefix + """adduser"""
    )
  )

  // @LINE:46
  private[this] lazy val controllers_account_Signup_saveUser22_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("adduser")))
  )
  private[this] lazy val controllers_account_Signup_saveUser22_invoker = createInvoker(
    Signup_4.saveUser(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.account.Signup",
      "saveUser",
      Nil,
      "POST",
      """""",
      this.prefix + """adduser"""
    )
  )

  // @LINE:48
  private[this] lazy val controllers_Application_lookupMaintenance23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tablemaint")))
  )
  private[this] lazy val controllers_Application_lookupMaintenance23_invoker = createInvoker(
    Application_5.lookupMaintenance(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "lookupMaintenance",
      Nil,
      "GET",
      """""",
      this.prefix + """tablemaint"""
    )
  )

  // @LINE:50
  private[this] lazy val controllers_Application_userMaintenance24_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("adminuser")))
  )
  private[this] lazy val controllers_Application_userMaintenance24_invoker = createInvoker(
    Application_5.userMaintenance(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "userMaintenance",
      Nil,
      "GET",
      """""",
      this.prefix + """adminuser"""
    )
  )

  // @LINE:52
  private[this] lazy val controllers_Application_getAllUsers25_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("search")))
  )
  private[this] lazy val controllers_Application_getAllUsers25_invoker = createInvoker(
    Application_5.getAllUsers(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "getAllUsers",
      Nil,
      "GET",
      """""",
      this.prefix + """search"""
    )
  )

  // @LINE:54
  private[this] lazy val controllers_Application_deleteCardConfirm26_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deletecard/"), DynamicPart("cardkey", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_deleteCardConfirm26_invoker = createInvoker(
    Application_5.deleteCardConfirm(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "deleteCardConfirm",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """deletecard/$cardkey<[^/]+>"""
    )
  )

  // @LINE:55
  private[this] lazy val controllers_Application_deleteCard27_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deletecard/"), DynamicPart("cardkey", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_deleteCard27_invoker = createInvoker(
    Application_5.deleteCard(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "deleteCard",
      Seq(classOf[String]),
      "POST",
      """""",
      this.prefix + """deletecard/$cardkey<[^/]+>"""
    )
  )

  // @LINE:57
  private[this] lazy val controllers_Application_findUser28_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("finduser")))
  )
  private[this] lazy val controllers_Application_findUser28_invoker = createInvoker(
    Application_5.findUser(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "findUser",
      Nil,
      "GET",
      """""",
      this.prefix + """finduser"""
    )
  )

  // @LINE:58
  private[this] lazy val controllers_Application_getUserByEmailWildcard29_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("finduser")))
  )
  private[this] lazy val controllers_Application_getUserByEmailWildcard29_invoker = createInvoker(
    Application_5.getUserByEmailWildcard(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "getUserByEmailWildcard",
      Nil,
      "POST",
      """""",
      this.prefix + """finduser"""
    )
  )

  // @LINE:60
  private[this] lazy val controllers_Application_updateUser30_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateuser")))
  )
  private[this] lazy val controllers_Application_updateUser30_invoker = createInvoker(
    Application_5.updateUser(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "updateUser",
      Nil,
      "POST",
      """""",
      this.prefix + """updateuser"""
    )
  )

  // @LINE:62
  private[this] lazy val controllers_Application_exportUsers31_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("exportusers/"), DynamicPart("data", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_exportUsers31_invoker = createInvoker(
    Application_5.exportUsers(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "exportUsers",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """exportusers/$data<[^/]+>"""
    )
  )

  // @LINE:64
  private[this] lazy val controllers_Application_exportOpenFile32_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("exportOpenFile/"), DynamicPart("fileName", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_exportOpenFile32_invoker = createInvoker(
    Application_5.exportOpenFile(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "exportOpenFile",
      Seq(classOf[String]),
      "POST",
      """""",
      this.prefix + """exportOpenFile/$fileName<[^/]+>"""
    )
  )

  // @LINE:66
  private[this] lazy val controllers_Application_openUser33_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("openuser")))
  )
  private[this] lazy val controllers_Application_openUser33_invoker = createInvoker(
    Application_5.openUser(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "openUser",
      Nil,
      "GET",
      """""",
      this.prefix + """openuser"""
    )
  )

  // @LINE:68
  private[this] lazy val controllers_Application_addLookup34_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addlookup")))
  )
  private[this] lazy val controllers_Application_addLookup34_invoker = createInvoker(
    Application_5.addLookup(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "addLookup",
      Nil,
      "GET",
      """""",
      this.prefix + """addlookup"""
    )
  )

  // @LINE:69
  private[this] lazy val controllers_Application_saveLookup35_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addlookup")))
  )
  private[this] lazy val controllers_Application_saveLookup35_invoker = createInvoker(
    Application_5.saveLookup(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "saveLookup",
      Nil,
      "POST",
      """""",
      this.prefix + """addlookup"""
    )
  )

  // @LINE:71
  private[this] lazy val controllers_Application_openLookup36_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("openlookup/"), DynamicPart("lookupkey", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_openLookup36_invoker = createInvoker(
    Application_5.openLookup(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "openLookup",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """openlookup/$lookupkey<[^/]+>"""
    )
  )

  // @LINE:72
  private[this] lazy val controllers_Application_updateLookup37_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("openlookup/"), DynamicPart("lookupkey", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_updateLookup37_invoker = createInvoker(
    Application_5.updateLookup(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "updateLookup",
      Seq(classOf[String]),
      "POST",
      """""",
      this.prefix + """openlookup/$lookupkey<[^/]+>"""
    )
  )

  // @LINE:74
  private[this] lazy val controllers_Application_filterLookups38_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("filterlookups")))
  )
  private[this] lazy val controllers_Application_filterLookups38_invoker = createInvoker(
    Application_5.filterLookups(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "filterLookups",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """filterlookups"""
    )
  )

  // @LINE:76
  private[this] lazy val controllers_Application_deleteUserConfirm39_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteuser/"), DynamicPart("userkey", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_deleteUserConfirm39_invoker = createInvoker(
    Application_5.deleteUserConfirm(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "deleteUserConfirm",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """deleteuser/$userkey<[^/]+>"""
    )
  )

  // @LINE:77
  private[this] lazy val controllers_Application_deleteUser40_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteuser/"), DynamicPart("userkey", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_deleteUser40_invoker = createInvoker(
    Application_5.deleteUser(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "deleteUser",
      Seq(classOf[String]),
      "POST",
      """""",
      this.prefix + """deleteuser/$userkey<[^/]+>"""
    )
  )

  // @LINE:79
  private[this] lazy val controllers_account_Reset_resetUser41_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("resetuser/"), DynamicPart("token", """[^/]+""",true)))
  )
  private[this] lazy val controllers_account_Reset_resetUser41_invoker = createInvoker(
    Reset_0.resetUser(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.account.Reset",
      "resetUser",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """resetuser/$token<[^/]+>"""
    )
  )

  // @LINE:80
  private[this] lazy val controllers_account_Reset_runResetUser42_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("resetuser/"), DynamicPart("token", """[^/]+""",true)))
  )
  private[this] lazy val controllers_account_Reset_runResetUser42_invoker = createInvoker(
    Reset_0.runResetUser(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.account.Reset",
      "runResetUser",
      Seq(classOf[String]),
      "POST",
      """""",
      this.prefix + """resetuser/$token<[^/]+>"""
    )
  )

  // @LINE:82
  private[this] lazy val controllers_Application_initializeRecordUniqueKeys43_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("initkeys")))
  )
  private[this] lazy val controllers_Application_initializeRecordUniqueKeys43_invoker = createInvoker(
    Application_5.initializeRecordUniqueKeys(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "initializeRecordUniqueKeys",
      Nil,
      "GET",
      """""",
      this.prefix + """initkeys"""
    )
  )

  // @LINE:85
  private[this] lazy val controllers_account_settings_Index_index44_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("settings")))
  )
  private[this] lazy val controllers_account_settings_Index_index44_invoker = createInvoker(
    Index_6.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.account.settings.Index",
      "index",
      Nil,
      "GET",
      """ User settings...""",
      this.prefix + """settings"""
    )
  )

  // @LINE:86
  private[this] lazy val controllers_account_settings_Password_index45_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("settings/password")))
  )
  private[this] lazy val controllers_account_settings_Password_index45_invoker = createInvoker(
    Password_1.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.account.settings.Password",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """settings/password"""
    )
  )

  // @LINE:87
  private[this] lazy val controllers_account_settings_Password_runPassword46_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("settings/password")))
  )
  private[this] lazy val controllers_account_settings_Password_runPassword46_invoker = createInvoker(
    Password_1.runPassword(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.account.settings.Password",
      "runPassword",
      Nil,
      "POST",
      """""",
      this.prefix + """settings/password"""
    )
  )

  // @LINE:88
  private[this] lazy val controllers_account_settings_Email_index47_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("settings/email")))
  )
  private[this] lazy val controllers_account_settings_Email_index47_invoker = createInvoker(
    Email_2.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.account.settings.Email",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """settings/email"""
    )
  )

  // @LINE:89
  private[this] lazy val controllers_account_settings_Email_runEmail48_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("settings/email")))
  )
  private[this] lazy val controllers_account_settings_Email_runEmail48_invoker = createInvoker(
    Email_2.runEmail(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.account.settings.Email",
      "runEmail",
      Nil,
      "POST",
      """""",
      this.prefix + """settings/email"""
    )
  )

  // @LINE:92
  private[this] lazy val controllers_account_Signup_create49_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup")))
  )
  private[this] lazy val controllers_account_Signup_create49_invoker = createInvoker(
    Signup_4.create(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.account.Signup",
      "create",
      Nil,
      "GET",
      """ Registers the user, sending an email to confirm the account.""",
      this.prefix + """signup"""
    )
  )

  // @LINE:93
  private[this] lazy val controllers_account_Signup_save50_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup")))
  )
  private[this] lazy val controllers_account_Signup_save50_invoker = createInvoker(
    Signup_4.save(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.account.Signup",
      "save",
      Nil,
      "POST",
      """""",
      this.prefix + """signup"""
    )
  )

  // @LINE:96
  private[this] lazy val controllers_account_Signup_confirm51_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("confirm/"), DynamicPart("confirmToken", """[^/]+""",true)))
  )
  private[this] lazy val controllers_account_Signup_confirm51_invoker = createInvoker(
    Signup_4.confirm(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.account.Signup",
      "confirm",
      Seq(classOf[String]),
      "GET",
      """ Accessed when the user confirms the registration.""",
      this.prefix + """confirm/$confirmToken<[^/]+>"""
    )
  )

  // @LINE:99
  private[this] lazy val controllers_account_Reset_ask52_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("reset/ask")))
  )
  private[this] lazy val controllers_account_Reset_ask52_invoker = createInvoker(
    Reset_0.ask(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.account.Reset",
      "ask",
      Nil,
      "GET",
      """ Displays a page to send a reset email given the user's email.""",
      this.prefix + """reset/ask"""
    )
  )

  // @LINE:100
  private[this] lazy val controllers_account_Reset_runAsk53_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("reset/ask")))
  )
  private[this] lazy val controllers_account_Reset_runAsk53_invoker = createInvoker(
    Reset_0.runAsk(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.account.Reset",
      "runAsk",
      Nil,
      "POST",
      """""",
      this.prefix + """reset/ask"""
    )
  )

  // @LINE:103
  private[this] lazy val controllers_account_Reset_reset54_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("reset/"), DynamicPart("token", """[^/]+""",true)))
  )
  private[this] lazy val controllers_account_Reset_reset54_invoker = createInvoker(
    Reset_0.reset(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.account.Reset",
      "reset",
      Seq(classOf[String]),
      "GET",
      """ Resets the password using the password.""",
      this.prefix + """reset/$token<[^/]+>"""
    )
  )

  // @LINE:104
  private[this] lazy val controllers_account_Reset_runReset55_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("reset/"), DynamicPart("token", """[^/]+""",true)))
  )
  private[this] lazy val controllers_account_Reset_runReset55_invoker = createInvoker(
    Reset_0.runReset(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.account.Reset",
      "runReset",
      Seq(classOf[String]),
      "POST",
      """""",
      this.prefix + """reset/$token<[^/]+>"""
    )
  )

  // @LINE:106
  private[this] lazy val controllers_account_settings_Email_validateEmail56_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("email/"), DynamicPart("token", """[^/]+""",true)))
  )
  private[this] lazy val controllers_account_settings_Email_validateEmail56_invoker = createInvoker(
    Email_2.validateEmail(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.account.settings.Email",
      "validateEmail",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """email/$token<[^/]+>"""
    )
  )

  // @LINE:109
  private[this] lazy val controllers_Assets_at57_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at57_invoker = createInvoker(
    Assets_3.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/$file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_Application_index0_route(params) =>
      call { 
        controllers_Application_index0_invoker.call(Application_5.index())
      }
  
    // @LINE:8
    case controllers_Application_authenticate1_route(params) =>
      call { 
        controllers_Application_authenticate1_invoker.call(Application_5.authenticate())
      }
  
    // @LINE:9
    case controllers_Application_logout2_route(params) =>
      call { 
        controllers_Application_logout2_invoker.call(Application_5.logout())
      }
  
    // @LINE:11
    case controllers_Application_contact3_route(params) =>
      call { 
        controllers_Application_contact3_invoker.call(Application_5.contact())
      }
  
    // @LINE:12
    case controllers_Application_contactSend4_route(params) =>
      call { 
        controllers_Application_contactSend4_invoker.call(Application_5.contactSend())
      }
  
    // @LINE:15
    case controllers_Application_openLogin5_route(params) =>
      call { 
        controllers_Application_openLogin5_invoker.call(Application_5.openLogin())
      }
  
    // @LINE:16
    case controllers_Application_authenticate6_route(params) =>
      call { 
        controllers_Application_authenticate6_invoker.call(Application_5.authenticate())
      }
  
    // @LINE:18
    case controllers_Application_accessDenied7_route(params) =>
      call { 
        controllers_Application_accessDenied7_invoker.call(Application_5.accessDenied())
      }
  
    // @LINE:21
    case controllers_Application_addCard8_route(params) =>
      call { 
        controllers_Application_addCard8_invoker.call(Application_5.addCard())
      }
  
    // @LINE:22
    case controllers_Application_saveCard9_route(params) =>
      call { 
        controllers_Application_saveCard9_invoker.call(Application_5.saveCard())
      }
  
    // @LINE:24
    case controllers_Application_searchCards10_route(params) =>
      call { 
        controllers_Application_searchCards10_invoker.call(Application_5.searchCards())
      }
  
    // @LINE:26
    case controllers_Application_userHome11_route(params) =>
      call { 
        controllers_Application_userHome11_invoker.call(Application_5.userHome())
      }
  
    // @LINE:28
    case controllers_Application_filterCardSearch12_route(params) =>
      call(params.fromQuery[String]("type", None), params.fromQuery[String]("value", None)) { (_pf_escape_type, value) =>
        controllers_Application_filterCardSearch12_invoker.call(Application_5.filterCardSearch(_pf_escape_type, value))
      }
  
    // @LINE:30
    case controllers_Application_searchAllCards13_route(params) =>
      call(params.fromPath[String]("searchText", None)) { (searchText) =>
        controllers_Application_searchAllCards13_invoker.call(Application_5.searchAllCards(searchText))
      }
  
    // @LINE:32
    case controllers_Application_openCard14_route(params) =>
      call(params.fromPath[String]("cardkey", None)) { (cardkey) =>
        controllers_Application_openCard14_invoker.call(Application_5.openCard(cardkey))
      }
  
    // @LINE:33
    case controllers_Application_updateCard15_route(params) =>
      call(params.fromPath[String]("cardkey", None)) { (cardkey) =>
        controllers_Application_updateCard15_invoker.call(Application_5.updateCard(cardkey))
      }
  
    // @LINE:35
    case controllers_Application_addComments16_route(params) =>
      call(params.fromQuery[String]("uniquekey", None), params.fromQuery[String]("comment", None)) { (uniquekey, comment) =>
        controllers_Application_addComments16_invoker.call(Application_5.addComments(uniquekey, comment))
      }
  
    // @LINE:37
    case controllers_Application_reportsCreate17_route(params) =>
      call(params.fromPath[String]("reportType", None)) { (reportType) =>
        controllers_Application_reportsCreate17_invoker.call(Application_5.reportsCreate(reportType))
      }
  
    // @LINE:39
    case controllers_Application_openUserAccount18_route(params) =>
      call(params.fromQuery[String]("email", None)) { (email) =>
        controllers_Application_openUserAccount18_invoker.call(Application_5.openUserAccount(email))
      }
  
    // @LINE:40
    case controllers_Application_updateUserAccount19_route(params) =>
      call { 
        controllers_Application_updateUserAccount19_invoker.call(Application_5.updateUserAccount())
      }
  
    // @LINE:43
    case controllers_Application_adminHome20_route(params) =>
      call { 
        controllers_Application_adminHome20_invoker.call(Application_5.adminHome())
      }
  
    // @LINE:45
    case controllers_account_Signup_createUser21_route(params) =>
      call { 
        controllers_account_Signup_createUser21_invoker.call(Signup_4.createUser())
      }
  
    // @LINE:46
    case controllers_account_Signup_saveUser22_route(params) =>
      call { 
        controllers_account_Signup_saveUser22_invoker.call(Signup_4.saveUser())
      }
  
    // @LINE:48
    case controllers_Application_lookupMaintenance23_route(params) =>
      call { 
        controllers_Application_lookupMaintenance23_invoker.call(Application_5.lookupMaintenance())
      }
  
    // @LINE:50
    case controllers_Application_userMaintenance24_route(params) =>
      call { 
        controllers_Application_userMaintenance24_invoker.call(Application_5.userMaintenance())
      }
  
    // @LINE:52
    case controllers_Application_getAllUsers25_route(params) =>
      call { 
        controllers_Application_getAllUsers25_invoker.call(Application_5.getAllUsers())
      }
  
    // @LINE:54
    case controllers_Application_deleteCardConfirm26_route(params) =>
      call(params.fromPath[String]("cardkey", None)) { (cardkey) =>
        controllers_Application_deleteCardConfirm26_invoker.call(Application_5.deleteCardConfirm(cardkey))
      }
  
    // @LINE:55
    case controllers_Application_deleteCard27_route(params) =>
      call(params.fromPath[String]("cardkey", None)) { (cardkey) =>
        controllers_Application_deleteCard27_invoker.call(Application_5.deleteCard(cardkey))
      }
  
    // @LINE:57
    case controllers_Application_findUser28_route(params) =>
      call { 
        controllers_Application_findUser28_invoker.call(Application_5.findUser())
      }
  
    // @LINE:58
    case controllers_Application_getUserByEmailWildcard29_route(params) =>
      call { 
        controllers_Application_getUserByEmailWildcard29_invoker.call(Application_5.getUserByEmailWildcard())
      }
  
    // @LINE:60
    case controllers_Application_updateUser30_route(params) =>
      call { 
        controllers_Application_updateUser30_invoker.call(Application_5.updateUser())
      }
  
    // @LINE:62
    case controllers_Application_exportUsers31_route(params) =>
      call(params.fromPath[String]("data", None)) { (data) =>
        controllers_Application_exportUsers31_invoker.call(Application_5.exportUsers(data))
      }
  
    // @LINE:64
    case controllers_Application_exportOpenFile32_route(params) =>
      call(params.fromPath[String]("fileName", None)) { (fileName) =>
        controllers_Application_exportOpenFile32_invoker.call(Application_5.exportOpenFile(fileName))
      }
  
    // @LINE:66
    case controllers_Application_openUser33_route(params) =>
      call { 
        controllers_Application_openUser33_invoker.call(Application_5.openUser())
      }
  
    // @LINE:68
    case controllers_Application_addLookup34_route(params) =>
      call { 
        controllers_Application_addLookup34_invoker.call(Application_5.addLookup())
      }
  
    // @LINE:69
    case controllers_Application_saveLookup35_route(params) =>
      call { 
        controllers_Application_saveLookup35_invoker.call(Application_5.saveLookup())
      }
  
    // @LINE:71
    case controllers_Application_openLookup36_route(params) =>
      call(params.fromPath[String]("lookupkey", None)) { (lookupkey) =>
        controllers_Application_openLookup36_invoker.call(Application_5.openLookup(lookupkey))
      }
  
    // @LINE:72
    case controllers_Application_updateLookup37_route(params) =>
      call(params.fromPath[String]("lookupkey", None)) { (lookupkey) =>
        controllers_Application_updateLookup37_invoker.call(Application_5.updateLookup(lookupkey))
      }
  
    // @LINE:74
    case controllers_Application_filterLookups38_route(params) =>
      call(params.fromQuery[String]("type", None), params.fromQuery[String]("value", None)) { (_pf_escape_type, value) =>
        controllers_Application_filterLookups38_invoker.call(Application_5.filterLookups(_pf_escape_type, value))
      }
  
    // @LINE:76
    case controllers_Application_deleteUserConfirm39_route(params) =>
      call(params.fromPath[String]("userkey", None)) { (userkey) =>
        controllers_Application_deleteUserConfirm39_invoker.call(Application_5.deleteUserConfirm(userkey))
      }
  
    // @LINE:77
    case controllers_Application_deleteUser40_route(params) =>
      call(params.fromPath[String]("userkey", None)) { (userkey) =>
        controllers_Application_deleteUser40_invoker.call(Application_5.deleteUser(userkey))
      }
  
    // @LINE:79
    case controllers_account_Reset_resetUser41_route(params) =>
      call(params.fromPath[String]("token", None)) { (token) =>
        controllers_account_Reset_resetUser41_invoker.call(Reset_0.resetUser(token))
      }
  
    // @LINE:80
    case controllers_account_Reset_runResetUser42_route(params) =>
      call(params.fromPath[String]("token", None)) { (token) =>
        controllers_account_Reset_runResetUser42_invoker.call(Reset_0.runResetUser(token))
      }
  
    // @LINE:82
    case controllers_Application_initializeRecordUniqueKeys43_route(params) =>
      call { 
        controllers_Application_initializeRecordUniqueKeys43_invoker.call(Application_5.initializeRecordUniqueKeys())
      }
  
    // @LINE:85
    case controllers_account_settings_Index_index44_route(params) =>
      call { 
        controllers_account_settings_Index_index44_invoker.call(Index_6.index())
      }
  
    // @LINE:86
    case controllers_account_settings_Password_index45_route(params) =>
      call { 
        controllers_account_settings_Password_index45_invoker.call(Password_1.index())
      }
  
    // @LINE:87
    case controllers_account_settings_Password_runPassword46_route(params) =>
      call { 
        controllers_account_settings_Password_runPassword46_invoker.call(Password_1.runPassword())
      }
  
    // @LINE:88
    case controllers_account_settings_Email_index47_route(params) =>
      call { 
        controllers_account_settings_Email_index47_invoker.call(Email_2.index())
      }
  
    // @LINE:89
    case controllers_account_settings_Email_runEmail48_route(params) =>
      call { 
        controllers_account_settings_Email_runEmail48_invoker.call(Email_2.runEmail())
      }
  
    // @LINE:92
    case controllers_account_Signup_create49_route(params) =>
      call { 
        controllers_account_Signup_create49_invoker.call(Signup_4.create())
      }
  
    // @LINE:93
    case controllers_account_Signup_save50_route(params) =>
      call { 
        controllers_account_Signup_save50_invoker.call(Signup_4.save())
      }
  
    // @LINE:96
    case controllers_account_Signup_confirm51_route(params) =>
      call(params.fromPath[String]("confirmToken", None)) { (confirmToken) =>
        controllers_account_Signup_confirm51_invoker.call(Signup_4.confirm(confirmToken))
      }
  
    // @LINE:99
    case controllers_account_Reset_ask52_route(params) =>
      call { 
        controllers_account_Reset_ask52_invoker.call(Reset_0.ask())
      }
  
    // @LINE:100
    case controllers_account_Reset_runAsk53_route(params) =>
      call { 
        controllers_account_Reset_runAsk53_invoker.call(Reset_0.runAsk())
      }
  
    // @LINE:103
    case controllers_account_Reset_reset54_route(params) =>
      call(params.fromPath[String]("token", None)) { (token) =>
        controllers_account_Reset_reset54_invoker.call(Reset_0.reset(token))
      }
  
    // @LINE:104
    case controllers_account_Reset_runReset55_route(params) =>
      call(params.fromPath[String]("token", None)) { (token) =>
        controllers_account_Reset_runReset55_invoker.call(Reset_0.runReset(token))
      }
  
    // @LINE:106
    case controllers_account_settings_Email_validateEmail56_route(params) =>
      call(params.fromPath[String]("token", None)) { (token) =>
        controllers_account_settings_Email_validateEmail56_invoker.call(Email_2.validateEmail(token))
      }
  
    // @LINE:109
    case controllers_Assets_at57_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at57_invoker.call(Assets_3.at(path, file))
      }
  }
}