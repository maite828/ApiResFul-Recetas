
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
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td><a href="curl -H "Content-Type: application/json" -H "Accept: application/xml" -X POST -d '"""),format.raw/*19.116*/("""{"""),format.raw/*19.117*/(""""name": "albondigas",
					"ingredients": ["""),format.raw/*20.22*/("""{"""),format.raw/*20.23*/(""""name": "tomate""""),format.raw/*20.39*/("""}"""),format.raw/*20.40*/(""","""),format.raw/*20.41*/("""{"""),format.raw/*20.42*/(""""name": "cebolla""""),format.raw/*20.59*/("""}"""),format.raw/*20.60*/(""","""),format.raw/*20.61*/("""{"""),format.raw/*20.62*/(""""name": "pan rallado""""),format.raw/*20.83*/("""}"""),format.raw/*20.84*/("""],
					"tags": ["""),format.raw/*21.15*/("""{"""),format.raw/*21.16*/(""""name": "proteinas""""),format.raw/*21.35*/("""}"""),format.raw/*21.36*/(""","""),format.raw/*21.37*/("""{"""),format.raw/*21.38*/(""""name": "facil""""),format.raw/*21.53*/("""}"""),format.raw/*21.54*/("""]"""),format.raw/*21.55*/("""}"""),format.raw/*21.56*/("""' http://localhost:9000/recipes">CREO LA RECETA PASANDO LOS DATOS EN JSON MEDIANTE BODY (xml/json)</a></td>
                    <td><strong>POST</strong> curl -H "Content-Type: application/json" -H "Accept: application/xml" -X POST -d '"""),format.raw/*22.129*/("""{"""),format.raw/*22.130*/(""""name": "albondigas",
					"ingredients": ["""),format.raw/*23.22*/("""{"""),format.raw/*23.23*/(""""name": "tomate""""),format.raw/*23.39*/("""}"""),format.raw/*23.40*/(""","""),format.raw/*23.41*/("""{"""),format.raw/*23.42*/(""""name": "cebolla""""),format.raw/*23.59*/("""}"""),format.raw/*23.60*/(""","""),format.raw/*23.61*/("""{"""),format.raw/*23.62*/(""""name": "pan rallado""""),format.raw/*23.83*/("""}"""),format.raw/*23.84*/("""],
					"tags": ["""),format.raw/*24.15*/("""{"""),format.raw/*24.16*/(""""name": "proteinas""""),format.raw/*24.35*/("""}"""),format.raw/*24.36*/(""","""),format.raw/*24.37*/("""{"""),format.raw/*24.38*/(""""name": "facil""""),format.raw/*24.53*/("""}"""),format.raw/*24.54*/("""]"""),format.raw/*24.55*/("""}"""),format.raw/*24.56*/("""' http://localhost:9000/recipes</td>
                </tr>
                <tr>
                    <td><a href="">RECETA GUARDADA EN CACHÉ</a></td>
                    <td><strong>GET</strong> curl -i -H "Accept: application/xml" -X GET http://localhost:9000/recipecache/1</td>
                </tr>
                <tr>
                    <td><a href="">MUESTRA LA LISTA DE RECETAS (xml/json)</a></td>
                    <td><strong>GET</strong> curl -i -H "Accept: application/json" -X GET http://localhost:9000/recipes</td>
                </tr>
                <tr>
                    <td><a href="">RECETAS POR ID (xml/json)</a></td>
                    <td><strong>GET</strong>curl -i -H "Accept: application/xml" -X GET http://localhost:9000/recipe/1</td>
                </tr>
                <tr>
                    <td><a href="">RECETAS POR NOMBRE (xml/json)</a></td>
                    <td><strong>GET</strong>curl -i -H "Accept: application/json" -X GET http://localhost:9000/recipe/name/albondigas</td>
                </tr>
                <tr>
                    <td><a href="">ACTUALIZAR RECETAS (xml/json)</a></td>
                    <td><strong>PUT</strong>curl -H "Content-Type: application/json" -H "Accept: application/xml" -X PUT -d '"""),format.raw/*44.126*/("""{"""),format.raw/*44.127*/(""""name": "Rodaballo",
					"ingredients": ["""),format.raw/*45.22*/("""{"""),format.raw/*45.23*/(""""name": "m""""),format.raw/*45.34*/("""}"""),format.raw/*45.35*/(""","""),format.raw/*45.36*/("""{"""),format.raw/*45.37*/(""""name": "e""""),format.raw/*45.48*/("""}"""),format.raw/*45.49*/(""","""),format.raw/*45.50*/("""{"""),format.raw/*45.51*/(""""name": "ii""""),format.raw/*45.63*/("""}"""),format.raw/*45.64*/("""],
					"tags": ["""),format.raw/*46.15*/("""{"""),format.raw/*46.16*/(""""name": "ym""""),format.raw/*46.28*/("""}"""),format.raw/*46.29*/(""","""),format.raw/*46.30*/("""{"""),format.raw/*46.31*/(""""name": "y""""),format.raw/*46.42*/("""}"""),format.raw/*46.43*/("""]"""),format.raw/*46.44*/("""}"""),format.raw/*46.45*/("""' http://localhost:9000/recipe/1</td>
                </tr>
                <tr>
                    <td><a href="">ELIMINAR RECETAS POR ID (xml/json)</a></td>
                    <td><strong>DELETE</strong>curl -i -H "Accept: application/json" -X DELETE http://localhost:9000/recipe/1</td>
                </tr>
                <tr>
                    <td><a href="">CREO RECETA PASANDO MEDIANTE FORMFACTORY</a></td>
                    <td><strong>POST</strong>curl -i -X POST http://localhost:9000/recipesF\?name\=pan\&portions\=4</td>
                </tr>
            </tbody>
        </table>
        <div class="divider"></div>

        <h4>Ingredientes</h4>
        <table class="responsive-table highlight striped">
            <thead>
                <tr>
                    <th>Acción</th>
                    <th>URI</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td><a href="">CREO INGREDIENTE PASANDO MEDIANTE FORMFACTORY</a></td>
                    <td><strong>POST</strong>curl -i -X POST http://localhost:9000/ingredients\?name\=harina\&quantity\=450</td>
                </tr>
                 <tr>
                    <td><a href="">RELACION MANUAL ManyToMany RECETAS_INGREDIENTES</a></td>
                    <td><strong>PUT</strong>curl -i -H "Accept: application/xml" -X PUT http://localhost:9000/ingredients/1/recipe/1</td>
                </tr>
                <tr>
                    <td><a href="">MUESTRA LA LISTA DE INGREDIENTES (xml/json)</a></td>
                    <td><strong>GET</strong>curl -i -X GET http://localhost:9000/ingredients</td>
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
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td><a href="">RECETAS POR TAG (xml/json)</a></td>
                    <td><strong>GET</strong>curl -i -H "Accept: application/xml" -X GET http://localhost:9000/recipe/tag/facil</td>
                </tr>

            </tbody>
        </table>
        
        <h4>Tasks</h4>
        <table class="responsive-table highlight striped">
            <thead>
                <tr>
                    <th>Acción</th>
                    <th>URI</th>
                </tr>
            </thead>
            <tbody>
            	<tr>
                    <td><a href="">RELACION MANUAL ManyToMany RECETAS_INGREDIENTES</a></td>
                    <td><strong>POST</strong>curl "Accept: application/xml" -X PUT http://localhost:9000/ingredients/1/recipe/1</td>
                </tr>
            	<tr>
                    <td><a href="">RELACION MANUAL OneToMany RECETA_TASKS</a></td>
                    <td><strong>POST</strong>curl -i -H "Accept: application/xml" -X POST http://localhost:9000/recipes/1/task\?description\=bbbb</td>
                </tr>
                <tr>
                    <td><a href="">//RELAICION MANUAL OneToMany INGREDIENTE_TASKS</a></td>
                    <td><strong>POST</strong>curl -i -H "Accept: application/xml" -X POST http://localhost:9000/ingredients/1/task/1</td>
                </tr>
            </tbody>
        </table>
    </div>

