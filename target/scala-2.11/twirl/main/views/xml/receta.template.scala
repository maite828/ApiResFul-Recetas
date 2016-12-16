
package views.xml

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object receta_Scope0 {
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

class receta extends BaseScalaTemplate[play.twirl.api.XmlFormat.Appendable,Format[play.twirl.api.XmlFormat.Appendable]](play.twirl.api.XmlFormat) with play.twirl.api.Template1[Receta,play.twirl.api.XmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(receta: Receta):play.twirl.api.XmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.18*/("""

"""),format.raw/*3.1*/("""<receta id=""""),_display_(/*3.14*/receta/*3.20*/.getId()),format.raw/*3.28*/("""">
	<name>"""),_display_(/*4.9*/receta/*4.15*/.getName()),format.raw/*4.25*/("""</name>
</receta>"""))
      }
    }
  }

  def render(receta:Receta): play.twirl.api.XmlFormat.Appendable = apply(receta)

  def f:((Receta) => play.twirl.api.XmlFormat.Appendable) = (receta) => apply(receta)

  def ref: this.type = this

}


}

/**/
object receta extends receta_Scope0.receta
              /*
                  -- GENERATED --
                  DATE: Fri Dec 16 01:56:37 CET 2016
                  SOURCE: /Users/mayteecheverry/MyGitRepos/play/Recetas/app/views/receta.scala.xml
                  HASH: a76ccddfa42167ce61402aeb0390201795b90070
                  MATRIX: 741->1|851->17|879->19|918->32|932->38|960->46|996->57|1010->63|1040->73
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|35->4|35->4|35->4
                  -- GENERATED --
              */
          