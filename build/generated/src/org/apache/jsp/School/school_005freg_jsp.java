package org.apache.jsp.School;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class school_005freg_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(1);
    _jspx_dependants.add("/WEB-INF/struts-html.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_form_onsubmit_method_action;

  private org.apache.jasper.runtime.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_html_form_onsubmit_method_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_html_form_onsubmit_method_action.release();
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
      out.write("<style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write("#Layer1 {\r\n");
      out.write("\tposition:absolute;\r\n");
      out.write("\tleft:211px;\r\n");
      out.write("\ttop:24px;\r\n");
      out.write("\twidth:682px;\r\n");
      out.write("\theight:53px;\r\n");
      out.write("\tz-index:1;\r\n");
      out.write("}\r\n");
      out.write(".style4 {font-size: 18px}\r\n");
      out.write("-->\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body>");
      if (_jspx_meth_html_form_0(_jspx_page_context))
        return;
      out.write("\r\n");
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

  private boolean _jspx_meth_html_form_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:form
    org.apache.struts.taglib.html.FormTag _jspx_th_html_form_0 = (org.apache.struts.taglib.html.FormTag) _jspx_tagPool_html_form_onsubmit_method_action.get(org.apache.struts.taglib.html.FormTag.class);
    _jspx_th_html_form_0.setPageContext(_jspx_page_context);
    _jspx_th_html_form_0.setParent(null);
    _jspx_th_html_form_0.setAction("school_reg_action.php");
    _jspx_th_html_form_0.setMethod("post");
    _jspx_th_html_form_0.setOnsubmit("return validateSchool_reg_Bean(this)");
    int _jspx_eval_html_form_0 = _jspx_th_html_form_0.doStartTag();
    if (_jspx_eval_html_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("<table width=\"700\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" align=\"center\" style=\"vertical-align:top\">\r\n");
        out.write("  <!--DWLayoutTable-->\r\n");
        out.write("  <tr>\r\n");
        out.write("    <td width=\"700\" height=\"750\"><div style=\"text-align:center; color:#666666; font-size:24px; background-color:#CCCCCC\">SCHOOL REGISTRATION : &nbsp;</div>\r\n");
        out.write("      <div style=\"text-align:center; font-size:24px; color:#999999; height:50px; vertical-align:bottom\">\r\n");
        out.write("        <p>Basic Info : </p>\r\n");
        out.write("      </div>\r\n");
        out.write("      <table width=\"702\" height=\"500\" border=\"0\" align=\"center\" cellspacing=\"7\" bordercolor=\"#FF00FF\" bgcolor=\"#CCCCCC\">\r\n");
        out.write("      <tr>\r\n");
        out.write("        <th width=\"302\" class=\"style4\" scope=\"row\"><div align=\"right\">School Name : <font color=\"#FF0000\">*</font></div></th>\r\n");
        out.write("        <th width=\"329\" class=\"style4\" scope=\"row\">\r\n");
        out.write("          <div align=\"left\">\r\n");
        out.write("            <input name=\"school_name\" type=\"text\" id=\"school_name\" size=\"50\">\r\n");
        out.write("            </div></th></tr>\r\n");
        out.write("      <tr>\r\n");
        out.write("        <th scope=\"row\"><div align=\"right\">Board :<font color=\"#FF0000\">*</font></div></th>\r\n");
        out.write("        <th scope=\"row\">\r\n");
        out.write("          <div align=\"left\">\r\n");
        out.write("            <select name=\"board\" id=\"board\">\r\n");
        out.write("              <option>Alahabad Board (UP Board)</option>\r\n");
        out.write("              <option>CSBE</option>\r\n");
        out.write("              <option>ICSE</option>\r\n");
        out.write("              <option>ICS</option>\r\n");
        out.write("            </select>\r\n");
        out.write("          </div></th></tr>\r\n");
        out.write("      <tr>\r\n");
        out.write("        <th scope=\"row\"><div align=\"right\">Registered Under : <font color=\"#FF0000\">*</font></div></th>\r\n");
        out.write("        <th scope=\"row\">\r\n");
        out.write("          <div align=\"left\">\r\n");
        out.write("            <select name=\"registered_under\" id=\"registered_under\">\r\n");
        out.write("              <option>UGC</option>\r\n");
        out.write("              <option>AICTE</option>\r\n");
        out.write("            </select>\r\n");
        out.write("          </div></th></tr>\r\n");
        out.write("      <tr>\r\n");
        out.write("        <th scope=\"row\"><div align=\"right\">Type Of School : </div></th>\r\n");
        out.write("        <th scope=\"row\"><div align=\"left\">\r\n");
        out.write("          <select name=\"school_type\" id=\"school_type\">\r\n");
        out.write("            <option>Private</option>\r\n");
        out.write("            <option>Government</option>\r\n");
        out.write("            <option>Undertaken by Gov.</option>\r\n");
        out.write("                    </select>\r\n");
        out.write("        </div></th>\r\n");
        out.write("      </tr>\r\n");
        out.write("      <tr>\r\n");
        out.write("        <th scope=\"row\"><div align=\"right\">Website : <font color=\"#FF0000\">*</font></div></th>\r\n");
        out.write("        <th scope=\"row\">\r\n");
        out.write("          <div align=\"left\">\r\n");
        out.write("            <input name=\"website\" type=\"text\" id=\"website\" size=\"50\">\r\n");
        out.write("          </div></th></tr>\r\n");
        out.write("      <tr>\r\n");
        out.write("        <th scope=\"row\"><div align=\"right\">School Mailing Address ( Email ) : <font color=\"#FF0000\">*</font></div></th>\r\n");
        out.write("        <th scope=\"row\">\r\n");
        out.write("          <div align=\"left\">\r\n");
        out.write("            <input name=\"school_email\" type=\"text\" id=\"school_email\" size=\"50\">\r\n");
        out.write("          </div></th></tr>\r\n");
        out.write("      <tr>\r\n");
        out.write("        <th scope=\"row\"><div align=\"right\">Established In ( Year ) : </div></th>\r\n");
        out.write("        <th scope=\"row\">\r\n");
        out.write("          <div align=\"left\">\r\n");
        out.write("            <input name=\"estb_year\" type=\"text\" id=\"estb_year\" size=\"50\" maxlength=\"4\">\r\n");
        out.write("          </div></th></tr>\r\n");
        out.write("      <tr>\r\n");
        out.write("        <th scope=\"row\">&nbsp;</th>\r\n");
        out.write("        <th scope=\"row\"><div align=\"center\"></div></th>\r\n");
        out.write("      </tr>\r\n");
        out.write("      <tr>\r\n");
        out.write("        <th scope=\"row\"><div align=\"right\">School Landline No. : <font color=\"#FF0000\">*</font></div></th>\r\n");
        out.write("        <th scope=\"row\">\r\n");
        out.write("          <div align=\"left\">\r\n");
        out.write("            <input name=\"school_phone\" type=\"text\" id=\"school_phone\" size=\"50\">\r\n");
        out.write("          </div></th></tr>\r\n");
        out.write("      <tr>\r\n");
        out.write("        <th scope=\"row\"><div align=\"right\">City : <font color=\"#FF0000\">*</font></div></th>\r\n");
        out.write("        <th scope=\"row\">\r\n");
        out.write("          <div align=\"left\">\r\n");
        out.write("            <input name=\"city\" type=\"text\" id=\"city\" size=\"50\">\r\n");
        out.write("          </div></th></tr>\r\n");
        out.write("      <tr>\r\n");
        out.write("        <th scope=\"row\"><div align=\"right\">State :        </div></th>\r\n");
        out.write("        <th scope=\"row\"><div align=\"left\">\r\n");
        out.write("          <input name=\"state\" type=\"text\" id=\"state\" size=\"50\">\r\n");
        out.write("        </div></th>\r\n");
        out.write("      </tr>\r\n");
        out.write("    </table>\r\n");
        out.write("    <div style=\"text-align:center; font-size:24px; color:#999999; height:50px; vertical-align:bottom\">\r\n");
        out.write("      <p>Principal's Info :</p>\r\n");
        out.write("      </div>\r\n");
        out.write("    <table width=\"700\" border=\"0\" cellspacing=\"7\" bgcolor=\"#CCCCCC\">\r\n");
        out.write("      <tr>\r\n");
        out.write("        <th width=\"335\" scope=\"row\"><div align=\"right\">Principal's Name : </div></th>\r\n");
        out.write("        <td width=\"340\"><input name=\"principal_name\" type=\"text\" id=\"principal_name\" size=\"50\"></td>\r\n");
        out.write("      </tr>\r\n");
        out.write("      <tr>\r\n");
        out.write("        <th scope=\"row\"><div align=\"right\">Principal's Mobile No. : </div></th>\r\n");
        out.write("        <td><input name=\"principal_mob\" type=\"text\" id=\"principal_mob\" size=\"50\"></td>\r\n");
        out.write("      </tr>\r\n");
        out.write("      <tr>\r\n");
        out.write("        <th scope=\"row\"><div align=\"right\">Principal's Email : <font color=\"#FF0000\">*</font></div></th>\r\n");
        out.write("        <td><input name=\"principal_email\" type=\"text\" id=\"principal_email\" size=\"50\"></td>\r\n");
        out.write("      </tr>\r\n");
        out.write("    </table>    \r\n");
        out.write("    <div style=\"text-align:center; font-size:24px; color:#999999; height:50px; vertical-align:bottom\">\r\n");
        out.write("      <p>Profile Manager Info  :</p>\r\n");
        out.write("    </div>\r\n");
        out.write("    <table width=\"700\" border=\"0\" cellspacing=\"7\" bgcolor=\"#CCCCCC\">\r\n");
        out.write("      <tr>\r\n");
        out.write("        <th width=\"337\" scope=\"row\"><div align=\"right\">Name : </div></th>\r\n");
        out.write("        <td width=\"338\"><input name=\"manager_name\" type=\"text\" id=\"manager_name\" size=\"50\"></td>\r\n");
        out.write("      </tr>\r\n");
        out.write("      <tr>\r\n");
        out.write("        <th scope=\"row\"><div align=\"right\">Designation : </div></th>\r\n");
        out.write("        <td><input name=\"manager_designation\" type=\"text\" id=\"manager_designation\" size=\"50\"></td>\r\n");
        out.write("      </tr>\r\n");
        out.write("      <tr>\r\n");
        out.write("        <th scope=\"row\"><div align=\"right\">Mobile No. : <font color=\"#FF0000\">*</font></div></th>\r\n");
        out.write("        <td><input name=\"manager_mob\" type=\"text\" id=\"manager_mob\" size=\"50\"></td>\r\n");
        out.write("      </tr>\r\n");
        out.write("      <tr>\r\n");
        out.write("        <th scope=\"row\"><div align=\"right\">Email Address : <font color=\"#FF0000\">*</font></div></th>\r\n");
        out.write("        <td><input name=\"manager_email\" type=\"text\" id=\"manager_email\" size=\"50\"></td>\r\n");
        out.write("      </tr>\r\n");
        out.write("    </table>\r\n");
        out.write("    <div style=\"text-align:center; font-size:24px; color:#999999; height:50px; vertical-align:bottom\">\r\n");
        out.write("      <p>Account Detail  :</p>\r\n");
        out.write("    </div>\r\n");
        out.write("    <table width=\"700\" border=\"0\" cellspacing=\"7\" bgcolor=\"#CCCCCC\">\r\n");
        out.write("      <tr>\r\n");
        out.write("        <th width=\"338\" scope=\"row\"><div align=\"right\">Password : <font color=\"#FF0000\">*</font></div></th>\r\n");
        out.write("        <td width=\"337\"><input name=\"password\" type=\"password\" id=\"password\" size=\"50\"></td>\r\n");
        out.write("      </tr>\r\n");
        out.write("      <tr>\r\n");
        out.write("        <th scope=\"row\"><div align=\"right\">Confirm Password : <font color=\"#FF0000\">*</font></div></th>\r\n");
        out.write("        <td><input name=\"confirm_password\" type=\"password\" id=\"confirm_password\" size=\"50\"></td>\r\n");
        out.write("      </tr>\r\n");
        out.write("    </table>\r\n");
        out.write("    <p>&nbsp;</p>\r\n");
        out.write("    <table width=\"699\" border=\"0\" cellspacing=\"7\" bgcolor=\"#CCCCCC\">\r\n");
        out.write("      <tr>\r\n");
        out.write("        <th width=\"339\" scope=\"row\"><div align=\"right\">\r\n");
        out.write("          <input name=\"reset\" type=\"reset\" id=\"reset\" style=\"width:250px; cursor:pointer;\" value=\"Refill Form\">\r\n");
        out.write("        </div></th>\r\n");
        out.write("        <th width=\"305\" scope=\"row\">\r\n");
        out.write("          \r\n");
        out.write("            <div align=\"right\">\r\n");
        out.write("              <input type=\"submit\" name=\"Submit\" value=\"get global\" style=\"width:250px; cursor:pointer;\">\r\n");
        out.write("              </div></th>\r\n");
        out.write("      </tr>\r\n");
        out.write("    </table>\r\n");
        out.write("    <p>&nbsp;</p>\r\n");
        out.write("    <p>&nbsp;</p></td>\r\n");
        out.write("  </tr>\r\n");
        out.write("</table>");
        int evalDoAfterBody = _jspx_th_html_form_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_html_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_form_onsubmit_method_action.reuse(_jspx_th_html_form_0);
      return true;
    }
    _jspx_tagPool_html_form_onsubmit_method_action.reuse(_jspx_th_html_form_0);
    return false;
  }
}
