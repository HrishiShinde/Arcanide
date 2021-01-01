/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.dao.registerDao;
import java.io.IOException;
import static java.lang.System.out;
import java.sql.SQLException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "register", urlPatterns = {"/register"})
public class register extends HttpServlet {

    @Override
    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException{
        try {
            String Firstname = request.getParameter("Firstname");
            String Lastname = request.getParameter("Lastname");
            String Username = request.getParameter("Username");
            String Email = request.getParameter("Email");
            String Phone = request.getParameter("Phoneno");
            String Password = request.getParameter("Password");
            String ConfPass = request.getParameter("ConfPass");
            
            out.println(Firstname+Lastname+Username+Email+Phone+Password+ConfPass);
            
            registerDao dao = new registerDao();
            
            
            
            if (dao.checkUser(Username)){
                out.println("Username already exists!");
                request.setAttribute("uname", "Uae!");
                response.sendRedirect("home.jsp");
            }
            else{
               if (dao.checkEmail(Email)){
                    out.println("Email already exists!");
                    request.setAttribute("email", "Eae!");
                    response.sendRedirect("home.jsp");
                }
               else{
                  if (dao.checkPhone(Phone)){
                        out.println("inside 1st if");
                        out.println("Phone already exists!");
                        request.setAttribute("phone", "Pae!");
                        response.sendRedirect("home.jsp");
                    }
                    else{
                        out.println("outside 2nd if");
                        if (dao.insert(Firstname, Lastname, Username, Email, Phone, Password, ConfPass)){
                            out.println("inside 2nd if");
                            HttpSession session = request.getSession();
                            session.setAttribute("user", Username);
                            response.sendRedirect("home.jsp");
                        }
                        else{
                            out.println("Invalid!");
                        }
                    } 
               }
            }
        } catch (SQLException ex) {
            out.println("error: "+ex);
        }
    }
}
