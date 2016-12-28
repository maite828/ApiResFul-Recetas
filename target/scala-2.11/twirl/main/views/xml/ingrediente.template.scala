
package views.xml

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object ingrediente_Scope0 {
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

class ingrediente extends BaseScalaTemplate[play.twirl.api.XmlFormat.Appendable,Format[play.twirl.api.XmlFormat.Appendable]](play.twirl.api.XmlFormat) with play.twirl.api.Template1[Ingrediente,play.twirl.api.XmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(ingrediente: Ingrediente):play.twirl.api.XmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.28*/("""

"""),format.raw/*3.1*/("""<ingrediente id=""""),_display_(/*3.19*/ingrediente/*3.30*/.getId()),format.raw/*3.38*/("""">
	<name>"""),_display_(/*4.9*/ingrediente/*4.20*/.getName),format.raw/*4.28*/("""</name>
</ingrediente>"""))
      }
    }
  }

  def render(ingrediente:Ingrediente): play.twirl.api.XmlFormat.Appendable = apply(ingrediente)

  def f:((Ingrediente) => play.twirl.api.XmlFormat.Appendable) = (ingrediente) => apply(ingrediente)

  def ref: this.type = this

}


}

/**/
object ingrediente extends ingrediente_Scope0.ingrediente
              /*
                  -- GENERATED --
                  DATE: Wed Dec 28 17:01:51 CET 2016
                  SOURCE: /Users/mayteecheverry/MyGitRepos/play/Recetas/app/views/ingrediente.scala.xml
                  HASH: 3a10b1007901faedddc5b964e35b47cfe740a87e
                  MATRIX: 756->1|876->27|904->29|948->47|967->58|995->66|1031->77|1050->88|1078->96
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|35->4|35->4|35->4
                  -- GENERATED --
              */
          