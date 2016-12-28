
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

"""),format.raw/*3.1*/("""<recetas>
	"""),_display_(/*4.3*/for(item <- recetas) yield /*4.23*/{_display_(Seq[Any](format.raw/*4.24*/("""
		"""),format.raw/*5.3*/("""<receta id=""""),_display_(/*5.16*/item/*5.20*/.getId()),format.raw/*5.28*/("""">
			<name>"""),_display_(/*6.11*/item/*6.15*/.getName),format.raw/*6.23*/("""</name>
			<createdAt>"""),_display_(/*7.16*/item/*7.20*/.getDateCreation),format.raw/*7.36*/("""</createdAt>	
		</receta>
	""")))}),format.raw/*9.3*/("""
"""),format.raw/*10.1*/("""</recetas>"""))
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
                  DATE: Wed Dec 28 17:01:51 CET 2016
                  SOURCE: /Users/mayteecheverry/MyGitRepos/play/Recetas/app/views/recetas.scala.xml
                  HASH: fa425d5373688b8390f7ae06debbceb4124123dd
                  MATRIX: 749->1|866->24|894->26|931->38|966->58|1004->59|1033->62|1072->75|1084->79|1112->87|1151->100|1163->104|1191->112|1240->135|1252->139|1288->155|1345->183|1373->184
                  LINES: 27->1|32->1|34->3|35->4|35->4|35->4|36->5|36->5|36->5|36->5|37->6|37->6|37->6|38->7|38->7|38->7|40->9|41->10
                  -- GENERATED --
              */
          