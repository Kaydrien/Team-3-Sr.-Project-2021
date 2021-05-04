package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AdminLogIn_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    \n");
      out.write("    <!-- CSS code -->\n");
      out.write("<style>\n");
      out.write("body {\n");
      out.write("margin: 0;\n");
      out.write("Padding: 0;\n");
      out.write("}\n");
      out.write("\t.text {\n");
      out.write("\twidth: 100%;\n");
      out.write("\theight: 100vh;\n");
      out.write("\tbackground: linear-gradient(rgba(0,0,0,0.5), rgba(0,0,0,0.5)), url(bank.jpg);\n");
      out.write("\tbackground-size: cover;\n");
      out.write("\tbackground-position: center;\n");
      out.write("\tdisplay: flex;\n");
      out.write("\talign-items: center;\n");
      out.write("\tjustify-content: center;\n");
      out.write("\tcolor: #fff;\n");
      out.write("\tfont-size: 2vw;\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\n");
      out.write("\t</style>\n");
      out.write("        \n");
      out.write("        <!-- Main code -->\n");
      out.write("<body>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("\n");
      out.write("<h1>Admin Login:</h1>\n");
      out.write("\n");
      out.write("<!-- Form to allow the dentist to enter their information and log into their account -->\n");
      out.write("<form action=\"AdminLoginServlet\">\n");
      out.write("  <label for=\"AdminID\">Admin ID:</label>\n");
      out.write("  <input type=\"text\" id=\"AdminID\" name=\"AdminID\"><br><br>\n");
      out.write("  <label for=\"AdminPswd\">Password:</label>\n");
      out.write("  <input type=\"password\" id=\"AdminPswd\" name=\"AdminPswd\"><br><br>\n");
      out.write("  <input type=\"submit\" value=\"Login\">\n");
      out.write("  <input type=\"reset\" value=\"Clear\">\n");
      out.write("</form>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
