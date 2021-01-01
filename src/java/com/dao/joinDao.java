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
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hrishikesh Shinde
 */
public class joinDao {

    String url = "jdbc:mysql://localhost:3306/arcanide?zeroDateTimeBehavior=convertToNull&useSSL=false";
    
    public boolean insert(String id, String uname) throws SQLException {
        try 
        {
            String tname = Tname(id); 
            if(id != null){
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection(url,"root","hrishi");
                
                String Query = "insert into tplayers values(?,?,?)";
                
                PreparedStatement ps = con.prepareStatement(Query);
                ps.setString(1, id);
                ps.setString(2, uname);
                ps.setString(3, tname);
                
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
    
    public String Tname(String id) throws SQLException{
        
        try 
        {
            if(id != null){
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection(url,"root","hrishi");
                
                String Query = "select* from tournaments where id=?";
                
                PreparedStatement ps = con.prepareStatement(Query);
                ps.setString(1, id);
                
                ResultSet rs = ps.executeQuery();
                if(rs.next()){
                    String tname = rs.getString("Tournament_name");
                    return tname;
                }
            } 
        } 
        catch (ClassNotFoundException e) 
        {
            e.printStackTrace();
    }
        
        return null;
    }
    
    
    
    public List tour(String player) throws SQLException{
        
        try 
        {
            List<String> tid=new ArrayList<>();
            if(player != null){
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection(url,"root","hrishi");
                
                String Query = "select* from tplayers where player_name=?";
                
                PreparedStatement ps = con.prepareStatement(Query);
                ps.setString(1, player);
                System.out.println(player);
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                    tid.add(rs.getString("id"));
                    
                }
                return tid;
            } 
        } 
        catch (ClassNotFoundException e) 
        {
            e.printStackTrace();
        }
        
        return null;
    }
    public String tours(String player) throws SQLException{
        
        try 
        {
            if(player != null){
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection(url,"root","hrishi");
                
                String Query = "select* from tplayers where player_name=?";
                
                PreparedStatement ps = con.prepareStatement(Query);
                ps.setString(1, player);
                System.out.println(player);
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                    String tid = rs.getString("id");
                    return tid;
                }
            } 
        } 
        catch (ClassNotFoundException e) 
        {
            e.printStackTrace();
        }
        
        return null;
    }

    public boolean checkuser(String uname) throws SQLException {
        
        try 
        {
            if(uname != null){
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection(url,"root","hrishi");
                
                String Query = "select* from tplayers where player_name=?";
                
                PreparedStatement ps = con.prepareStatement(Query);
                ps.setString(1, uname);
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
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

    public boolean deleteuser(String id) throws SQLException {
        
        try 
        {
            if(id != null){
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection(url,"root","hrishi");
                
                String Query = "delete from users where username=?";
                
                PreparedStatement ps = con.prepareStatement(Query);
                ps.setString(1, id);
                int i = ps.executeUpdate();

                if(i > 0) {
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
    
    public boolean deletetour(String id) throws SQLException {
        
        try 
        {
            if(id != null){
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection(url,"root","hrishi");
                
                String Query = "delete from tournaments where id=?";
                
                PreparedStatement ps = con.prepareStatement(Query);
                ps.setString(1, id);
                int i = ps.executeUpdate();

                if(i > 0) {
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
    public boolean deletetp(String id) throws SQLException {
        
        try 
        {
            if(id != null){
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection(url,"root","hrishi");
                
                String Query = "delete from tplayers where id=?";
                
                PreparedStatement ps = con.prepareStatement(Query);
                ps.setString(1, id);
                int i = ps.executeUpdate();

                if(i > 0) {
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
