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

/**
 *
 * @author Hrishikesh Shinde
 */
@WebServlet(name = "delete", urlPatterns = {"/delete"})
public class delete extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet delete</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet delete at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String id = request.getParameter("id");
        String value = request.getParameter("value");
        
        joinDao jdao = new joinDao();
        if(value.equals("user")){
            System.out.println("user done" + id);
            try {
                jdao.deleteuser(id);
                response.sendRedirect("admin.jsp");
            } catch (SQLException ex) {
                Logger.getLogger(delete.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(value.equals("tour")){
            System.out.println("tour done");
            try {
                jdao.deletetour(id);
                response.sendRedirect("admin.jsp");
            } catch (SQLException ex) {
                Logger.getLogger(delete.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(value.equals("tplayer")){
            System.out.println("tplayer done");
            try {
                jdao.deletetp(id);
                response.sendRedirect("admin.jsp");
            } catch (SQLException ex) {
                Logger.getLogger(delete.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
