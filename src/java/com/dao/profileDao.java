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

public class profileDao {
    String url = "jdbc:mysql://localhost:3306/arcanide?zeroDateTimeBehavior=convertToNull&useSSL=false";
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
                    String username = rs.getString("firstname");
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
    public String firstname(String uname) throws SQLException
    {
        try 
        {
            if(uname != null){
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection(url,"root","hrishi");
                String Query = "select * from users where email=?";
                PreparedStatement ps = con.prepareStatement(Query);
                ps.setString(1, uname);
                ResultSet rs = ps.executeQuery();
                if(rs.next()){
                    String firstname = rs.getString("firstname");
                    return firstname;
                }
            } 
        } 
        catch (ClassNotFoundException e) 
        {
            e.printStackTrace();
        }
        
        return "lol";
    }
    public String lastname(String uname) throws SQLException
    {
        try 
        {
            if(uname != null){
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection(url,"root","hrishi");
                String Query = "select * from users where email=?";
                PreparedStatement ps = con.prepareStatement(Query);
                ps.setString(1, uname);
                ResultSet rs = ps.executeQuery();
                if(rs.next()){
                    String lastname = rs.getString("lastname");
                    return lastname;
                }
            } 
        } 
        catch (ClassNotFoundException e) 
        {
            e.printStackTrace();
        }
        
        return "";
    }
    public String email(String uname) throws SQLException
    {
        try 
        {
            if(uname != null){
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection(url,"root","hrishi");
                String Query = "select * from users where email=?";
                PreparedStatement ps = con.prepareStatement(Query);
                ps.setString(1, uname);
                ResultSet rs = ps.executeQuery();
                if(rs.next()){
                    String email = rs.getString("email");
                    return email;
                }
            } 
        } 
        catch (ClassNotFoundException e) 
        {
            e.printStackTrace();
        }
        
        return "";
    }
    public String phone(String uname) throws SQLException
    {
        try 
        {
            if(uname != null){
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection(url,"root","hrishi");
                String Query = "select * from users where email=?";
                PreparedStatement ps = con.prepareStatement(Query);
                ps.setString(1, uname);
                ResultSet rs = ps.executeQuery();
                if(rs.next()){
                    String phone = rs.getString("phone");
                    return phone;
                }
            } 
        } 
        catch (ClassNotFoundException e) 
        {
            e.printStackTrace();
        }
        
        return "";
    }
    public String pass(String uname) throws SQLException
    {
        try 
        {
            if(uname != null){
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection(url,"root","hrishi");
                String Query = "select * from users where email=?";
                PreparedStatement ps = con.prepareStatement(Query);
                ps.setString(1, uname);
                ResultSet rs = ps.executeQuery();
                if(rs.next()){
                    String password = rs.getString("password");
                    return password;
                }
            } 
        } 
        catch (ClassNotFoundException e) 
        {
            e.printStackTrace();
        }
        
        return "";
    }
    public boolean editflname(String uname, String fname, String lname) throws SQLException
    {
        try 
        {
            System.out.println("out if!!!");
            if(uname != null){
                System.out.println("In try");
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection(url,"root","hrishi");
                String Query = "update users set firstname=?, lastname=? where email=?";
                PreparedStatement ps = con.prepareStatement(Query);
                ps.setString(1, fname);
                ps.setString(2, lname);
                ps.setString(3, uname);
                int update = ps.executeUpdate();
                System.out.println("before if");
                if(update > 0){
                    System.out.print("rows: " + update);
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
    public boolean edituname(String email, String uname) throws SQLException
    {
        try 
        {
            System.out.println("out if!!!");
            if(uname != null){
                System.out.println("In try");
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection(url,"root","hrishi");
                String Query = "update users set username=? where email=?";
                PreparedStatement ps = con.prepareStatement(Query);
                ps.setString(1, uname);
                ps.setString(2, email);
                int update = ps.executeUpdate();
                System.out.println("before if");
                if(update > 0){
                    System.out.print("rows: " + update);
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
    public boolean editemail(String email, String uname) throws SQLException
    {
        try 
        {
            System.out.println("out if!!!");
            if(uname != null){
                System.out.println("In try");
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection(url,"root","hrishi");
                String Query = "update users set email=? where username=?";
                PreparedStatement ps = con.prepareStatement(Query);
                ps.setString(1, email);
                ps.setString(2, uname);
                int update = ps.executeUpdate();
                System.out.println("before if");
                if(update > 0){
                    System.out.print("rows: " + update);
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
    public boolean editphone(String phone, String email) throws SQLException
    {
        try 
        {
            System.out.println("out if!!!");
            if(email != null){
                System.out.println("In try");
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection(url,"root","hrishi");
                String Query = "update users set phone=? where email=?";
                PreparedStatement ps = con.prepareStatement(Query);
                ps.setString(1, phone);
                ps.setString(2, email);
                int update = ps.executeUpdate();
                System.out.println("before if");
                if(update > 0){
                    System.out.print("rows: " + update);
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
    public boolean editpass(String pass, String email) throws SQLException
    {
        try 
        {
            System.out.println("out if!!!");
            if(email != null){
                System.out.println("In try");
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection(url,"root","hrishi");
                String Query = "update users set password=? where email=?";
                PreparedStatement ps = con.prepareStatement(Query);
                ps.setString(1, pass);
                ps.setString(2, email);
                int update = ps.executeUpdate();
                System.out.println("before if");
                if(update > 0){
                    System.out.print("rows: " + update);
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
