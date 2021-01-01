/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.dao.profileDao;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.SQLException;
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
@WebServlet(name = "editpass", urlPatterns = {"/editpass"})
public class editpass extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("not not Updatetd!!!");
        try {
            String email = request.getParameter("Email");
            String pass = request.getParameter("Password");
            PrintWriter out = response.getWriter();
            
            profileDao pdao = new profileDao();
            System.out.println(email + pass);
            System.out.println("not Updatetd!!!");
            
            if(pdao.editpass(pass, email)){
                System.out.println("Updatetd!!!");
                HttpSession session = request.getSession();
                session.setAttribute("result", "updated");
                session.removeAttribute("user");
                response.sendRedirect("home.jsp");
                out.println("<script> alert(\"You must login again to see changes :)\"); </script>");
            }
            
            
        } catch (SQLException ex) {
            out.println("error: "+ex);
        }
    }
}
