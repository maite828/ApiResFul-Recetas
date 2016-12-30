
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
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

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.19*/("""

"""),_display_(/*3.2*/main(message)/*3.15*/ {_display_(Seq[Any](format.raw/*3.17*/("""
    """),format.raw/*4.5*/("""<h1>"""),_display_(/*4.10*/message),format.raw/*4.17*/("""</h1>

    <h2>RUTAS DE LA API</h2>
    <div class="divider"></div>
    <div id="rutas">
        <h4>Recetas</h4>
        <table class="responsive-table highlight striped">
            <thead>
                <tr>
                    <th>Acción</th>
                    <th>URI</th>
                    <th class="center">Login</th>
                </tr>
            </thead>
            <tbody>

                <tr>
                    <td><a href="https://github.com/JoseVte/tfg-recetarium/tree/master/doc/recetas-doc.md#obtener-una-receta-por-slug">Obtener por slug</a></td>
                    <td><strong>GET</strong> /recipes/"""),format.raw/*22.55*/("""{"""),format.raw/*22.56*/("""slug"""),format.raw/*22.60*/("""}"""),format.raw/*22.61*/("""</td>
                    <td class="center">-</td>
                </tr>
                <tr>
                    <td><a href="https://github.com/JoseVte/tfg-recetarium/tree/master/doc/recetas-doc.md#crear-una-receta-nueva">Crear</a></td>
                    <td><strong>POST</strong> /recipes</td>
                    <td class="center">OWNER</td>
                </tr>
                <tr>
                    <td><a href="https://github.com/JoseVte/tfg-recetarium/tree/master/doc/recetas-doc.md#borrar-un-ingrediente-de-una-receta">Borrar un ingrediente</a></td>
                    <td><strong>DELETE</strong> /recipes/"""),format.raw/*32.58*/("""{"""),format.raw/*32.59*/("""id-receta"""),format.raw/*32.68*/("""}"""),format.raw/*32.69*/("""/ingredient/"""),format.raw/*32.81*/("""{"""),format.raw/*32.82*/("""id"""),format.raw/*32.84*/("""}"""),format.raw/*32.85*/("""</td>
                    <td class="center">OWNER / ADMIN</td>
                </tr>
                <tr>
                    <td><a href="https://github.com/JoseVte/tfg-recetarium/tree/master/doc/recetas-doc.md#a%C3%B1adir-o-quitar-de-favoritos">Añadir/Borrar a favoritos</a></td>
                    <td><strong>PUT</strong> /recipes/"""),format.raw/*37.55*/("""{"""),format.raw/*37.56*/("""id"""),format.raw/*37.58*/("""}"""),format.raw/*37.59*/("""/fav</td>
                    <td class="center">COMUN</td>
                </tr>
            </tbody>
        </table>
        <div class="divider"></div>

        <h4>Tags</h4>
        <table class="responsive-table highlight striped">
            <thead>
                <tr>
                    <th>Acción</th>
                    <th>URI</th>
                    <th class="center">Login</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td><a href="https://github.com/JoseVte/tfg-recetarium/tree/master/doc/tag-doc.md#buscar-etiquetas-por-cadena">Buscar tags</a></td>
                    <td><strong>GET</strong>  /tags(?search=*)</td>
                    <td class="center">-</td>
                </tr>
                <tr>
                    <td><a href="https://github.com/JoseVte/tfg-recetarium/tree/master/doc/tag-doc.md#obtener-una-etiqueta-por-id">Obtener por id</a></td>
                    <td><strong>GET</strong>    /tags/"""),format.raw/*61.55*/("""{"""),format.raw/*61.56*/("""id"""),format.raw/*61.58*/("""}"""),format.raw/*61.59*/("""</td>
                    <td class="center">-</td>
                </tr>
            </tbody>
        </table>
        <div class="divider"></div>

        <h4>Archivos</h4>
        <table class="responsive-table highlight striped">
            <thead>
                <tr>
                    <th>Acción</th>
                    <th>URI</th>
                    <th class="center">Login</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td><a href="https://github.com/JoseVte/tfg-recetarium/tree/master/doc/archivos-doc.md#todas-las-imagenes">Todas las imagenes</a></td>
                    <td><strong>GET</strong>  /users/"""),format.raw/*80.54*/("""{"""),format.raw/*80.55*/("""user-id"""),format.raw/*80.62*/("""}"""),format.raw/*80.63*/("""/files</td>
                    <td class="center">COMUN</td>
                </tr>
            </tbody>
        </table>
    </div>

""")))}),format.raw/*87.2*/("""
"""))
      }
    }
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Fri Dec 30 07:17:31 CET 2016
                  SOURCE: /Users/mayteecheverry/MyGitRepos/play/Recetas/app/views/index.scala.html
                  HASH: 52be4d41572140135186937eb6bd1972edd474b4
                  MATRIX: 745->1|857->18|885->21|906->34|945->36|976->41|1007->46|1034->53|1695->686|1724->687|1756->691|1785->692|2437->1316|2466->1317|2503->1326|2532->1327|2572->1339|2601->1340|2631->1342|2660->1343|3025->1680|3054->1681|3084->1683|3113->1684|4141->2684|4170->2685|4200->2687|4229->2688|4943->3374|4972->3375|5007->3382|5036->3383|5201->3518
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|35->4|35->4|53->22|53->22|53->22|53->22|63->32|63->32|63->32|63->32|63->32|63->32|63->32|63->32|68->37|68->37|68->37|68->37|92->61|92->61|92->61|92->61|111->80|111->80|111->80|111->80|118->87
                  -- GENERATED --
              */
          