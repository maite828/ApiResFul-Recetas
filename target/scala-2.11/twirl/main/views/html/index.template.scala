
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
                    <td><a href="">CREO LA RECETA PASANDO LOS DATOS EN JSON MEDIANTE BODY (xml/json)</a></td>
                    <td><strong>POST</strong> curl -H "Content-Type: application/json" -H "Accept: application/xml" -X POST -d '"""),format.raw/*20.129*/("""{"""),format.raw/*20.130*/(""""name": "albondigas",
					"ingredients": ["""),format.raw/*21.22*/("""{"""),format.raw/*21.23*/(""""name": "tomate""""),format.raw/*21.39*/("""}"""),format.raw/*21.40*/(""","""),format.raw/*21.41*/("""{"""),format.raw/*21.42*/(""""name": "cebolla""""),format.raw/*21.59*/("""}"""),format.raw/*21.60*/(""","""),format.raw/*21.61*/("""{"""),format.raw/*21.62*/(""""name": "pan rallado""""),format.raw/*21.83*/("""}"""),format.raw/*21.84*/("""],
					"tags": ["""),format.raw/*22.15*/("""{"""),format.raw/*22.16*/(""""name": "proteinas""""),format.raw/*22.35*/("""}"""),format.raw/*22.36*/(""","""),format.raw/*22.37*/("""{"""),format.raw/*22.38*/(""""name": "facil""""),format.raw/*22.53*/("""}"""),format.raw/*22.54*/("""]"""),format.raw/*22.55*/("""}"""),format.raw/*22.56*/("""' http://ec2-35-156-252-132.eu-central-1.compute.amazonaws.com/recipes</td>
                </tr>
                <tr>
                    <td><a href="">RECETA GUARDADA EN CACHÉ</a></td>
                    <td><strong>GET</strong> curl -i -H "Accept: application/xml" -X GET http://ec2-35-156-252-132.eu-central-1.compute.amazonaws.com/recipecache/1</td>
                </tr>
                <tr>
                    <td><a href="">MUESTRA LA LISTA DE RECETAS (xml/json)</a></td>
                    <td><strong>GET</strong> curl -i -H "Accept: application/json" -X GET http://ec2-35-156-252-132.eu-central-1.compute.amazonaws.com/recipes</td>
                </tr>
                <tr>
                    <td><a href="">RECETAS POR ID (xml/json)</a></td>
                    <td><strong>GET</strong>curl -i -H "Accept: application/xml" -X GET http://ec2-35-156-252-132.eu-central-1.compute.amazonaws.com/recipe/1</td>
                </tr>
                <tr>
                    <td><a href="">RECETAS POR NOMBRE (xml/json)</a></td>
                    <td><strong>GET</strong>curl -i -H "Accept: application/json" -X GET http://ec2-35-156-252-132.eu-central-1.compute.amazonaws.com/recipe/name/albondigas</td>
                </tr>
                <tr>
                    <td><a href="">ACTUALIZAR RECETAS (xml/json)</a></td>
                    <td><strong>PUT</strong>curl -H "Content-Type: application/json" -H "Accept: application/xml" -X PUT -d '"""),format.raw/*42.126*/("""{"""),format.raw/*42.127*/(""""name": "Rodaballo",
					"ingredients": ["""),format.raw/*43.22*/("""{"""),format.raw/*43.23*/(""""name": "m""""),format.raw/*43.34*/("""}"""),format.raw/*43.35*/(""","""),format.raw/*43.36*/("""{"""),format.raw/*43.37*/(""""name": "e""""),format.raw/*43.48*/("""}"""),format.raw/*43.49*/(""","""),format.raw/*43.50*/("""{"""),format.raw/*43.51*/(""""name": "ii""""),format.raw/*43.63*/("""}"""),format.raw/*43.64*/("""],
					"tags": ["""),format.raw/*44.15*/("""{"""),format.raw/*44.16*/(""""name": "ym""""),format.raw/*44.28*/("""}"""),format.raw/*44.29*/(""","""),format.raw/*44.30*/("""{"""),format.raw/*44.31*/(""""name": "y""""),format.raw/*44.42*/("""}"""),format.raw/*44.43*/("""]"""),format.raw/*44.44*/("""}"""),format.raw/*44.45*/("""' http://ec2-35-156-252-132.eu-central-1.compute.amazonaws.com/recipe/1</td>
                </tr>
                <tr>
                    <td><a href="">ELIMINAR RECETAS POR ID (xml/json)</a></td>
                    <td><strong>DELETE</strong>curl -i -H "Accept: application/json" -X DELETE http://ec2-35-156-252-132.eu-central-1.compute.amazonaws.com/recipe/1</td>
                </tr>
                <tr>
                    <td><a href="">CREO RECETA PASANDO MEDIANTE FORMFACTORY</a></td>
                    <td><strong>POST</strong>curl -i -X POST http://ec2-35-156-252-132.eu-central-1.compute.amazonaws.com/recipesF\?name\=pan\&portions\=4</td>
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
                    <td><strong>POST</strong>curl -i -X POST http://ec2-35-156-252-132.eu-central-1.compute.amazonaws.com/ingredients\?name\=harina\&quantity\=450</td>
                </tr>
                 <tr>
                    <td><a href="">RELACION MANUAL ManyToMany RECETAS_INGREDIENTES</a></td>
                    <td><strong>PUT</strong>curl -i -H "Accept: application/xml" -X PUT http://ec2-35-156-252-132.eu-central-1.compute.amazonaws.com/ingredients/1/recipe/1</td>
                </tr>
                <tr>
                    <td><a href="">MUESTRA LA LISTA DE INGREDIENTES (xml/json)</a></td>
                    <td><strong>GET</strong>curl -i -X GET http://ec2-35-156-252-132.eu-central-1.compute.amazonaws.com/ingredients</td>
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
                    <td><strong>GET</strong>curl -i -H "Accept: application/xml" -X GET http://ec2-35-156-252-132.eu-central-1.compute.amazonaws.com/recipe/tag/facil</td>
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
                    <td><strong>POST</strong>"Accept: application/xml" -X PUT http://ec2-35-156-252-132.eu-central-1.compute.amazonaws.com/ingredients/1/recipe/1</td>
                </tr>
            	<tr>
                    <td><a href="">RELACION MANUAL OneToMany RECETA_TASKS</a></td>
                    <td><strong>POST</strong>curl -i -H "Accept: application/xml" -X POST http://ec2-35-156-252-132.eu-central-1.compute.amazonaws.com/recipes/1/task\?description\=bbbb</td>
                </tr>
                <tr>
                    <td><a href="">//RELAICION MANUAL OneToMany INGREDIENTE_TASKS</a></td>
                    <td><strong>POST</strong>curl -i -H "Accept: application/xml" -X POST http://ec2-35-156-252-132.eu-central-1.compute.amazonaws.com/ingredients/1/task/1</td>
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
                  DATE: Sat Dec 31 23:19:46 CET 2016
                  SOURCE: /Users/mayteecheverry/MyGitRepos/play/Recetas/app/views/index.scala.html
                  HASH: 036dee7f14988226b8766ee9fd5823fb4a91405a
                  MATRIX: 745->1|857->18|885->21|906->34|945->36|976->41|1007->46|1034->53|1668->658|1698->659|1769->702|1798->703|1842->719|1871->720|1900->721|1929->722|1974->739|2003->740|2032->741|2061->742|2110->763|2139->764|2184->781|2213->782|2260->801|2289->802|2318->803|2347->804|2390->819|2419->820|2448->821|2477->822|3966->2282|3996->2283|4066->2325|4095->2326|4134->2337|4163->2338|4192->2339|4221->2340|4260->2351|4289->2352|4318->2353|4347->2354|4387->2366|4416->2367|4461->2384|4490->2385|4530->2397|4559->2398|4588->2399|4617->2400|4656->2411|4685->2412|4714->2413|4743->2414|8563->6203
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|35->4|35->4|51->20|51->20|52->21|52->21|52->21|52->21|52->21|52->21|52->21|52->21|52->21|52->21|52->21|52->21|53->22|53->22|53->22|53->22|53->22|53->22|53->22|53->22|53->22|53->22|73->42|73->42|74->43|74->43|74->43|74->43|74->43|74->43|74->43|74->43|74->43|74->43|74->43|74->43|75->44|75->44|75->44|75->44|75->44|75->44|75->44|75->44|75->44|75->44|156->125
                  -- GENERATED --
              */
          