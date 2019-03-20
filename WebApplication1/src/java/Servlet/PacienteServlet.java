
package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "PacienteServlet", urlPatterns = {"/PacienteServlet"})
public class PacienteServlet extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
           String strFormId = request.getParameter("formid") ;
           
           if(strFormId.equals("1")){
               
               String strName = request.getParameter("name");
               String strApellido = request.getParameter("apellidos");
               String strGender = request.getParameter("gender");
               String strSymptoms = request.getParameter("symptoms");
               
               String strBirthYear = request.getParameter("BirthYear");
               String strBirthMonth = request.getParameter("BirthMonth");
               String strBirthDay = request.getParameter("BirthDay");
               
               
               int iBirthYear = Integer.parseInt(strBirthYear);
               int iBirthMonth = Integer.parseInt(strBirthMonth);
               int iBirthDay = Integer.parseInt(strBirthDay);
               
               request.getSession().setAttribute("name", strName);
               request.getSession().setAttribute("apellido", strApellido);
               request.getSession().setAttribute("diaNac", iBirthDay);
               request.getSession().setAttribute("mesNac", iBirthMonth);
               request.getSession().setAttribute("anhoNac", iBirthYear);
               request.getSession().setAttribute("genero", strGender);
               request.getSession().setAttribute("sintomas", strSymptoms);
               
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
