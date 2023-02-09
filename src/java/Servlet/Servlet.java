/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author mdeodanes
 */
@WebServlet(name = "Servlet", urlPatterns = {"/Servlet"})
public class Servlet extends HttpServlet {

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

            int num1 = 0;
            int num2 = 0;
            int resultado = 0;
            String opcion = "";

            if (request.getMethod() == "POST") {

                num1 = Integer.parseInt(request.getParameter("num1"));
                num2 = Integer.parseInt(request.getParameter("num2"));

                opcion = request.getParameter("opcion");

                if (opcion.equals("suma")) {
                    resultado = num1 + num2;

                } else if (opcion.equals("resta")) {
                    resultado = num1 - num2;

                } else if (opcion.equals("multiplicacion")) {
                    resultado = num1 * num2;

                } else if (opcion.equals("division")) {

                    resultado = num1 / num2;
                }
            }

            out.println("<!DOCTYPE html>");
            out.println("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css\" rel=\"stylesheet\">");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Mi Calculadora | Servlet</title>");
            out.println("</head>");
            out.println("<body>");

            out.println("<div class=\"container\">");
            out.println(" <div class=\"row align-items-center justify-content-center min-vh-100\">");
            out.println("<div class=\"col-lg-5 col-md-8 py-8 py-xl-0\">");
            out.println("<div class=\"card shadow border-0 p-3\">");
            out.println("<h1 class=\"display-5 py-2 text-center\">MI CALCULADORA SERVLET</h1>");

            out.println("<form >");

            out.println(" <div class=\"mb-3\">");
            out.println(" <label class=\"form-label\">Primer numero :</label>");
            out.println(" <input type=\"text\" class=\"form-control\" name=\"num1\" " + " value=\" " + num1 + "\"/>");
            out.println("</div>");

            out.println("<div class=\"mb-3\">");
            out.println("<label class=\"form-label\">Segundo numero :</label>");
            out.println(" <input type=\"text\" class=\"form-control\" name=\"num2\"  " + "value=\" " + num2 + "\" />");

            out.println("</div>");

            out.println("<div class=\"mb-3\">");
            out.println("<label class=\"form-label\">Resultado : " + opcion + "</label>");
            out.println("<label class=\"form-control\">" + resultado + "</label>");

            out.println("</div>");

            out.println("<div class=\"d-grid gap-2\">");
    
            out.println("<a href=\"index.html\" class=\"btn btn-warning\">Calcular</a>");
             
            out.println("</div>");

            out.println("</form>");

            out.println(" </div>");
            out.println("</div>");
            out.println("</div>");
            out.println("</div>");

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
