package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class student_005finit_005fprofile_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\">\n");
      out.write("<title>Untitled Document</title>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("<table width=\"700\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" bgcolor=\"#FFFFCC\" align=\"center\">\n");
      out.write("  <!--DWLayoutTable-->\n");
      out.write("  <tr>\n");
      out.write("    <td width=\"161\" height=\"35\"></td>\n");
      out.write("    <td colspan=\"3\" valign=\"top\" style=\"text-align:center; color:#990033; border-style:dotted\"><font size=\"+2\">Fill Up Your Info:</font> </td>\n");
      out.write("    <td width=\"184\"></td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td height=\"17\"></td>\n");
      out.write("    <td width=\"94\"></td>\n");
      out.write("    <td width=\"160\"></td>\n");
      out.write("    <td width=\"101\"></td>\n");
      out.write("    <td></td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td height=\"158\">&nbsp;</td>\n");
      out.write("    <td colspan=\"3\" valign=\"top\"><table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" bgcolor=\"#CCCCCC\" style=\"border-style:outset; border-color:#FFFFFF\">\n");
      out.write("      <!--DWLayoutTable-->\n");
      out.write("      <tr>\n");
      out.write("        <td width=\"20\" height=\"30\">&nbsp;</td>\n");
      out.write("          <td width=\"139\" rowspan=\"5\" valign=\"top\"><table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" bgcolor=\"#FFFFFF\">\n");
      out.write("            <!--DWLayoutTable-->\n");
      out.write("            <tr>\n");
      out.write("              <td width=\"150\" height=\"150\">&nbsp;</td>\n");
      out.write("              </tr>\n");
      out.write("          </table></td>\n");
      out.write("          <td width=\"17\">&nbsp;</td>\n");
      out.write("          <td width=\"30\">&nbsp;</td>\n");
      out.write("          <td width=\"100\">&nbsp;</td>\n");
      out.write("          <td width=\"23\">&nbsp;</td>\n");
      out.write("          <td width=\"18\">&nbsp;</td>\n");
      out.write("        </tr>\n");
      out.write("      <tr>\n");
      out.write("        <td height=\"36\"></td>\n");
      out.write("          <td></td>\n");
      out.write("          <td colspan=\"3\" valign=\"top\"><div align=\"center\">\n");
      out.write("            <input name=\"file\" type=\"file\" size=\"5\">\n");
      out.write("          </div></td>\n");
      out.write("          <td>&nbsp;</td>\n");
      out.write("        </tr>\n");
      out.write("      <tr>\n");
      out.write("        <td height=\"15\"></td>\n");
      out.write("          <td></td>\n");
      out.write("          <td></td>\n");
      out.write("          <td></td>\n");
      out.write("          <td></td>\n");
      out.write("          <td></td>\n");
      out.write("        </tr>\n");
      out.write("      <tr>\n");
      out.write("        <td height=\"46\">&nbsp;</td>\n");
      out.write("          <td>&nbsp;</td>\n");
      out.write("          <td>&nbsp;</td>\n");
      out.write("          <td valign=\"top\"><input name=\"upload\" type=\"button\" id=\"upload\" value=\"upload\" style=\"width:100px; height:40px; cursor:pointer\"></td>\n");
      out.write("          <td>&nbsp;</td>\n");
      out.write("          <td>&nbsp;</td>\n");
      out.write("        </tr>\n");
      out.write("      <tr>\n");
      out.write("        <td height=\"23\">&nbsp;</td>\n");
      out.write("          <td>&nbsp;</td>\n");
      out.write("          <td>&nbsp;</td>\n");
      out.write("          <td>&nbsp;</td>\n");
      out.write("          <td>&nbsp;</td>\n");
      out.write("          <td>&nbsp;</td>\n");
      out.write("        </tr>\n");
      out.write("\n");
      out.write("    </table></td>\n");
      out.write("    <td>&nbsp;</td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td height=\"29\">&nbsp;</td>\n");
      out.write("    <td>&nbsp;</td>\n");
      out.write("    <td>&nbsp;</td>\n");
      out.write("    <td>&nbsp;</td>\n");
      out.write("    <td>&nbsp;</td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td height=\"99\">&nbsp;</td>\n");
      out.write("    <td colspan=\"3\" valign=\"top\"><table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" bgcolor=\"#CCCCCC\" style=\"border-style:outset\">\n");
      out.write("      <!--DWLayoutTable-->\n");
      out.write("      <tr>\n");
      out.write("        <td width=\"174\" height=\"5\"></td>\n");
      out.write("          <td width=\"173\"></td>\n");
      out.write("        </tr>\n");
      out.write("      <tr>\n");
      out.write("        <td height=\"32\" valign=\"top\"><div align=\"center\">Standard:\n");
      out.write("          <select name=\"select\">\n");
      out.write("            <option value=\"1\">I</option>\n");
      out.write("            <option value=\"2\">II</option>\n");
      out.write("            <option value=\"3\">III</option>\n");
      out.write("            <option value=\"4\">IV</option>\n");
      out.write("            <option value=\"5\">V</option>\n");
      out.write("            <option value=\"6\">VI</option>\n");
      out.write("            <option value=\"7\">VII</option>\n");
      out.write("            <option value=\"8\">VIII</option>\n");
      out.write("            <option value=\"9\">IX</option>\n");
      out.write("            <option value=\"10\">X</option>\n");
      out.write("            <option value=\"11\">XI</option>\n");
      out.write("            <option value=\"12\">XII</option>\n");
      out.write("              </select>\n");
      out.write("            <font color=\"#FF0000\" style=\"vertical-align:super\">*</font></div></td>\n");
      out.write("          <td valign=\"top\"><div align=\"center\">Section :\n");
      out.write("              <select name=\"select2\">\n");
      out.write("                <option value=\"A\">A</option>\n");
      out.write("                <option value=\"B\">B</option>\n");
      out.write("                <option value=\"C\">C</option>\n");
      out.write("                <option value=\"D\">D</option>\n");
      out.write("                <option value=\"E\">E</option>\n");
      out.write("                <option value=\"F\">F</option>\n");
      out.write("                </select>\n");
      out.write("              <font color=\"#FF0000\" style=\"vertical-align:super\">*</font>\n");
      out.write("                                                                      </div></td>\n");
      out.write("        </tr>\n");
      out.write("      <tr>\n");
      out.write("        <td height=\"17\"></td>\n");
      out.write("          <td></td>\n");
      out.write("        </tr>\n");
      out.write("      <tr>\n");
      out.write("        <td height=\"32\" colspan=\"2\" valign=\"top\"><table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\n");
      out.write("          <!--DWLayoutTable-->\n");
      out.write("          <tr>\n");
      out.write("            <td width=\"347\" height=\"32\" valign=\"top\"><div align=\"center\">\n");
      out.write("              <input name=\"parent_id\" type=\"text\" id=\"parent_id\" size=\"50\" placeholder=\"Parent's Email\">\n");
      out.write("              <font color=\"#FF0000\" style=\"vertical-align:super\">*</font>\n");
      out.write("              </div></td>\n");
      out.write("              </tr>\n");
      out.write("          </table></td>\n");
      out.write("        </tr>\n");
      out.write("      <tr>\n");
      out.write("        <td height=\"5\"></td>\n");
      out.write("          <td></td>\n");
      out.write("        </tr>\n");
      out.write("    </table></td>\n");
      out.write("    <td>&nbsp;</td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td height=\"30\">&nbsp;</td>\n");
      out.write("    <td>&nbsp;</td>\n");
      out.write("    <td>&nbsp;</td>\n");
      out.write("    <td>&nbsp;</td>\n");
      out.write("    <td>&nbsp;</td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td height=\"77\">&nbsp;</td>\n");
      out.write("    <td colspan=\"3\" valign=\"top\"><table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"1\" bgcolor=\"#CCCCCC\" style=\"border-style:outset\">\n");
      out.write("      <!--DWLayoutTable-->\n");
      out.write("      <tr>\n");
      out.write("        <td width=\"13\" height=\"19\">&nbsp;</td>\n");
      out.write("          <td width=\"162\">&nbsp;</td>\n");
      out.write("          <td width=\"160\">&nbsp;</td>\n");
      out.write("          <td width=\"20\">&nbsp;</td>\n");
      out.write("        </tr>\n");
      out.write("      <tr>\n");
      out.write("        <td height=\"23\">&nbsp;</td>\n");
      out.write("          <td valign=\"top\"><input name=\"city\" type=\"text\" id=\"city\" placeholder=\"Your City\"></td>\n");
      out.write("          <td valign=\"top\"><div align=\"right\">\n");
      out.write("            <input name=\"state\" type=\"text\" id=\"state\" placeholder=\"Your state\">\n");
      out.write("          </div></td>\n");
      out.write("          <td>&nbsp;</td>\n");
      out.write("        </tr>\n");
      out.write("      <tr>\n");
      out.write("        <td height=\"23\">&nbsp;</td>\n");
      out.write("          <td>&nbsp;</td>\n");
      out.write("          <td>&nbsp;</td>\n");
      out.write("          <td>&nbsp;</td>\n");
      out.write("        </tr>\n");
      out.write("    </table></td>\n");
      out.write("    <td>&nbsp;</td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td height=\"20\">&nbsp;</td>\n");
      out.write("    <td>&nbsp;</td>\n");
      out.write("    <td>&nbsp;</td>\n");
      out.write("    <td>&nbsp;</td>\n");
      out.write("    <td>&nbsp;</td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td height=\"231\"></td>\n");
      out.write("    <td colspan=\"3\" valign=\"top\"><table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" bgcolor=\"#CCCCCC\" style=\"border:outset\">\n");
      out.write("      <!--DWLayoutTable-->\n");
      out.write("      <tr>\n");
      out.write("        <td width=\"347\" height=\"100\" valign=\"middle\"><div align=\"center\">\n");
      out.write("          <textarea name=\"about\" cols=\"50\" rows=\"5\" id=\"about\" placeholder=\"Introduce Yourself (max. 400 char)\" style=\"resize:none\"></textarea>\n");
      out.write("          </div></td>\n");
      out.write("        </tr>\n");
      out.write("      <tr>\n");
      out.write("        <td height=\"17\"></td>\n");
      out.write("        </tr>\n");
      out.write("      <tr>\n");
      out.write("        <td height=\"98\" valign=\"middle\"><table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\n");
      out.write("          <!--DWLayoutTable-->\n");
      out.write("          <tr>\n");
      out.write("            <td width=\"347\" height=\"98\" valign=\"top\"><div align=\"center\">\n");
      out.write("              <textarea name=\"hobby\" cols=\"50\" rows=\"5\" id=\"hobby\" placeholder=\"Your Hobbies (eg. Swimming,Reading)\" style=\"resize:none\"></textarea>\n");
      out.write("              </div></td>\n");
      out.write("              </tr>\n");
      out.write("          </table>          </td>\n");
      out.write("        </tr>\n");
      out.write("      <tr>\n");
      out.write("        <td height=\"8\"></td>\n");
      out.write("        </tr>\n");
      out.write("    </table></td>\n");
      out.write("    <td></td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td height=\"8\"></td>\n");
      out.write("    <td></td>\n");
      out.write("    <td></td>\n");
      out.write("    <td></td>\n");
      out.write("    <td></td>\n");
      out.write("  </tr>\n");
      out.write("\n");
      out.write("  <tr>\n");
      out.write("    <td height=\"46\">&nbsp;</td>\n");
      out.write("    <td>&nbsp;</td>\n");
      out.write("    <td valign=\"top\"><table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\n");
      out.write("      <!--DWLayoutTable-->\n");
      out.write("      <tr>\n");
      out.write("        <td width=\"160\" height=\"46\" valign=\"top\"><div align=\"center\">\n");
      out.write("          <input name=\"update\" type=\"button\" id=\"update\" value=\"Update Info\" style=\"height:40px; width:120px\">\n");
      out.write("        </div></td>\n");
      out.write("        </tr>\n");
      out.write("    </table></td>\n");
      out.write("    <td>&nbsp;</td>\n");
      out.write("    <td>&nbsp;</td>\n");
      out.write("  </tr>\n");
      out.write("</table>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
