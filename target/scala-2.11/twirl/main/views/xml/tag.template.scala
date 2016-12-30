
package views.xml

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object tag_Scope0 {
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

class tag extends BaseScalaTemplate[play.twirl.api.XmlFormat.Appendable,Format[play.twirl.api.XmlFormat.Appendable]](play.twirl.api.XmlFormat) with play.twirl.api.Template1[Tag,play.twirl.api.XmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(tag: Tag):play.twirl.api.XmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.12*/("""

"""),format.raw/*3.1*/("""<tag>
	<name>"""),_display_(/*4.9*/tag/*4.12*/.getName),format.raw/*4.20*/("""</name>
</tag>"""))
      }
    }
  }

  def render(tag:Tag): play.twirl.api.XmlFormat.Appendable = apply(tag)

  def f:((Tag) => play.twirl.api.XmlFormat.Appendable) = (tag) => apply(tag)

  def ref: this.type = this

}


}

/**/
object tag extends tag_Scope0.tag
              /*
                  -- GENERATED --
                  DATE: Fri Dec 30 02:52:23 CET 2016
                  SOURCE: /Users/mayteecheverry/MyGitRepos/play/Recetas/app/views/tag.scala.xml
                  HASH: 0dab98b9d7340a063d96db31e74a383c89d62ba6
                  MATRIX: 732->1|836->11|864->13|903->27|914->30|942->38
                  LINES: 27->1|32->1|34->3|35->4|35->4|35->4
                  -- GENERATED --
              */
          