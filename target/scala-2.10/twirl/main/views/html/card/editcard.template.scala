
package views.html.card

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object editcard_Scope0 {
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

class editcard extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template6[Form[Application.CardAdd],Card,java.util.List[Team],java.util.List[Lookup],java.util.List[CardAudit],java.util.List[Comment],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(rookieCard: Form[Application.CardAdd], card: Card, teams: java.util.List[Team], lookups: java.util.List[Lookup], auditTrail: java.util.List[CardAudit], allComments: java.util.List[Comment]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import java.text.SimpleDateFormat

Seq[Any](format.raw/*1.192*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main(null)/*5.12*/ {_display_(Seq[Any](format.raw/*5.14*/("""
	"""),format.raw/*6.2*/("""<script type="text/javascript">
		$(document).ready(function()"""),format.raw/*7.31*/("""{"""),format.raw/*7.32*/("""		 
			"""),format.raw/*8.4*/("""$('input[name=selectServices]').on('change', function() """),format.raw/*8.60*/("""{"""),format.raw/*8.61*/("""
				"""),format.raw/*9.5*/("""$('#services').val($('input[name=selectServices]:checked').map(function() """),format.raw/*9.79*/("""{"""),format.raw/*9.80*/("""
					"""),format.raw/*10.6*/("""return this.value;
				"""),format.raw/*11.5*/("""}"""),format.raw/*11.6*/(""").get());
			"""),format.raw/*12.4*/("""}"""),format.raw/*12.5*/(""");
		"""),format.raw/*13.3*/("""}"""),format.raw/*13.4*/(""");
	</script>
	<input type="hidden" name="uniquekey" id="uniquekey" value=""""),_display_(/*15.63*/card/*15.67*/.uniquekey),format.raw/*15.77*/("""" />
	<section id="rookieCard">
		<form class="formoid-solid-dark"
			style="background-color: #FFFFFF; font-size: 14px; font-family: 'Trebuchet MS','Roboto', Arial, Helvetica, sans-serif; color: #34495E; max-width: 480px; min-width: 150px"
			method="post" action="">
			<div class="title">
				<h2>Rookie Card</h2>
			</div>
			<div class="formSubtitle">
				Player Info
			</div>
			<div class="element-input">
				<label class="title"><span class="required">*</span>Player Name:</label>
				<div class="item-cont"><input class="large" type="text" name="name" required="required" placeholder="Enter the Player's Name..." value=""""),_display_(/*28.142*/card/*28.146*/.name),format.raw/*28.151*/("""" /><span class="icon-place"></span></div>
			</div>
			<div class="element-select">
				<label class="title"><span class="required">*</span>Position:</label>
				<div class="item-cont">
					<div class="large">
						<span>
							<select name="position" required="required">
								<option selected="selected" value="" disabled="disabled">--- Select Position ---</option>
								"""),_display_(/*37.10*/for(lookup <- lookups) yield /*37.32*/ {_display_(Seq[Any](format.raw/*37.34*/("""
									"""),_display_(/*38.11*/if(lookup.lookuptype == "Position")/*38.46*/ {_display_(Seq[Any](format.raw/*38.48*/("""<option """),_display_(/*38.57*/if(lookup.name == card.position)/*38.89*/ {_display_(Seq[Any](format.raw/*38.91*/("""selected="selected"""")))}),format.raw/*38.111*/(""" """),format.raw/*38.112*/("""value=""""),_display_(/*38.120*/lookup/*38.126*/.name),format.raw/*38.131*/("""">"""),_display_(/*38.134*/lookup/*38.140*/.name),format.raw/*38.145*/("""</option>""")))}),format.raw/*38.155*/("""
								""")))}),format.raw/*39.10*/("""	
							"""),format.raw/*40.8*/("""</select>
							<i></i><span class="icon-place"></span>
						</span>
					</div>
				</div>
			</div>
			<div class="element-select">
				<label class="title"><span class="required">*</span>Team:</label>
				<div class="item-cont">
					<div class="large">
						<span>
							<select name="team" required="required">
								<option selected="selected" value="" disabled="disabled">--- Select Team ---</option>
								"""),_display_(/*53.10*/for(team <- teams) yield /*53.28*/ {_display_(Seq[Any](format.raw/*53.30*/("""
									"""),format.raw/*54.10*/("""{"""),format.raw/*54.11*/("""<option """),_display_(/*54.20*/if(team.name == card.team)/*54.46*/ {_display_(Seq[Any](format.raw/*54.48*/("""selected="selected"""")))}),format.raw/*54.68*/(""" """),format.raw/*54.69*/("""value=""""),_display_(/*54.77*/team/*54.81*/.name),format.raw/*54.86*/("""">"""),_display_(/*54.89*/team/*54.93*/.name),format.raw/*54.98*/("""</option>"""),format.raw/*54.107*/("""}"""),format.raw/*54.108*/("""
								""")))}),format.raw/*55.10*/("""
							"""),format.raw/*56.8*/("""</select>
							<i></i><span class="icon-place"></span>
						</span>
					</div>
				</div>
			</div>
			<div class="element-radio">
				<label class="title"><span class="required">*</span>Card Maker:</label>
				"""),_display_(/*64.6*/for(lookup <- lookups) yield /*64.28*/ {_display_(Seq[Any](format.raw/*64.30*/("""
					"""),_display_(/*65.7*/if(lookup.lookuptype == "Card Maker")/*65.44*/ {_display_(Seq[Any](format.raw/*65.46*/("""
						"""),format.raw/*66.7*/("""<input type="radio" name="cardmaker" value=""""),_display_(/*66.52*/lookup/*66.58*/.name),format.raw/*66.63*/("""" required="required" """),_display_(/*66.86*/if(lookup.name == card.cardmaker)/*66.119*/ {_display_(Seq[Any](format.raw/*66.121*/("""checked""")))}),format.raw/*66.129*/(""" """),format.raw/*66.130*/("""/><span>"""),_display_(/*66.139*/lookup/*66.145*/.name),format.raw/*66.150*/("""</span></label>
						<span class="clearfix"></span>
					""")))}),format.raw/*68.7*/("""
				""")))}),format.raw/*69.6*/("""
			"""),format.raw/*70.4*/("""</div>
			<div class="element-number">
				<label class="title"><span class="required">*</span>Card Year:</label>
				<div class="item-cont"><input class="large" type="text" min="0" max="5000" name="year" required="required" placeholder="Enter the Card Year..."  value=""""),_display_(/*73.158*/card/*73.162*/.year),format.raw/*73.167*/("""" /><span class="icon-place"></span></div>
			</div>
			<div class="formSubtitle">
				Comments
			</div>
			<div class="element-input">
				<span class="text-center"><button type="button" class="buttonCustomView" align="center" style="color: #FFFFFF;" data-toggle="modal" data-target="#modalComments">Add Comments</button></span>
				<br><br>
				"""),_display_(/*81.6*/if(!allComments.isEmpty)/*81.30*/ {_display_(Seq[Any](format.raw/*81.32*/("""
					"""),format.raw/*82.6*/("""<div class="modifiedSection" style="font-size: 12px;">
						<table class="modifiedTable">
							"""),_display_(/*84.9*/for(comment <- allComments) yield /*84.36*/ {_display_(Seq[Any](format.raw/*84.38*/("""
								"""),format.raw/*85.9*/("""<tr>
									<td width="25%">"""),_display_(/*86.27*/if(comment.datecreated != null)/*86.58*/{_display_(_display_(/*86.60*/(new SimpleDateFormat("MM/dd/yyyy hh:mm a").format(comment.datecreated))))}),format.raw/*86.133*/("""</td>
									<td width="25%">"""),_display_(/*87.27*/comment/*87.34*/.author),format.raw/*87.41*/("""</td>
									<td width="50%">"""),_display_(/*88.27*/comment/*88.34*/.comment),format.raw/*88.42*/("""</td>
								</tr>
							""")))}),format.raw/*90.9*/("""					
						"""),format.raw/*91.7*/("""</table>
					</div>
				""")))}),format.raw/*93.6*/("""
			"""),format.raw/*94.4*/("""</div>
			<div class="element-input">
				"""),_display_(/*96.6*/if(rookieCard.hasGlobalErrors)/*96.36*/ {_display_(Seq[Any](format.raw/*96.38*/("""
					"""),format.raw/*97.6*/("""<span class="errorMessageDisplay" style="color: #d9534f;">"""),_display_(/*97.65*/rookieCard/*97.75*/.globalError.message),format.raw/*97.95*/("""</span>
				""")))}),format.raw/*98.6*/("""
			"""),format.raw/*99.4*/("""</div>
			<div class="submit">
				<input type="submit" value="Submit" />
				<a href="/" class="buttonCancel">"""),_display_(/*102.39*/Messages("goback")),format.raw/*102.57*/("""</a>
			</div>
			"""),_display_(/*104.5*/if(!auditTrail.isEmpty)/*104.28*/ {_display_(Seq[Any](format.raw/*104.30*/("""
				"""),format.raw/*105.5*/("""<div class="modifiedSection" style="font-size: 10px;">
					<table class="modifiedTable">
						"""),_display_(/*107.8*/for(audit <- auditTrail) yield /*107.32*/ {_display_(Seq[Any](format.raw/*107.34*/("""
							"""),format.raw/*108.8*/("""<tr>
								<td>"""),_display_(/*109.14*/audit/*109.19*/.editor),format.raw/*109.26*/(""" """),format.raw/*109.27*/("""("""),_display_(/*109.29*/audit/*109.34*/.editoremail),format.raw/*109.46*/(""") changed <b>"""),_display_(/*109.60*/audit/*109.65*/.fielddisplay),format.raw/*109.78*/("""</b> from <b>"""),_display_(/*109.92*/audit/*109.97*/.oldvalue),format.raw/*109.106*/("""</b> to <b>"""),_display_(/*109.118*/audit/*109.123*/.newvalue),format.raw/*109.132*/("""</b> on """),_display_(/*109.141*/audit/*109.146*/.editdate),format.raw/*109.155*/(""".</td>
							</tr>
						""")))}),format.raw/*111.8*/("""					
					"""),format.raw/*112.6*/("""</table>
				</div>
			""")))}),format.raw/*114.5*/("""
			"""),format.raw/*115.4*/("""<!-- This is needed for bottom shadow to appear... -->
			<div></div>
		</form>
	</section>
""")))}))
      }
    }
  }

  def render(rookieCard:Form[Application.CardAdd],card:Card,teams:java.util.List[Team],lookups:java.util.List[Lookup],auditTrail:java.util.List[CardAudit],allComments:java.util.List[Comment]): play.twirl.api.HtmlFormat.Appendable = apply(rookieCard,card,teams,lookups,auditTrail,allComments)

  def f:((Form[Application.CardAdd],Card,java.util.List[Team],java.util.List[Lookup],java.util.List[CardAudit],java.util.List[Comment]) => play.twirl.api.HtmlFormat.Appendable) = (rookieCard,card,teams,lookups,auditTrail,allComments) => apply(rookieCard,card,teams,lookups,auditTrail,allComments)

  def ref: this.type = this

}


}

/**/
object editcard extends editcard_Scope0.editcard
              /*
                  -- GENERATED --
                  DATE: Mon Jan 30 15:32:16 MST 2017
                  SOURCE: C:/WebDev/workspace/RookieCards/app/views/card/editcard.scala.html
                  HASH: 33aaf3336a8b42984721fcccc63755f4623414d3
                  MATRIX: 874->1|1193->191|1223->231|1251->234|1269->244|1308->246|1337->249|1427->312|1455->313|1489->321|1572->377|1600->378|1632->384|1733->458|1761->459|1795->466|1846->490|1874->491|1915->505|1943->506|1976->512|2004->513|2109->591|2122->595|2153->605|2826->1250|2840->1254|2867->1259|3287->1652|3325->1674|3365->1676|3404->1688|3448->1723|3488->1725|3524->1734|3565->1766|3605->1768|3657->1788|3687->1789|3723->1797|3739->1803|3766->1808|3797->1811|3813->1817|3840->1822|3882->1832|3924->1843|3961->1853|4424->2289|4458->2307|4498->2309|4537->2320|4566->2321|4602->2330|4637->2356|4677->2358|4728->2378|4757->2379|4792->2387|4805->2391|4831->2396|4861->2399|4874->2403|4900->2408|4938->2417|4968->2418|5010->2429|5046->2438|5296->2662|5334->2684|5374->2686|5408->2694|5454->2731|5494->2733|5529->2741|5601->2786|5616->2792|5642->2797|5692->2820|5735->2853|5776->2855|5816->2863|5846->2864|5883->2873|5899->2879|5926->2884|6017->2945|6054->2952|6086->2957|6388->3231|6402->3235|6429->3240|6812->3597|6845->3621|6885->3623|6919->3630|7046->3731|7089->3758|7129->3760|7166->3770|7225->3802|7265->3833|7295->3835|7392->3908|7452->3941|7468->3948|7496->3955|7556->3988|7572->3995|7601->4003|7661->4033|7701->4046|7759->4074|7791->4079|7862->4124|7901->4154|7941->4156|7975->4163|8061->4222|8080->4232|8121->4252|8165->4266|8197->4271|8340->4386|8380->4404|8428->4425|8461->4448|8502->4450|8536->4456|8662->4555|8703->4579|8744->4581|8781->4590|8828->4609|8843->4614|8872->4621|8902->4622|8932->4624|8947->4629|8981->4641|9023->4655|9038->4660|9073->4673|9115->4687|9130->4692|9162->4701|9203->4713|9219->4718|9251->4727|9289->4736|9305->4741|9337->4750|9397->4779|9437->4791|9494->4817|9527->4822
                  LINES: 27->1|32->1|34->4|35->5|35->5|35->5|36->6|37->7|37->7|38->8|38->8|38->8|39->9|39->9|39->9|40->10|41->11|41->11|42->12|42->12|43->13|43->13|45->15|45->15|45->15|58->28|58->28|58->28|67->37|67->37|67->37|68->38|68->38|68->38|68->38|68->38|68->38|68->38|68->38|68->38|68->38|68->38|68->38|68->38|68->38|68->38|69->39|70->40|83->53|83->53|83->53|84->54|84->54|84->54|84->54|84->54|84->54|84->54|84->54|84->54|84->54|84->54|84->54|84->54|84->54|84->54|85->55|86->56|94->64|94->64|94->64|95->65|95->65|95->65|96->66|96->66|96->66|96->66|96->66|96->66|96->66|96->66|96->66|96->66|96->66|96->66|98->68|99->69|100->70|103->73|103->73|103->73|111->81|111->81|111->81|112->82|114->84|114->84|114->84|115->85|116->86|116->86|116->86|116->86|117->87|117->87|117->87|118->88|118->88|118->88|120->90|121->91|123->93|124->94|126->96|126->96|126->96|127->97|127->97|127->97|127->97|128->98|129->99|132->102|132->102|134->104|134->104|134->104|135->105|137->107|137->107|137->107|138->108|139->109|139->109|139->109|139->109|139->109|139->109|139->109|139->109|139->109|139->109|139->109|139->109|139->109|139->109|139->109|139->109|139->109|139->109|139->109|141->111|142->112|144->114|145->115
                  -- GENERATED --
              */
          