
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
                    <td><a href="https://github.com/JoseVte/tfg-recetarium/tree/master/doc/recetas-doc.md#paginaci%C3%B3n">Listado y busqueda por páginas</a></td>
                    <td><strong>GET</strong> /recipes(?page=&amp;size=&amp;search=&amp;order=&amp;tags=*)</td>
                    <td class="center">-</td>
                </tr>
                <tr>
                    <td><a href="https://github.com/JoseVte/tfg-recetarium/tree/master/doc/recetas-doc.md#obtener-una-receta-por-slug">Obtener por slug</a></td>
                    <td><strong>GET</strong> /recipes/"""),format.raw/*26.55*/("""{"""),format.raw/*26.56*/("""slug"""),format.raw/*26.60*/("""}"""),format.raw/*26.61*/("""</td>
                    <td class="center">-</td>
                </tr>
                <tr>
                    <td><a href="https://github.com/JoseVte/tfg-recetarium/tree/master/doc/recetas-doc.md#crear-una-receta-nueva">Crear</a></td>
                    <td><strong>POST</strong> /recipes</td>
                    <td class="center">OWNER</td>
                </tr>
                <tr>
                    <td><a href="https://github.com/JoseVte/tfg-recetarium/tree/master/doc/recetas-doc.md#crear-un-nuevo-borrador">Crear borrador</a></td>
                    <td><strong>POST</strong> /recipes/draft</td>
                    <td class="center">OWNER</td>
                </tr>
                <tr>
                    <td><a href="https://github.com/JoseVte/tfg-recetarium/tree/master/doc/recetas-doc.md#crear-una-receta-desde-el-borrador">Crear receta desde el borrador</a></td>
                    <td><strong>POST</strong> /recipes/create-from-draft</td>
                    <td class="center">OWNER</td>
                </tr>
                <tr>
                    <td><a href="https://github.com/JoseVte/tfg-recetarium/tree/master/doc/recetas-doc.md#actualizar-una-receta-ya-existente">Actualizar</a></td>
                    <td><strong>PUT</strong>    /recipes/"""),format.raw/*46.58*/("""{"""),format.raw/*46.59*/("""id"""),format.raw/*46.61*/("""}"""),format.raw/*46.62*/(""" """),format.raw/*46.63*/("""<br> <strong>PATCH</strong>  /recipes/"""),format.raw/*46.101*/("""{"""),format.raw/*46.102*/("""id"""),format.raw/*46.104*/("""}"""),format.raw/*46.105*/("""</td>
                    <td class="center">OWNER / ADMIN</td>
                </tr>
                <tr>
                    <td><a href="https://github.com/JoseVte/tfg-recetarium/tree/master/doc/recetas-doc.md#borrar-una-receta">Borrar</a></td>
                    <td><strong>DELETE</strong> /recipes/"""),format.raw/*51.58*/("""{"""),format.raw/*51.59*/("""id"""),format.raw/*51.61*/("""}"""),format.raw/*51.62*/("""</td>
                    <td class="center">OWNER / ADMIN</td>
                </tr>
                <tr>
                    <td><a href="https://github.com/JoseVte/tfg-recetarium/tree/master/doc/recetas-doc.md#comprobar-slug-de-una-receta">Comprobar slug</a></td>
                    <td><strong>HEAD</strong> /recipes/"""),format.raw/*56.56*/("""{"""),format.raw/*56.57*/("""slug"""),format.raw/*56.61*/("""}"""),format.raw/*56.62*/("""/check <br> <strong>HEAD</strong> /recipes/"""),format.raw/*56.105*/("""{"""),format.raw/*56.106*/("""slug"""),format.raw/*56.110*/("""}"""),format.raw/*56.111*/("""/check/"""),format.raw/*56.118*/("""{"""),format.raw/*56.119*/("""id"""),format.raw/*56.121*/("""}"""),format.raw/*56.122*/("""</td>
                    <td class="center">COMUN</td>
                </tr>
                <tr>
                    <td><a href="https://github.com/JoseVte/tfg-recetarium/tree/master/doc/recetas-doc.md#comprobar-si-una-receta-es-del-usuario-logueado">Comprobar propietario</a></td>
                    <td><strong>HEAD</strong> /recipes/"""),format.raw/*61.56*/("""{"""),format.raw/*61.57*/("""slug"""),format.raw/*61.61*/("""}"""),format.raw/*61.62*/("""/mine</td>
                    <td class="center">COMUN</td>
                </tr>
                <tr>
                    <td><a href="https://github.com/JoseVte/tfg-recetarium/tree/master/doc/recetas-doc.md#a%C3%B1adir-un-nuevo-ingrediente-a-una-receta">Añadir un ingrediente</a></td>
                    <td><strong>POST</strong> /recipes/"""),format.raw/*66.56*/("""{"""),format.raw/*66.57*/("""id-receta"""),format.raw/*66.66*/("""}"""),format.raw/*66.67*/("""/ingredient</td>
                    <td class="center">OWNER / ADMIN</td>
                </tr>
                <tr>
                    <td><a href="https://github.com/JoseVte/tfg-recetarium/tree/master/doc/recetas-doc.md#borrar-un-ingrediente-de-una-receta">Borrar un ingrediente</a></td>
                    <td><strong>DELETE</strong> /recipes/"""),format.raw/*71.58*/("""{"""),format.raw/*71.59*/("""id-receta"""),format.raw/*71.68*/("""}"""),format.raw/*71.69*/("""/ingredient/"""),format.raw/*71.81*/("""{"""),format.raw/*71.82*/("""id"""),format.raw/*71.84*/("""}"""),format.raw/*71.85*/("""</td>
                    <td class="center">OWNER / ADMIN</td>
                </tr>
                <tr>
                    <td><a href="https://github.com/JoseVte/tfg-recetarium/tree/master/doc/recetas-doc.md#a%C3%B1adir-o-quitar-de-favoritos">Añadir/Borrar a favoritos</a></td>
                    <td><strong>PUT</strong> /recipes/"""),format.raw/*76.55*/("""{"""),format.raw/*76.56*/("""id"""),format.raw/*76.58*/("""}"""),format.raw/*76.59*/("""/fav</td>
                    <td class="center">COMUN</td>
                </tr>
                <tr>
                    <td><a href="https://github.com/JoseVte/tfg-recetarium/tree/master/doc/recetas-doc.md#puntuar-la-receta">Puntuar la receta</a></td>
                    <td><strong>PUT</strong> /recipes/"""),format.raw/*81.55*/("""{"""),format.raw/*81.56*/("""id"""),format.raw/*81.58*/("""}"""),format.raw/*81.59*/("""/rating</td>
                    <td class="center">COMUN</td>
                </tr>
            </tbody>
        </table>
        <div class="divider"></div>

        <h4>Comentarios</h4>
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
                    <td><a href="https://github.com/JoseVte/tfg-recetarium/tree/master/doc/comentarios-doc.md#todas-las-respuestas">Todas las respuestas</a></td>
                    <td><strong>GET</strong>  /recipes"""),format.raw/*100.55*/("""{"""),format.raw/*100.56*/("""recipe-id"""),format.raw/*100.65*/("""}"""),format.raw/*100.66*/("""/comments/"""),format.raw/*100.76*/("""{"""),format.raw/*100.77*/("""comentario-id"""),format.raw/*100.90*/("""}"""),format.raw/*100.91*/("""</td>
                    <td class="center">-</td>
                </tr>
                <tr>
                    <td><a href="https://github.com/JoseVte/tfg-recetarium/tree/master/doc/comentarios-doc.md#crear-una-categoria">Crear</a></td>
                    <td><strong>POST</strong> /recipes"""),format.raw/*105.55*/("""{"""),format.raw/*105.56*/("""id"""),format.raw/*105.58*/("""}"""),format.raw/*105.59*/("""/comments <br> <strong>POST</strong> /recipes"""),format.raw/*105.104*/("""{"""),format.raw/*105.105*/("""recipe-id"""),format.raw/*105.114*/("""}"""),format.raw/*105.115*/("""/comments/"""),format.raw/*105.125*/("""{"""),format.raw/*105.126*/("""comentario-id"""),format.raw/*105.139*/("""}"""),format.raw/*105.140*/("""</td>
                    <td class="center">COMUN</td>
                </tr>
                <tr>
                    <td><a href="https://github.com/JoseVte/tfg-recetarium/tree/master/doc/comentarios-doc.md#actualizar-una-categoria">Actualizar</a></td>
                    <td><strong>PUT</strong>    /recipes"""),format.raw/*110.57*/("""{"""),format.raw/*110.58*/("""recipe-id"""),format.raw/*110.67*/("""}"""),format.raw/*110.68*/("""/comments/"""),format.raw/*110.78*/("""{"""),format.raw/*110.79*/("""comentario-id"""),format.raw/*110.92*/("""}"""),format.raw/*110.93*/(""" """),format.raw/*110.94*/("""<br> <strong>PATCH</strong>  /recipes"""),format.raw/*110.131*/("""{"""),format.raw/*110.132*/("""recipe-id"""),format.raw/*110.141*/("""}"""),format.raw/*110.142*/("""/comments/"""),format.raw/*110.152*/("""{"""),format.raw/*110.153*/("""comentario-id"""),format.raw/*110.166*/("""}"""),format.raw/*110.167*/("""</td>
                    <td class="center">OWNER / ADMIN</td>
                </tr>
                <tr>
                    <td><a href="https://github.com/JoseVte/tfg-recetarium/tree/master/doc/comentarios-doc.md#borrar-una-categoria">Borrar</a></td>
                    <td><strong>DELETE</strong> /recipes"""),format.raw/*115.57*/("""{"""),format.raw/*115.58*/("""recipe-id"""),format.raw/*115.67*/("""}"""),format.raw/*115.68*/("""/comments/"""),format.raw/*115.78*/("""{"""),format.raw/*115.79*/("""comentario-id"""),format.raw/*115.92*/("""}"""),format.raw/*115.93*/("""</td>
                    <td class="center">OWNER / ADMIN</td>
                </tr>
            </tbody>
        </table>
        <div class="divider"></div>

        <h4>Categorias</h4>
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
                    <td><a href="https://github.com/JoseVte/tfg-recetarium/tree/master/doc/categorias-doc.md#todas-las-categorias">Todas las categorias</a></td>
                    <td><strong>GET</strong>  /categories</td>
                    <td class="center">-</td>
                </tr>
                <tr>
                    <td><a href="https://github.com/JoseVte/tfg-recetarium/tree/master/doc/categorias-doc.md#todas-las-categorias-con-paginacion">Todas las categorias con paginacion</a></td>
                    <td><strong>GET</strong>  /categories(?page=&amp;size=&amp;search=&amp;order=)</td>
                    <td class="center">-</td>
                </tr>
                <tr>
                    <td><a href="https://github.com/JoseVte/tfg-recetarium/tree/master/doc/categorias-doc.md#obtener-una-categoria-por-id">Obtener por id</a></td>
                    <td><strong>GET</strong>    /categories/"""),format.raw/*144.61*/("""{"""),format.raw/*144.62*/("""id"""),format.raw/*144.64*/("""}"""),format.raw/*144.65*/("""</td>
                    <td class="center">-</td>
                </tr>
                <tr>
                    <td><a href="https://github.com/JoseVte/tfg-recetarium/tree/master/doc/categorias-doc.md#crear-una-categoria">Crear</a></td>
                    <td><strong>POST</strong> /categories</td>
                    <td class="center">ADMIN</td>
                </tr>
                <tr>
                    <td><a href="https://github.com/JoseVte/tfg-recetarium/tree/master/doc/categorias-doc.md#actualizar-una-categoria">Actualizar</a></td>
                    <td><strong>PUT</strong>    /categories/"""),format.raw/*154.61*/("""{"""),format.raw/*154.62*/("""id"""),format.raw/*154.64*/("""}"""),format.raw/*154.65*/(""" """),format.raw/*154.66*/("""<br> <strong>PATCH</strong>  /categories/"""),format.raw/*154.107*/("""{"""),format.raw/*154.108*/("""id"""),format.raw/*154.110*/("""}"""),format.raw/*154.111*/("""</td>
                    <td class="center">ADMIN</td>
                </tr>
                <tr>
                    <td><a href="https://github.com/JoseVte/tfg-recetarium/tree/master/doc/categorias-doc.md#borrar-una-categoria">Borrar</a></td>
                    <td><strong>DELETE</strong> /categories/"""),format.raw/*159.61*/("""{"""),format.raw/*159.62*/("""id"""),format.raw/*159.64*/("""}"""),format.raw/*159.65*/("""</td>
                    <td class="center">ADMIN</td>
                </tr>
                <tr>
                    <td><a href="https://github.com/JoseVte/tfg-recetarium/tree/master/doc/categorias-doc.md#borrar-multiples-categorias">Borrar multiple</a></td>
                    <td><strong>DELETE</strong> /categories?ids=&amp;ids=</td>
                    <td class="center">ADMIN</td>
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
                    <td><strong>GET</strong>    /tags/"""),format.raw/*188.55*/("""{"""),format.raw/*188.56*/("""id"""),format.raw/*188.58*/("""}"""),format.raw/*188.59*/("""</td>
                    <td class="center">-</td>
                </tr>
            </tbody>
        </table>
        <div class="divider"></div>

        <h4>Autentificación</h4>
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
                    <td><a href="https://github.com/JoseVte/tfg-recetarium/tree/master/doc/auth-doc.md#loguear-un-usuario">Loguear un usuario</a></td>
                    <td><strong>POST</strong>    /auth/login</td>
                    <td class="center">-</td>
                </tr>
                <tr>
                    <td><a href="https://github.com/JoseVte/tfg-recetarium/tree/master/doc/auth-doc.md#registrar-un-usuario">Registrar un usuario</a></td>
                    <td><strong>POST</strong>    /auth/register</td>
                    <td class="center">-</td>
                </tr>
                <tr>
                    <td><a href="https://github.com/JoseVte/tfg-recetarium/tree/master/doc/auth-doc.md#enviar-email-para-reiniciar-la-password">Enviar email para reiniciar la password</a></td>
                    <td><strong>POST</strong>    /auth/reset/password</td>
                    <td class="center">-</td>
                </tr>
                <tr>
                    <td><a href="https://github.com/JoseVte/tfg-recetarium/tree/master/doc/auth-doc.md#cambiar-la-password">Cambia la password</a></td>
                    <td><strong>PUT</strong>     /auth/reset/password <br> <strong>PATCH</strong>   /auth/reset/password</td>
                    <td class="center">-</td>
                </tr>
                <tr>
                    <td><a href="https://github.com/JoseVte/tfg-recetarium/tree/master/doc/auth-doc.md#comprobar-token">Comprobar el token</a></td>
                    <td><strong>POST</strong>    /auth/check</td>
                    <td class="center">-</td>
                </tr>
                <tr>
                    <td><a href="https://github.com/JoseVte/tfg-recetarium/tree/master/doc/auth-doc.md#activar-la-cuenta-del-usuario">Activar cuenta</a></td>
                    <td><strong>PUT</strong>     /auth/active <br> <strong>PATCH</strong>   /auth/active</td>
                    <td class="center">-</td>
                </tr>
                <tr>
                    <td><a href="https://github.com/JoseVte/tfg-recetarium/tree/master/doc/auth-doc.md#obtener-los-detalles-del-perfil">Obtener los detalles del perfil</a></td>
                    <td><strong>GET</strong>    /auth/profile</td>
                    <td class="center">COMUN</td>
                </tr>
                <tr>
                    <td><a href="https://github.com/JoseVte/tfg-recetarium/tree/master/doc/auth-doc.md#guardar-los-cambios-del-perfil">Guardar los cambios del perfil</a></td>
                    <td><strong>PUT</strong>     /auth/profile <br> <strong>PATCH</strong>   /auth/profile</td>
                    <td class="center">COMUN</td>
                </tr>
            </tbody>
        </table>
        <div class="divider"></div>

        <h4>Usuarios</h4>
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
                    <td><a href="https://github.com/JoseVte/tfg-recetarium/tree/master/doc/user-doc.md#paginaci%C3%B3n">Listado por páginas</a></td>
                    <td><strong>GET</strong>    /users(?page=&amp;size=&amp;search=&amp;order=)</td>
                    <td>COMUN</td>
                </tr>
                <tr>
                    <td><a href="https://github.com/JoseVte/tfg-recetarium/tree/master/doc/user-doc.md#obtener-un-usuario-por-id">Obtener por id</a></td>
                    <td><strong>GET</strong>    /users/"""),format.raw/*266.56*/("""{"""),format.raw/*266.57*/("""id"""),format.raw/*266.59*/("""}"""),format.raw/*266.60*/("""</td>
                    <td>COMUN</td>
                </tr>
                <tr>
                    <td><a href="https://github.com/JoseVte/tfg-recetarium/tree/master/doc/user-doc.md#crear-un-usuario-nuevo">Crear</a></td>
                    <td><strong>POST</strong>   /users</td>
                    <td>ADMIN</td>
                </tr>
                <tr>
                    <td><a href="https://github.com/JoseVte/tfg-recetarium/tree/master/doc/user-doc.md#actualizar-un-usuario-ya-existente">Actualizar</a></td>
                    <td><strong>PUT</strong>    /users/"""),format.raw/*276.56*/("""{"""),format.raw/*276.57*/("""id"""),format.raw/*276.59*/("""}"""),format.raw/*276.60*/(""" """),format.raw/*276.61*/("""<br> <strong>PATCH</strong>  /users/"""),format.raw/*276.97*/("""{"""),format.raw/*276.98*/("""id"""),format.raw/*276.100*/("""}"""),format.raw/*276.101*/("""</td>
                    <td>ADMIN</td>
                </tr>
                <tr>
                    <td><a href="https://github.com/JoseVte/tfg-recetarium/tree/master/doc/user-doc.md#borrar-un-usuario">Borrar</a></td>
                    <td><strong>DELETE</strong> /users/"""),format.raw/*281.56*/("""{"""),format.raw/*281.57*/("""id"""),format.raw/*281.59*/("""}"""),format.raw/*281.60*/("""</td>
                    <td>ADMIN</td>
                </tr>
            </tbody>
        </table>
        <div class="divider"></div>

        <h4>Amigos</h4>
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
                    <td><a href="https://github.com/JoseVte/tfg-recetarium/tree/master/doc/user-doc.md#paginaci%C3%B3n">Listado por páginas</a></td>
                    <td><strong>GET</strong>    /users/"""),format.raw/*300.56*/("""{"""),format.raw/*300.57*/("""id"""),format.raw/*300.59*/("""}"""),format.raw/*300.60*/("""/friends(?page=&amp;size=&amp;search=&amp;order=)</td>
                    <td class="center">COMUN</td>
                </tr>
                <tr>
                    <td><a href="https://github.com/JoseVte/tfg-recetarium/tree/master/doc/user-doc.md#crear-un-usuario-nuevo">Crear</a></td>
                    <td><strong>POST</strong>   /users/"""),format.raw/*305.56*/("""{"""),format.raw/*305.57*/("""id"""),format.raw/*305.59*/("""}"""),format.raw/*305.60*/("""/friends</td>
                    <td class="center">COMUN</td>
                </tr>
                <tr>
                    <td><a href="https://github.com/JoseVte/tfg-recetarium/tree/master/doc/user-doc.md#borrar-un-usuario">Borrar</a></td>
                    <td><strong>DELETE</strong> /users/"""),format.raw/*310.56*/("""{"""),format.raw/*310.57*/("""user-id"""),format.raw/*310.64*/("""}"""),format.raw/*310.65*/("""/friends/"""),format.raw/*310.74*/("""{"""),format.raw/*310.75*/("""amigo-id"""),format.raw/*310.83*/("""}"""),format.raw/*310.84*/("""</td>
                    <td class="center">COMUN</td>
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
                    <td><strong>GET</strong>  /users/"""),format.raw/*329.54*/("""{"""),format.raw/*329.55*/("""user-id"""),format.raw/*329.62*/("""}"""),format.raw/*329.63*/("""/files</td>
                    <td class="center">COMUN</td>
                </tr>
                <tr>
                    <td><a href="https://github.com/JoseVte/tfg-recetarium/tree/master/doc/archivos-doc.md#obtener-por-nombre-del-archivo">Obtener por nombre del archivo</a></td>
                    <td><strong>GET</strong>    /users/"""),format.raw/*334.56*/("""{"""),format.raw/*334.57*/("""user-id"""),format.raw/*334.64*/("""}"""),format.raw/*334.65*/("""/files/"""),format.raw/*334.72*/("""{"""),format.raw/*334.73*/("""id"""),format.raw/*334.75*/("""}"""),format.raw/*334.76*/(""" """),format.raw/*334.77*/("""<br> <strong>GET</strong>    /users/"""),format.raw/*334.113*/("""{"""),format.raw/*334.114*/("""user-id"""),format.raw/*334.121*/("""}"""),format.raw/*334.122*/("""/files/"""),format.raw/*334.129*/("""{"""),format.raw/*334.130*/("""nombre"""),format.raw/*334.136*/("""}"""),format.raw/*334.137*/("""</td>
                    <td class="center">-</td>
                </tr>
                <tr>
                    <td><a href="https://github.com/JoseVte/tfg-recetarium/tree/master/doc/archivos-doc.md#subida-del-archivo">Subida del archivo</a></td>
                    <td><strong>POST</strong>   /users/"""),format.raw/*339.56*/("""{"""),format.raw/*339.57*/("""user-id"""),format.raw/*339.64*/("""}"""),format.raw/*339.65*/("""/files</td>
                    <td class="center">OWNER / ADMIN</td>
                </tr>
                <tr>
                    <td><a href="https://github.com/JoseVte/tfg-recetarium/tree/master/doc/archivos-doc.md#borrar-archivo">Borrar archivo</a></td>
                    <td><strong>DELETE</strong> /users/"""),format.raw/*344.56*/("""{"""),format.raw/*344.57*/("""user-id"""),format.raw/*344.64*/("""}"""),format.raw/*344.65*/("""/files/"""),format.raw/*344.72*/("""{"""),format.raw/*344.73*/("""id"""),format.raw/*344.75*/("""}"""),format.raw/*344.76*/(""" """),format.raw/*344.77*/("""<br> <strong>DELETE</strong> /users/"""),format.raw/*344.113*/("""{"""),format.raw/*344.114*/("""user-id"""),format.raw/*344.121*/("""}"""),format.raw/*344.122*/("""/files/"""),format.raw/*344.129*/("""{"""),format.raw/*344.130*/("""nombre"""),format.raw/*344.136*/("""}"""),format.raw/*344.137*/("""</td>
                    <td class="center">OWNER / ADMIN</td>
                </tr>
            </tbody>
        </table>
    </div>

    <div class="divider"></div>

    <h2>DOCUMENTACIÓN EXPANDIDA</h2>
    <div class="collection">
        <a class="collection-item" href="https://github.com/JoseVte/tfg-recetarium/tree/master/doc/auth-doc.md">Autentificación</a>
        <a class="collection-item" href="https://github.com/JoseVte/tfg-recetarium/tree/master/doc/recetas-doc.md">Recetas</a>
        <a class="collection-item" href="https://github.com/JoseVte/tfg-recetarium/tree/master/doc/user-doc.md">Usuarios</a>
        <a class="collection-item" href="https://github.com/JoseVte/tfg-recetarium/tree/master/doc/archivos-doc.md">Archivos</a>
        <a class="collection-item" href="https://github.com/JoseVte/tfg-recetarium/tree/master/doc/categorias-deoc.md">Categorias</a>
        <a class="collection-item" href="https://github.com/JoseVte/tfg-recetarium/tree/master/doc/tags-doc.md">Tags</a>
    </div>
    <div class="divider"></div>

    <div id="changelog">
        <h3>CHANGELOG</h3>

        <h4><a href="https://github.com/JoseVte/tfg-recetarium/releases/tag/0.13.1"><img alt="0.13.1" src=""""),_display_(/*367.109*/routes/*367.115*/.Assets.versioned("images/rocket-blue.png")),format.raw/*367.158*/(""""> 0.13.1</a></h4>
        <ul class="collection">
            <li class="collection-item">Comprobar el parametro <code>order</code> en la paginación</li>
            <li class="collection-item">Arreglado problema con el autoincremento de las recetas del usuario</li>
        </ul>

        <h5><a href="https://github.com/JoseVte/tfg-recetarium/releases/tag/0.12.3"><img alt="0.12.3" src=""""),_display_(/*373.109*/routes/*373.115*/.Assets.versioned("images/release.png")),format.raw/*373.154*/(""""> 0.12.3</a></h5>
        <ul class="collection">
            <li class="collection-item">CRUD de las categorias</li>
        </ul>

        <h5><a href="https://github.com/JoseVte/tfg-recetarium/releases/tag/0.12.2"><img alt="0.12.2" src=""""),_display_(/*378.109*/routes/*378.115*/.Assets.versioned("images/release.png")),format.raw/*378.154*/(""""> 0.12.2</a></h5>
        <ul class="collection">
            <li class="collection-item">Nueva ruta: obtener tag por ID</li>
        </ul>

        <h5><a href="https://github.com/JoseVte/tfg-recetarium/releases/tag/0.12.1"><img alt="0.12.1" src=""""),_display_(/*383.109*/routes/*383.115*/.Assets.versioned("images/release.png")),format.raw/*383.154*/(""""> 0.12.1</a></h5>
        <ul class="collection">
            <li class="collection-item">Añadido idioma al perfil del usuario</li>
        </ul>

        <h5><a href="https://github.com/JoseVte/tfg-recetarium/releases/tag/0.11.3"><img alt="0.11.3" src=""""),_display_(/*388.109*/routes/*388.115*/.Assets.versioned("images/release.png")),format.raw/*388.154*/(""""> 0.11.3</a></h5>
        <ul class="collection">
            <li class="collection-item">Creados los mensajes en español e ingles para la internacionalización</li>
        </ul>

        <h5><a href="https://github.com/JoseVte/tfg-recetarium/releases/tag/0.11.2"><img alt="0.11.2" src=""""),_display_(/*393.109*/routes/*393.115*/.Assets.versioned("images/release.png")),format.raw/*393.154*/(""""> 0.11.2</a></h5>
        <ul class="collection">
            <li class="collection-item">Añadido <a href="https://github.com/pusher/pusher-http-java">pusher</a> para las notificaciones</li>
        </ul>

        <h5><a href="https://github.com/JoseVte/tfg-recetarium/releases/tag/0.11.1"><img alt="0.11.1" src=""""),_display_(/*398.109*/routes/*398.115*/.Assets.versioned("images/release.png")),format.raw/*398.154*/(""""> 0.11.1</a></h5>
        <ul class="collection">
            <li class="collection-item">Ver las recetas favoritas en el perfil</li>
        </ul>

        <h5><a href="https://github.com/JoseVte/tfg-recetarium/releases/tag/0.10.3-hotfix"><img alt="0.10.3-hotfix" src=""""),_display_(/*403.123*/routes/*403.129*/.Assets.versioned("images/release.png")),format.raw/*403.168*/(""""> 0.10.3-hotfix</a></h5>
        <ul class="collection">
            <li class="collection-item">Arreglos en los Serializer</li>
        </ul>

        <h5><a href="https://github.com/JoseVte/tfg-recetarium/releases/tag/0.10.3"><img alt="0.10.3" src=""""),_display_(/*408.109*/routes/*408.115*/.Assets.versioned("images/release.png")),format.raw/*408.154*/(""""> 0.10.3</a></h5>
        <ul class="collection">
            <li class="collection-item">Validacion del email durante el registro</li>
            <li class="collection-item">Añadido avatar al usuario</li>
            <li class="collection-item">Recreacion del JWT</li>
        </ul>

        <h5><a href="https://github.com/JoseVte/tfg-recetarium/releases/tag/0.10.2"><img alt="0.10.2" src=""""),_display_(/*415.109*/routes/*415.115*/.Assets.versioned("images/release.png")),format.raw/*415.154*/(""""> 0.10.2</a></h5>
        <ul class="collection">
            <li class="collection-item">Busqueda de usuarios</li>
        </ul>

        <h5><a href="https://github.com/JoseVte/tfg-recetarium/releases/tag/0.10.1-hotfix"><img alt="0.10.1-hotfix" src=""""),_display_(/*420.123*/routes/*420.129*/.Assets.versioned("images/release.png")),format.raw/*420.168*/(""""> 0.10.1-hotfix</a></h5>
        <ul class="collection">
            <li class="collection-item">Arreglo de errores y nuevos test añadidos</li>
        </ul>

        <h5><a href="https://github.com/JoseVte/tfg-recetarium/releases/tag/0.10.1"><img alt="0.10.1" src=""""),_display_(/*425.109*/routes/*425.115*/.Assets.versioned("images/release.png")),format.raw/*425.154*/(""""> 0.10.1</a></h5>
        <ul class="collection">
            <li class="collection-item">Rutas para ver, agregar y borrar amigos</li>
        </ul>

        <h5><a href="https://github.com/JoseVte/tfg-recetarium/releases/tag/0.9.1"><img alt="0.9.1" src=""""),_display_(/*430.107*/routes/*430.113*/.Assets.versioned("images/release.png")),format.raw/*430.152*/(""""> 0.9.1</a></h5>
        <ul class="collection">
            <li class="collection-item">Ver las recetas por usuario</li>
        </ul>

        <h5><a href="https://github.com/JoseVte/tfg-recetarium/releases/tag/0.8.2-hotfix"><img alt="0.8.2-hotfix" src=""""),_display_(/*435.121*/routes/*435.127*/.Assets.versioned("images/release.png")),format.raw/*435.166*/(""""> 0.8.2-hotfix</a></h5>
        <ul class="collection">
            <li class="collection-item">Fixeada query para la busqueda de recetas por tags</li>
        </ul>

        <h5><a href="https://github.com/JoseVte/tfg-recetarium/releases/tag/0.8.2"><img alt="0.8.2" src=""""),_display_(/*440.107*/routes/*440.113*/.Assets.versioned("images/release.png")),format.raw/*440.152*/(""""> 0.8.2</a></h5>
        <ul class="collection">
            <li class="collection-item">Busqueda de recetas por tags</li>
        </ul>

        <h5><a href="https://github.com/JoseVte/tfg-recetarium/releases/tag/0.8.1"><img alt="0.8.1" src=""""),_display_(/*445.107*/routes/*445.113*/.Assets.versioned("images/release.png")),format.raw/*445.152*/(""""> 0.8.1</a></h5>
        <ul class="collection">
            <li class="collection-item">CRUD de comentarios</li>
        </ul>

        <h5><a href="https://github.com/JoseVte/tfg-recetarium/releases/tag/0.8.0-hotfix"><img alt="0.8.0-hotfix" src=""""),_display_(/*450.121*/routes/*450.127*/.Assets.versioned("images/release.png")),format.raw/*450.166*/(""""> 0.8.0-hotfix</a></h5>
        <ul class="collection">
            <li class="collection-item">Ordenar recetas por fecha</li>
            <li class="collection-item">Nuevo sistema para contar las recetas</li>
        </ul>

        <h5><a href="https://github.com/JoseVte/tfg-recetarium/releases/tag/0.7.1"><img alt="0.7.1" src=""""),_display_(/*456.107*/routes/*456.113*/.Assets.versioned("images/release.png")),format.raw/*456.152*/(""""> 0.7.1</a></h5>
        <ul class="collection">
            <li class="collection-item">Añadida galeria para elegir imagenes en la receta y el perfil de usuario</li>
        </ul>

        <h5><a href="https://github.com/JoseVte/tfg-recetarium/releases/tag/0.6.1"><img alt="0.6.1" src=""""),_display_(/*461.107*/routes/*461.113*/.Assets.versioned("images/release.png")),format.raw/*461.152*/(""""> 0.6.1</a></h5>
        <ul class="collection">
            <li class="collection-item">Añadidas rutas para añadir a favoritos</li>
            <li class="collection-item">Añadida posibilidad de puntuar una receta del 0 al 5</li>
        </ul>

        <h5><a href="https://github.com/JoseVte/tfg-recetarium/releases/tag/0.5.2"><img alt="0.5.2" src=""""),_display_(/*467.107*/routes/*467.113*/.Assets.versioned("images/release.png")),format.raw/*467.152*/(""""> 0.5.2</a></h5>
        <ul class="collection">
            <li class="collection-item">Nuevas rutas para el perfil</li>
            <li class="collection-item">Cambiados algunos metodos del UserService</li>
        </ul>

        <h5><a href="https://github.com/JoseVte/tfg-recetarium/releases/tag/0.5.1"><img alt="0.5.1" src=""""),_display_(/*473.107*/routes/*473.113*/.Assets.versioned("images/release.png")),format.raw/*473.152*/(""""> 0.5.1</a></h5>
        <ul class="collection">
            <li class="collection-item">Generar borrador de una receta</li>
        </ul>

        <h5><a href="https://github.com/JoseVte/tfg-recetarium/releases/tag/0.5.0-hotfix-2"><img alt="0.5.0-hotfix-2" src=""""),_display_(/*478.125*/routes/*478.131*/.Assets.versioned("images/release.png")),format.raw/*478.170*/(""""> 0.5.0-hotfix-2</a></h5>
        <ul class="collection">
            <li class="collection-item">Arreglado problema con la visibilidad de las recetas</li>
        </ul>

        <h5><a href="https://github.com/JoseVte/tfg-recetarium/releases/tag/0.5.0"><img alt="0.5.0-hotfix" src=""""),_display_(/*483.114*/routes/*483.120*/.Assets.versioned("images/release.png")),format.raw/*483.159*/(""""> 0.5.0-hotfix</a></h5>
        <ul class="collection">
            <li class="collection-item">Arreglado login cuando se ha enviado un correo para restaurar la password</li>
        </ul>

        <h5><a href="https://github.com/JoseVte/tfg-recetarium/releases/tag/0.5.0"><img alt="0.5.0" src=""""),_display_(/*488.107*/routes/*488.113*/.Assets.versioned("images/release.png")),format.raw/*488.152*/(""""> 0.5.0</a></h5>
        <ul class="collection">
            <li class="collection-item">Añadida visibilidad a las recetas</li>
        </ul>

        <h5><a href="https://github.com/JoseVte/tfg-recetarium/releases/tag/0.4.1"><img alt="0.4.1" src=""""),_display_(/*493.107*/routes/*493.113*/.Assets.versioned("images/release.png")),format.raw/*493.152*/(""""> 0.4.1</a></h5>
        <ul class="collection">
            <li class="collection-item">Busqueda de recetas</li>
            <li class="collection-item">Actualizada la documentación</li>
            <li class="collection-item">Añadidos nuevos test</li>
        </ul>

        <h5><a href="https://github.com/JoseVte/tfg-recetarium/releases/tag/0.4.0"><img alt="0.4.0" src=""""),_display_(/*500.107*/routes/*500.113*/.Assets.versioned("images/release.png")),format.raw/*500.152*/(""""> 0.4.0</a></h5>
        <ul class="collection">
            <li class="collection-item">Gestion de ficheros con dropbox</li>
            <li class="collection-item">Cambio del servidor CI a Travis</li>
            <li class="collection-item">Añadidas las URL en los mails</li>
            <li class="collection-item">Cambios en la estructura del modelo de la receta</li>
            <li class="collection-item">Fix en el JWT y añadido token sin expiración</li>
            <li class="collection-item">Subida de múltiples archivos</li>
        </ul>

        <h5><a href="https://github.com/JoseVte/tfg-recetarium/releases/tag/0.3.4"><img alt="0.3.4" src=""""),_display_(/*510.107*/routes/*510.113*/.Assets.versioned("images/release.png")),format.raw/*510.152*/(""""> 0.3.4</a></h5>
        <ul class="collection">
            <li class="collection-item">Subida, lectura y borrado de archivos en el servidor.</li>
        </ul>

        <h5><a href="https://github.com/JoseVte/tfg-recetarium/releases/tag/0.3.3"><img alt="0.3.3" src=""""),_display_(/*515.107*/routes/*515.113*/.Assets.versioned("images/release.png")),format.raw/*515.152*/(""""> 0.3.3</a></h5>
        <ul class="collection">
            <li class="collection-item">Nuevos formatos de JSON para el input y output de los usuarios y recetas.</li>
        </ul>

        <h5><a href="https://github.com/JoseVte/tfg-recetarium/releases/tag/0.3.2-hotfix"><img alt="0.3.2-hotfix" src=""""),_display_(/*520.121*/routes/*520.127*/.Assets.versioned("images/release.png")),format.raw/*520.166*/(""""> 0.3.2-hotfix</a></h5>
        <ul class="collection">
            <li class="collection-item">Nombre de los test fixeado en Jenkins</li>
        </ul>

        <h5><a href="https://github.com/JoseVte/tfg-recetarium/releases/tag/0.3.2"><img alt="0.3.2" src=""""),_display_(/*525.107*/routes/*525.113*/.Assets.versioned("images/release.png")),format.raw/*525.152*/(""""> 0.3.2</a></h5>
        <ul class="collection">
            <li class="collection-item">Añadidos los middleware para evitar el acceso a zonas privadas.</li>
            <li class="collection-item">Versionado de la API con tag en el README.</li>
            <li class="collection-item">Test para los middleware.</li>
            <li class="collection-item">Nombre de los test fixeado en Linux (testear en Jenkins).</li>
        </ul>

        <h5><a href="https://github.com/JoseVte/tfg-recetarium/releases/tag/0.3.1-hotfix"><img alt="0.3.1-hotfix" src=""""),_display_(/*533.121*/routes/*533.127*/.Assets.versioned("images/release.png")),format.raw/*533.166*/(""""> 0.3.1-hotfix</a></h5>
        <ul class="collection">
            <li class="collection-item">Hotfix: Añadido el filtro CORS para poder acceder desde la APP web.</li>
        </ul>

        <h5><a href="https://github.com/JoseVte/tfg-recetarium/releases/tag/0.3.1"><img alt="0.3.1" src=""""),_display_(/*538.107*/routes/*538.113*/.Assets.versioned("images/release.png")),format.raw/*538.152*/(""""> 0.3.1</a></h5>
        <ul class="collection">
            <li class="collection-item">Despliegue de la aplicación en Heroku: <a href="https://recetarium.herokuapp.com/">recetarium</a></li>
        </ul>

        <h5><a href="https://github.com/JoseVte/tfg-recetarium/releases/tag/0.3.0"><img alt="0.3.0" src=""""),_display_(/*543.107*/routes/*543.113*/.Assets.versioned("images/release.png")),format.raw/*543.152*/(""""> 0.3.0</a></h5>
        <ul class="collection">
            <li class="collection-item">Nuevo README.</li>
            <li class="collection-item">Implementación de registro,login y reinicio de password en un nuevo <strong>controller</strong>.</li>
            <li class="collection-item">Acceso a rutas privadas mediante <strong>JWT</strong>.</li>
            <li class="collection-item">Test para el nuevo <strong>controller</strong></li>
        </ul>

        <h5><a href="https://github.com/JoseVte/tfg-recetarium/releases/tag/0.2.2"><img alt="0.2.2" src=""""),_display_(/*551.107*/routes/*551.113*/.Assets.versioned("images/release.png")),format.raw/*551.152*/(""""> 0.2.2</a></h5>
        <ul class="collection">
            <li class="collection-item"><strong>Controller</strong> para las recetas.</li>
            <li class="collection-item">Test para el nuevo controllador.</li>
        </ul>

        <h5><a href="https://github.com/JoseVte/tfg-recetarium/releases/tag/0.2.1"><img alt="0.2.1" src=""""),_display_(/*557.107*/routes/*557.113*/.Assets.versioned("images/release.png")),format.raw/*557.152*/(""""> 0.2.1</a></h5>
        <ul class="collection">
            <li class="collection-item">Cambiado el nombre del modelo <strong>Section</strong> por <strong>Category</strong>.</li>
            <li class="collection-item">Refactorización de los <strong>controllers</strong>, <strong>DAO</strong> y <strong>Models</strong>.</li>
            <li class="collection-item">Personalizacón de la salida de los test en el terminal.</li>
            <li class="collection-item">Refactorización de los test y clarificación de los nombres de los test.</li>
        </ul>

        <h5><a href="https://github.com/JoseVte/tfg-recetarium/releases/tag/0.2.0"><img alt="0.2.0" src=""""),_display_(/*565.107*/routes/*565.113*/.Assets.versioned("images/release.png")),format.raw/*565.152*/(""""> 0.2.0</a></h5>
        <ul class="collection">
            <li class="collection-item">Añadidos todos los modelos básicos y sus relaciones:
                <ul class="collection">
                    <li class="collection-item">User</li>
                    <li class="collection-item">Recipe</li>
                    <li class="collection-item">Comment</li>
                    <li class="collection-item">Media</li>
                    <li class="collection-item">Tag</li>
                    <li class="collection-item">Section</li>
                </ul>
            </li>
            <li class="collection-item">Clases <strong>DAO</strong> y <strong>Service</strong> para los modelos.</li>
            <li class="collection-item">CRUD y servicios para usuarios, recetas, comentarios, categorias, tags y archivos.</li>
            <li class="collection-item">Automatización de los campos <code>created_at</code> y <code>updated_at</code> para los modelos.</li>
            <li class="collection-item">Creados los <strong>controllers</strong> básicos para usuarios y recetas.</li>
            <li class="collection-item">Creados los test para las clases <strong>DAO</strong> y <strong>Service</strong> usando un fichero <code>YAML</code>.</li>
        </ul>

        <h5><a href="https://github.com/JoseVte/tfg-recetarium/releases/tag/0.1.0"><img alt="0.1.0" src=""""),_display_(/*584.107*/routes/*584.113*/.Assets.versioned("images/release.png")),format.raw/*584.152*/(""""> 0.1.0</a></h5>
        <ul class="collection">
            <li class="collection-item">Integración con Jenkins</li>
        </ul>

        <h5><a href="https://github.com/JoseVte/tfg-recetarium/releases/tag/0.0.0"><img alt="0.0.0" src=""""),_display_(/*589.107*/routes/*589.113*/.Assets.versioned("images/release.png")),format.raw/*589.152*/(""""> 0.0.0</a></h5>
        <ul class="collection">
            <li class="collection-item">App base</li>
        </ul>
    </div>
