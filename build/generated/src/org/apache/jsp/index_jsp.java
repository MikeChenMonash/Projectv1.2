package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title></title>\n");
      out.write("        \n");
      out.write("        <script type=\"text/javascript\" src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js\"></script>  \n");
      out.write("        <script type=\"text/javascript\" src=\"js/test.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/marker.js\"></script>\n");
      out.write("<!--        <script>\n");
      out.write("            $(document).ready(function(){\n");
      out.write("                $(\"button\").click(function(event){\n");
      out.write("                var buttonID = event.target.id;\n");
      out.write("                $.get(\"/Projectv1/DatabaseAccess\",\n");
      out.write("                    function(resp){\n");
      out.write("                        $(\"#database\").empty().append(\"<h3>json result</h3>\");\n");
      out.write("                        $.each(resp, function(i,objectId){\n");
      out.write("                            $(\"#database\").append(i+1, \". \" + objectId.objectId + \"</br>\");\n");
      out.write("                        });     \n");
      out.write("                    });              \n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("            </script>-->\n");
      out.write("            \n");
      out.write("        <meta name=\"viewport\" content=\"initial-scale=1.0, user-scalable=no\">\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/form.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("            <h1>Smart Trip</h1>\n");
      out.write("            <nav>\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"\" class=\"current\">Home</a></li>\n");
      out.write("                    <li><a href=\"\">Sign in</a></li>\n");
      out.write("                    <li><a href=\"\">Sign up</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </nav>\n");
      out.write("        </header>\n");
      out.write("\n");
      out.write("        <div id=\"map\" style=\"float:left;width:63%; height:100%\"></div>\n");
      out.write("\n");
      out.write("        <!--<form action=\"routeBlock.java\" method=\"Get\">-->  \n");
      out.write("        <fieldset>\n");
      out.write("            <label class=\"title\">From:</label><input id=\"start-pac\" class=\"controls\" type=\"text\"\n");
      out.write("                                                     placeholder=\"Enter a location\"><br />\n");
      out.write("            <label class=\"title\">To:</label><input id=\"end-pac\" class=\"controls\" type=\"text\"\n");
      out.write("                                                   placeholder=\"Enter a location\"><br />\n");
      out.write("            \n");
      out.write("            <label class=\"title\">Truck Height(m):</label><input id=\"height\" type=\"text\" class=\"controls\" \n");
      out.write("                                                             name=\"truck-height\"><br />\n");
      out.write("            <label class=\"title\">Truck Length(m):</label><input id=\"length\" type=\"text\" class=\"controls\"\n");
      out.write("                                                             name=\"truck-length\"><br />\n");
      out.write("            <label class=\"title\">Truck Width(m):</label><input id=\"width\" type=\"text\" class=\"controls\"\n");
      out.write("                                                            name=\"truck-width\"><br />\n");
      out.write("            <input type=\"submit\" id=\"submit\" value=\"Sumbit\" />\n");
      out.write("        </fieldset>\n");
      out.write("        <!--</form>-->\n");
      out.write("  \n");
      out.write("        <br />\n");
      out.write("        \n");
      out.write("        <fieldset>\n");
      out.write("            \n");
      out.write("        </fieldset>\n");
      out.write("\n");
      out.write("        <div id=\"directionsPanel\" class=\"panel\" style=\"float:right; width:34%; height:100%\">\n");
      out.write("            <p>Total Distance: <span id=\"total\"></span></p>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <script src=\"js/map.js\"></script>\n");
      out.write("\n");
      out.write("        <script src=\"https://maps.googleapis.com/maps/api/js?signed_in=true&libraries=places&callback=initMap\"\n");
      out.write("        async defer></script>\n");
      out.write("        <button id=\"marker\" type=\"button\">marker</button>\n");
      out.write("        <button id=\"test\" type=\"button\">test</button>\n");
      out.write("        <p>result</p>\n");
      out.write("        <p>result</p>\n");
      out.write("        <p>result</p>\n");
      out.write("        <div id=\"database\"></div></br></br>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
