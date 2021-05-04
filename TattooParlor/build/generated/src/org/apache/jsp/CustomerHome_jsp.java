package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Tattoo.Admin;

public final class CustomerHome_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!-- Import all packages needed -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Main code -->\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <!-- Java code to bring variable a1 from the session and retrieve all the customer info in the database-->\n");
      out.write("        \n");
      out.write("        ");

        Admin c1;
        
        c1 = (Admin)session.getAttribute("a");
        
        //p1.selectDB("A906");
        c1.display();
        
        
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <!-- CSS code -->\n");
      out.write("        \n");
      out.write("        <style>\n");
      out.write("            table {\n");
      out.write("                width:100%;\n");
      out.write("            }\n");
      out.write("            table, th, td {\n");
      out.write("                border: 1px solid black;\n");
      out.write("                border-collapse: collapse;\n");
      out.write("            }\n");
      out.write("            th, td {\n");
      out.write("                padding: 15px;\n");
      out.write("                text-align: left;\n");
      out.write("            }\n");
      out.write("            #t01 tr:nth-child(even) {\n");
      out.write("                background-color: #eee;\n");
      out.write("            }\n");
      out.write("            #t01 tr:nth-child(odd) {\n");
      out.write("                background-color: #fff;\n");
      out.write("            }\n");
      out.write("            #t01 th {\n");
      out.write("                background-color: black;\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            MyAppmnt {\n");
      out.write("                padding: 15px;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("        </style>\n");
      out.write(" \n");
      out.write("        \n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Patient Info</title>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <!-- Body -->\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        <h1>Welcome to the ToothHurty Dentistry Patient Page</h1>\n");
      out.write("        <h3>Your information is below. To schedule or change your upcoming visit click the \"Change/Make My Appointment\" button \n");
      out.write("        at the bottom of the page.</h3>\n");
      out.write("        \n");
      out.write("        <!-- A table to hold the customer information drawn from the database using the p1 variable and the Account class -->\n");
      out.write("        \n");
      out.write("        <table id=\"t01\">\n");
      out.write("            <tr>\n");
      out.write("                <th>Firstname</th>\n");
      out.write("                <th>Lastname</th> \n");
      out.write("                <th>Email</th>\n");
      out.write("                <th>Address</th>\n");
      out.write("                <th>Insurance</th>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>");
      out.print(c1. getunam());
      out.write("</td>\n");
      out.write("                <td>");
      out.print(c1. getunam());
      out.write("</td>\n");
      out.write("                <td>");
      out.print(c1. getunam());
      out.write("</td>\n");
      out.write("                <td>");
      out.print(c1. getunam());
      out.write("</td>\n");
      out.write("                <td>");
      out.print(c1. getunam());
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("       <!-- H1 tags for visual adjustemnt --> \n");
      out.write("        <h1> </h1>\n");
      out.write("        \n");
      out.write("        <!-- A button leading to the change info page where the use can change their information in the database -->\n");
      out.write("        <form action=\"ChangeInfoPage.jsp\">\n");
      out.write("        <input type=\"submit\" value=\"Change My Information\">\n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("        <h3>Your Appointment:</h3> \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <!-- Table to hold date and time appointment info -->\n");
      out.write("       <table id=\"t01\">\n");
      out.write("            <tr>\n");
      out.write("                <td>");
      out.print(c1. getunam());
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("       </table>\n");
      out.write("            \n");
      out.write("        <h1>  </h1>\n");
      out.write("        \n");
      out.write("        <!-- A button to go to the page where the user can change their appointemnt -->\n");
      out.write("       <form action=\"CustomerAptmnts.jsp\">\n");
      out.write("            <input type=\"submit\" value=\"Change/Make My Appointment\">\n");
      out.write("       </form>\n");
      out.write("        \n");
      out.write("        <h1>  </h1>\n");
      out.write("        \n");
      out.write("        <!-- Button that moves the user back to the login page -->\n");
      out.write("        <form action=\"Login.jsp\">\n");
      out.write("            <input type=\"submit\" value=\"Log Out\">\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("    </body>\n");
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
