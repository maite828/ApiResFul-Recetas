
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

"""),_display_(/*5.2*/for(r <- recetas) yield /*5.19*/{_display_(Seq[Any](format.raw/*5.20*/("""
"""),format.raw/*6.1*/("""<receta id=""""),_display_(/*6.14*/r/*6.15*/.getId()),format.raw/*6.23*/("""">
	<name>"""),_display_(/*7.9*/r/*7.10*/.getName),format.raw/*7.18*/("""</name>
	<createdAt>"""),_display_(/*8.14*/r/*8.15*/.getDateCreation),format.raw/*8.31*/("""</createdAt>	
</receta>
""")))}),format.raw/*10.2*/("""

"""),format.raw/*12.1*/("""</recetas>"""))
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
                  DATE: Tue Dec 27 19:24:07 CET 2016
                  SOURCE: /Users/mayteecheverry/MyGitRepos/play/Recetas/app/views/recetas.scala.xml
                  HASH: cd5f8aa6c8cc720309fe751a659a4e1849e3f529
                  MATRIX: 749->1|866->24|894->26|931->38|963->55|1001->56|1028->57|1067->70|1076->71|1104->79|1140->90|1149->91|1177->99|1224->120|1233->121|1269->137|1324->162|1353->164
                  LINES: 27->1|32->1|34->3|36->5|36->5|36->5|37->6|37->6|37->6|37->6|38->7|38->7|38->7|39->8|39->8|39->8|41->10|43->12
                  -- GENERATED --
              */
          