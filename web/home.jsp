<%-- 
    Document   : home
    Created on : 11 Dec, 2020, 10:44:39 PM
    Author     : Hrishikesh Shinde
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%-- 
    Document   : home
    Created on : 1 Oct, 2020, 8:30:42 PM
    Author     : Hrishikesh Shinde
--%>

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
        
        <link rel="stylesheet" href="css/homes.css">
        

        <!--#####-->
        
        <title>Arcanide</title>
        
        <style>
            
            .form-control.success input{
                border:solid 3px #2ecc71;
            }
            .form-control.error input{
                border:solid 3px #e74c3c;
            }

            .form-group.success i.fa-check-circle{
                visibility: visible;
                color: #2ecc71;
            }
            .form-control.error i.fa-exclamation-circle{
                visibility: visible;
                color: #e74c3c;
            }

            .form-group.error small{
                visibility: visible;
                color: #e74c3c;
            }
            
            .games{
    height: 140px;
    width: 190px;
}
        </style>
    </head>
    <body>
        
        <%
            if (session.getAttribute("result") == "updated"){
        %>
        <script>
            alert("You must login again to see changes :)");
        </script>
        <%
            } else if (session.getAttribute("uname") == "Uae"){
        %>
        <script>
            alert("The username you entererd already exists, Choose another one :)");
        </script>
        <%
            } else if (session.getAttribute("email") == "Eae"){
        %>
        <script>
            alert("The email you entererd already exists, Choose another one :)");
        </script>
        <%
            } else if (session.getAttribute("phone") == "Pae"){
        %>
        <script>
            alert("The phone number you entererd already exists, Choose another one :)");
        </script>
        <%
            }
        %>
        
        
        <script>
            function myFunction() {
            alert("You should log in first!");
            }
        </script>
        
    <!--NAVBAR and Log+signup-->
        <!--Navbar-->
        
        <nav class="navbar navbar-expand-lg navbar-light">
            <div class="container">
               <a class="navbar-brand text-light" href="#" id="nav-name">~ARCANIDE~</a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>

                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav ml-auto">
                        <li class="nav-item active">
                            <a class="nav-link text-light" href="#">Home</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link text-light" href="games.jsp">Categories</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link text-light" href="tournaments.jsp">Tournaments</a>
                        </li>
                        <%
                            if (session.getAttribute("user") == null){
                        %>
                        <!-- if not logged in -->
                        <li class="nav-item">
                            <a class="nav-link text-light" href="#" onclick="myFunction()">My Profile</a>
                        </li>
                        <%
                        } else if (session.getAttribute("user") != null){
                        %>
                        <!-- if logged in -->
                        <li class="nav-item">
                            <a class="nav-link text-light" href="myprofile.jsp">My Profile</a>
                        </li>
                        <%}%>
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
                        <form action="login" method="POST">
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
                                
                                <a class="" href="#" style="position: relative; left: 60%" data-toggle="modal" data-target="#SignupModal" id="signupp">Not a member?? SignUP</a>
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
                        <form action="register" method="POST" id="form" name="form">
                            <div class="form-row">
                                <div class="form-group col-md-6">
                                    <label for="Firstname" class="clr">Firstname</label>
                                    <input type="text" class="form-control success" id="Firstname" name="Firstname" required>
                                </div>
                                <div class="form-group col-md-6">
                                    <label for="Lastname" class="clr">Lastname</label>
                                    <input type="text" class="form-control" id="Lastname" name="Lastname" required>
                                </div>
                            </div>
                            <div class="form-row">
                                <div class="form-group col-md-12">
                                    <label for="Username" class="clr">Username</label>
                                    <input type="text" class="form-control success" id="Username" name="Username" required>
                                </div> 
                            </div>
                            <div class="form-row">
                                <div class="form-group col-md-12">
                                    <label for="Address2" class="clr">Email</label>
                                    <input type="text" class="form-control error" id="Email" name="Email" placeholder="abc@email.com" required>
                                </div>
                            </div>
                            <div class="form-row">
                                <div class="form-group col-md-12">
                                    <label for="Phone" class="clr">Phone</label>
                                    <input type="text" class="form-control" id="Phoneno" name="Phoneno" required>
                                </div>
                            </div>
                            <div class="form-row">
                                <div class="form-group col-md-6">
                                    <label for="Password" class="clr">Password</label>
                                    <input type="text" class="form-control" id="Password" name="Password" required>
                                </div>
                                <div class="form-group col-md-6">
                                    <label for="ConfPass" class="clr">Confirm Password</label>
                                    <input type="password" class="form-control" id="ConfPass" name="ConfPass" required>
                                </div>
                            </div>
                            <button type="submit" class="btn btn-primary" id="submit" onclick="return check()">Sign in</button>
                        </form>
                    </div>
                </div>
            </div>
        </div>
        <!--~~~~~-->
    <!--~~~~~-->
        
        
    <!--Carousel-->
        <div id="carouselExampleCaptions" class="carousel slide" data-ride="carousel">
            <ol class="carousel-indicators">
                <li data-target="#carouselExampleCaptions" data-slide-to="0" class="active"></li>
                <li data-target="#carouselExampleCaptions" data-slide-to="1"></li>
                <li data-target="#carouselExampleCaptions" data-slide-to="2"></li>
            </ol>
            <div class="carousel-inner">
                <div class="carousel-item active">
                    <img src="css/images/3.jpg" class="d-block w-100" alt="...">
                    <div class="carousel-caption d-none d-md-block">
                        <h5 class="animate slideInRight" style="animation-delay: 1s">PLAY Games here!</h5>
                        <p class="animate slideInRight" style="animation-delay: 2s">Some browser games to play online</p>
                        <a href="" class="animate slideInRight" style="animation-delay: 3s">Play now!</a>
                    </div>
                </div>
                <div class="carousel-item">
                    <img src="css/images/2.jpg" class="d-block w-100" alt="...">
                    <div class="carousel-caption d-none d-md-block">
                        <h5 class="" style="animation-delay: 1s">Host Or Join any Tournaments</h5>
                        <p class="" style="animation-delay: 2s">Play Esports And Improve Your skills.</p>
                        <a href="" class="" style="animation-delay: 3s">Host or Join now!</a>
                    </div>
                </div>
                <div class="carousel-item">
                    <img src="css/images/1.jpg" class="d-block w-100" alt="...">
                    <div class="carousel-caption d-none d-md-block">
                        <h5 class="" style="animation-delay: 1s">Are you an game developer?</h5>
                        <p class="" style="animation-delay: 2s">Upload your games for FREE!</p>
                        <a href="" class="" style="animation-delay: 3s">Upload now!</a>
                    </div>
                </div>
            </div>
            <a class="carousel-control-prev" href="#carouselExampleCaptions" role="button" data-slide="prev">
                <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                <span class="sr-only">Previous</span>
            </a>
            <a class="carousel-control-next" href="#carouselExampleCaptions" role="button" data-slide="next">
                <span class="carousel-control-next-icon" aria-hidden="true"></span>
                <span class="sr-only">Next</span>
            </a>
        </div>
    <!--~~~~~-->
        <br><br><br>
        
    <!--GameCards-->
        <section class="section-1">
        <div class="col d-flex justify-content-center">
            <div class="card border border-secondary w-75">
                <div class="card-header cardhedbg">
                    <h3 id="Hedding">Here are some casual games</h3>
                </div>
                <div class="card-body cardbodbg">
                    <div class="container">
                        <div class="row">
                            <div class="col-3">
                                <a href="games/btsa.html"><img src="css/images/games/Battleship2.jpg" class="games"> </a>
                            </div>
                            <div class="col-3">
                                <a href="games/cricket.html"><img src="css/images/games/Cricket1.jpg" class="games"> </a>
                            </div>
                            <div class="col-3">
                                <a href="games/ttt.html"><img src="css/images/games/TTT1.jpg" class="games"> </a>
                            </div>
                             <div class="col-3">
                                <a href="games/chess.html"><img src="css/images/games/chess1.jpg" class="games"> </a>
                            </div>
                            
                        </div>
                   </div>
               </div>
           </div>
        </div>
            
        </section>
    <!--~~~~~-->
        
    <br><br>
    <br>
    
    <div class="container">
        <div class="row">
            <div class="card col-12">
                <div class="card-body">
                    <p style="font-size: 20px; position: relative; top: 8px"> <b>Players</b>, looking for open tournaments to play in, organized by our community? </p>
                    <a href="tournaments.jsp" class="btn btn-primary" style="position: absolute; top: 23px; right: 25px">Browse the Tournaments</a>
                </div>
            </div>
        </div>
    </div>
    
    
    <br><br><br>

    <!--TournaCards-->
        <section class="section-2">
            
            <div class="col d-flex justify-content-center">
                <div class="card border border-secondary w-75">
                    <div class="card-header cardhedbg">
                        <h3 id="Hedding">Registration ending soon!</h3>
                    </div>
                    <div class="card-body cardbodbg">
                        <div class="container">
                            <div class="row">
                    
                                <div class="col-md-4">
                                    <div class="card text-center" style="width: 18rem;">
                                        <img src="css/images/tournaments/test1.png" class="card-img-top" alt="...">
                                        <div class="card-body">
                                            <ul class="list-group list-group-flush">
                                                <li class="card-title list-group-item"><b>Valorant Master Series #1</b></li>
                                                <li class="list-group-item"><span class="fa fa-calendar"></span> Thursday, Nov 26th 2020</li>
                                                <li class="list-group-item"><span class="fa fa-clock-o"></span> 7:00 PM IST</li>
                                            </ul>
                                        <a href="tournaments.jsp" class="btn btn-primary go">GO</a>
                                        </div>
                                    </div>
                                </div>
                    
                                <div class="col-md-4">
                                    <div class="card text-center" style="width: 18rem;">
                                        <img src="css/images/tournaments/test2.png" class="card-img-top" alt="...">
                                        <div class="card-body">
                                            <ul class="list-group list-group-flush">
                                                <li class="card-title list-group-item"><b>Pantana Cup - FIFA 20 PS4</b></li>
                                                <li class="list-group-item"><span class="fa fa-calendar"></span> Friday, Nov 27th 2020</li>
                                                <li class="list-group-item"><span class="fa fa-clock-o"></span> 5:00 PM IST</li>
                                            </ul>
                                        <a href="tournaments.jsp" class="btn btn-primary go">GO</a>
                                        </div>
                                    </div>
                                </div>
                    
                                <div class="col-md-4">
                                    <div class="card text-center" style="width: 18rem;">
                                        <img src="css/images/tournaments/test3.jpg" class="card-img-top" alt="...">
                                        <div class="card-body">
                                            <ul class="list-group list-group-flush">
                                                <li class="card-title list-group-item"><b>Rocket League SOLO Tournament</b></li>
                                                <li class="list-group-item"><span class="fa fa-calendar"></span> Saturday, Nov 28th 2020</li>
                                                <li class="list-group-item"><span class="fa fa-clock-o"></span> 11:00 AM IST</li>
                                            </ul>
                                        <a href="tournaments.jsp" class="btn btn-primary go">GO</a>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
    <!--~~~~~-->
    <br><br><br>
        
    <%!
        public String validate(){
            
            //String fname = request.getParameter("Firstname");
            //System.out.println(fname);
        return null;
        }
        
    %>
        
    <!--footer-->
        <section class="section-4">
            <footer class="page-footer font-small pt-4" style="background-color: #0e0e0e; color: floralwhite">
                <div class="container-fluid text-center text-md-left">
                    <div class="row">
                        <div class="col-md-6 mt-md-0 mt-3">
                            <h5 class="text-uppercase">Arcanide</h5><br>
                            <p>The esports technology to engage you players with competitions.</p>
                        </div>
                        <hr class="clearfix w-100 d-md-none pb-3">
                        <div class="col-md-3 mb-md-0 mb-3">
                            <ul class="list-unstyled">
                                <li><a href="home.jsp">Home</a></li>
                                <li><a href="games.jsp">Games</a></li>
                                <li><a href="tournaments.jsp">Host Tournaments</a></li>
                                <li><a href="tournaments.jsp">Join Tournaments</a></li>
                                <li><a href="myprofile.jsp">Your profile</a></li>
                            </ul>
                        </div>
                        <div class="col-md-3 mb-md-0 mb-3">
                            <ul class="list-unstyled">
                                <li><a href="#">Terms of use</a></li>
                                <li><a href="#">About cookies</a></li>
                                <li><a href="#">Privacy policies</a></li>
                                <li><a href="#">Report Abuse</a></li>
                            </ul>
                        </div>
                    </div>
                </div>
                <!-- Copyright -->
                <div class="footer-copyright text-center py-3" style="background-color: #010101; color: white">© 2020 Copyright:
                    <a href="#">Arcanide</a>
                </div>
                <!-- Copyright -->
            </footer>
        </section>
    <!--~~~~~-->
        
    <!--SCRIPTS-->
    <script type="text/javascript"> 
        function check(){
            var fname = document.form.Firstname.value;
            var lname = document.form.Lastname.value;
            var uname = document.form.Username.value;
            var email = document.form.Email.value;
            var phoneno = document.form.Phoneno.value;
            var pass = document.form.Password.value;
            var pass2 = document.form.ConfPass.value;
            var mailcheck = /^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\.[a-zA-Z0-9-]+)*$/;
            var phonono = /^([0-9]{10})$/;
            var passcheck = /^(?=.*[0-9])(?=.*[!@#$%^&*])[a-zA-Z0-9!@#$%^&*]{7,15}$/;;
            

            if(fname === "" || fname.length < 4){
                alert("Firstname is empty, must be greater than 4!");
                document.form.Firstname.focus();
                return false;
            }
            if(lname === "" || lname.length < 4){
                alert("Lastname is empty, must be greater than 4!");
                document.form.Lastname.focus();
                return false;
            }
            if(uname === "" || uname.length < 4){
                alert("Username empty, must be greater than 4!");
                document.form.Username.focus();
                return false;
            }
            if(email === "" || !email.match(mailcheck)){
                alert("Email empty or invalid!");
                document.form.Email.focus();
                return false;
            }
            if(phoneno === "" || phoneno.length < 9 || phoneno.length > 11){
                alert("Phone empty or must be of 10 digits!");
                document.form.Phoneno.focus();
                return false;
            }
            if(!phoneno.match(phonono)){
                alert("Phone should be digits only!");
                document.form.Phoneno.focus();
                return false;
            }
            if(pass === "" || pass.length < 8 || pass.length > 15 ){
                alert("Password empty or must be between 8 to 15 characters!");
                document.form.Password.focus();
                return false;
            }
            if(!pass.match(passcheck)){
                alert("Password must contain atleast 1 Capital letter, 1 lowercase, 1 number and 1 special charecter!");
                document.form.Password.focus();
                return false;
            }
            if( pass2 !== pass){
                console.log(pass,"<--pass,confpass-->",pass2);
                alert("Password2 doesn't match!");
                document.form.ConfPass.focus();
                return false;
            }
        }
    </script>
    
        <script src="Bootstrap4/bootstrap-4.5.0-dist/jquery/dist/jquery.slim.min.js"></script>
        <script src="Bootstrap4/bootstrap-4.5.0-dist/popper.js/dist/popper.min.js"></script>
        <script src="Bootstrap4/bootstrap-4.5.0-dist/js/bootstrap.min.js"></script>
        
        
    <!--~~~~~-->
    </body>
</html>



