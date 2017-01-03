
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
                    <td><a href="http://ec2-35-156-254-201.eu-central-1.compute.amazonaws.com/recipesJ">CREO LA RECETA PASANDO LOS DATOS EN JSON MEDIANTE BODY (xml/json)</a></td>
                    <td><strong>POST</strong> curl -H "Content-Type: application/json" -H "Accept: application/xml" -X POST -d '"""),format.raw/*20.129*/("""{"""),format.raw/*20.130*/(""""name": "albondigas",
					"ingredients": ["""),format.raw/*21.22*/("""{"""),format.raw/*21.23*/(""""name": "tomate""""),format.raw/*21.39*/("""}"""),format.raw/*21.40*/(""","""),format.raw/*21.41*/("""{"""),format.raw/*21.42*/(""""name": "cebolla""""),format.raw/*21.59*/("""}"""),format.raw/*21.60*/(""","""),format.raw/*21.61*/("""{"""),format.raw/*21.62*/(""""name": "pan rallado""""),format.raw/*21.83*/("""}"""),format.raw/*21.84*/("""],
					"tags": ["""),format.raw/*22.15*/("""{"""),format.raw/*22.16*/(""""name": "proteinas""""),format.raw/*22.35*/("""}"""),format.raw/*22.36*/(""","""),format.raw/*22.37*/("""{"""),format.raw/*22.38*/(""""name": "facil""""),format.raw/*22.53*/("""}"""),format.raw/*22.54*/("""]"""),format.raw/*22.55*/("""}"""),format.raw/*22.56*/("""' http://ec2-35-156-254-201.eu-central-1.compute.amazonaws.com/recipes</td>
                </tr>
                <tr>
                    <td><a href="http://ec2-35-156-254-201.eu-central-1.compute.amazonaws.com/recipe_cache/1">RECETA GUARDADA EN CACHÉ</a></td>
                    <td><strong>GET</strong> curl -i -H "Accept: application/xml" -X GET http://ec2-35-156-254-201.eu-central-1.compute.amazonaws.com/recipecache/1</td>
                </tr>
                <tr>
                    <td><a href="http://ec2-35-156-254-201.eu-central-1.compute.amazonaws.com/recipes">MUESTRA LA LISTA DE RECETAS (xml/json)</a></td>
                    <td><strong>GET</strong> curl -i -H "Accept: application/json" -X GET http://ec2-35-156-254-201.eu-central-1.compute.amazonaws.com/recipes</td>
                </tr>
                <tr>
                    <td><a href="http://ec2-35-156-254-201.eu-central-1.compute.amazonaws.com/recipe/1">RECETAS POR ID (xml/json)</a></td>
                    <td><strong>GET</strong>curl -i -H "Accept: application/xml" -X GET http://ec2-35-156-254-201.eu-central-1.compute.amazonaws.com/recipe/1</td>
                </tr>
                <tr>
                    <td><a href="http://ec2-35-156-254-201.eu-central-1.compute.amazonaws.com/recipe/name/albondigas">RECETAS POR NOMBRE (xml/json)</a></td>
                    <td><strong>GET</strong>curl -i -H "Accept: application/json" -X GET http://ec2-35-156-254-201.eu-central-1.compute.amazonaws.com/recipe/name/albondigas</td>
                </tr>
                <tr>
                    <td><a href="http://ec2-35-156-254-201.eu-central-1.compute.amazonaws.com/recipe/1">ACTUALIZAR RECETAS (xml/json)</a></td>
                    <td><strong>PUT</strong>curl -H "Content-Type: application/json" -H "Accept: application/xml" -X PUT -d '"""),format.raw/*42.126*/("""{"""),format.raw/*42.127*/(""""name": "Sopa",
					"ingredients": ["""),format.raw/*43.22*/("""{"""),format.raw/*43.23*/(""""name": "m""""),format.raw/*43.34*/("""}"""),format.raw/*43.35*/(""","""),format.raw/*43.36*/("""{"""),format.raw/*43.37*/(""""name": "e""""),format.raw/*43.48*/("""}"""),format.raw/*43.49*/(""","""),format.raw/*43.50*/("""{"""),format.raw/*43.51*/(""""name": "ii""""),format.raw/*43.63*/("""}"""),format.raw/*43.64*/("""],
					"tags": ["""),format.raw/*44.15*/("""{"""),format.raw/*44.16*/(""""name": "ym""""),format.raw/*44.28*/("""}"""),format.raw/*44.29*/(""","""),format.raw/*44.30*/("""{"""),format.raw/*44.31*/(""""name": "y""""),format.raw/*44.42*/("""}"""),format.raw/*44.43*/("""]"""),format.raw/*44.44*/("""}"""),format.raw/*44.45*/("""' http://ec2-35-156-254-201.eu-central-1.compute.amazonaws.com/recipe/1</td>
                </tr>
                <tr>
                    <td><a href="http://ec2-35-156-254-201.eu-central-1.compute.amazonaws.com/recipe/1">ELIMINAR RECETAS POR ID (xml/json)</a></td>
                    <td><strong>DELETE</strong>curl -i -H "Accept: application/json" -X DELETE http://ec2-35-156-254-201.eu-central-1.compute.amazonaws.com/recipe/1</td>
                </tr>
                <tr>
                    <td><a href="http://ec2-35-156-254-201.eu-central-1.compute.amazonaws.com/recipesF\?name\=Fabada\&portions\=8">CREO RECETA PASANDO MEDIANTE FORMFACTORY</a></td>
                    <td><strong>POST</strong>curl -i -X POST http://ec2-35-156-254-201.eu-central-1.compute.amazonaws.com/recipesF\?name\=Fabada\&portions\=4</td>
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
                    <td><a href="http://ec2-35-156-254-201.eu-central-1.compute.amazonaws.com/ingredients\?name\=harina\&quantity\=450">CREO INGREDIENTE PASANDO MEDIANTE FORMFACTORY</a></td>
                    <td><strong>POST</strong>curl -i -X POST http://ec2-35-156-254-201.eu-central-1.compute.amazonaws.com/ingredients\?name\=harina\&quantity\=450</td>
                </tr>
                 <tr>
                    <td><a href="http://ec2-35-156-254-201.eu-central-1.compute.amazonaws.com/ingredients/1/recipe/1">RELACION MANUAL ManyToMany RECETAS_INGREDIENTES</a></td>
                    <td><strong>PUT</strong>curl -i -H "Accept: application/xml" -X PUT http://ec2-35-156-254-201.eu-central-1.compute.amazonaws.com/ingredients/1/recipe/1</td>
                </tr>
                <tr>
                    <td><a href="http://ec2-35-156-254-201.eu-central-1.compute.amazonaws.com/ingredients">MUESTRA LA LISTA DE INGREDIENTES (xml/json)</a></td>
                    <td><strong>GET</strong>curl -i -X GET http://ec2-35-156-254-201.eu-central-1.compute.amazonaws.com/ingredients</td>
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
                    <td><a href="http://ec2-35-156-254-201.eu-central-1.compute.amazonaws.com/recipe/tag/facil">RECETAS POR TAG (xml/json)</a></td>
                    <td><strong>GET</strong>curl -i -H "Accept: application/xml" -X GET http://ec2-35-156-254-201.eu-central-1.compute.amazonaws.com/recipe/tag/facil</td>
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
                    <td><a href="http://ec2-35-156-254-201.eu-central-1.compute.amazonaws.com/ingredients/1/recipe/1">RELACION MANUAL ManyToMany RECETAS_INGREDIENTES</a></td>
                    <td><strong>POST</strong>curl -i -H "Accept: application/xml" -X PUT http://ec2-35-156-254-201.eu-central-1.compute.amazonaws.com/ingredients/1/recipe/1</td>
                </tr>
            	<tr>
                    <td><a href="http://ec2-35-156-254-201.eu-central-1.compute.amazonaws.com/recipes/1/task\?description\=bbbb">RELACION MANUAL OneToMany RECETA_TASKS</a></td>
                    <td><strong>POST</strong>curl -i -H "Accept: application/xml" -X POST http://ec2-35-156-254-201.eu-central-1.compute.amazonaws.com/recipes/1/task\?description\=bbbb</td>
                </tr>
                <tr>
                    <td><a href="http://ec2-35-156-254-201.eu-central-1.compute.amazonaws.com/ingredients/1/task/1">//RELAICION MANUAL OneToMany INGREDIENTE_TASKS</a></td>
                    <td><strong>POST</strong>curl -i -H "Accept: application/xml" -X POST http://ec2-35-156-254-201.eu-central-1.compute.amazonaws.com/ingredients/1/task/1</td>
                </tr>
            </tbody>
        </table>
    </div>

