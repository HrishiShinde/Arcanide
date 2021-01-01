/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.dao.loginDao;
import com.dao.profileDao;
import java.io.IOException;
import static java.lang.System.out;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(name = "profile", urlPatterns = {"/profile"})
public class profile extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String uname = request.getParameter("Email");
            String fname = request.getParameter("Firstname");
            String lname = request.getParameter("Lastname");
            String pass = request.getParameter("pass");
            
            loginDao dao = new loginDao();
            profileDao pdao = new profileDao();
            
            
            
            String action = request.getServletPath();
            switch(action){
                case "editflname":
                    pdao.editflname(uname, fname, lname);
            }
            
            if (dao.check(uname,pass)){ 
                response.sendRedirect("home.jsp");
            }
            else{
                out.println("Invalid!");
            }
        } catch (SQLException ex) {
            out.println("error: "+ex);
        }
    }
}
