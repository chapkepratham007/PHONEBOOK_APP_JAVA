/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.99
 * Generated at: 2024-03-18 16:37:32 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.entity.User;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/component/footer.jsp", Long.valueOf(1710779539358L));
    _jspx_dependants.put("/component/allCss.jsp", Long.valueOf(1688882472000L));
    _jspx_dependants.put("/component/navbar.jsp", Long.valueOf(1689506152000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(3);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.LinkedHashSet<>(1);
    _jspx_imports_classes.add("com.entity.User");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css\"\r\n");
      out.write("	integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\"\r\n");
      out.write("	crossorigin=\"anonymous\">\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\"\r\n");
      out.write("	integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\"\r\n");
      out.write("	crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js\"\r\n");
      out.write("	integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\"\r\n");
      out.write("	crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js\"\r\n");
      out.write("	integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\"\r\n");
      out.write("	crossorigin=\"anonymous\"></script>\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css\"\r\n");
      out.write("	integrity=\"sha512-iecdLmaskl7CVkqkXNQ/ZH/XLlvWZOJyj7Yy7tcenmpD1ypASozpmT/E0iPtmFIB46ZmdtAc9eNBvH0H/ZpiBw==\"\r\n");
      out.write("	crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\r\n");
      out.write("	\r\n");
      out.write("	<link rel=\"stylesheet\" href=\"style.css\">");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\"background-color:#7d7a7a;\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<nav class=\"navbar navbar-expand-lg navbar-dark bg-primary\">\r\n");
      out.write("	<a class=\"navbar-brand\" href=\"index.jsp\"><i\r\n");
      out.write("		class=\"fa-sharp fa-solid fa-phone\"></i> Phone Book</a>\r\n");
      out.write("	<button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\"\r\n");
      out.write("		data-target=\"#navbarSupportedContent\"\r\n");
      out.write("		aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\"\r\n");
      out.write("		aria-label=\"Toggle navigation\">\r\n");
      out.write("		<span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("	</button>\r\n");
      out.write("\r\n");
      out.write("	<div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
      out.write("		<ul class=\"navbar-nav mr-auto\">\r\n");
      out.write("			<li class=\"nav-item active\"><a class=\"nav-link\" href=\"index.jsp\"><i\r\n");
      out.write("					class=\"fa-solid fa-house-user\"></i> Home <span class=\"sr-only\">(current)</span></a>\r\n");
      out.write("			</li>\r\n");
      out.write("			<li class=\"nav-item active\"><a class=\"nav-link\"\r\n");
      out.write("				href=\"addContact.jsp\"><i class=\"fa-solid fa-plus\"></i> Add Phone\r\n");
      out.write("					No</a></li>\r\n");
      out.write("\r\n");
      out.write("			<li class=\"nav-item active\"><a class=\"nav-link\"\r\n");
      out.write("				href=\"viewContact.jsp\"><i class=\"fa-solid fa-eye\"></i> View\r\n");
      out.write("					Contact</a></li>\r\n");
      out.write("		</ul>\r\n");
      out.write("		");

		User user = (User) session.getAttribute("user");

		if (user == null) {
		
      out.write("\r\n");
      out.write("		<form class=\"form-inline my-2 my-lg-0\">\r\n");
      out.write("			<a href=\"login.jsp\" class=\"btn btn-success\"><i\r\n");
      out.write("				class=\"fa-sharp fa-solid fa-right-to-bracket\"></i> Login</a> <a\r\n");
      out.write("				href=\"register.jsp\" class=\"btn btn-danger ml-2\"><i\r\n");
      out.write("				class=\"fa-solid fa-user-plus\"></i> Register</a>\r\n");
      out.write("		</form>\r\n");
      out.write("		");

		} else {
		
      out.write("\r\n");
      out.write("		<form class=\"form-inline my-2 my-lg-0\">\r\n");
      out.write("			<button class=\"btn btn-success\">");
      out.print(user.getName());
      out.write("</button>\r\n");
      out.write("			<a data-toggle=\"modal\" data-target=\"#exampleModalCenter\"\r\n");
      out.write("				class=\"btn btn-danger ml-2 text-white\">Logout</a>\r\n");
      out.write("		</form>\r\n");
      out.write("		");

		}
		
      out.write("\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("	<!-- Logout popup -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<!-- Modal -->\r\n");
      out.write("	<div class=\"modal fade\" id=\"exampleModalCenter\" tabindex=\"-1\"\r\n");
      out.write("		role=\"dialog\" aria-labelledby=\"exampleModalCenterTitle\"\r\n");
      out.write("		aria-hidden=\"true\">\r\n");
      out.write("		<div class=\"modal-dialog modal-dialog-centered\" role=\"document\">\r\n");
      out.write("			<div class=\"modal-content\">\r\n");
      out.write("				<div class=\"modal-header\">\r\n");
      out.write("					<h5 class=\"modal-title\" id=\"exampleModalLongTitle\">Logout</h5>\r\n");
      out.write("					<button type=\"button\" class=\"close\" data-dismiss=\"modal\"\r\n");
      out.write("						aria-label=\"Close\">\r\n");
      out.write("						<span aria-hidden=\"true\">&times;</span>\r\n");
      out.write("					</button>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"modal-body text-center\">\r\n");
      out.write("				<h6>Do you want to Logout?</h6>\r\n");
      out.write("				<button type=\"button\" class=\"btn btn-secondary\"\r\n");
      out.write("						data-dismiss=\"modal\">Cancel</button>\r\n");
      out.write("					<a href=\"logout\" class=\"btn btn-primary\">Logout</a>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"modal-footer\">\r\n");
      out.write("					\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("	<!-- Logout popup -->\r\n");
      out.write("</nav>");
      out.write("\r\n");
      out.write("<div class=\"container-fluid\">\r\n");
      out.write("<div class=\"row p-2\">\r\n");
      out.write("<div class=\"col-md-4 offset-md-4\">\r\n");
      out.write("<div class=\"card\">\r\n");
      out.write("<div class=\"card-body\">\r\n");
      out.write("<h4 class=\"text-center text-success\">Login Page</h4>\r\n");

String invalidMsg=(String)session.getAttribute("invalidMsg");
if(invalidMsg!=null)
{
      out.write("\r\n");
      out.write("<p class=\"text-danger text-center\">");
      out.print( invalidMsg );
      out.write("</p>\r\n");
 
session.removeAttribute("invalidMsg")	;
}

      out.write("\r\n");
      out.write("\r\n");

String logMsg=(String)session.getAttribute("logMsg");
if(logMsg!=null)
{
      out.write("\r\n");
      out.write("<p class=\"text-success text-center\">");
      out.print( logMsg );
      out.write("</p>\r\n");
 
session.removeAttribute("logMsg")	;
}

      out.write("\r\n");
      out.write("<form action=\"login\" method=\"post\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  <div class=\"form-group\">\r\n");
      out.write("    <label for=\"exampleInputEmail1\">Email address</label>\r\n");
      out.write("    <input type=\"email\" name=\"email\" class=\"form-control\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\">\r\n");
      out.write("   \r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"form-group\">\r\n");
      out.write("    <label for=\"exampleInputPassword1\">Password</label>\r\n");
      out.write("    <input type=\"password\" name=\"password\" class=\"form-control\" id=\"exampleInputPassword1\">\r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write("  <div class=\"text-center mt-2\">\r\n");
      out.write("  <button type=\"submit\" class=\"btn btn-primary\">Login</button>\r\n");
      out.write("  </div>\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div style=\"margin-top:300px\">\r\n");
      out.write("<div class=\"container-fluid bg-primary p-2\">\r\n");
      out.write("<h5 class=\"text-white text-center\">Developed and designed by Pratham</h5>\r\n");
      out.write("</div>");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