""")))}),format.raw/*127.2*/("""
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
                  DATE: Sun Jan 01 17:04:30 CET 2017
                  SOURCE: /Users/mayteecheverry/MyGitRepos/play/Recetas/app/views/index.scala.html
                  HASH: 6be7105ea6cbf70e58924b9b3e24dbc5ea155df3
                  MATRIX: 745->1|857->18|885->21|906->34|945->36|976->41|1007->46|1034->53|1545->535|1575->536|1646->579|1675->580|1719->596|1748->597|1777->598|1806->599|1851->616|1880->617|1909->618|1938->619|1987->640|2016->641|2061->658|2090->659|2137->678|2166->679|2195->680|2224->681|2267->696|2296->697|2325->698|2354->699|2619->935|2649->936|2720->979|2749->980|2793->996|2822->997|2851->998|2880->999|2925->1016|2954->1017|2983->1018|3012->1019|3061->1040|3090->1041|3135->1058|3164->1059|3211->1078|3240->1079|3269->1080|3298->1081|3341->1096|3370->1097|3399->1098|3428->1099|4722->2364|4752->2365|4822->2407|4851->2408|4890->2419|4919->2420|4948->2421|4977->2422|5016->2433|5045->2434|5074->2435|5103->2436|5143->2448|5172->2449|5217->2466|5246->2467|5286->2479|5315->2480|5344->2481|5373->2482|5412->2493|5441->2494|5470->2495|5499->2496|8934->5900
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|35->4|35->4|50->19|50->19|51->20|51->20|51->20|51->20|51->20|51->20|51->20|51->20|51->20|51->20|51->20|51->20|52->21|52->21|52->21|52->21|52->21|52->21|52->21|52->21|52->21|52->21|53->22|53->22|54->23|54->23|54->23|54->23|54->23|54->23|54->23|54->23|54->23|54->23|54->23|54->23|55->24|55->24|55->24|55->24|55->24|55->24|55->24|55->24|55->24|55->24|75->44|75->44|76->45|76->45|76->45|76->45|76->45|76->45|76->45|76->45|76->45|76->45|76->45|76->45|77->46|77->46|77->46|77->46|77->46|77->46|77->46|77->46|77->46|77->46|158->127
                  -- GENERATED --
              */
          