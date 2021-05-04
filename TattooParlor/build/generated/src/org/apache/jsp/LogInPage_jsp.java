package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class LogInPage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"\" media=\"screen\"/>\n");
      out.write("  <title>Log In</title>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <form action=\"Login\" method=\"post\">\n");
      out.write("        <table style=\"width: 50%\">\n");
      out.write("            <tr>\n");
      out.write("                <td>UserName</td>\n");
      out.write("                <td><input type=\"text\" name=\"username\" /></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Password</td>\n");
      out.write("                <td><input type=\"text\" name=\"password\" /></td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("        <input type =\"submit\" value=\"Login\" />\n");
      out.write("        <h1></h1>\n");
      out.write("    </form>    \n");
      out.write("    <form action=\"ArtistLogIn.jsp\">\n");
      out.write("       <input type=\"submit\" value=\"Log in as Artist\">\n");
      out.write("    </form> \n");
      out.write("         <h1></h1>\n");
      out.write("    <form action=\"AdminLogIn.jsp\">\n");
      out.write("    <input type=\"submit\" value=\"Log in as Admin\">\n");
      out.write("    </form>\n");
      out.write("      \n");
      out.write("      <p class=\"forgot\" align=\"center\"><a href=\"#\">Forgot Password?</p>\n");
      out.write("      <p class=\"register\" align=\"center\"><a href=\"Register.jsp\">Register</p> \n");
      out.write("        \n");
      out.write("    </form>\n");
      out.write(" \n");
      out.write("</body>\n");
      out.write("\n");
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
