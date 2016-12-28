
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
  def apply/*1.2*/(rec: Receta):play.twirl.api.XmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.15*/("""

"""),format.raw/*3.1*/("""<receta id=""""),_display_(/*3.14*/rec/*3.17*/.getId()),format.raw/*3.25*/("""">
	<name>"""),_display_(/*4.9*/rec/*4.12*/.getName),format.raw/*4.20*/("""</name>
	<createdAt>"""),_display_(/*5.14*/rec/*5.17*/.getDateCreation),format.raw/*5.33*/("""</createdAt>
	<ingredientes>
	"""),_display_(/*7.3*/for(item  <- rec.getIngredientes) yield /*7.36*/{_display_(Seq[Any](format.raw/*7.37*/("""
		"""),_display_(/*8.4*/ingrediente(item)),format.raw/*8.21*/("""
	""")))}),format.raw/*9.3*/("""
	"""),format.raw/*10.2*/("""</ingredientes>
</receta>"""))
      }
    }
  }

  def render(rec:Receta): play.twirl.api.XmlFormat.Appendable = apply(rec)

  def f:((Receta) => play.twirl.api.XmlFormat.Appendable) = (rec) => apply(rec)

  def ref: this.type = this

}


}

/**/
object receta extends receta_Scope0.receta
              /*
                  -- GENERATED --
                  DATE: Wed Dec 28 17:01:51 CET 2016
                  SOURCE: /Users/mayteecheverry/MyGitRepos/play/Recetas/app/views/receta.scala.xml
                  HASH: b8019c812249735a30d9555479a662bfb2affd02
                  MATRIX: 741->1|848->14|876->16|915->29|926->32|954->40|990->51|1001->54|1029->62|1076->83|1087->86|1123->102|1179->133|1227->166|1265->167|1294->171|1331->188|1363->191|1392->193
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|35->4|35->4|35->4|36->5|36->5|36->5|38->7|38->7|38->7|39->8|39->8|40->9|41->10
                  -- GENERATED --
              */
          