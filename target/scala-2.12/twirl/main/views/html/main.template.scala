
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(pageID: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.33*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html lang="en" id=""""),_display_(/*3.22*/pageID),format.raw/*3.28*/("""">
    <head>
        <title>Core Design - """),_display_(/*5.31*/pageID),format.raw/*5.37*/("""</title>
        <lik rel="stylesheet" type="text/css" media="screen" href=""""),_display_(/*6.69*/routes/*6.75*/.Assets.versioned("stylesheets/main.css")),format.raw/*6.116*/("""">
    </head>
    <body>
        <div id="Container">
            <div id="Logo">
                <h1>Core Design</h1>
                <h3>
                    <em>Website Design and Development Services</em>
                </h3>
            </div>
            <div id="Navigation">
                <ul>
                    <li><a href=""""),_display_(/*18.35*/routes/*18.41*/.Application.index()),format.raw/*18.61*/("""" class="home">Home</a></li>
                    <li><a href="about" class="about">About Us</a></li>
                    <li><a href="services" class="services">Services</a></li>
                    <li><a href="clients" class="clients">Clients</a></li>
                    <li><a href="contact" class="contact">Contact Us</a></li>
                </ul>
            </div>
            <div id="Content">
                """),_display_(/*26.18*/content),format.raw/*26.25*/("""
            """),format.raw/*27.13*/("""</div>
            <div id="Footer">
                <h6>
                    <em>Copyright &copy; 2015 Core Design</em>
                </h6>
            </div>
        </div>
    </body>
</html>
"""))
      }
    }
  }

  def render(pageID:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(pageID)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (pageID) => (content) => apply(pageID)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Nov 15 10:37:11 GMT 2017
                  SOURCE: /media/sf_D_DRIVE/itt/wmdd1_ft_2017/WMDD12017CoreDesign/app/views/main.scala.html
                  HASH: 4a1d094a94ba967c538a5fdee6ed7564d9adc9e1
                  MATRIX: 952->1|1078->32|1105->33|1168->70|1194->76|1264->120|1290->126|1393->203|1407->209|1469->250|1836->590|1851->596|1892->616|2340->1037|2368->1044|2409->1057
                  LINES: 28->1|33->1|34->2|35->3|35->3|37->5|37->5|38->6|38->6|38->6|50->18|50->18|50->18|58->26|58->26|59->27
                  -- GENERATED --
              */
          