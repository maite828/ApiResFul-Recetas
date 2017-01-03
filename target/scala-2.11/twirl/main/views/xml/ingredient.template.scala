
package views.xml

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object ingredient_Scope0 {
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

class ingredient extends BaseScalaTemplate[play.twirl.api.XmlFormat.Appendable,Format[play.twirl.api.XmlFormat.Appendable]](play.twirl.api.XmlFormat) with play.twirl.api.Template1[Ingredient,play.twirl.api.XmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(i: Ingredient):play.twirl.api.XmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.17*/("""

"""),format.raw/*3.1*/("""<ingredient id=""""),_display_(/*3.18*/i/*3.19*/.getId()),format.raw/*3.27*/("""">
	<name>"""),_display_(/*4.9*/i/*4.10*/.getName),format.raw/*4.18*/("""</name>
	<quantity>"""),_display_(/*5.13*/i/*5.14*/.getQuantity),format.raw/*5.26*/("""</quantity>
</ingredient>
"""))
      }
    }
  }

  def render(i:Ingredient): play.twirl.api.XmlFormat.Appendable = apply(i)

  def f:((Ingredient) => play.twirl.api.XmlFormat.Appendable) = (i) => apply(i)

  def ref: this.type = this

}


}

/**/
object ingredient extends ingredient_Scope0.ingredient
              /*
                  -- GENERATED --
                  DATE: Tue Jan 03 03:16:26 CET 2017
                  SOURCE: /Users/mayteecheverry/MyGitRepos/play/Recetas/app/views/ingredient.scala.xml
                  HASH: 7a9460f27b725b9c586c2df2acabc493936f1c61
                  MATRIX: 753->1|862->16|890->18|933->35|942->36|970->44|1006->55|1015->56|1043->64|1089->84|1098->85|1130->97
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|35->4|35->4|35->4|36->5|36->5|36->5
                  -- GENERATED --
              */
          