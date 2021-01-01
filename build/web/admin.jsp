<%-- 
    Document   : admin
    Created on : 12 Dec, 2020, 10:36:54 AM
    Author     : Hrishikesh Shinde
--%>

<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.dao.joinDao"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!--Links-->
        <link rel="stylesheet" href="Bootstrap4/bootstrap-4.5.0-dist/css/bootstrap.css" type="text/css"/>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/4.0.0/animate.min.css"/>
        <link rel="stylesheet" href="Bootstrap4/bootstrap-4.5.0-dist/css/bootstrap.min.css">
        <link rel="stylesheet" href="Bootstrap4/bootstrap-social/bootstrap-social.css">
        <link rel="stylesheet" href="Bootstrap4/font-awesome/css/font-awesome.min.css">
        
            <!-- Fonts -->
            <link href="https://fonts.googleapis.com/css2?family=Dosis:wght@500&family=Quicksand:wght@700&display=swap" rel="stylesheet">
            <link href="https://fonts.googleapis.com/css?family=Quicksand&display=swap" rel="stylesheet">
            <link href="https://fonts.googleapis.com/css2?family=Quicksand:wght@700&display=swap" rel="stylesheet">
            <link href="https://fonts.googleapis.com/css2?family=Luckiest+Guy&display=swap" rel="stylesheet">
            <!-- ~~~~ -->
        
        <link rel="stylesheet" href="css/homes.css">
        

        <!--#####-->
        
        <title>Arcanide</title>
        
        <style>
            
        </style>
    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-light">
            <div class="container">
               <a class="navbar-brand text-light" href="home.jsp" id="nav-name">~ARCANIDE~</a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>

                    
                    <%
                    if (session.getAttribute("user") == null){
                    %>
                    <!-- if not logged in -->
                    <span class="navbar-text ml-5" id="loginBTN">
                        <a id="logg" class="log" href="#LoginModal" data-toggle="modal" data-target="#LoginModal">
                            <span class="fa fa-sign-in"></span> Login
                        </a>
                    </span>
                    <!--ooooooo -->
                    <%
                    } else if (session.getAttribute("user") != null){
                    %>
                    <!-- if logged in -->
                    <span class="navbar-text ml-5" id="loginBTN">
                        <a id="logg" class="log" href="#">
                            <span class="fa fa-user-circle-o"></span> ${user}
                        </a>    
                        <a id="logout" class="log" href="logout" >
                            <span class="fa fa-sign-out"></span> Logout
                        </a> 
                    </span>
                    <%}%>
                    <!--ooooooo-->
                    
            </div>
        </nav>
                    
        <div class="">
        <div class="row">
            <div class="nav flex-column nav-pills col-2 bg-white" id="v-pills-tab" role="tablist" aria-orientation="vertical" style="border-bottom-left-radius: 5px; border-top-left-radius: 5px">
                <a class="nav-link text-gray-dark active" id="v-pills-home-tab" data-toggle="pill" href="#Profiletab" role="tab" aria-controls="v-pills-home" aria-selected="true">
                    <span class="fa fa-user"></span> Users
                </a>
                <a class="nav-link text-gray-dark" id="v-pills-profile-tab" data-toggle="pill" href="#YTtab" role="tab" aria-controls="v-pills-profile" aria-selected="false">
                    <span class="fa fa-shield"></span> Tournaments
                </a>
                <a class="nav-link text-gray-dark" id="v-pills-messages-tab" data-toggle="pill" href="#TJtab" role="tab" aria-controls="v-pills-messages" aria-selected="false">
                    <span class="fa fa-gamepad"></span> Tournaments and Players
                </a>
            </div>
            <div class="tab-content col-10 bg-white" id="v-pills-tabContent" style="border-bottom-right-radius: 5px; border-top-right-radius: 5px">
                <div class="tab-pane fade show active" id="Profiletab" role="tabpanel" aria-labelledby="v-pills-home-tab">
                    <table class="table">
                        <thead>
                            <tr>
                                <th scope="col">Firstname</th>
                                <th scope="col">Lastname</th>
                                <th scope="col">Username</th>
                                <th scope="col">Email</th>
                                <th scope="col">Phone</th>
                                <th scope="col">Password</th>
                                <th scope="col">Action</th>
                            </tr>
                        </thead>
                        <tbody>
                    <%
                        String url = "jdbc:mysql://localhost:3306/arcanide?zeroDateTimeBehavior=convertToNull&useSSL=false";
                            Class.forName("com.mysql.jdbc.Driver");
                            Connection con = DriverManager.getConnection(url,"root","hrishi");
                        String Queryu = "select * from users;";
                        PreparedStatement psu = con.prepareStatement(Queryu);
                        ResultSet rsu = psu.executeQuery();
                        while(rsu.next()){
                    %>
                    <tr>
                                <% System.out.println("in while 1"); %>
                                <th scope="row"><%=rsu.getString(1)%></th>
                                <% System.out.println("in while 2"); %>
                                <td><%=rsu.getString(2)%></td>
                                <td><%=rsu.getString(3)%></td>
                                <td><%=rsu.getString(4)%></td>
                                <td><%=rsu.getString(5)%></td>
                                <td><%=rsu.getString(6)%></td>
                                <td><a class="btn btn-outline-secondary" href="delete?id=<%=rsu.getString("username")%>&&value=user">Delete</a></td>
                            </tr>
                    <%
                        }
                    %>
                    </tbody>
                    </table>
                </div>
                
                
                <div class="tab-pane fade text-gray-dark" id="YTtab" role="tabpanel" aria-labelledby="v-pills-profile-tab">
                    <table class="table">
                        <thead>
                            
                            <tr>
                                <th scope="col">Id</th>
                                <th scope="col">Tournament Name</th>
                                <th scope="col">Game name</th>
                                <th scope="col">Date</th>
                                <th scope="col">Time</th>
                                <th scope="col">Format</th>
                                <th scope="col">Hosted by</th>
                                <th scope="col">Description</th>
                                <th scope="col">Prize</th>
                                <th scope="col">Discord</th>
                                <th scope="col">Action</th>
                            </tr>
                        </thead>
                        <tbody>
                            <%
                            System.out.println("in try 1");
                                
                                String Query1 = "select* from tournaments;";
                                PreparedStatement ps3 = con.prepareStatement(Query1);
                                ResultSet rs3 = ps3.executeQuery();
                                while(rs3.next()){
                        %>
                            <tr>
                                <th scope="row"><%=rs3.getString(1)%></th>
                                <td><%=rs3.getString(2)%></td>
                                <td><%=rs3.getString(3)%></td>
                                <td><%=rs3.getString(4) %></td>
                                <td><%=rs3.getString(5)%></td>
                                <td><%=rs3.getString(6)%></td>
                                <td><%=rs3.getString(7)%></td>   
                                <td><%=rs3.getString(8)%></td>
                                <td><%=rs3.getString(9)%></td>
                                <td><%=rs3.getString(10)%></td>
                                <td><a class="btn btn-outline-secondary" href="delete?id=<%=rs3.getString("id")%>&&value=tour">Delete</a></td>
                            </tr>
                            <%
                                }
                            %>
                        </tbody>
                    </table>
                </div>
                <div class="tab-pane fade text-gray-dark" id="TJtab" role="tabpanel" aria-labelledby="v-pills-messages-tab">
                    <table class="table">
                        <thead>
                            <tr>
                                <th scope="col">Id</th>
                                <th scope="col">Player Name</th>
                                <th scope="col">Tournament Name</th>
                                <th scope="col">Action</th>
                            </tr>
                        </thead>
                        <tbody>
                        <%
                                String Queryt = "select * from tplayers;";
                                PreparedStatement ps = con.prepareStatement(Queryt);
                                ResultSet rs = ps.executeQuery();
                                while(rs.next()){
                        %>
                            <tr>
                                <th scope="row"><%=rs.getString(1)%></th>
                                <td><%=rs.getString(2)%></td>
                                <td><%=rs.getString(3)%></td>
                                <td><a class="btn btn-outline-secondary" href="delete?id=<%=rs.getString("id")%>&&value=tplayer">Delete</a></td>
                            </tr>
                        <%            
                            }
                        %>  
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </div>
                
    <script>
        $(function () {
        $('#myTab li:last-child a').tab('show');
        });
    </script>
    <script>
        feather.replace();
    </script>
    <script src="Bootstrap4/bootstrap-4.5.0-dist/jquery/dist/jquery.slim.min.js"></script>
        <script src="Bootstrap4/bootstrap-4.5.0-dist/popper.js/dist/popper.min.js"></script>
        <script src="Bootstrap4/bootstrap-4.5.0-dist/js/bootstrap.min.js"></script>
    </body>
</html>
