/*a
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Registration;

import validation.formvaidation;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author USER
 */
public class regser extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
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
  
  regdata objRegData = new regdata();
        objRegData.setUser(request.getParameter("username"));
        out.println(objRegData.getUser());
        objRegData.setPwd(request.getParameter("pwd"));
        out.println(objRegData.getPwd());
        objRegData.setConformpwd(request.getParameter("confirmpwd"));
        out.println(objRegData.getConformpwd());
        objRegData.setEmail(request.getParameter("email"));
        out.println(objRegData.getEmail());
        objRegData.setContact(request.getParameter("contact"));
        out.println(objRegData.getContact());
        objRegData.setBOD(request.getParameter("DoB"));
        out.println(objRegData.getBOD());
        isValidData(objRegData);
        ArrayList<String> list = isValidData(objRegData);
        if(list.size()==0)
        {
            RequestDispatcher rd= request.getRequestDispatcher("success.jsp");
            rd.forward(request,response);
        }
        else
        {
            RequestDispatcher rd= request.getRequestDispatcher("reg.jsp");
            rd.forward(request,response);
        }
    }
    ArrayList isValidData(regdata objRegData)
    {
        ArrayList <String> errors = new ArrayList();
        formvaidation form = new formvaidation();
       if(form.unamevalidator(objRegData.getUser()))
       {
             errors.add("Invalid username");
         } 
        /*if(form.passvalid(objRegData.getPwd())==false)
       {
             errors.add("Invalid password");
         } 
        if(form.emailvalid(objRegData.getEmail())==false)
       {
             errors.add("Invalid emailid");
         } 
        if(form.contactvalid(objRegData.getContact())==false)
       {
             errors.add("Invalid contactno");
         } 
        if(form.datevalid(objRegData.getBOD())==false)
       {
             errors.add("Invalid dob");
         } 
        for(int i=0;i<errors.size();i++)
        {
            System.out.println(errors.get(i));
        }*/
        return errors;

    
}
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
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
     * Handles the HTTP
     * <code>POST</code> method.
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
