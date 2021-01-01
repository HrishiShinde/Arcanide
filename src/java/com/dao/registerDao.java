/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class registerDao {
    
    String url = "jdbc:mysql://localhost:3306/arcanide?zeroDateTimeBehavior=convertToNull&useSSL=false";
    
    public boolean checkUser(String Username) throws SQLException{
        
        try 
        {
            if(Username != null){
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection(url,"root","hrishi");
                String Query = "select * from users where username=?";
                PreparedStatement ps = con.prepareStatement(Query);
                ps.setString(1, Username);
                ResultSet rs = ps.executeQuery();
                if(rs.next()){
                    System.out.print("Name: "+rs.getString("username")+", ");
                    System.out.print("Email: "+rs.getString("email")+", ");
                    System.out.print("Phone: "+rs.getString("phone")+", ");
                    
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
    public boolean checkEmail(String Email) throws SQLException{
        
        try 
        {
            if(Email != null){
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection(url,"root","hrishi");
                String Query = "select * from users where email=?";
                PreparedStatement ps = con.prepareStatement(Query);
                ps.setString(1, Email);
                ResultSet rs = ps.executeQuery();
                if(rs.next()){
                    System.out.print("Name: "+rs.getString("username")+", ");
                    System.out.print("Email: "+rs.getString("email")+", ");
                    System.out.print("Phone: "+rs.getString("phone")+", ");
                    
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
     public boolean checkPhone(String Phone) throws SQLException{
        
        try 
        {
            if(Phone != null){
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection(url,"root","hrishi");
                String Query = "select * from users where phone=?";
                PreparedStatement ps = con.prepareStatement(Query);
                ps.setString(1, Phone);
                ResultSet rs = ps.executeQuery();
                if(rs.next()){
                    System.out.print("Name: "+rs.getString("username")+", ");
                    System.out.print("Email: "+rs.getString("email")+", ");
                    System.out.print("Phone: "+rs.getString("phone")+", ");
                    
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
    
    
    
    public boolean insert(String Firstname, String Lastname, String Username, String Email, String Phone, String Password, String ConfPass) throws SQLException
    {
        try 
        {
            if(Username != null){
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection(url,"root","hrishi");
                
                String Query = "insert into users values(?,?,?,?,?,?)";
                
                PreparedStatement ps = con.prepareStatement(Query);
                ps.setString(1, Firstname);
                ps.setString(2, Lastname);
                ps.setString(3, Username);
                ps.setString(4, Email);
                ps.setString(5, Phone);
                ps.setString(6, Password);
                
                int i = ps.executeUpdate();
            
                if(i > 0) {
                    System.out.println("You are sucessfully registered");
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
    
}
