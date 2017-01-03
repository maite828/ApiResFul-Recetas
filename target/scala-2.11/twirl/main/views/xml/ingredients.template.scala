
package views.xml

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object ingredients_Scope0 {
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

class ingredients extends BaseScalaTemplate[play.twirl.api.XmlFormat.Appendable,Format[play.twirl.api.XmlFormat.Appendable]](play.twirl.api.XmlFormat) with play.twirl.api.Template1[List[Ingredient],play.twirl.api.XmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(ingredients: List[Ingredient]):play.twirl.api.XmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.33*/("""
"""),format.raw/*2.1*/("""<ngredients>
	"""),_display_(/*3.3*/for(i <- ingredients) yield /*3.24*/{_display_(Seq[Any](format.raw/*3.25*/("""
		"""),_display_(/*4.4*/ingredient(i)),format.raw/*4.17*/("""
	""")))}),format.raw/*5.3*/("""
"""),format.raw/*6.1*/("""</ngredients>	"""))
      }
    }
  }

  def render(ingredients:List[Ingredient]): play.twirl.api.XmlFormat.Appendable = apply(ingredients)

  def f:((List[Ingredient]) => play.twirl.api.XmlFormat.Appendable) = (ingredients) => apply(ingredients)

  def ref: this.type = this

}


}

/**/
object ingredients extends ingredients_Scope0.ingredients
              /*
                  -- GENERATED --
                  DATE: Tue Jan 03 03:16:26 CET 2017
                  SOURCE: /Users/mayteecheverry/MyGitRepos/play/Recetas/app/views/ingredients.scala.xml
                  HASH: e7a0c37cd0b0b48e7ce23542db707c378157e3ac
                  MATRIX: 761->1|886->32|913->33|953->48|989->69|1027->70|1056->74|1089->87|1121->90|1148->91
                  LINES: 27->1|32->1|33->2|34->3|34->3|34->3|35->4|35->4|36->5|37->6
                  -- GENERATED --
              */
          