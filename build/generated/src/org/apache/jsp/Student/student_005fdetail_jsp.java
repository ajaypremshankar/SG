package org.apache.jsp.Student;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class student_005fdetail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.apache.jasper.runtime.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
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
      _jspx_resourceInjector = (org.apache.jasper.runtime.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\">\r\n");
      out.write("<title>Untitled Document</title>\r\n");
      out.write("<style>\r\n");
      out.write(".Name{\r\n");
      out.write("text-transform:uppercase;\r\n");
      out.write("color:#0033CC;\r\n");
      out.write("font-weight:bold;\r\n");
      out.write("font-size:large;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".Values{\r\n");
      out.write("color:#0000CC;\r\n");
      out.write("font-size:large;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<table width=\"800\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("  <!--DWLayoutTable-->\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td width=\"28\" height=\"13\"></td>\r\n");
      out.write("    <td width=\"30\"></td>\r\n");
      out.write("    <td width=\"90\"></td>\r\n");
      out.write("    <td width=\"15\"></td>\r\n");
      out.write("    <td width=\"120\"></td>\r\n");
      out.write("    <td width=\"40\"></td>\r\n");
      out.write("    <td width=\"20\"></td>\r\n");
      out.write("    <td width=\"265\"></td>\r\n");
      out.write("    <td width=\"87\"></td>\r\n");
      out.write("    <td width=\"105\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"29\"></td>\r\n");
      out.write("    <td colspan=\"2\" rowspan=\"2\" valign=\"top\"><table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("      <!--DWLayoutTable-->\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td width=\"119\" height=\"29\" valign=\"top\"><div align=\"center\" class=\"Name\">fname</div></td>\r\n");
      out.write("          <td width=\"1\"></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td height=\"1\"></td>\r\n");
      out.write("          <td></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("    </table></td>\r\n");
      out.write("    <td></td>\r\n");
      out.write("    <td valign=\"top\"><table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("      <!--DWLayoutTable-->\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td width=\"120\" height=\"29\" valign=\"top\"><div align=\"center\" class=\"Name\">lname</div></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("    </table></td>\r\n");
      out.write("    <td></td>\r\n");
      out.write("    <td></td>\r\n");
      out.write("    <td></td>\r\n");
      out.write("    <td></td>\r\n");
      out.write("    <td></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"1\"></td>\r\n");
      out.write("    <td></td>\r\n");
      out.write("    <td></td>\r\n");
      out.write("    <td></td>\r\n");
      out.write("    <td></td>\r\n");
      out.write("    <td></td>\r\n");
      out.write("    <td></td>\r\n");
      out.write("    <td></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  \r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"10\"></td>\r\n");
      out.write("    <td></td>\r\n");
      out.write("    <td></td>\r\n");
      out.write("    <td></td>\r\n");
      out.write("    <td></td>\r\n");
      out.write("    <td></td>\r\n");
      out.write("    <td></td>\r\n");
      out.write("    <td></td>\r\n");
      out.write("    <td></td>\r\n");
      out.write("    <td></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"24\"></td>\r\n");
      out.write("    <td></td>\r\n");
      out.write("    <td colspan=\"7\" valign=\"top\"><table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("      <!--DWLayoutTable-->\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td width=\"119\" height=\"24\" valign=\"top\"><div align=\"center\" class=\"Values\">Student</div></td>\r\n");
      out.write("          <td width=\"16\">&nbsp;</td>\r\n");
      out.write("          <td width=\"70\" valign=\"top\"><div align=\"center\">at</div></td>\r\n");
      out.write("          <td width=\"19\">&nbsp;</td>\r\n");
      out.write("          <td width=\"144\" valign=\"top\"><div align=\"center\" class=\"Values\">School_Name</div></td>\r\n");
      out.write("          <td width=\"22\">&nbsp;</td>\r\n");
      out.write("          <td width=\"70\" valign=\"top\"><div align=\"center\">from</div></td>\r\n");
      out.write("          <td width=\"35\">&nbsp;</td>\r\n");
      out.write("          <td width=\"120\" valign=\"top\"><div align=\"center\" class=\"Values\">City</div></td>\r\n");
      out.write("          <td width=\"22\">&nbsp;</td>\r\n");
      out.write("        </tr>\r\n");
      out.write("    </table></td>\r\n");
      out.write("    <td>&nbsp;</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"12\"></td>\r\n");
      out.write("    <td></td>\r\n");
      out.write("    <td></td>\r\n");
      out.write("    <td></td>\r\n");
      out.write("    <td></td>\r\n");
      out.write("    <td></td>\r\n");
      out.write("    <td></td>\r\n");
      out.write("    <td></td>\r\n");
      out.write("    <td></td>\r\n");
      out.write("    <td></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"25\"></td>\r\n");
      out.write("    <td></td>\r\n");
      out.write("    <td colspan=\"4\" valign=\"top\"><table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("      <!--DWLayoutTable-->\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td width=\"126\" height=\"25\" valign=\"top\"><div align=\"center\">Gender :</div></td>\r\n");
      out.write("        <td width=\"139\" valign=\"top\"><div align=\"center\" class=\"Values\">Sex</div></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </table></td>\r\n");
      out.write("    <td>&nbsp;</td>\r\n");
      out.write("    <td valign=\"top\"><table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("      <!--DWLayoutTable-->\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td width=\"135\" height=\"25\" valign=\"top\"><div align=\"center\">Born on </div></td>\r\n");
      out.write("        <td width=\"130\" valign=\"top\"><div align=\"center\" class=\"Values\">DOB</div></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </table></td>\r\n");
      out.write("    <td>&nbsp;</td>\r\n");
      out.write("    <td></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"36\"></td>\r\n");
      out.write("    <td></td>\r\n");
      out.write("    <td></td>\r\n");
      out.write("    <td></td>\r\n");
      out.write("    <td></td>\r\n");
      out.write("    <td></td>\r\n");
      out.write("    <td></td>\r\n");
      out.write("    <td></td>\r\n");
      out.write("    <td></td>\r\n");
      out.write("    <td></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
