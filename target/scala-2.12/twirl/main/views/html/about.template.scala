
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

object about extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main("About")/*1.15*/ {_display_(Seq[Any](format.raw/*1.17*/("""
  """),format.raw/*2.3*/("""<h3>
    There is something different and special about us :-)
  </h3>

  <p>
    Please <a href="contact"> contact us</a> to discuss your requirements.
  </p>
""")))}),format.raw/*9.2*/("""
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Nov 10 16:59:32 GMT 2017
                  SOURCE: /media/sf_D_DRIVE/itt/wmdd1_ft_2017/WMDD12017CoreDesign/app/views/about.scala.html
                  HASH: 6bb3d1b2db00341752fddf98c12a80cc10103225
                  MATRIX: 1030->1|1051->14|1090->16|1119->19|1309->180
                  LINES: 33->1|33->1|33->1|34->2|41->9
                  -- GENERATED --
              */
          