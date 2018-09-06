/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shreya_servlet1;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author iiht
 */
public class servlet_user_pass extends HttpServlet {

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
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet servlet_user_pass</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet servlet_user_pass at " + request.getContextPath() + "</h1>");
            
             try {
                String user = request.getParameter("username");
                String pass = request.getParameter("password");
                String gender = request.getParameter("gender");
                String[] hobby = request.getParameterValues("hobby");
                String[] Cast = request.getParameterValues("cast");

                
                String hint = "M****";
                if(user.equals("shreya") && pass.equals("madhvi")){
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
                    
                    
                    
                }else{
                    out.println("Not valid username or password , " + user + " !");
                    out.println("Hint:"+hint);
                }

            } catch (Exception e) {
                out.println("error : " + e);
            }
    
            
            out.println("</body>");
            out.println("</html>");
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
