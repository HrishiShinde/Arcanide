package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class myprofile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
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
      out.write("        <link rel=\"stylesheet\" href=\"css/newprofile.css\">\n");
      out.write("        <script src=\"https://unpkg.com/feather-icons\"></script>\n");
      out.write("\n");
      out.write("        <!--#####-->\n");
      out.write("        \n");
      out.write("        <title>Arcanide</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <!--NAVBAR and Log+signup-->\n");
      out.write("        <!--Navbar-->\n");
      out.write("        \n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-light\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("               <a class=\"navbar-brand text-light\" href=\"#\" id=\"nav-name\">~ARCANIDE~</a>\n");
      out.write("                <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                </button>\n");
      out.write("\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("                    <ul class=\"navbar-nav ml-auto\">\n");
      out.write("                        <li class=\"nav-item active\">\n");
      out.write("                            <a class=\"nav-link text-light\" href=\"home.jsp\">Home</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link text-light\" href=\"games.jsp\">Categories</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link text-light\" href=\"tournaments.jsp\">Tournaments</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link text-light\" href=\"#\">My Profile</a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div> \n");
      out.write("                    \n");
      out.write("                    ");

                    if (session.getAttribute("user") == null){
                    
      out.write("\n");
      out.write("                    <!-- if not logged in -->\n");
      out.write("                    <span class=\"navbar-text ml-5\" id=\"loginBTN\">\n");
      out.write("                        <a id=\"logg\" class=\"log\" href=\"#LoginModal\" data-toggle=\"modal\" data-target=\"#LoginModal\">\n");
      out.write("                            <span class=\"fa fa-sign-in\"></span> Login\n");
      out.write("                        </a>\n");
      out.write("                    </span>\n");
      out.write("                    <!--ooooooo -->\n");
      out.write("                    ");

                    } else if (session.getAttribute("user") != null){
                    
      out.write("\n");
      out.write("                    <!-- if logged in -->\n");
      out.write("                    <span class=\"navbar-text ml-5\" id=\"loginBTN\">\n");
      out.write("                        <a id=\"logg\" class=\"log\" href=\"#\">\n");
      out.write("                            <span class=\"fa fa-user-circle-o\"></span> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("                        </a>    \n");
      out.write("                        <a id=\"logout\" class=\"log\" href=\"logout\" >\n");
      out.write("                            <span class=\"fa fa-sign-out\"></span> Logout\n");
      out.write("                        </a> \n");
      out.write("                    </span>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                    <!--ooooooo-->\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        \n");
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
      out.write("                                <input type=\"text\" class=\"form-control\" name=\"email\" id=\"email\" aria-describedby=\"emailHelp\" required>\n");
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
      out.write("                        <form action=\"register\" method=\"POST\" id=\"form\">\n");
      out.write("                            <div class=\"form-row\">\n");
      out.write("                                <div class=\"form-group col-md-6\">\n");
      out.write("                                    <label for=\"Firstname\" class=\"clr\">Firstname</label>\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" id=\"Firstname\" name=\"Firstname\" required>\n");
      out.write("                                    <i class=\"fa fa-check-circle\"></i>\n");
      out.write("                                    <i class=\"fa fa-exclamation-circle\"></i>\n");
      out.write("                                    <small>Error message</small>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group col-md-6\">\n");
      out.write("                                    <label for=\"Lastname\" class=\"clr\">Lastname</label>\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" id=\"Lastname\" name=\"Lastname\" required>\n");
      out.write("                                    <i class=\"fa fa-check-circle\"></i>\n");
      out.write("                                    <i class=\"fa fa-exclamation-circle\"></i>\n");
      out.write("                                    <small>Error message</small>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-row\">\n");
      out.write("                                <div class=\"form-group col-md-12\">\n");
      out.write("                                    <label for=\"Username\" class=\"clr\">Username</label>\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" id=\"Username\" name=\"Username\" required>\n");
      out.write("                                    <i class=\"fa fa-check-circle\"></i>\n");
      out.write("                                    <i class=\"fa fa-exclamation-circle\"></i>\n");
      out.write("                                    <small>Error message</small>\n");
      out.write("                                </div> \n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-row\">\n");
      out.write("                                <div class=\"form-group col-md-12\">\n");
      out.write("                                    <label for=\"Address2\" class=\"clr\">Email</label>\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" id=\"Email\" name=\"Email\" placeholder=\"abc@email.com\" required>\n");
      out.write("                                    <i class=\"fa fa-check-circle\"></i>\n");
      out.write("                                    <i class=\"fa fa-exclamation-circle\"></i>\n");
      out.write("                                    <small>Error message</small>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-row\">\n");
      out.write("                                <div class=\"form-group col-md-12\">\n");
      out.write("                                    <label for=\"Phone\" class=\"clr\">Phone</label>\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" id=\"Phone\" name=\"Phone\" required>\n");
      out.write("                                    <i class=\"fa fa-check-circle\"></i>\n");
      out.write("                                    <i class=\"fa fa-exclamation-circle\"></i>\n");
      out.write("                                    <small>Error message</small>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-row\">\n");
      out.write("                                <div class=\"form-group col-md-6\">\n");
      out.write("                                    <label for=\"Password\" class=\"clr\">Password</label>\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" id=\"Password\" name=\"Password\" required>\n");
      out.write("                                    <i class=\"fa fa-check-circle\"></i>\n");
      out.write("                                    <i class=\"fa fa-exclamation-circle\"></i>\n");
      out.write("                                    <small>Error message</small>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group col-md-6\">\n");
      out.write("                                    <label for=\"ConfPass\" class=\"clr\">Confirm Password</label>\n");
      out.write("                                    <input type=\"password\" class=\"form-control\" id=\"ConfPass\" name=\"ConfPass\" required>\n");
      out.write("                                    <i class=\"fa fa-check-circle\"></i>\n");
      out.write("                                    <i class=\"fa fa-exclamation-circle\"></i>\n");
      out.write("                                    <small>Error message</small>\n");
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
      out.write("                            <button type=\"submit\" class=\"btn btn-primary\" id=\"submit\" onclick=\"checkInputs()\" >Sign in</button>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!--~~~~~-->\n");
      out.write("    <!--~~~~~-->\n");
      out.write("    \n");
      out.write("    <!--LoginMODAL-->\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <div class=\"container-fluid\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("    <nav id=\"sidebarMenu\" class=\"col-md-3 col-lg-2 d-md-block bg-light sidebar collapse\">\n");
      out.write("      <div class=\"sidebar-sticky pt-3\">\n");
      out.write("        <ul class=\"nav flex-column\">\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link\" href=\"#\">\n");
      out.write("              <span class=\"fa fa-user\"></span> Profile\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link\" href=\"#\">\n");
      out.write("              <span class=\"fa fa-shield\"></span> Your tournaments\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link\" href=\"#\">\n");
      out.write("                <span class=\"fa fa-gamepad\"></span> Tournaments joined\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("    </nav>\n");
      out.write("    </div></div>\n");
      out.write("    \n");
      out.write("    <!--~~~~~-->\n");
      out.write("     data-feather=\"user\" \n");
      out.write("     data-feather=\"shopping-cart\"\n");
      out.write("     data-feather=\"shield\" \n");
      out.write("     <script>\n");
      out.write("      feather.replace()\n");
      out.write("    </script>\n");
      out.write("    \n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