""")))}),format.raw/*594.2*/("""
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
                  DATE: Fri Dec 30 02:52:23 CET 2016
                  SOURCE: /Users/mayteecheverry/MyGitRepos/play/Recetas/app/views/index.scala.html
                  HASH: 84fc2d8ce251c2ad749b952a95ba1fff5a96c983
                  MATRIX: 745->1|857->18|885->21|906->34|945->36|976->41|1007->46|1034->53|2057->1048|2086->1049|2118->1053|2147->1054|3454->2333|3483->2334|3513->2336|3542->2337|3571->2338|3638->2376|3668->2377|3699->2379|3729->2380|4062->2685|4091->2686|4121->2688|4150->2689|4500->3011|4529->3012|4561->3016|4590->3017|4662->3060|4692->3061|4725->3065|4755->3066|4791->3073|4821->3074|4852->3076|4882->3077|5250->3417|5279->3418|5311->3422|5340->3423|5711->3766|5740->3767|5777->3776|5806->3777|6183->4126|6212->4127|6249->4136|6278->4137|6318->4149|6347->4150|6377->4152|6406->4153|6771->4490|6800->4491|6830->4493|6859->4494|7196->4803|7225->4804|7255->4806|7284->4807|8021->5515|8051->5516|8089->5525|8119->5526|8158->5536|8188->5537|8230->5550|8260->5551|8584->5846|8614->5847|8645->5849|8675->5850|8750->5895|8781->5896|8820->5905|8851->5906|8891->5916|8922->5917|8965->5930|8996->5931|9336->6242|9366->6243|9404->6252|9434->6253|9473->6263|9503->6264|9545->6277|9575->6278|9605->6279|9672->6316|9703->6317|9742->6326|9773->6327|9813->6337|9844->6338|9887->6351|9918->6352|10258->6663|10288->6664|10326->6673|10356->6674|10395->6684|10425->6685|10467->6698|10497->6699|11938->8111|11968->8112|11999->8114|12029->8115|12669->8726|12699->8727|12730->8729|12760->8730|12790->8731|12861->8772|12892->8773|12924->8775|12955->8776|13290->9082|13320->9083|13351->9085|13381->9086|14741->10417|14771->10418|14802->10420|14832->10421|18986->14546|19016->14547|19047->14549|19077->14550|19684->15128|19714->15129|19745->15131|19775->15132|19805->15133|19870->15169|19900->15170|19932->15172|19963->15173|20269->15450|20299->15451|20330->15453|20360->15454|21058->16123|21088->16124|21119->16126|21149->16127|21523->16472|21553->16473|21584->16475|21614->16476|21943->16776|21973->16777|22009->16784|22039->16785|22077->16794|22107->16795|22144->16803|22174->16804|22893->17494|22923->17495|22959->17502|22989->17503|23357->17842|23387->17843|23423->17850|23453->17851|23489->17858|23519->17859|23550->17861|23580->17862|23610->17863|23676->17899|23707->17900|23744->17907|23775->17908|23812->17915|23843->17916|23879->17922|23910->17923|24244->18228|24274->18229|24310->18236|24340->18237|24684->18552|24714->18553|24750->18560|24780->18561|24816->18568|24846->18569|24877->18571|24907->18572|24937->18573|25003->18609|25034->18610|25071->18617|25102->18618|25139->18625|25170->18626|25206->18632|25237->18633|26474->19841|26491->19847|26557->19890|26977->20281|26994->20287|27056->20326|27327->20568|27344->20574|27406->20613|27685->20863|27702->20869|27764->20908|28049->21164|28066->21170|28128->21209|28446->21498|28463->21504|28525->21543|28869->21858|28886->21864|28948->21903|29249->22175|29266->22181|29328->22220|29610->22473|29627->22479|29689->22518|30113->22913|30130->22919|30192->22958|30475->23212|30492->23218|30554->23257|30851->23525|30868->23531|30930->23570|31216->23827|31233->23833|31295->23872|31582->24130|31599->24136|31661->24175|31964->24449|31981->24455|32043->24494|32317->24739|32334->24745|32396->24784|32675->25034|32692->25040|32754->25079|33115->25411|33132->25417|33194->25456|33512->25745|33529->25751|33591->25790|33973->26143|33990->26149|34052->26188|34412->26519|34429->26525|34491->26564|34785->26829|34802->26835|34864->26874|35178->27159|35195->27165|35257->27204|35583->27501|35600->27507|35662->27546|35941->27796|35958->27802|36020->27841|36425->28217|36442->28223|36504->28262|37191->28920|37208->28926|37270->28965|37569->29235|37586->29241|37648->29280|37981->29584|37998->29590|38060->29629|38350->29890|38367->29896|38429->29935|39014->30491|39031->30497|39093->30536|39413->30827|39430->30833|39492->30872|39835->31186|39852->31192|39914->31231|40507->31795|40524->31801|40586->31840|40955->32180|40972->32186|41034->32225|41729->32891|41746->32897|41808->32936|43207->34306|43224->34312|43286->34351|43555->34591|43572->34597|43634->34636|43795->34766
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|35->4|35->4|57->26|57->26|57->26|57->26|77->46|77->46|77->46|77->46|77->46|77->46|77->46|77->46|77->46|82->51|82->51|82->51|82->51|87->56|87->56|87->56|87->56|87->56|87->56|87->56|87->56|87->56|87->56|87->56|87->56|92->61|92->61|92->61|92->61|97->66|97->66|97->66|97->66|102->71|102->71|102->71|102->71|102->71|102->71|102->71|102->71|107->76|107->76|107->76|107->76|112->81|112->81|112->81|112->81|131->100|131->100|131->100|131->100|131->100|131->100|131->100|131->100|136->105|136->105|136->105|136->105|136->105|136->105|136->105|136->105|136->105|136->105|136->105|136->105|141->110|141->110|141->110|141->110|141->110|141->110|141->110|141->110|141->110|141->110|141->110|141->110|141->110|141->110|141->110|141->110|141->110|146->115|146->115|146->115|146->115|146->115|146->115|146->115|146->115|175->144|175->144|175->144|175->144|185->154|185->154|185->154|185->154|185->154|185->154|185->154|185->154|185->154|190->159|190->159|190->159|190->159|219->188|219->188|219->188|219->188|297->266|297->266|297->266|297->266|307->276|307->276|307->276|307->276|307->276|307->276|307->276|307->276|307->276|312->281|312->281|312->281|312->281|331->300|331->300|331->300|331->300|336->305|336->305|336->305|336->305|341->310|341->310|341->310|341->310|341->310|341->310|341->310|341->310|360->329|360->329|360->329|360->329|365->334|365->334|365->334|365->334|365->334|365->334|365->334|365->334|365->334|365->334|365->334|365->334|365->334|365->334|365->334|365->334|365->334|370->339|370->339|370->339|370->339|375->344|375->344|375->344|375->344|375->344|375->344|375->344|375->344|375->344|375->344|375->344|375->344|375->344|375->344|375->344|375->344|375->344|398->367|398->367|398->367|404->373|404->373|404->373|409->378|409->378|409->378|414->383|414->383|414->383|419->388|419->388|419->388|424->393|424->393|424->393|429->398|429->398|429->398|434->403|434->403|434->403|439->408|439->408|439->408|446->415|446->415|446->415|451->420|451->420|451->420|456->425|456->425|456->425|461->430|461->430|461->430|466->435|466->435|466->435|471->440|471->440|471->440|476->445|476->445|476->445|481->450|481->450|481->450|487->456|487->456|487->456|492->461|492->461|492->461|498->467|498->467|498->467|504->473|504->473|504->473|509->478|509->478|509->478|514->483|514->483|514->483|519->488|519->488|519->488|524->493|524->493|524->493|531->500|531->500|531->500|541->510|541->510|541->510|546->515|546->515|546->515|551->520|551->520|551->520|556->525|556->525|556->525|564->533|564->533|564->533|569->538|569->538|569->538|574->543|574->543|574->543|582->551|582->551|582->551|588->557|588->557|588->557|596->565|596->565|596->565|615->584|615->584|615->584|620->589|620->589|620->589|625->594
                  -- GENERATED --
              */
          