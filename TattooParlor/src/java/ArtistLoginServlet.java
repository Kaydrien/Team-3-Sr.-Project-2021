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
@WebServlet(urlPatterns = {"/ArtistLoginServlet"})
public class ArtistLoginServlet extends HttpServlet {

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
          
           String un;
           String pw;
           String pwd;
           String Id;
           String Fn;
	   String Ln;
                
        try{
           
         un = request.getParameter("ArtistID");
         pw = request.getParameter("ArtistPswd");  
         
        System.out.println("Username: " + un);
        System.out.println("Password: " + pw);
        
        Admin a = new Admin();
        
        a.selectArtistDB(un);
        
        pwd = a.getpassword();
        System.out.println(pwd);
        System.out.println("Correct password for this customer is: " + pwd);
        
        HttpSession dentsess;
        dentsess = request.getSession();
        dentsess.setAttribute("a", a);
        System.out.println("Admin added 'a' to Artist Session");
        
        if(pw.equals(pwd)){
             RequestDispatcher rd = request.getRequestDispatcher("/ArtistHome.jsp");
             rd.forward(request, response);
            }else{
                 RequestDispatcher rd = request.getRequestDispatcher("/Error.jsp");
             rd.forward(request, response);  

              }
            
        }//end try
        
         catch (Exception e){System.out.println("Exception caught"); 
             RequestDispatcher rd = request.getRequestDispatcher("/Error.jsp");
             rd.forward(request, response);}
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
