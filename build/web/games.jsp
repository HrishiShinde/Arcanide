<%-- 
    Document   : games
    Created on : 2 Oct, 2020, 7:59:55 PM
    Author     : Hrishikesh Shinde
--%>
<!DOCTYPE html>
<html lang="en">
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
        
    <link rel="stylesheet" href="css/games.css">
    <!--#####-->
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Games</title>

    <style>
        #card{
        position: absolute;
        left: 25%;
        top: auto;
        max-height: 20%;
        }
        #para{
            background-attachment: fixed;
            background-position: center;
            background-repeat: no-repeat;
            background-size: cover;
            height: 300px;
        }
        #logout{
                color: floralwhite;
                padding: .2rem 1rem;
                font-family: quicksand;
                font-size: 18px;
                text-transform: uppercase;
                font-weight: bold;
            }
    </style>
</head>
<body style="background:url(css/images/games/games4.jpg);">
    
    <script>
            function myFunction() {
            alert("You must be logged in!");
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
                            <a class="nav-link text-light" href="home.jsp">Home</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link text-light" href="#">Categories</a>
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


    <br><br><br>
    <!--GameCard1-->
    <section class="section-1">
        <div class="col d-flex justify-content-center">
            <div class="card border border-secondary w-75">
                <div class="card-header cardhedbg">
                    <h3 id="Hedding">Choose a Game</h3>
                </div>
                <div class="card-body cardbodbg">
                    <div class="container">
                        <div class="row">
                            <div class="col-4">
                                <a href="games/btsa.html"><img src="css/images/games/Battleship1.png" class="games"> </a>
                            </div>
                            <div class="col-4">
                                <a href="games/cricket.html"><img src="css/images/games/Cricket1.png" class="games"> </a>
                            </div>
                            <div class="col-3">
                                <a href="games/ttt.html"><img src="css/images/games/TTT1.png" class="games"> </a>
                            </div>
                        </div>
                        <br><br>
                        <div class="row">
                            <div class="col-4">
                                <a href="games/vortex.html"><img src="css/images/games/Vortex1.png" class="games"> </a>
                            </div>
                             <div class="col-4">
                                <a href="games/chess.html"><img src="css/images/games/chess1.png" class="games"> </a>
                            </div>
                            <div class="col-4">
                                <a href="games/mini.html"><img src="css/images/games/mini_battles.png" class="games"> </a>
                            </div>
                        </div>
                        <br><br>
                        <div class="row">
                            <div class="col-4">
                                <a href="games/btlf.html"><img src="css/images/games/BottleFlip1.png" class="games"> </a>
                            </div>
                   </div>
               </div>
           </div>
        </div>
    </section>  
    <br><br>
    
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
                                <li><a href="myprofile.jsp">Your profile</a></li>
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
</body>
</html>