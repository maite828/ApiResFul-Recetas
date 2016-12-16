
package views.xml

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object recetas_Scope0 {
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

class recetas extends BaseScalaTemplate[play.twirl.api.XmlFormat.Appendable,Format[play.twirl.api.XmlFormat.Appendable]](play.twirl.api.XmlFormat) with play.twirl.api.Template1[List[Receta],play.twirl.api.XmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(recetas: List[Receta]):play.twirl.api.XmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.25*/("""

"""),format.raw/*4.1*/("""<recetas>
	"""),_display_(/*5.3*/for(r <- recetas) yield /*5.20*/ {_display_(Seq[Any](format.raw/*5.22*/("""
	"""),_display_(/*6.3*/receta(r)),format.raw/*6.12*/("""
	""")))}),format.raw/*7.3*/("""
"""),format.raw/*8.1*/("""</recetas>"""))
      }
    }
  }

  def render(recetas:List[Receta]): play.twirl.api.XmlFormat.Appendable = apply(recetas)

  def f:((List[Receta]) => play.twirl.api.XmlFormat.Appendable) = (recetas) => apply(recetas)

  def ref: this.type = this

}


}

/**/
object recetas extends recetas_Scope0.recetas
              /*
                  -- GENERATED --
                  DATE: Fri Dec 16 01:56:37 CET 2016
                  SOURCE: /Users/mayteecheverry/MyGitRepos/play/Recetas/app/views/recetas.scala.xml
                  HASH: ee9975a85b1a4c86f9c69b69f4eb18c08875640b
                  MATRIX: 749->2|866->25|894->27|931->39|963->56|1002->58|1030->61|1059->70|1091->73|1118->74
                  LINES: 27->2|32->2|34->4|35->5|35->5|35->5|36->6|36->6|37->7|38->8
                  -- GENERATED --
              */
          