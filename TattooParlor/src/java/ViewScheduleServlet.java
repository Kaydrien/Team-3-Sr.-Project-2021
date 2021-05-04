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
@WebServlet(urlPatterns = {"/ViewScheduleServlet"})
public class ViewScheduleServlet extends HttpServlet {

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
     
            String day;
            String id;
            
            
        try {
            
            day = request.getParameter("Dayschedule");
            
           Admin v = new Admin();
           Admin a;
           
           HttpSession dentsess;
           dentsess = request.getSession();
           a = (Admin)dentsess.getAttribute("a");
           a.display();
            
           id = a.getid();
           
           v.dailyAppointments(id, day);
           
           
          // HttpSession dentsess;
           dentsess = request.getSession();
           dentsess.setAttribute("v", v);
           System.out.println("Admin added v to daily schedule");
             
            
            RequestDispatcher rd = request.getRequestDispatcher("/DaySchedule.jsp");
            rd.forward(request, response);
   
        }//end try
        
        
        
        catch(Exception e){RequestDispatcher rd = request.getRequestDispatcher("/ErrorEnterDay.jsp");
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