""")))}),format.raw/*125.2*/("""
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
                  DATE: Tue Jan 03 03:19:11 CET 2017
                  SOURCE: /Users/mayteecheverry/MyGitRepos/play/Recetas/app/views/index.scala.html
                  HASH: 42785502b6cf74f84103c2d3ca588e0c464af7f3
                  MATRIX: 745->1|857->18|885->21|906->34|945->36|976->41|1007->46|1034->53|1737->727|1767->728|1838->771|1867->772|1911->788|1940->789|1969->790|1998->791|2043->808|2072->809|2101->810|2130->811|2179->832|2208->833|2253->850|2282->851|2329->870|2358->871|2387->872|2416->873|2459->888|2488->889|2517->890|2546->891|4399->2715|4429->2716|4494->2753|4523->2754|4562->2765|4591->2766|4620->2767|4649->2768|4688->2779|4717->2780|4746->2781|4775->2782|4815->2794|4844->2795|4889->2812|4918->2813|4958->2825|4987->2826|5016->2827|5045->2828|5084->2839|5113->2840|5142->2841|5171->2842|9761->7401
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|35->4|35->4|51->20|51->20|52->21|52->21|52->21|52->21|52->21|52->21|52->21|52->21|52->21|52->21|52->21|52->21|53->22|53->22|53->22|53->22|53->22|53->22|53->22|53->22|53->22|53->22|73->42|73->42|74->43|74->43|74->43|74->43|74->43|74->43|74->43|74->43|74->43|74->43|74->43|74->43|75->44|75->44|75->44|75->44|75->44|75->44|75->44|75->44|75->44|75->44|156->125
                  -- GENERATED --
              */
          