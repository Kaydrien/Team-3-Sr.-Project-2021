/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Tattoo.Admin;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author kaydr
 */
@WebServlet(urlPatterns = {"/InfoServlet"})
public class InfoServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        PrintWriter out = response.getWriter();
                
           // Variables to hold information brought from the jsp pages, account class, and database
            String fn;
	    String ln;
	    String un;
	    String pw;
            String id;
            
            
            
        try {
            
            fn = request.getParameter("fnam");
            ln = request.getParameter("Lnam");
            un = request.getParameter("unm");
            pw = request.getParameter("pswd");


            Admin i2;
            
            HttpSession dentsess;
            dentsess = request.getSession();
            i2 = (Admin)dentsess.getAttribute("a");
            i2.display();

            // Variable to retuieve and hold patient id variable
            id = i2.getid();
            
             // update statement from admin class
            i2.updateDB(id, fn, ln, un, pw);
            
            
             // request dispacher forwards control to the customer info pafge 
           RequestDispatcher rd = request.getRequestDispatcher("/CustomerHome.jsp");
             rd.forward(request, response);
        }//end try
        
        
        
        catch(Exception e){RequestDispatcher rd = request.getRequestDispatcher("/Error.jsp");
             rd.forward(request, response);}//end catch
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
