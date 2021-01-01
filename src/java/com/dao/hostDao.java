package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Hrishikesh Shinde
 */
public class hostDao {
    String url = "jdbc:mysql://localhost:3306/arcanide?zeroDateTimeBehavior=convertToNull&useSSL=false";
    public boolean insert(String id, String Tname, String Gname, String date, String time, String format,String hosted_by, String description, String prize, String dlink, String image_name, String save_path) throws SQLException
    {
        try 
        {
            if(Tname != null){
                Class.forName("com.mysql.jdbc.Driver");
                
                Connection con = DriverManager.getConnection(url,"root","hrishi");
                
                String Query = "insert into tournaments values(?,?,?,?,?,?,?,?,?,?,?,?)";
                
                PreparedStatement ps = con.prepareStatement(Query);
                ps.setString(1, id);
                ps.setString(2, Tname);
                ps.setString(3, Gname);
                ps.setString(4, date);
                ps.setString(5, time);
                ps.setString(6, format);
                ps.setString(7, hosted_by);
                ps.setString(8, description);
                ps.setString(9, prize);
                ps.setString(10, dlink);
                ps.setString(11, image_name);
                ps.setString(12, save_path);
                
                System.out.println(Query);
                //int i = 10;
                int i = ps.executeUpdate();
            
                if(i > 0) {
                    System.out.println("You are sucessfully registered");
                    return true;
                }
                
                /*if(rs.next()){
                    System.out.print("Name: "+rs.getString("username")+", ");
                    System.out.print("pass: "+rs.getString("password")+", ");
                    return true;
                }*/
            } 
        } 
        catch (ClassNotFoundException e) 
        {
            e.printStackTrace();
        }
        
        return false;
    }
    
    public String retrive(String uname) throws SQLException{
        
        try 
        {
            if(uname != null){
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection(url,"root","hrishi");
                String Query = "select * from tournaments where username=?";
                PreparedStatement ps = con.prepareStatement(Query);
                ps.setString(1, uname);
                ResultSet rs = ps.executeQuery();
                if(rs.next()){
                    String image = rs.getString("Save_path");
                    return image;
                }
            } 
        } 
        catch (ClassNotFoundException e) 
        {
            e.printStackTrace();
        }
        
        return null;
        
    }
    
    
    
    
    
}
