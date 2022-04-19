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
            
            Bhaskara bhaskara = new Bhaskara();
            
            bhaskara.setA(a);
            bhaskara.setB(b);
            bhaskara.setC(c);
            
            bhaskara.calculaDelta();
            bhaskara.calculaRaizes();
                       
            request.setAttribute("valorA", String.valueOf(a));
            request.setAttribute("valorB", String.valueOf(b));
            request.setAttribute("valorC", String.valueOf(c));
            
            request.setAttribute("delta", String.valueOf(bhaskara.getDelta()));
            request.setAttribute("x1", String.valueOf(bhaskara.getxP()));
            request.setAttribute("x2", String.valueOf(bhaskara.getxN()));
            
            request.getRequestDispatcher("resultado.jsp").forward(request, response);


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
