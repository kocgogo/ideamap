/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.65
 * Generated at: 2015-12-09 10:30:35 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
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

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"EUC-KR\">\r\n");
      out.write("<title>TEST</title>\r\n");
      out.write("<style>\r\n");
      out.write("body {\r\n");
      out.write("   background-color: white;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/*********************************************************************************/\r\n");
      out.write("/* header                                                                          */\r\n");
      out.write("/*********************************************************************************/\r\n");
      out.write("#header {\r\n");
      out.write("   position: relative;\r\n");
      out.write("   background-color: #91D8f7;\r\n");
      out.write("   color: white;\r\n");
      out.write("   width: auto;\r\n");
      out.write("   height: 11em;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/*********************************************************************************/\r\n");
      out.write("/* main                                                                          */\r\n");
      out.write("/*********************************************************************************/\r\n");
      out.write("#main {\r\n");
      out.write("   position: relative;\r\n");
      out.write("   /* margin: 0 auto; */\r\n");
      out.write("   background-color: white;\r\n");
      out.write("   width: auto;\r\n");
      out.write("   min-height: 500px;\r\n");
      out.write("   /* overflow: scroll; */\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#contents {\r\n");
      out.write("   float: left;\r\n");
      out.write("   position: relative;\r\n");
      out.write("   min-height: 500px;\r\n");
      out.write("   width: 100%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/*********************************************************************************/\r\n");
      out.write("/* center                                                                          */\r\n");
      out.write("/*********************************************************************************/\r\n");
      out.write("#center {\r\n");
      out.write("   position: relative;\r\n");
      out.write("   float: left;\r\n");
      out.write("   left: 0;\r\n");
      out.write("   width: 84%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/*********************************************************************************/\r\n");
      out.write("/* aside                                                                          */\r\n");
      out.write("/*********************************************************************************/\r\n");
      out.write("#right {\r\n");
      out.write("   position: relative;\r\n");
      out.write("   float: right;\r\n");
      out.write("   width: 15%;\r\n");
      out.write("   right: 0;\r\n");
      out.write("   margin-top: 21.440px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/*********************************************************************************/\r\n");
      out.write("/* bottom                                                                          */\r\n");
      out.write("/*********************************************************************************/\r\n");
      out.write("#bottom {\r\n");
      out.write("   position: relative;\r\n");
      out.write("   float: left;\r\n");
      out.write("   margin: 0 auto;\r\n");
      out.write("   background-color: #3A3A3A;\r\n");
      out.write("   width: 100%;\r\n");
      out.write("   height: 8em;\r\n");
      out.write("   margin-top: 50px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/*********************************************************************************/\r\n");
      out.write("/* banner                                                                          */\r\n");
      out.write("/*********************************************************************************/\r\n");
      out.write("#banner {\r\n");
      out.write("   /* height: 13em; */\r\n");
      out.write("   position: relative;\r\n");
      out.write("   background-size: cover;\r\n");
      out.write("   color: #fff;\r\n");
      out.write("}\r\n");
      out.write("/*    #banner\r\n");
      out.write("   {\r\n");
      out.write("      padding: 5em 0em;\r\n");
      out.write("   } */\r\n");
      out.write("\r\n");
      out.write("/*    .homepage #banner\r\n");
      out.write("   {\r\n");
      out.write("      padding: 15em 0em;\r\n");
      out.write("   }\r\n");
      out.write(" */\r\n");
      out.write(".container {\r\n");
      out.write("   width: 1200px;\r\n");
      out.write("   margin-left: auto;\r\n");
      out.write("   margin-right: auto;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("   <!-- Header -->\r\n");
      out.write("   <div id=\"header\">");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, (java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${view.top}.jsp", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false), out, false);
      out.write("</div>\r\n");
      out.write("   <!--taglib prefix=\"s\" 를 추가하면 속성으로 등록한 view의 값을 쓸수있다   -->\r\n");
      out.write("   <!-- Header -->\r\n");
      out.write("   \r\n");
      out.write("   <!-- /Banner -->\r\n");
      out.write("   <div id=\"main\">\r\n");
      out.write("      <!-- Main -->\r\n");
      out.write("      <div class=\"container\">\r\n");
      out.write("         <!-- center -->\r\n");
      out.write("         <div id=\"contents\">\r\n");
      out.write("            <div id=\"center\">");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, (java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${view.center}.jsp", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false), out, false);
      out.write("</div>\r\n");
      out.write("            <!-- center -->\r\n");
      out.write("         </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <!-- Main -->\r\n");
      out.write("   </div>\r\n");
      out.write("   <!-- Footer -->\r\n");
      out.write("   <div id=\"bottom\">");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, (java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${view.bottom}.jsp", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false), out, false);
      out.write("</div>\r\n");
      out.write("   <!-- Footer -->\r\n");
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