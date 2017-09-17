/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import User.userlist;
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
public class logser extends HttpServlet {

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
        logdata objLoginData = new logdata();
       objLoginData.setUser(request.getParameter("username"));
       //out.println(objLoginData.getUser());
       objLoginData. setPwd(request.getParameter("pwd"));
       //out.println(objLoginData.getPwd());
       userlist objuserlist=new userlist();
       ArrayList<logdata> user=objuserlist.getUserlit();
       boolean status=false;
       for (int i=0;i<user.size();i++)
       {
if (objLoginData.getUser().equals(user.get(i).getUser())&&objLoginData.getUser().equals(user.get(i).getPwd()))       
    
{status=true;
break;

}
    }
       
    if(status==true)
    
        {
            RequestDispatcher rd= request.getRequestDispatcher("success.jsp");
            rd.forward(request,response);
        }
        else
        {
            RequestDispatcher rd= request.getRequestDispatcher("error.jsp");
            rd.forward(request,response);
        
    }
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
