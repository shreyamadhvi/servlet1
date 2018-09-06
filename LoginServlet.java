/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shreya_servlet1;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Admin
 */
public class LoginServlet extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
           try {
                String user = request.getParameter("username");
                String pass = request.getParameter("password");
                String gender = request.getParameter("gender");
                String[] hobby = request.getParameterValues("hobby");
                String[] Cast = request.getParameterValues("cast");
                if(user.equals("shreya") && pass.equals("madhvi")){
                    RequestDispatcher rd = request.getRequestDispatcher("welcome.html");
                    out.print("<h1>Welcome " + user + " !</h1>");
                    out.print("<h1>Gender :"+ gender + "</h1>");
                    out.print("<h1>Hobbies:</h1>");
                    for (String string : hobby) {
                        out.print("<p>" + string + "</p>");
                    }
                
                    out.print("<h1>Cast:</h1>");
                    for (String string : Cast) {
                        out.print("<p>" + string + "</p>");
                    }
                    rd.include(request, response);
                }else if(user.equals("shreya")){              
                     RequestDispatcher rd = request.getRequestDispatcher("/error");
                     rd.forward(request, response);
                }else{
                    RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
                    out.println("Not valid username or password , " + user + " !"); 
                    rd.include(request, response);
                }

            } catch (Exception e) {
                out.println("error : " + e);
            }
        }
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
