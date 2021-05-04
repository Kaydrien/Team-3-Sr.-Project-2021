package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<title>Team 3 Tattoo</title>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\n");
      out.write("<body>\n");
      out.write("<!-- Navbar (sit on top) -->\n");
      out.write("<div class=\"w3-top\">\n");
      out.write("  <div class=\"w3-bar w3-white w3-wide w3-padding w3-card\">\n");
      out.write("    <a href=\"#home\" class=\"w3-bar-item w3-button\"><b>Team 3</b>Tattoo</a>\n");
      out.write("    <!-- Float links to the right. Hide them on small screens -->\n");
      out.write("    <div class=\"w3-right w3-hide-small\">\n");
      out.write("      <a href=\"#gallery\" class=\"w3-bar-item w3-button\">Gallery</a>\n");
      out.write("      <a href=\"#about\" class=\"w3-bar-item w3-button\">About</a>\n");
      out.write("      <a href=\"LogInPage.jsp\" class=\"w3-bar-item w3-button\">Log In</a>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- Header -->\n");
      out.write("<header class=\"w3-display-container w3-content w3-wide\" style=\"max-width:1500px;\" id=\"home\">\n");
      out.write("    <img class=\"w3-image\" src=\"homepic.jpg\" alt=\"Tattoo Parlor\" width=\"1500\" height=\"800\">\n");
      out.write("  <div class=\"w3-display-middle w3-margin-top w3-center\">\n");
      out.write("    <h1 class=\"w3-xxlarge w3-text-white\">Team 3 <span class=\"w3-hide-small w3-text-light-grey\">Tattoo</span></h1>\n");
      out.write("  </div>\n");
      out.write("</header>\n");
      out.write("\n");
      out.write("<!-- Page content -->\n");
      out.write("<div class=\"w3-content w3-padding\" style=\"max-width:1564px\">\n");
      out.write("\n");
      out.write("  <!-- Gallery Section -->\n");
      out.write("  <div class=\"w3-container w3-padding-32\" id=\"gallery\">\n");
      out.write("    <h3 class=\"w3-border-bottom w3-border-light-grey w3-padding-16\">Gallery</h3>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("  <div class=\"w3-row-padding\">\n");
      out.write("    <div class=\"w3-col l3 m6 w3-margin-bottom\">\n");
      out.write("      <div class=\"w3-display-container\">\n");
      out.write("        <div class=\"w3-display-topleft w3-black w3-padding\">Women Sleeve Tattoos</div>\n");
      out.write("        <img src=\"tattoo1.jpg\" alt=\"Tattoo1\" style=\"width:100%\">\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"w3-col l3 m6 w3-margin-bottom\">\n");
      out.write("      <div class=\"w3-display-container\">\n");
      out.write("        <div class=\"w3-display-topleft w3-black w3-padding\">Men Sleeve Tattoos</div>\n");
      out.write("        <img src=\"tattoo 2.jpeg\" alt=\"Tattoo2\" style=\"width:100%\">\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"w3-col l3 m6 w3-margin-bottom\">\n");
      out.write("      <div class=\"w3-display-container\">\n");
      out.write("        <div class=\"w3-display-topleft w3-black w3-padding\">Black and White Tattoos</div>\n");
      out.write("        <img src=\"tattoo 3.jpeg\" alt=\"Tattoo3\" style=\"width:100%\">\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"w3-col l3 m6 w3-margin-bottom\">\n");
      out.write("      <div class=\"w3-display-container\">\n");
      out.write("        <div class=\"w3-display-topleft w3-black w3-padding\">Couples Tattoos</div>\n");
      out.write("        <img src=\"tattoo 4.jpg\" alt=\"Tattoo4\" style=\"width:100%\">\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("    \n");
      out.write("\n");
      out.write("  <!-- About Section -->\n");
      out.write("  <div class=\"w3-container w3-padding-32\" id=\"about\">\n");
      out.write("    <h3 class=\"w3-border-bottom w3-border-light-grey w3-padding-16\">About</h3>\n");
      out.write("    <p>We are the premier tattoo and piercing studio with highly sought after artists and skilled piercers. We offer a welcoming environment with a friendly and diverse staff that strives to exceed your expectations. Our artists are skilled in realism, traditional, neo-traditional, portrait and watercolor tattoos. \n");
      out.write("    </p>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("  <div class=\"w3-row-padding w3-grayscale\">\n");
      out.write("    <div class=\"w3-col l3 m6 w3-margin-bottom\">\n");
      out.write("        <img src=\"tattooartist2.jpeg\" alt=\"John\" style=\"width:100%\">\n");
      out.write("      <h3>John Doe</h3>\n");
      out.write("      <p class=\"w3-opacity\">Lead Tattoo Artist</p>\n");
      out.write("      <p>something something something</p>\n");
      out.write(" \n");
      out.write("    </div>\n");
      out.write("    <div class=\"w3-col l3 m6 w3-margin-bottom\">\n");
      out.write("        <img src=\"tattooartist1.jpg\" alt=\"Jane\" style=\"width:80%\">\n");
      out.write("      <h3>Jane Doe</h3>\n");
      out.write("      <p class=\"w3-opacity\">Tattoo Artist</p>\n");
      out.write("      <p>Blah blah brain fart</p>\n");
      out.write(" \n");
      out.write("    </div>\n");
      out.write("    <div class=\"w3-col l3 m6 w3-margin-bottom\">\n");
      out.write("        <img src=\"tattooartist3.jpeg\" alt=\"Mike\" style=\"width:100%\">\n");
      out.write("      <h3>Mike Ross</h3>\n");
      out.write("      <p class=\"w3-opacity\">Tattoo Artist</p>\n");
      out.write("      <p>Something about this guy... </p>\n");
      out.write("     \n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  \n");
      out.write("      \n");
      out.write("      \n");
      out.write("      \n");
      out.write("      \n");
      out.write("      \n");
      out.write("  \n");
      out.write("<!-- Image of location/map -->\n");
      out.write("<div class=\"w3-container\">\n");
      out.write("    <img src=\"tattooshop.jpg\" class=\"w3-image\" style=\"width:50%\">\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- End page content -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Footer -->\n");
      out.write("<footer class=\"w3-center w3-black w3-padding-16\">\n");
      out.write(" \n");
      out.write("</footer>\n");
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
