package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Tattoo.Admin;

public final class MyAccount_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!-- Import all packages needed -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<!-- Main code -->\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        \n");
      out.write("        <!-- Java code to get the variable from the session that will provide the current info for the patient -->\n");
      out.write("\n");
      out.write("          ");

        Admin c2;
        
        c2 = (Admin)session.getAttribute("a");
        
        //p1.selectDB("A906");
        c2.display();
        
        
      out.write("\n");
      out.write("        \n");
      out.write("        <!-- Style for pizazz -->\n");
      out.write("\n");
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
      out.write("        <!-- Body -->\n");
      out.write("\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Patient Info</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <!-- A table to hold the customers current info that they are trying to change -->\n");
      out.write("\n");
      out.write("        <h1>Change Info</h1>\n");
      out.write("        <h3>The information we currently have on file for you:</h3>\n");
      out.write("        \n");
      out.write("        <table id=\"t01\">\n");
      out.write("            <tr>\n");
      out.write("                <th>Firstname</th>\n");
      out.write("                <th>Lastname</th> \n");
      out.write("                <th>Username</th>\n");
      out.write("                <th>Password</th>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>");
      out.print(c2. getfname());
      out.write("</td>\n");
      out.write("                <td>");
      out.print(c2. getlname());
      out.write("</td>\n");
      out.write("                <td>");
      out.print(c2. getunam());
      out.write("</td>\n");
      out.write("                <td>");
      out.print(c2. getpassword());
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("</table>\n");
      out.write("        \n");
      out.write("            <!-- Textboxes for inputing new information and an action that calls on the change \n");
      out.write("            infor servlet touse the account class to change the information in the database -->\n");
      out.write("\n");
      out.write("        <h1>Change your info here:</h1>\n");
      out.write("\n");
      out.write("        <form action=\"ChangeInfoServlet\">\n");
      out.write("            <label for=\"fnam\">FirstName:</label>\n");
      out.write("            <input type=\"text\" id=\"fnam\" name=\"fnam\"><br><br>\n");
      out.write("            <label for=\"Lnam\">LastName:</label>\n");
      out.write("            <input type=\"text\" id=\"Lnam\" name=\"Lnam\"><br><br>\n");
      out.write("            <label for=\"eml\">Username:</label>\n");
      out.write("            <input type=\"text\" id=\"unm\" name=\"eml\"><br><br>\n");
      out.write("            <label for=\"Adrs\">Password:</label>\n");
      out.write("            <input type=\"text\" id=\"pswd\" name=\"Adrs\"><br><br>\n");
      out.write("            <input type=\"reset\" value=\"Clear\">\n");
      out.write("            <input type=\"submit\" value=\"Update\">\n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("        <h1> </h1>\n");
      out.write("        \n");
      out.write("        <!-- A button that simply retirned the patient to their information page witout making any changes -->\n");
      out.write("\n");
      out.write("        <form action=\"CustomerInfo.jsp\">\n");
      out.write("        <input type=\"submit\" value=\"Return To Home\">\n");
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
