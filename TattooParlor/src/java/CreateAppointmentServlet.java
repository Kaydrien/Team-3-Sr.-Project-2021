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
@WebServlet(urlPatterns = {"/CreateAppointmentServlet"})
public class CreateAppointmentServlet extends HttpServlet {

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
         
         
           String fn;
	    String ln;
	    String tm;
	    String da;
            String aptID;
            String artID;
            String id;
            
            
         try {
             
            aptID = request.getParameter("AptID");
            artID = request.getParameter("artID");
            da = request.getParameter("dday");
            tm = request.getParameter("AptTime");
            
            Admin aa;
            
            
            HttpSession dentsess;
            dentsess = request.getSession();
            aa = (Admin)dentsess.getAttribute("a");
            aa.display();
            
            id = aa.getid();
            fn = aa.getfname();
            ln = aa.getlname();

            aa.createAppointmentDB(aptID, tm, artID, id, da, fn, ln);
            //AppointmentID, ApmntTime, AritistID, CustomerID, Day, Fname, Lname
            
             
             RequestDispatcher rd = request.getRequestDispatcher("/AppointmentMade.jsp");
             rd.forward(request, response);
       
        }
         
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
