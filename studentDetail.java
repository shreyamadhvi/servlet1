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
public class studentDetail extends HttpServlet {

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

                String Fullname = request.getParameter("Fullname");
                String Address = request.getParameter("Address");
                String textarea = request.getParameter("textarea");
                String[] Divison = request.getParameterValues("Divison");
                String[] Result = request.getParameterValues("Result");

                String file = request.getParameter("file");
              // RequestDispatcher rd = request.getRequestDispatcher("welcome.html");
                out.print("<div class= 'container'><div class='card text-white bg-info mb-3' style='max-width: 20rem;'>");
                out.print("<div class='card-header'>" + Fullname + "</div>");
                out.print("<div class='card-body'><h4 class='card-title'>"+ Address + "</h4>");
                out.print("<p class='card-text'>"+"textarea:" + " " + textarea+ "</p>");
                out.print("<p class='card-text'>"+"file:" + " " + file + "</p>");
            
//                out.print("<h1>" + "productprice:" + " " + productprice + " </h1>");
//                out.print("<h1>" + "producttype:" + " " + producttype + " </h1>");
//                out.print("<h1>" + "city:" + " " + city + " </h1>");
                out.print("<h1>Divison:</h1>");

                for (String string : Divison) {
                    out.print("<p class='card-text'>"+ string + "</p>");
                }
                out.print("</div></div></div>");
                //rd.include(request, response);
                
                out.print("<h1>:Result</h1>");

                for (String string : Result) {
                    out.print("<p class='card-text'>"+ string + "</p>");
                }
                out.print("</div></div></div>");
                //rd.include(request, response);
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
