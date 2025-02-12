/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.dao.joinDao;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Hrishikesh Shinde
 */
@WebServlet(name = "joinuser", urlPatterns = {"/joinuser"})
public class joinuser extends HttpServlet {

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
            out.println("<title>Servlet joinuser</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet joinuser at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
    
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String id = request.getParameter("id");
        String uname = request.getParameter("uname");
        out.println(id+"<--id,uname-->"+uname);
        
        joinDao jdao = new joinDao();
        if(id != null && uname != null){
            try {
                if(!jdao.checkuser(uname)){
                    if(jdao.insert(id, uname)){
                        System.out.println("Registered");
                        HttpSession session = request.getSession();
                        session.setAttribute("report", "joined");
                        response.sendRedirect("myprofile.jsp");
                    }
                }
                else{
                    HttpSession session = request.getSession();
                    session.setAttribute("report", "already_joined");
                    response.sendRedirect("myprofile.jsp");
                }
            } catch (SQLException ex) {
                Logger.getLogger(joinuser.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }

}
