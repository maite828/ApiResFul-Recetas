
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
  def apply/*1.2*/(recetas: List[Receta]):play.twirl.api.XmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.25*/("""
"""),format.raw/*2.1*/("""<!-- lista -->
<recetas>
	"""),_display_(/*4.3*/for(item <- recetas) yield /*4.23*/{_display_(Seq[Any](format.raw/*4.24*/("""
		"""),format.raw/*5.3*/("""<receta id=""""),_display_(/*5.16*/item/*5.20*/.getId()),format.raw/*5.28*/("""">
			<name>"""),_display_(/*6.11*/item/*6.15*/.getName),format.raw/*6.23*/("""</name>
			<createdAt>"""),_display_(/*7.16*/item/*7.20*/.getDateCreation),format.raw/*7.36*/("""</createdAt>	
		</receta>
	""")))}),format.raw/*9.3*/("""
"""),format.raw/*10.1*/("""</recetas>	




<!-- detalle -->
<recetas>
	"""),_display_(/*17.3*/for(r <- recetas) yield /*17.20*/{_display_(Seq[Any](format.raw/*17.21*/("""
		"""),_display_(/*18.4*/receta(r)),format.raw/*18.13*/("""
	""")))}),format.raw/*19.3*/("""
"""),format.raw/*20.1*/("""</recetas>"""))
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
                  DATE: Fri Dec 30 01:03:30 CET 2016
                  SOURCE: /Users/mayteecheverry/MyGitRepos/play/Recetas/app/views/recetas.scala.xml
                  HASH: 217935617daf9252fbd27462f57ead1ba3241651
                  MATRIX: 749->1|866->24|893->25|945->52|980->72|1018->73|1047->76|1086->89|1098->93|1126->101|1165->114|1177->118|1205->126|1254->149|1266->153|1302->169|1359->197|1387->198|1458->243|1491->260|1530->261|1560->265|1590->274|1623->277|1651->278
                  LINES: 27->1|32->1|33->2|35->4|35->4|35->4|36->5|36->5|36->5|36->5|37->6|37->6|37->6|38->7|38->7|38->7|40->9|41->10|48->17|48->17|48->17|49->18|49->18|50->19|51->20
                  -- GENERATED --
              */
          