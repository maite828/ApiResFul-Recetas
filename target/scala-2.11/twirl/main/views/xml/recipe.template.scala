
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
	<createdAt>"""),_display_(/*5.14*/r/*5.15*/.getDateCreation),format.raw/*5.31*/("""</createdAt>
	<ingredients>
	"""),_display_(/*7.3*/for(i  <- r.getIngredients) yield /*7.30*/{_display_(Seq[Any](format.raw/*7.31*/("""
		"""),_display_(/*8.4*/ingredient(i)),format.raw/*8.17*/("""
	""")))}),format.raw/*9.3*/("""
	"""),format.raw/*10.2*/("""</ingredients>
	<tags>
	"""),_display_(/*12.3*/for(t  <- r.getTags) yield /*12.23*/{_display_(Seq[Any](format.raw/*12.24*/("""
		"""),_display_(/*13.4*/tag(t)),format.raw/*13.10*/("""
	""")))}),format.raw/*14.3*/("""
	"""),format.raw/*15.2*/("""</tags>
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
                  DATE: Sun Jan 01 19:23:00 CET 2017
                  SOURCE: /Users/mayteecheverry/MyGitRepos/play/Recetas/app/views/recipe.scala.xml
                  HASH: 67ce18e674cc77fbe8a865f0b053875a70922d9d
                  MATRIX: 741->1|846->12|874->14|913->27|922->28|950->36|986->47|995->48|1023->56|1070->77|1079->78|1115->94|1170->124|1212->151|1250->152|1279->156|1312->169|1344->172|1373->174|1424->199|1460->219|1499->220|1529->224|1556->230|1589->233|1618->235
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|35->4|35->4|35->4|36->5|36->5|36->5|38->7|38->7|38->7|39->8|39->8|40->9|41->10|43->12|43->12|43->12|44->13|44->13|45->14|46->15
                  -- GENERATED --
              */
          