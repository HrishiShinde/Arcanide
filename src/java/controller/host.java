/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.dao.hostDao;
import java.io.File;
import java.io.IOException;
import static java.lang.System.out;
import java.sql.SQLException;
import java.util.Random;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

/**
 *
 * @author Hrishikesh Shinde
 */
@WebServlet(name = "host", urlPatterns = {"/host"})
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 2, maxFileSize = 1024 * 1024 * 10, maxRequestSize = 1024 * 1024 * 50)

public class host extends HttpServlet {

    
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        
        try {
            Random rand = new Random();
            int upperbound = 1001;
            int id_int = rand.nextInt(upperbound);
            String id = Integer.toString(id_int);
            String Tname = request.getParameter("Tname");
            String Gname = request.getParameter("Gname");
            String date = request.getParameter("date");
            String time = request.getParameter("time");
            String format = request.getParameter("format");
            String hosted_by = request.getParameter("hby");
            String description = request.getParameter("description");
            String prize = request.getParameter("prize");
            String dlink = request.getParameter("dlink");
            
            /*
            Part part = request.getPart("image");
            String fileName = extractFileName(part);
            String savePath = "C:\\Users\\Hrishikesh Shinde\\Documents\\NetBeansProjects\\Arcanide\\web\\css\\images\\tournaments\\playerTourna\\";
            //File fileSaveDir = new File(savePath); 
            
            System.out.println("f"+fileName);
            System.out.println("s1"+savePath);
            
            part.write(savePath + File.separator);
            
            System.out.println("s2"+savePath);
            */
            String fileName = "";
            String savePath = "";
            
            hostDao dao = new hostDao();
            
            if (dao.insert(id, Tname, Gname, date, time, format, hosted_by, description, prize, dlink, fileName, savePath)){ 
                response.sendRedirect("myprofile.jsp");
            }
            else{
                out.println("Invalid!");
            }
        } catch (SQLException ex) {
            out.println("error: "+ex);
        }
    }
    private String extractFileName(Part part){
        String contentDisp = part.getHeader("content-disposition");
        String[] items = contentDisp.split(";");
        for(String s : items){
            if(s.trim().startsWith("filename")){
                return s.substring(s.indexOf("=")+2, s.length()-1);
            }
        }
        return "";   
    }
}
