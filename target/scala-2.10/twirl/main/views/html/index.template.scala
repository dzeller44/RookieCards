
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[Application.Register],Form[Application.Login],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(signupForm: Form[Application.Register], loginForm: Form[Application.Login]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.78*/("""

"""),_display_(/*3.2*/main(null)/*3.12*/ {_display_(Seq[Any](format.raw/*3.14*/("""
	"""),format.raw/*4.2*/("""<section id="homePage">
			<div class="container">
				<h2><b>Welcome to Dan's Rookie Cards</h2>
				<div class="testimonials" data-appear-top-offset="-200" data-animated="fadeInUp">
						<div class="item">
							<div class="testim_content">Your One-Stop-Shop for your Baseball Card Needs!</div>
							<div class="testim_content">Please sign in to begin your experience!</div>
						</div>
				</div>
			</div>
		</section>
""")))}))
      }
    }
  }

  def render(signupForm:Form[Application.Register],loginForm:Form[Application.Login]): play.twirl.api.HtmlFormat.Appendable = apply(signupForm,loginForm)

  def f:((Form[Application.Register],Form[Application.Login]) => play.twirl.api.HtmlFormat.Appendable) = (signupForm,loginForm) => apply(signupForm,loginForm)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Mon Jan 30 13:46:16 MST 2017
                  SOURCE: C:/WebDev/workspace/RookieCards/app/views/index.scala.html
                  HASH: ca67e0936b64f2b0b59b13ab09d75c03bf4433c4
                  MATRIX: 789->1|960->77|988->80|1006->90|1045->92|1073->94
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4
                  -- GENERATED --
              */
          