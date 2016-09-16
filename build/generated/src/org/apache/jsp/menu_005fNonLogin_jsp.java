package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class menu_005fNonLogin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\r\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\">\r\n");
      out.write("<title>Untitled Document</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write(".style1 {color: #ffffff}\r\n");
      out.write("-->\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<table width=\"1000\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("  <!--DWLayoutTable-->\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td width=\"1000\" height=\"30\" align=\"center\" valign=\"bottom\"><table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" bgcolor=\"#FFFFFF\">\r\n");
      out.write("      <!--DWLayoutTable-->\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td width=\"1000\" height=\"30\" align=\"center\" valign=\"baseline\" bgcolor=\"#CCCCCC\">\r\n");
      out.write("          <div align=\"center\"><a href=\"landing_page.php\">\r\n");
      out.write("            <input type=\"image\" value=\"home\" src=\"/images/home.png\" width=\"120\" height=\"30\"></a>\r\n");
      out.write("            <span class=\"style1\">\r\n");
      out.write("              <input type=\"image\" value=\"go_to_school\" src=\"/images/goToSchool.png\" width=\"120\" height=\"30\">\r\n");
      out.write("              </span>\r\n");
      out.write("            <a href=\"#\">\r\n");
      out.write("              <input type=\"image\" value=\"register\" src=\"/images/register.png\" width=\"120\" height=\"30\">\r\n");
      out.write("\t\t\t  </a>\r\n");
      out.write("\t\t\t  \r\n");
      out.write("            <a href=\"login.php\">\r\n");
      out.write("              <input type=\"image\" value=\"login\" src=\"/images/login.png\" width=\"120\" height=\"30\" border=\"0\">\r\n");
      out.write("\t\t\t  </a>\r\n");
      out.write("            \r\n");
      out.write("            <input type=\"image\" value=\"about_us\" src=\"/images/aboutUs.png\" width=\"120\" height=\"30\">\r\n");
      out.write("            \r\n");
      out.write("            <input type=\"image\" value=\"contact\" src=\"/images/contact.png\" width=\"120\" height=\"30\">\r\n");
      out.write("            <!--Search Bar -->\r\n");
      out.write("            <input type=\"image\" src=\"/images/search.png\" value=\"search\" height=\"30\" width=\"120\">\r\n");
      out.write("            <!--LBS-->\r\n");
      out.write("            <!--LBE-->\r\n");
      out.write("          </div></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("    </table></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"20\">&nbsp;</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
