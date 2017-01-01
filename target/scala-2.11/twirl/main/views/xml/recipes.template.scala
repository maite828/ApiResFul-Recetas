
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
"""),format.raw/*2.1*/("""<!-- lista -->
<recipes>
	"""),_display_(/*4.3*/for(r <- recipes) yield /*4.20*/{_display_(Seq[Any](format.raw/*4.21*/("""
	"""),format.raw/*5.2*/("""<recipe id=""""),_display_(/*5.15*/r/*5.16*/.getId()),format.raw/*5.24*/("""">
		<name>"""),_display_(/*6.10*/r/*6.11*/.getName),format.raw/*6.19*/("""</name>
		<createdAt>"""),_display_(/*7.15*/r/*7.16*/.getDateCreation),format.raw/*7.32*/("""</createdAt>
		<portions>"""),_display_(/*8.14*/r/*8.15*/.getPortions),format.raw/*8.27*/("""</portions>	
	</recipe>
	""")))}),format.raw/*10.3*/("""
"""),format.raw/*11.1*/("""</recipes>	




<!-- detalle -->
<recipes>
	"""),_display_(/*18.3*/for(r <- recipes) yield /*18.20*/{_display_(Seq[Any](format.raw/*18.21*/("""
		"""),_display_(/*19.4*/recipe(r)),format.raw/*19.13*/("""
	""")))}),format.raw/*20.3*/("""
"""),format.raw/*21.1*/("""</recipes>"""))
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
                  DATE: Sat Dec 31 23:44:38 CET 2016
                  SOURCE: /Users/mayteecheverry/MyGitRepos/play/Recetas/app/views/recipes.scala.xml
                  HASH: c8c558ae16453b59044cae771c54451f90d16b2d
                  MATRIX: 749->1|866->24|893->25|945->52|977->69|1015->70|1043->72|1082->85|1091->86|1119->94|1157->106|1166->107|1194->115|1242->137|1251->138|1287->154|1339->180|1348->181|1380->193|1436->219|1464->220|1535->265|1568->282|1607->283|1637->287|1667->296|1700->299|1728->300
                  LINES: 27->1|32->1|33->2|35->4|35->4|35->4|36->5|36->5|36->5|36->5|37->6|37->6|37->6|38->7|38->7|38->7|39->8|39->8|39->8|41->10|42->11|49->18|49->18|49->18|50->19|50->19|51->20|52->21
                  -- GENERATED --
              */
          