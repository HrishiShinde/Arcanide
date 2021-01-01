package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

    public class loginDao
{
    String url = "jdbc:mysql://localhost:3306/arcanide?zeroDateTimeBehavior=convertToNull&useSSL=false";
    public boolean check(String uname, String pass) throws SQLException
    {
        try 
        {
            if(uname != null){
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection(url,"root","hrishi");
                String Query = "select * from users where email=? and password=?";
                PreparedStatement ps = con.prepareStatement(Query);
                ps.setString(1, uname);
                ps.setString(2, pass);
                ResultSet rs = ps.executeQuery();
                if(rs.next()){
                    System.out.print("Name: "+rs.getString("username")+", ");
                    System.out.print("pass: "+rs.getString("password")+", ");
                    return true;
                }
            } 
        } 
        catch (ClassNotFoundException e) 
        {
            e.printStackTrace();
        }
        
        return false;
    }
    
    public String username(String email) throws SQLException{
        
        try 
        {
            if(email != null){
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection(url,"root","hrishi");
                String Query = "select * from users where email=?";
                PreparedStatement ps = con.prepareStatement(Query);
                ps.setString(1, email);
                ResultSet rs = ps.executeQuery();
                if(rs.next()){
                    String username = rs.getString("username");
                    return username;
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
