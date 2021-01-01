<%-- 
    Document   : myprofile
    Created on : 24 Nov, 2020, 6:42:18 PM
    Author     : Hrishikesh Shinde
--%>

<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.dao.joinDao"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
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
        
        <link rel="stylesheet" href="css/newprofile.css">
        <script src="https://unpkg.com/feather-icons"></script>

        <!--#####-->
        <title>My Profile</title>
        
        <style>
            .hmm{
    color: #272727;
}
    
            
        </style>
        <script src="Bootstrap4/bootstrap-4.5.0-dist/jquery/dist/jquery.slim.min.js"></script>
        <script src="Bootstrap4/bootstrap-4.5.0-dist/popper.js/dist/popper.min.js"></script>
        <script src="Bootstrap4/bootstrap-4.5.0-dist/js/bootstrap.min.js"></script>
    </head>
    <body>
        <%
            if (session.getAttribute("report") == "joined"){
        %>
        <script>
            alert("You are registered to the tournament!!!, Check in 'Tournaments joined' section");
        </script>
        <%
            }else if(session.getAttribute("report") == "already_joined"){
        %>
        <script>
            alert("You are already registered to that tournament!!!, Check in 'Tournaments joined' section");
        </script>
        <%
            }
        %>
        
        
    <!--NAVBAR and Log+signup-->
        <!--Navbar-->
        
        <nav class="navbar navbar-expand-lg navbar-light">
            <div class="container">
               <a class="navbar-brand text-light" href="home.jsp" id="nav-name">~ARCANIDE~</a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>

                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav ml-auto">
                        <li class="nav-item active">
                            <a class="nav-link text-light" href="home.jsp">Home</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link text-light" href="games.jsp">Categories</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link text-light" href="tournaments.jsp">Tournaments</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link text-light" href="#">My Profile</a>
                        </li>
                    </ul>
                </div> 
                    
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
        
        <!--~~~~~-->
        
        <!--LoginMODAL-->
        <div class="modal fade" id="LoginModal" data-backdrop="static" data-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true">
            <div class="modal-dialog border border-light rounded-sm">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title offset-5" id="loghead">Login</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true" id="cross" style="color: floralwhite">&times;</span>
                        </button>
                    </div>
                    <div class="modal-body">
                        <form action="logg" method="POST">
                            <div class="form-group">
                                
                                <label for="exampleInputEmail1" id="email" class="clr">Email address</label>
                                <input type="text" class="form-control" name="email" id="email" aria-describedby="emailHelp" required>
                                <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
                            </div>
                            <div class="form-group">
                                <label for="exampleInputPassword1" id="pass" class="clr">Password</label>
                                <input type="password" class="form-control" name="pass" id="pass" required>
                            </div>
                            <div class="form-group form-check">
                                <input type="checkbox" class="form-check-input" id="exampleCheck1">
                                <label class="form-check-label clr" for="exampleCheck1" id="rem">Remember Me!</label>
                                
                                <a class="offset-4" data-toggle="modal" data-target="#SignupModal" id="signupp">Not a member?? SignUP</a>
                            </div>
                            <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                            <input type="submit" class="btn btn-primary" value="Login"></input>
                        </form>
                    </div>
                </div>
            </div>
        </div>
        <!--~~~~~-->
        
        <!--SignupMODAL-->
        <div class="modal fade" id="SignupModal" data-backdrop="static" data-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true">
            <div class="modal-dialog border border-light rounded-sm">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title offset-5" id="loghead">SignUp</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true" id="cross" style="color: floralwhite">&times;</span>
                        </button>
                    </div>
                    <div class="modal-body">
                        <form action="register" method="POST" id="form">
                            <div class="form-row">
                                <div class="form-group col-md-6">
                                    <label for="Firstname" class="clr">Firstname</label>
                                    <input type="text" class="form-control" id="Firstname" name="Firstname" required>
                                    <i class="fa fa-check-circle"></i>
                                    <i class="fa fa-exclamation-circle"></i>
                                    <small>Error message</small>
                                </div>
                                <div class="form-group col-md-6">
                                    <label for="Lastname" class="clr">Lastname</label>
                                    <input type="text" class="form-control" id="Lastname" name="Lastname" required>
                                    <i class="fa fa-check-circle"></i>
                                    <i class="fa fa-exclamation-circle"></i>
                                    <small>Error message</small>
                                </div>
                            </div>
                            <div class="form-row">
                                <div class="form-group col-md-12">
                                    <label for="Username" class="clr">Username</label>
                                    <input type="text" class="form-control" id="Username" name="Username" required>
                                    <i class="fa fa-check-circle"></i>
                                    <i class="fa fa-exclamation-circle"></i>
                                    <small>Error message</small>
                                </div> 
                            </div>
                            <div class="form-row">
                                <div class="form-group col-md-12">
                                    <label for="Address2" class="clr">Email</label>
                                    <input type="text" class="form-control" id="Email" name="Email" placeholder="abc@email.com" required>
                                    <i class="fa fa-check-circle"></i>
                                    <i class="fa fa-exclamation-circle"></i>
                                    <small>Error message</small>
                                </div>
                            </div>
                            <div class="form-row">
                                <div class="form-group col-md-12">
                                    <label for="Phone" class="clr">Phone</label>
                                    <input type="text" class="form-control" id="Phone" name="Phone" required>
                                    <i class="fa fa-check-circle"></i>
                                    <i class="fa fa-exclamation-circle"></i>
                                    <small>Error message</small>
                                </div>
                            </div>
                            <div class="form-row">
                                <div class="form-group col-md-6">
                                    <label for="Password" class="clr">Password</label>
                                    <input type="text" class="form-control" id="Password" name="Password" required>
                                    <i class="fa fa-check-circle"></i>
                                    <i class="fa fa-exclamation-circle"></i>
                                    <small>Error message</small>
                                </div>
                                <div class="form-group col-md-6">
                                    <label for="ConfPass" class="clr">Confirm Password</label>
                                    <input type="password" class="form-control" id="ConfPass" name="ConfPass" required>
                                    <i class="fa fa-check-circle"></i>
                                    <i class="fa fa-exclamation-circle"></i>
                                    <small>Error message</small>
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="form-check">
                                    <input class="form-check-input" type="checkbox" id="gridCheck">
                                    <label class="form-check-label clr" for="gridCheck">
                                        I agree All the terms and conditions
                                    </label>
                                </div>
                            </div>
                            <button type="submit" class="btn btn-primary" id="submit" onclick="checkInputs()" >Sign in</button>
                        </form>
                    </div>
                </div>
            </div>
        </div>
        <!--~~~~~-->
    <!--~~~~~-->
    
    <br>
    
    <!--Profile-->
    <div class="">
        <div class="row">
            <div class="nav flex-column nav-pills col-2 bg-white" id="v-pills-tab" role="tablist" aria-orientation="vertical" style="border-bottom-left-radius: 5px; border-top-left-radius: 5px">
                <a class="nav-link text-gray-dark active" id="v-pills-home-tab" data-toggle="pill" href="#Profiletab" role="tab" aria-controls="v-pills-home" aria-selected="true">
                    <span class="fa fa-user"></span> Profile
                </a>
                <a class="nav-link text-gray-dark" id="v-pills-profile-tab" data-toggle="pill" href="#YTtab" role="tab" aria-controls="v-pills-profile" aria-selected="false">
                    <span class="fa fa-shield"></span> Your tournaments
                </a>
                <a class="nav-link text-gray-dark" id="v-pills-messages-tab" data-toggle="pill" href="#TJtab" role="tab" aria-controls="v-pills-messages" aria-selected="false">
                    <span class="fa fa-gamepad"></span> Tournaments joined
                </a>
            </div>
            <div class="tab-content col-10 bg-white" id="v-pills-tabContent" style="border-bottom-right-radius: 5px; border-top-right-radius: 5px">
                <div class="tab-pane fade show active" id="Profiletab" role="tabpanel" aria-labelledby="v-pills-home-tab">
                    <div class="card mt-3 mb-3">
                        <h5 class="card-header"><span class="offset-5">Profile</span></h5>
                        <div class="card-body">
                            <form action="register" method="POST" id="form">
                                <div class="form-row">
                                    <div class="form-group offset-1 col-md-4">
                                        <label for="Firstname" class="clr text-dark">Firstname</label>
                                        <input type="text" class="form-control" id="Firstname" name="Firstname" value="${fname}" readonly>
                                    </div>
                                    <div class="form-group col-md-4">
                                        <label for="Lastname" class="clr text-dark">Lastname</label>
                                        <input type="text" class="form-control" id="Lastname" name="Lastname" value="${lname}" readonly>
                                    </div>
                                    <div class="form-group col-md-1">
                                        <a class="btn btn-outline-secondary" data-toggle="modal" data-target="#editflname" style="position: relative; top: 46%"><span class="fa fa-edit"></span></a>
                                    </div>
                                </div>
                                <div class="form-row">
                                    <div class="form-group offset-1 col-md-8">
                                        <label for="Username" class="clr text-dark">Username</label>
                                        <input type="text" class="form-control" id="Username" name="Username" value="${user}" readonly>
                                    </div>
                                    <div class="form-group col-md-1">
                                        <a class="btn btn-outline-secondary" data-toggle="modal" data-target="#edituname" style="position: relative; top: 46%"><span class="fa fa-edit"></span></a>
                                    </div>
                                </div>
                                <div class="form-row">
                                    <div class="form-group offset-1 col-md-8">
                                        <label for="Address2" class="clr text-dark">Email</label>
                                        <input type="text" class="form-control" id="Email" name="Email" value="${mail}" readonly>
                                     </div>
                                    <div class="form-group col-md-1">
                                        <a class="btn btn-outline-secondary" data-toggle="modal" data-target="#editemail" style="position: relative; top: 46%"><span class="fa fa-edit"></span></a>
                                    </div>
                                </div>
                                <div class="form-row">
                                    <div class="form-group offset-1 col-md-8">
                                        <label for="Phone" class="clr text-dark">Phone</label>
                                        <input type="text" class="form-control" id="Phone" name="Phone" value="${phone}" readonly>
                                    </div>
                                    <div class="form-group col-md-1">
                                        <a class="btn btn-outline-secondary" data-toggle="modal" data-target="#editphone" style="position: relative; top: 46%"><span class="fa fa-edit"></span></a>
                                    </div>
                                </div>
                                <div class="form-row">
                                    <div class="form-group offset-1 col-md-8">
                                        <label for="Password" class="clr text-dark">Password</label>
                                        <input type="text" class="form-control" id="Password" name="Password" value="${pass}" readonly>
                                    </div>
                                    <div class="form-group col-md-1">
                                        <a class="btn btn-outline-secondary" data-toggle="modal" data-target="#editpass" style="position: relative; top: 46%"><span class="fa fa-edit"></span></a>
                                    </div>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
                
                
                <div class="tab-pane fade text-gray-dark" id="YTtab" role="tabpanel" aria-labelledby="v-pills-profile-tab">
                    <%
                        String url = "jdbc:mysql://localhost:3306/arcanide?zeroDateTimeBehavior=convertToNull&useSSL=false";
                            System.out.println("in try");
                            Class.forName("com.mysql.jdbc.Driver");
                            Connection con = DriverManager.getConnection(url,"root","hrishi");
                        String player = String.valueOf(session.getAttribute("user"));
                        String Queryr = "select * from tournaments where hosted_by=?;";
                        PreparedStatement ps1 = con.prepareStatement(Queryr);
                        ps1.setString(1, player);
                        ResultSet rs1 = ps1.executeQuery();
                        if(rs1.next()){
                    %>
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
                            </tr>
                        </thead>
                        <tbody>
                            <%
                            System.out.println("in try 1");
                                
                                System.out.println(player+"<--player1");
                                joinDao jdao = new joinDao();
                                String tid = jdao.tours(player);
                                System.out.println(tid+"<--id1e");
                                String Query1 = "select* from tournaments where hosted_by=?;";
                                PreparedStatement ps3 = con.prepareStatement(Query1);
                                ps3.setString(1, player);
                                ResultSet rs3 = ps3.executeQuery();
                                while(rs3.next()){
                                    System.out.println("Working!!");
                        %>
                            <tr>
                                <% System.out.println("in while 1"); %>
                                <th scope="row"><%=rs3.getString(1)%></th>
                                <% System.out.println("in while 2"); %>
                                <td><%=rs3.getString(2)%></td>
                                <td><%=rs3.getString(3)%></td>
                                <td><%=rs3.getString(4) %></td>
                                <td><%=rs3.getString(5)%></td>
                                <td><%=rs3.getString(6)%></td>
                                <td><%=rs3.getString(7)%></td>   
                                <td><%=rs3.getString(8)%></td>
                                <td><%=rs3.getString(9)%></td>
                                <td><%=rs3.getString(10)%></td>
                                <% System.out.println("in while 3"); %>
                            </tr>
                            <%
                                }
                            %>
                        </tbody>
                    </table>
                    <%        
                        }else{
                    %>
                        <p class="mt-4" style="font-size: 28px;position: relative; left: 30%">You haven't hosted any tournaments!</p>
                    <%
                    }
                    %>
                </div>
                <div class="tab-pane fade text-gray-dark" id="TJtab" role="tabpanel" aria-labelledby="v-pills-messages-tab">
                    <%
                        String Query2 = "select * from tplayers where player_name=?;";
                        PreparedStatement ps2 = con.prepareStatement(Query2);
                        ps2.setString(1, player);
                        ResultSet rs2 = ps2.executeQuery();
                        if(rs2.next()){
                    %>
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
                            </tr>
                        </thead>
                        <tbody>
                        <%
                            System.out.println("in try");
                                
                                System.out.println(player+"<--player");
                                joinDao jdao = new joinDao();
                                List tid=new ArrayList();
                                tid = jdao.tour(player);
                                System.out.println(tid+"<--id");
                                String Query1 = "select * from tournaments where id=?;";
                                PreparedStatement ps = con.prepareStatement(Query1);
                                int i = 0;
                                while(i<tid.size()){
                                    String tids = String.valueOf(tid.get(i));
                                ps.setString(1, tids);
                                ResultSet rs = ps.executeQuery();
                                while(rs.next()){
                                    System.out.println("Working!!");
                        %>
                            <tr>
                                <% System.out.println("in while 1"); %>
                                <th scope="row"><%=rs.getString(1)%></th>
                                <% System.out.println("in while 2"); %>
                                <td><%=rs.getString(2)%></td>
                                <td><%=rs.getString(3)%></td>
                                <td><%=rs.getString(4) %></td>
                                <td><%=rs.getString(5)%></td>
                                <td><%=rs.getString(6)%></td>
                                <td><%=rs.getString(7)%></td>   
                                <td><%=rs.getString(8)%></td>
                                <td><%=rs.getString(9)%></td>
                                <td><%=rs.getString(10)%></td>
                                <% System.out.println("in while 3"); %>
                            </tr>
                        <%            
                                i++;}}
                        %>  
                        </tbody>
                    </table>
                    <%        
                        }else{
                    %>
                    <p class="mt-4" style="font-size: 28px;position: relative; left: 30%">You haven't joined any tournaments!</p>
                    <%
                    }
                    %>
                </div>
            </div>
        </div>
    </div>
    <br><br>
    
    
    <div class="modal fade" id="edituname" data-backdrop="static" data-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true">
            <div class="modal-dialog border border-light rounded-sm">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title offset-5" id="loghead">Update</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true" id="cross" style="color: floralwhite">&times;</span>
                        </button>
                    </div>
                    <div class="modal-body">
                        <form action="edituname" method="POST">
                            <div class="form-row">
                                    <div class="form-group col-md-8">
                                        <label for="Username" class="clr text-light">Username</label>
                                        <input type="text" class="form-control" id="Username" name="Username" value="${user}" required>
                                    </div>
                                </div>
                            <div class="form-row">
                                    <div class="form-group col-md-8">
                                        <label for="Address2" class="clr text-light">Email</label>
                                        <input type="text" class="form-control" id="Email" name="Email" value="${mail}" readonly>
                                     </div>
                                </div>
                            <input type="submit" class="btn btn-primary" value="Login"></input>
                        </form>
                    </div>
                </div>
            </div>
        </div>
        <div class="modal fade" id="editemail" data-backdrop="static" data-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true">
            <div class="modal-dialog border border-light rounded-sm">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title offset-5" id="loghead">Update</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true" id="cross" style="color: floralwhite">&times;</span>
                        </button>
                    </div>
                    <div class="modal-body">
                        <form action="editemail" method="POST">
                            <div class="form-row">
                                    <div class="form-group col-md-8">
                                        <label for="Address2" class="clr text-light">Email</label>
                                        <input type="text" class="form-control" id="Email" name="Email" value="${mail}" required>
                                     </div>
                                </div>
                            <div class="form-row">
                                    <div class="form-group col-md-8">
                                        <label for="Address2" class="clr text-light">Email</label>
                                        <input type="text" class="form-control" id="Email" name="Email" value="${mail}" readonly>
                                     </div>
                                </div>
                            <input type="submit" class="btn btn-primary" value="Login"></input>
                        </form>
                    </div>
                </div>
            </div>
        </div>
        <div class="modal fade" id="editphone" data-backdrop="static" data-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true">
            <div class="modal-dialog border border-light rounded-sm">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title offset-5" id="loghead">Update</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true" id="cross" style="color: floralwhite">&times;</span>
                        </button>
                    </div>
                    <div class="modal-body">
                        <form action="editphone" method="POST">
                            <div class="form-row">
                                    <div class="form-group col-md-8">
                                        <label for="Phone" class="clr text-light">Phone</label>
                                        <input type="text" class="form-control" id="Phone" name="Phone" value="${phone}" required>
                                    </div>
                                </div>
                            <div class="form-row">
                                    <div class="form-group col-md-8">
                                        <label for="Address2" class="clr text-light">Email</label>
                                        <input type="text" class="form-control" id="Email" name="Email" value="${mail}" readonly>
                                     </div>
                                </div>
                            <input type="submit" class="btn btn-primary" value="Login"></input>
                        </form>
                    </div>
                </div>
            </div>
        </div>
        <div class="modal fade" id="editpass" data-backdrop="static" data-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true">
            <div class="modal-dialog border border-light rounded-sm">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title offset-5" id="loghead">Update</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true" id="cross" style="color: floralwhite">&times;</span>
                        </button>
                    </div>
                    <div class="modal-body">
                        <form action="editpass" method="POST">
                            <div class="form-row">
                                    <div class="form-group col-md-8">
                                        <label for="Password" class="clr text-light">Password</label>
                                        <input type="text" class="form-control" id="Password" name="Password" value="${pass}" required>
                                    </div>
                                </div>
                            <div class="form-row">
                                    <div class="form-group col-md-8">
                                        <label for="Address2" class="clr text-light">Email</label>
                                        <input type="text" class="form-control" id="Email" name="Email" value="${mail}" readonly>
                                     </div>
                                </div>
                            <input type="submit" class="btn btn-primary" value="Login"></input>
                        </form>
                    </div>
                </div>
            </div>
        </div>
        <div class="modal fade" id="editflname" data-backdrop="static" data-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true">
            <div class="modal-dialog border border-light rounded-sm">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title offset-5" id="loghead">Update</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true" id="cross" style="color: floralwhite">&times;</span>
                        </button>
                    </div>
                    <div class="modal-body">
                        <form action="editflname" method="POST">
                            <div class="form-group col-md-4">
                                        <label for="Firstname" class="clr text-light">Firstname</label>
                                        <input type="text" class="form-control" id="Firstname" name="Firstname" value="${fname}" required>
                                    </div>
                                    <div class="form-group col-md-4">
                                        <label for="Lastname" class="clr text-light">Lastname</label>
                                        <input type="text" class="form-control" id="Lastname" name="Lastname" value="${lname}" required>
                                    </div>
                            <div class="form-row">
                                    <div class="form-group col-md-8">
                                        <label for="Address2" class="clr text-light">Email</label>
                                        <input type="text" class="form-control" id="Email" name="Email" value="${mail}" readonly>
                                     </div>
                                </div>
                            <input type="submit" class="btn btn-primary" value="Update"></input>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    
    
    
    
    <!--footer-->
        <section class="section-4">
            <footer class="page-footer font-small pt-4" style="background-color: #0e0e0e; color: floralwhite">
                <div class="container-fluid text-center text-md-left">
                    <div class="row">
                        <div class="col-md-6 mt-md-0 mt-3">
                            <h5 class="text-uppercase">Arcanide</h5><br>
                            <p>The esports technology to engage your players with competitions.</p>
                        </div>
                        <hr class="clearfix w-100 d-md-none pb-3">
                        <div class="col-md-3 mb-md-0 mb-3">
                            <ul class="list-unstyled">
                                <li><a href="home.jsp">Home</a></li>
                                <li><a href="games.jsp">Games</a></li>
                                <li><a href="tournaments.jsp">Host Tournaments</a></li>
                                <li><a href="tournaments.jsp">Join Tournaments</a></li>
                                <li><a href="#!">Your profile</a></li>
                            </ul>
                        </div>
                        <div class="col-md-3 mb-md-0 mb-3">
                            <ul class="list-unstyled">
                                <li><a href="#!">Terms of use</a></li>
                                <li><a href="#!">About cookies</a></li>
                                <li><a href="#!">Privacy policies</a></li>
                                <li><a href="#!">Report Abuse</a></li>
                            </ul>
                        </div>
                    </div>
                </div>
                <!-- Copyright -->
                <div class="footer-copyright text-center py-3" style="background-color: #010101; color: white">© 2020 Copyright:
                    <a href="https://mdbootstrap.com/">Arcanide</a>
                </div>
                <!-- Copyright -->
            </footer>
        </section>
    <!--~~~~~-->

    <script>
        $(function () {
        $('#myTab li:last-child a').tab('show');
        });
    </script>
    <script>
        feather.replace();
    </script>
    </body>
</html>
