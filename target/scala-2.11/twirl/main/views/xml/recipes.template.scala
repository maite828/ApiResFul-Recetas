
package views.xml

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object recipes_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.xml._
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

class recipes extends BaseScalaTemplate[play.twirl.api.XmlFormat.Appendable,Format[play.twirl.api.XmlFormat.Appendable]](play.twirl.api.XmlFormat) with play.twirl.api.Template1[List[Recipe],play.twirl.api.XmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(recipes: List[Recipe]):play.twirl.api.XmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.25*/("""
									"""),format.raw/*2.10*/("""<!-- lista -->
<recipes>
	"""),_display_(/*4.3*/for(r <- recipes) yield /*4.20*/{_display_(Seq[Any](format.raw/*4.21*/("""
	"""),format.raw/*5.2*/("""<recipe id=""""),_display_(/*5.15*/r/*5.16*/.getId()),format.raw/*5.24*/("""">
		<name>"""),_display_(/*6.10*/r/*6.11*/.getName),format.raw/*6.19*/("""</name>
		<portions>"""),_display_(/*7.14*/r/*7.15*/.getPortions),format.raw/*7.27*/("""</portions>	
		<createdAt>"""),_display_(/*8.15*/r/*8.16*/.getDateCreation),format.raw/*8.32*/("""</createdAt>
	</recipe>
	""")))}),format.raw/*10.3*/("""
"""),format.raw/*11.1*/("""</recipes>	

									<!-- detalle -->
<recipes>
	"""),_display_(/*15.3*/for(r <- recipes) yield /*15.20*/{_display_(Seq[Any](format.raw/*15.21*/("""
		"""),_display_(/*16.4*/recipe(r)),format.raw/*16.13*/("""
	""")))}),format.raw/*17.3*/("""
"""),format.raw/*18.1*/("""</recipes>"""))
      }
    }
  }

  def render(recipes:List[Recipe]): play.twirl.api.XmlFormat.Appendable = apply(recipes)

  def f:((List[Recipe]) => play.twirl.api.XmlFormat.Appendable) = (recipes) => apply(recipes)

  def ref: this.type = this

}


}

/**/
object recipes extends recipes_Scope0.recipes
              /*
                  -- GENERATED --
                  DATE: Tue Jan 03 03:19:11 CET 2017
                  SOURCE: /Users/mayteecheverry/MyGitRepos/play/Recetas/app/views/recipes.scala.xml
                  HASH: 0224c4c8b28c58cd9d13dc4dddf3faecb68e8131
                  MATRIX: 749->1|866->24|903->34|955->61|987->78|1025->79|1053->81|1092->94|1101->95|1129->103|1167->115|1176->116|1204->124|1251->145|1260->146|1292->158|1345->185|1354->186|1390->202|1446->228|1474->229|1551->280|1584->297|1623->298|1653->302|1683->311|1716->314|1744->315
                  LINES: 27->1|32->1|33->2|35->4|35->4|35->4|36->5|36->5|36->5|36->5|37->6|37->6|37->6|38->7|38->7|38->7|39->8|39->8|39->8|41->10|42->11|46->15|46->15|46->15|47->16|47->16|48->17|49->18
                  -- GENERATED --
              */
          