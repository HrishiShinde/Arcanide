package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <!--Links-->\n");
      out.write("        <link rel=\"stylesheet\" href=\"Bootstrap4/bootstrap-4.5.0-dist/css/bootstrap.css\" type=\"text/css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/animate.css/4.0.0/animate.min.css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"Bootstrap4/bootstrap-4.5.0-dist/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"Bootstrap4/bootstrap-social/bootstrap-social.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"Bootstrap4/font-awesome/css/font-awesome.min.css\">\n");
      out.write("        \n");
      out.write("            <!-- Fonts -->\n");
      out.write("            <link href=\"https://fonts.googleapis.com/css2?family=Dosis:wght@500&family=Quicksand:wght@700&display=swap\" rel=\"stylesheet\">\n");
      out.write("            <link href=\"https://fonts.googleapis.com/css?family=Quicksand&display=swap\" rel=\"stylesheet\">\n");
      out.write("            <link href=\"https://fonts.googleapis.com/css2?family=Quicksand:wght@700&display=swap\" rel=\"stylesheet\">\n");
      out.write("            <link href=\"https://fonts.googleapis.com/css2?family=Luckiest+Guy&display=swap\" rel=\"stylesheet\">\n");
      out.write("            <!-- ~~~~ -->\n");
      out.write("        \n");
      out.write("        <link rel=\"stylesheet\" href=\"css/home.css\">\n");
      out.write("        \n");
      out.write("\n");
      out.write("        <!--#####-->\n");
      out.write("        \n");
      out.write("        <title>Arcanide</title>\n");
      out.write("        \n");
      out.write("        <style>\n");
      out.write("            .parallax{\n");
      out.write("                    background-image: url(css/parallax6.jpg);\n");
      out.write("                    background-attachment: fixed;\n");
      out.write("                    background-position: center;\n");
      out.write("                    background-repeat: no-repeat;\n");
      out.write("                    height: 300px;\n");
      out.write("                    }\n");
      out.write("                    .text{\n");
      out.write("                        font-weight: bold;\n");
      out.write("                        text-transform: uppercase;\n");
      out.write("                        color: floralwhite;             \n");
      out.write("                    }        \n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <!--NAVBAR and Log+signup-->\n");
      out.write("        <!--Navbar-->\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-light\" style=\"background-color: transparent\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("               <a class=\"navbar-brand text-light\" href=\"#\" id=\"nav-name\">~ARCANIDE~</a>\n");
      out.write("                    <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                        <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                </button>\n");
      out.write("\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("                    <ul class=\"navbar-nav ml-auto\">\n");
      out.write("                        <li class=\"nav-item active\">\n");
      out.write("                            <a class=\"nav-link text-light\" href=\"#\">Home</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link text-light\" href=\"games.jsp\">Categories</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link text-light\" href=\"tournaments.jsp\">Tournaments</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link text-light\" href=\"#\">About</a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                    <span class=\"navbar-text ml-5\" id=\"loginBTN\">\n");
      out.write("                        <a id=\"logg\" data-toggle=\"modal\" data-target=\"#LoginModal\">\n");
      out.write("                            <span class=\"fa fa-sign-in\"></span> Login\n");
      out.write("                        </a>    \n");
      out.write("                    </span>\n");
      out.write("                </div> \n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        <!--~~~~~-->\n");
      out.write("        \n");
      out.write("        <!--LoginMODAL-->\n");
      out.write("        <div class=\"modal fade\" id=\"LoginModal\" data-backdrop=\"static\" data-keyboard=\"false\" tabindex=\"-1\" aria-labelledby=\"staticBackdropLabel\" aria-hidden=\"true\">\n");
      out.write("            <div class=\"modal-dialog border border-light rounded-sm\">\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    <div class=\"modal-header\">\n");
      out.write("                        <h5 class=\"modal-title offset-5\" id=\"loghead\">Login</h5>\n");
      out.write("                        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("                            <span aria-hidden=\"true\" id=\"cross\" style=\"color: floralwhite\">&times;</span>\n");
      out.write("                        </button>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-body\">\n");
      out.write("                        <form action=\"login\" method=\"POST\">\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                \n");
      out.write("                                <label for=\"exampleInputEmail1\" id=\"email\" class=\"clr\">Email address</label>\n");
      out.write("                                <input type=\"email\" class=\"form-control\" name=\"email\" id=\"email\" aria-describedby=\"emailHelp\" required>\n");
      out.write("                                <small id=\"emailHelp\" class=\"form-text text-muted\">We'll never share your email with anyone else.</small>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"exampleInputPassword1\" id=\"pass\" class=\"clr\">Password</label>\n");
      out.write("                                <input type=\"password\" class=\"form-control\" name=\"pass\" id=\"pass\" required>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group form-check\">\n");
      out.write("                                <input type=\"checkbox\" class=\"form-check-input\" id=\"exampleCheck1\">\n");
      out.write("                                <label class=\"form-check-label clr\" for=\"exampleCheck1\" id=\"rem\">Remember Me!</label>\n");
      out.write("                                \n");
      out.write("                                <a class=\"offset-4\" data-toggle=\"modal\" data-target=\"#SignupModal\" id=\"signupp\">Not a member?? SignUP</a>\n");
      out.write("                            </div>\n");
      out.write("                            <button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\">Close</button>\n");
      out.write("                            <input type=\"submit\" class=\"btn btn-primary\" value=\"Login\"></input>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!--~~~~~-->\n");
      out.write("        \n");
      out.write("        <!--SignupMODAL-->\n");
      out.write("        <div class=\"modal fade\" id=\"SignupModal\" data-backdrop=\"static\" data-keyboard=\"false\" tabindex=\"-1\" aria-labelledby=\"staticBackdropLabel\" aria-hidden=\"true\">\n");
      out.write("            <div class=\"modal-dialog border border-light rounded-sm\">\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    <div class=\"modal-header\">\n");
      out.write("                        <h5 class=\"modal-title offset-5\" id=\"loghead\">SignUp</h5>\n");
      out.write("                        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("                            <span aria-hidden=\"true\" id=\"cross\" style=\"color: floralwhite\">&times;</span>\n");
      out.write("                        </button>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-body\">\n");
      out.write("                        <form>\n");
      out.write("                            <div class=\"form-row\">\n");
      out.write("                                <div class=\"form-group col-md-6\">\n");
      out.write("                                    <label for=\"inputFirstname\" class=\"clr\">Firstname</label>\n");
      out.write("                                    <input type=\"email\" class=\"form-control\" id=\"inputFirstname\" required>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group col-md-6\">\n");
      out.write("                                    <label for=\"inputLastname\" class=\"clr\">Lastname</label>\n");
      out.write("                                    <input type=\"password\" class=\"form-control\" id=\"inputLastname\" required>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"inputUsername\" class=\"clr\">Username</label>\n");
      out.write("                                <input type=\"text\" class=\"form-control\" id=\"inputUsername\" required>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"inputAddress2\" class=\"clr\">Email</label>\n");
      out.write("                                <input type=\"text\" class=\"form-control\" id=\"inputAddress2\" placeholder=\"abc@email.com\" required>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"inputPhone\" class=\"clr\">Phone</label>\n");
      out.write("                                <input type=\"text\" class=\"form-control\" id=\"inputPhone\" required>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-row\">\n");
      out.write("                                <div class=\"form-group col-md-6\">\n");
      out.write("                                    <label for=\"inputPassword\" class=\"clr\">Password</label>\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" id=\"inputPassword\" required>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group col-md-6\">\n");
      out.write("                                    <label for=\"inputConfPass\" class=\"clr\">Confirm Password</label>\n");
      out.write("                                    <input type=\"password\" class=\"form-control\" id=\"inputConfPass\" required>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <div class=\"form-check\">\n");
      out.write("                                    <input class=\"form-check-input\" type=\"checkbox\" id=\"gridCheck\">\n");
      out.write("                                    <label class=\"form-check-label clr\" for=\"gridCheck\">\n");
      out.write("                                        I agree All the terms and conditions\n");
      out.write("                                    </label>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <button type=\"submit\" class=\"btn btn-primary\">Sign in</button>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!--~~~~~-->\n");
      out.write("    <!--~~~~~-->\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    <!--Carousel-->\n");
      out.write("        <div id=\"carouselExampleCaptions\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("            <ol class=\"carousel-indicators\">\n");
      out.write("                <li data-target=\"#carouselExampleCaptions\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("                <li data-target=\"#carouselExampleCaptions\" data-slide-to=\"1\"></li>\n");
      out.write("                <li data-target=\"#carouselExampleCaptions\" data-slide-to=\"2\"></li>\n");
      out.write("            </ol>\n");
      out.write("            <div class=\"carousel-inner\">\n");
      out.write("                <div class=\"carousel-item active\">\n");
      out.write("                    <img src=\"css/images/3.jpg\" class=\"d-block w-100\" alt=\"...\">\n");
      out.write("                    <div class=\"carousel-caption d-none d-md-block\">\n");
      out.write("                        <h5 class=\"animate slideInRight\" style=\"animation-delay: 1s\">PLAY Games here!</h5>\n");
      out.write("                        <p class=\"animate slideInRight\" style=\"animation-delay: 2s\">Some browser games to play online</p>\n");
      out.write("                        <a href=\"\" class=\"animate slideInRight\" style=\"animation-delay: 3s\">Play now!</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"carousel-item\">\n");
      out.write("                    <img src=\"css/images/2.jpg\" class=\"d-block w-100\" alt=\"...\">\n");
      out.write("                    <div class=\"carousel-caption d-none d-md-block\">\n");
      out.write("                        <h5 class=\"\" style=\"animation-delay: 1s\">Host Or Join any Tournaments</h5>\n");
      out.write("                        <p class=\"\" style=\"animation-delay: 2s\">Play Esports And Improve Your skills.</p>\n");
      out.write("                        <a href=\"\" class=\"\" style=\"animation-delay: 3s\">Host or Join now!</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"carousel-item\">\n");
      out.write("                    <img src=\"css/images/1.jpg\" class=\"d-block w-100\" alt=\"...\">\n");
      out.write("                    <div class=\"carousel-caption d-none d-md-block\">\n");
      out.write("                        <h5 class=\"\" style=\"animation-delay: 1s\">Are you an game developer?</h5>\n");
      out.write("                        <p class=\"\" style=\"animation-delay: 2s\">Upload your games for FREE!</p>\n");
      out.write("                        <a href=\"\" class=\"\" style=\"animation-delay: 3s\">Upload now!</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <a class=\"carousel-control-prev\" href=\"#carouselExampleCaptions\" role=\"button\" data-slide=\"prev\">\n");
      out.write("                <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\n");
      out.write("                <span class=\"sr-only\">Previous</span>\n");
      out.write("            </a>\n");
      out.write("            <a class=\"carousel-control-next\" href=\"#carouselExampleCaptions\" role=\"button\" data-slide=\"next\">\n");
      out.write("                <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\n");
      out.write("                <span class=\"sr-only\">Next</span>\n");
      out.write("            </a>\n");
      out.write("        </div>\n");
      out.write("    <!--~~~~~-->\n");
      out.write("        <br><br><br>\n");
      out.write("        \n");
      out.write("    <!--GameCards-->\n");
      out.write("        <section class=\"section-1\">\n");
      out.write("        <div class=\"col d-flex justify-content-center\">\n");
      out.write("            <div class=\"card border border-secondary w-75\">\n");
      out.write("                <div class=\"card-header cardhedbg\">\n");
      out.write("                    <h3 id=\"Hedding\">Choose a Game</h3>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"card-body cardbodbg\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-2\">\n");
      out.write("                                <a href=\"games/btsa.html\"><img src=\"css/images/games/Battleship2.jpg\" class=\"games\"> </a>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-2\">\n");
      out.write("                                <a href=\"games/cricket.php\"><img src=\"css/images/games/Cricket1.jpg\" class=\"games\"> </a>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-2\">\n");
      out.write("                                <a href=\"games/ttt.html\"><img src=\"css/images/games/TTT1.jpg\" class=\"games\"> </a>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-2\">\n");
      out.write("                                <a href=\"games/btlf.html\"><img src=\"css/images/games/BottleFlip1.jpg\" class=\"games\"> </a>\n");
      out.write("                            </div>\n");
      out.write("                             <div class=\"col-2\">\n");
      out.write("                                <a href=\"games/vortex.html\"><img src=\"css/images/games/Vortex1.jpg\" class=\"games\"> </a>\n");
      out.write("                            </div>\n");
      out.write("                             <div class=\"col-2\">\n");
      out.write("                                <a href=\"games/chess.html\"><img src=\"css/images/games/chess1.jpg\" class=\"games\"> </a>\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                        </div>\n");
      out.write("                   </div>\n");
      out.write("               </div>\n");
      out.write("           </div>\n");
      out.write("        </div>\n");
      out.write("            \n");
      out.write("        </section>\n");
      out.write("    <!--~~~~~-->\n");
      out.write("        \n");
      out.write("        <br><br><br>\n");
      out.write("    <!--ParallaxCards-->\n");
      out.write("        <section class=\"section-3\">\n");
      out.write("            <div class=\"card\" style=\"border: none\">\n");
      out.write("                <!--\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                    <h5 class=\"card-title\">Card title</h5>\n");
      out.write("                    <p class=\"card-text\">This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>\n");
      out.write("                    <p class=\"card-text\"><small class=\"text-muted\">Last updated 3 mins ago</small></p>\n");
      out.write("                </div>\n");
      out.write("                -->\n");
      out.write("                    <span class=\"parallax\">\n");
      out.write("                        <div class=\"container\">\n");
      out.write("                            <div class=\"text text-center\">\n");
      out.write("                            <br><br><br><br><br>\n");
      out.write("                                Tournaments\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </span>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("    <!--~~~~~-->    \n");
      out.write("    <br><br><br>\n");
      out.write("\n");
      out.write("    <!--TournaCards-->\n");
      out.write("        <section class=\"section-2\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    \n");
      out.write("                    <div class=\"col-md-4\">\n");
      out.write("                        <div class=\"card text-center\" style=\"width: 18rem;\">\n");
      out.write("                            <img src=\"css/images/tournaments/PUBG1.jpg\" class=\"card-img-top\" alt=\"...\">\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("                                <h5 class=\"card-title\">Pubg Tournaments</h5>\n");
      out.write("                                <p class=\"card-text\">Join or Host Pubg Tournaments.</p>\n");
      out.write("                                <a href=\"#\" class=\"btn btn-primary go\">GO</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <div class=\"col-md-4\">\n");
      out.write("                        <div class=\"card text-center\" style=\"width: 18rem;\">\n");
      out.write("                            <img src=\"css/images/tournaments/Valorant1.jpg\" class=\"card-img-top\" alt=\"...\">\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("                                <h5 class=\"card-title\">Valorant tournaments</h5>\n");
      out.write("                                <p class=\"card-text\">Join or Host Valorant Tournaments.</p>\n");
      out.write("                                <a href=\"#\" class=\"btn btn-primary\">Go</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <div class=\"col-md-4\">\n");
      out.write("                        <div class=\"card text-center\" style=\"width: 18rem;\">\n");
      out.write("                            <img src=\"css/images/tournaments/COD1.jpg\" class=\"card-img-top\" alt=\"...\">\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("                                <h5 class=\"card-title\">COD tournaments</h5>\n");
      out.write("                                <p class=\"card-text\">Join or Host COD Tournaments.</p>\n");
      out.write("                                <a href=\"#\" class=\"btn btn-primary\">Go</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("    <!--~~~~~-->\n");
      out.write("    <br><br><br>\n");
      out.write("        \n");
      out.write("    \n");
      out.write("        \n");
      out.write("    <!-- -->\n");
      out.write("        <section class=\"section-4\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col\">\n");
      out.write("                        <h5>That's it for today :)</h5>\n");
      out.write("                        <h5>That's it for today :)</h5>\n");
      out.write("                        <h5>That's it for today :)</h5>\n");
      out.write("                        <h5>That's it for today :)</h5>\n");
      out.write("                        <h5>That's it for today :)</h5>\n");
      out.write("                        <h5>That's it for today :)</h5>\n");
      out.write("                        <h5>That's it for today :)</h5>\n");
      out.write("                        <h5>That's it for today :)</h5>\n");
      out.write("                        <h5>That's it for today :)</h5>\n");
      out.write("                        <h5>That's it for today :)</h5>\n");
      out.write("                        <h5>That's it for today :)</h5>\n");
      out.write("                        <h5>That's it for today :)</h5>\n");
      out.write("                        <h5>That's it for today :)</h5>\n");
      out.write("                        <h5>That's it for today :)</h5>\n");
      out.write("                        <h5>That's it for today :)</h5>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("    <!--~~~~~-->\n");
      out.write("        \n");
      out.write("    <!--SCRIPTS-->\n");
      out.write("        <script src=\"Bootstrap4/bootstrap-4.5.0-dist/jquery/dist/jquery.slim.min.js\"></script>\n");
      out.write("        <script src=\"Bootstrap4/bootstrap-4.5.0-dist/popper.js/dist/popper.min.js\"></script>\n");
      out.write("        <script src=\"Bootstrap4/bootstrap-4.5.0-dist/js/bootstrap.min.js\"></script>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    <!--~~~~~-->\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
