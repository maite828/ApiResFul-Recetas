
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
	<name>"""),_display_(/*4.9*/receta/*4.15*/.getName),format.raw/*4.23*/("""</name>
	<createdAt>"""),_display_(/*5.14*/receta/*5.20*/.getDateCreation),format.raw/*5.36*/("""</createdAt>
	<recIngrediente>
	"""),_display_(/*7.3*/for(i <- receta.getRecIngredientes) yield /*7.38*/{_display_(Seq[Any](format.raw/*7.39*/("""
	"""),_display_(/*8.3*/i),format.raw/*8.4*/("""  
	""")))}),format.raw/*9.3*/("""
	"""),format.raw/*10.2*/("""</recIngrediente>
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
                  DATE: Tue Dec 27 21:00:59 CET 2016
                  SOURCE: /Users/mayteecheverry/MyGitRepos/play/Recetas/app/views/receta.scala.xml
                  HASH: f30422f6aef8772ca163c586c7cc9c9dc610f4f5
                  MATRIX: 741->1|851->17|879->19|918->32|932->38|960->46|996->57|1010->63|1038->71|1085->92|1099->98|1135->114|1193->147|1243->182|1281->183|1309->186|1329->187|1363->192|1392->194
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|35->4|35->4|35->4|36->5|36->5|36->5|38->7|38->7|38->7|39->8|39->8|40->9|41->10
                  -- GENERATED --
              */
          