
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
  def apply/*1.2*/(ingredient: Ingredient):play.twirl.api.XmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.26*/("""

"""),format.raw/*3.1*/("""<ingredient id=""""),_display_(/*3.18*/ingredient/*3.28*/.getId()),format.raw/*3.36*/("""">
	<name>"""),_display_(/*4.9*/ingredient/*4.19*/.getName),format.raw/*4.27*/("""</name>
</ingredient>"""))
      }
    }
  }

  def render(ingredient:Ingredient): play.twirl.api.XmlFormat.Appendable = apply(ingredient)

  def f:((Ingredient) => play.twirl.api.XmlFormat.Appendable) = (ingredient) => apply(ingredient)

  def ref: this.type = this

}


}

/**/
object ingredient extends ingredient_Scope0.ingredient
              /*
                  -- GENERATED --
                  DATE: Fri Dec 30 02:52:23 CET 2016
                  SOURCE: /Users/mayteecheverry/MyGitRepos/play/Recetas/app/views/ingredient.scala.xml
                  HASH: 7521bb6a5bb05133ef50acf56c0dff8cba0da434
                  MATRIX: 753->1|871->25|899->27|942->44|960->54|988->62|1024->73|1042->83|1070->91
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|35->4|35->4|35->4
                  -- GENERATED --
              */
          