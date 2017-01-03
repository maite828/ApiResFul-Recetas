
package views.xml

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object recipe_Scope0 {
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

class recipe extends BaseScalaTemplate[play.twirl.api.XmlFormat.Appendable,Format[play.twirl.api.XmlFormat.Appendable]](play.twirl.api.XmlFormat) with play.twirl.api.Template1[Recipe,play.twirl.api.XmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(r: Recipe):play.twirl.api.XmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.13*/("""

"""),format.raw/*3.1*/("""<recipe id=""""),_display_(/*3.14*/r/*3.15*/.getId()),format.raw/*3.23*/("""">
	<name>"""),_display_(/*4.9*/r/*4.10*/.getName),format.raw/*4.18*/("""</name>
	<portions>"""),_display_(/*5.13*/r/*5.14*/.getPortions),format.raw/*5.26*/("""</portions>
	<createdAt>"""),_display_(/*6.14*/r/*6.15*/.getDateCreation),format.raw/*6.31*/("""</createdAt>
	<ingredients>
	"""),_display_(/*8.3*/for(i  <- r.getIngredients) yield /*8.30*/{_display_(Seq[Any](format.raw/*8.31*/("""
		"""),_display_(/*9.4*/ingredient(i)),format.raw/*9.17*/("""
	""")))}),format.raw/*10.3*/("""
	"""),format.raw/*11.2*/("""</ingredients>
	<tags>
	"""),_display_(/*13.3*/for(t  <- r.getTags) yield /*13.23*/{_display_(Seq[Any](format.raw/*13.24*/("""
		"""),_display_(/*14.4*/tag(t)),format.raw/*14.10*/("""
	""")))}),format.raw/*15.3*/("""
	"""),format.raw/*16.2*/("""</tags>
</recipe>"""))
      }
    }
  }

  def render(r:Recipe): play.twirl.api.XmlFormat.Appendable = apply(r)

  def f:((Recipe) => play.twirl.api.XmlFormat.Appendable) = (r) => apply(r)

  def ref: this.type = this

}


}

/**/
object recipe extends recipe_Scope0.recipe
              /*
                  -- GENERATED --
                  DATE: Tue Jan 03 03:16:26 CET 2017
                  SOURCE: /Users/mayteecheverry/MyGitRepos/play/Recetas/app/views/recipe.scala.xml
                  HASH: 2f0a19a7d1470bc5c9429b6c080b95329e60c101
                  MATRIX: 741->1|846->12|874->14|913->27|922->28|950->36|986->47|995->48|1023->56|1069->76|1078->77|1110->89|1161->114|1170->115|1206->131|1261->161|1303->188|1341->189|1370->193|1403->206|1436->209|1465->211|1516->236|1552->256|1591->257|1621->261|1648->267|1681->270|1710->272
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|35->4|35->4|35->4|36->5|36->5|36->5|37->6|37->6|37->6|39->8|39->8|39->8|40->9|40->9|41->10|42->11|44->13|44->13|44->13|45->14|45->14|46->15|47->16
                  -- GENERATED --
              */
          