package br.uninove.controllers;

import br.uninove.model.Bhaskara;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BhaskaraController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {

            int a = Integer.parseInt(request.getParameter("valorA"));
            int b = Integer.parseInt(request.getParameter("valorB"));
            int c = Integer.parseInt(request.getParameter("valorC"));
            double delta;
            String params;

            Bhaskara bhaskara = new Bhaskara();

            bhaskara.setA(a);
            bhaskara.setB(b);
            bhaskara.setC(c);

            delta = bhaskara.calculaDelta();

            params = String.format("a=%s&b=%s&c=%s&delta=%s", a, b, c, delta);

            if (delta > 0) {
                bhaskara.calculaRaizes();
                params += String.format("&rP=%s&rN=%s",
                        bhaskara.getxP(),
                        bhaskara.getxN());
            }
            
            response.sendRedirect("resultado.jsp?" + params);
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
