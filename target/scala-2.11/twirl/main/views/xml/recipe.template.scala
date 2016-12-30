
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
  def apply/*1.2*/(rec: Recipe):play.twirl.api.XmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.15*/("""

"""),format.raw/*3.1*/("""<recipe id=""""),_display_(/*3.14*/rec/*3.17*/.getId()),format.raw/*3.25*/("""">
	<name>"""),_display_(/*4.9*/rec/*4.12*/.getName),format.raw/*4.20*/("""</name>
	<createdAt>"""),_display_(/*5.14*/rec/*5.17*/.getDateCreation),format.raw/*5.33*/("""</createdAt>
	<ingredients>
	"""),_display_(/*7.3*/for(i  <- rec.getIngredients) yield /*7.32*/{_display_(Seq[Any](format.raw/*7.33*/("""
		"""),_display_(/*8.4*/ingredient(i)),format.raw/*8.17*/("""
	""")))}),format.raw/*9.3*/("""
	"""),format.raw/*10.2*/("""</ingredients>
	<tags>
	"""),_display_(/*12.3*/for(t  <- rec.getTags) yield /*12.25*/{_display_(Seq[Any](format.raw/*12.26*/("""
		"""),_display_(/*13.4*/tag(t)),format.raw/*13.10*/("""
	""")))}),format.raw/*14.3*/("""
	"""),format.raw/*15.2*/("""</tags>
</recipe>"""))
      }
    }
  }

  def render(rec:Recipe): play.twirl.api.XmlFormat.Appendable = apply(rec)

  def f:((Recipe) => play.twirl.api.XmlFormat.Appendable) = (rec) => apply(rec)

  def ref: this.type = this

}


}

/**/
object recipe extends recipe_Scope0.recipe
              /*
                  -- GENERATED --
                  DATE: Fri Dec 30 02:31:56 CET 2016
                  SOURCE: /Users/mayteecheverry/MyGitRepos/play/Recetas/app/views/recipe.scala.xml
                  HASH: baad77a9085b5b28cf50b6dbfde99e2c677d9bbd
                  MATRIX: 741->1|848->14|876->16|915->29|926->32|954->40|990->51|1001->54|1029->62|1076->83|1087->86|1123->102|1178->132|1222->161|1260->162|1289->166|1322->179|1354->182|1383->184|1434->209|1472->231|1511->232|1541->236|1568->242|1601->245|1630->247
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|35->4|35->4|35->4|36->5|36->5|36->5|38->7|38->7|38->7|39->8|39->8|40->9|41->10|43->12|43->12|43->12|44->13|44->13|45->14|46->15
                  -- GENERATED --
              */
          