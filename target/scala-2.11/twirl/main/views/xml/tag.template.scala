
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
  def apply/*1.2*/(t: Tag):play.twirl.api.XmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.10*/("""

"""),format.raw/*3.1*/("""<tag>
	<name>"""),_display_(/*4.9*/t/*4.10*/.getName),format.raw/*4.18*/("""</name>
</tag>"""))
      }
    }
  }

  def render(t:Tag): play.twirl.api.XmlFormat.Appendable = apply(t)

  def f:((Tag) => play.twirl.api.XmlFormat.Appendable) = (t) => apply(t)

  def ref: this.type = this

}


}

/**/
object tag extends tag_Scope0.tag
              /*
                  -- GENERATED --
                  DATE: Sat Dec 31 23:19:46 CET 2016
                  SOURCE: /Users/mayteecheverry/MyGitRepos/play/Recetas/app/views/tag.scala.xml
                  HASH: be2258631cb87187d6f7c65e083e6a8291abcc95
                  MATRIX: 732->1|834->9|862->11|901->25|910->26|938->34
                  LINES: 27->1|32->1|34->3|35->4|35->4|35->4
                  -- GENERATED --
              */
          