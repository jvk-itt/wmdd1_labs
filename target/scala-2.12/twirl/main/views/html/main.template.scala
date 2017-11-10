
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
        <lik rel="stylesheet" type="text/css" media="screen" 
        href=""""),_display_(/*7.16*/routes/*7.22*/.Assets.versioned("stylesheets/main.css")),format.raw/*7.63*/("""">
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
                    <li><a href="index" class="home">Home</a></li>
                    <li><a href="about" class="about">About Us</a></li>
                    <li><a href="services" class="services">Services</a></li>
                    <li><a href="clients" class="clients">Clients</a></li>
                    <li><a href="contact" class="contact">Contact Us</a></li>
                </ul>
            </div>
            <div id="Content">
                """),_display_(/*27.18*/content),format.raw/*27.25*/("""
            """),format.raw/*28.13*/("""</div>
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
                  DATE: Fri Nov 10 16:59:33 GMT 2017
                  SOURCE: /media/sf_D_DRIVE/itt/wmdd1_ft_2017/WMDD12017CoreDesign/app/views/main.scala.html
                  HASH: 954173e9ee3f37503f596b8da68de86ebee45e87
                  MATRIX: 952->1|1078->32|1105->33|1168->70|1194->76|1264->120|1290->126|1402->212|1416->218|1477->259|2269->1024|2297->1031|2338->1044
                  LINES: 28->1|33->1|34->2|35->3|35->3|37->5|37->5|39->7|39->7|39->7|59->27|59->27|60->28
                  -- GENERATED --
              */
          