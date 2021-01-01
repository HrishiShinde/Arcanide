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
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "login", urlPatterns = {"/login"})
public class login extends HttpServlet {

    @Override
    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException{
        try {
            String uname = request.getParameter("email");
            String pass = request.getParameter("pass");
            
            loginDao dao = new loginDao();
            profileDao pdao = new profileDao();
            
            if (dao.check(uname,pass)){ 
                HttpSession session = request.getSession();
                session.setAttribute("user", dao.username(uname));
                session.removeAttribute("result");
                response.sendRedirect("home.jsp");
                session.setAttribute("fname", pdao.firstname(uname));
                session.setAttribute("lname", pdao.lastname(uname));
                session.setAttribute("mail", pdao.email(uname));
                session.setAttribute("phone", pdao.phone(uname));
                session.setAttribute("pass", pdao.pass(uname));
            }
            else{
                if (uname.equals("admin") && pass.equals("admin")){
                    HttpSession session = request.getSession();
                    session.setAttribute("user", uname); 
                    response.sendRedirect("admin.jsp");
                }
                
                out.println("Invalid!");
            }
        } catch (SQLException ex) {
            out.println("error: "+ex);
        }
        
        
    }

}
