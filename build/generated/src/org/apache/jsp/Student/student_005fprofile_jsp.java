package org.apache.jsp.Student;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Global.Model.ProfileInfoBundle;
import Global.Model.Student_Info;;

public final class student_005fprofile_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\">\r\n");
      out.write("<title>Untitled Document</title>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

ProfileInfoBundle pib=(ProfileInfoBundle)session.getAttribute("user");
Student_Info si=(Student_Info)pib.getUser_specific();
String dob[]=pib.getDob().split("\\.");
int day=Integer.parseInt(dob[0]);
int year=Integer.parseInt(dob[2]);

      out.write("\r\n");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write(".style2 {font-family: \"Courier New\", Courier, monospace;\r\n");
      out.write("font-weight:bold;\r\n");
      out.write("color:#003399;\r\n");
      out.write("font-size: xx-large;\r\n");
      out.write("}\r\n");
      out.write("input,textarea,select {\r\n");
      out.write("border-width:1px;\r\n");
      out.write("background-color:#FFFF00;\r\n");
      out.write("border-radius:4px;\r\n");
      out.write("box-shadow: -1px 0 0 rgba(255,255,255,.3);\t\t\r\n");
      out.write("border-color:#CCCCCC;\r\n");
      out.write("margin:0px;\r\n");
      out.write("text-align:right;\r\n");
      out.write("font-size:16px;\r\n");
      out.write("text-transform:capitalize;\r\n");
      out.write("}\r\n");
      out.write(".style3 {\r\n");
      out.write("\tfont-size: large;\r\n");
      out.write("\tcolor: #333333;\r\n");
      out.write("}\r\n");
      out.write(".style4 {color: #333333}\r\n");
      out.write(".style5 {font-size: medium}\r\n");
      out.write(".style6 {\r\n");
      out.write("\tfont-size: large;\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("}\r\n");
      out.write("a:link {\r\n");
      out.write("\ttext-decoration: none;\r\n");
      out.write("}\r\n");
      out.write("a:visited {\r\n");
      out.write("\ttext-decoration: none;\r\n");
      out.write("}\r\n");
      out.write("a:hover {\r\n");
      out.write("\ttext-decoration: none;\r\n");
      out.write("}\r\n");
      out.write("a:active {\r\n");
      out.write("\ttext-decoration: none;\r\n");
      out.write("}\r\n");
      out.write("-->\r\n");
      out.write("</style></head>\r\n");

String btn=request.getParameter("btn");
boolean basic=true, adv=true;
if(btn!=null&&!btn.equals("")){
if(btn.equalsIgnoreCase("edit_basic"))
basic=false;
else if(btn.equalsIgnoreCase("edit_advance"))
adv=false;
}

      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<table width=\"800\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" bgcolor=\"#CCCCCC\" align=\"center\">\r\n");
      out.write("  <!--DWLayoutTable-->\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td width=\"550\" height=\"36\" valign=\"top\"><table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("      <!--DWLayoutTable-->\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td width=\"550\" height=\"36\" valign=\"top\"><div align=\"center\"><span class=\"style2\">Profile </span><span class=\"style2\">:</span></div></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("      \r\n");
      out.write("    </table></td>\r\n");
      out.write("    <td width=\"250\" rowspan=\"2\" valign=\"top\"><!--DWLayoutEmptyCell-->&nbsp;</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"6\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"8\"></td>\r\n");
      out.write("    <td></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"550\" colspan=\"2\" valign=\"top\"><table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" bgcolor=\"#CCCCCC\">\r\n");
      out.write("      <!--DWLayoutTable-->\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td width=\"800\" height=\"282\" valign=\"top\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<form action=\"basic_info_update_action.php\" method=\"post\" name=\"basic\" />\r\n");
      out.write("\t\t  <table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" bgcolor=\"#FFFF00\">\r\n");
      out.write("\t\t    <!--DWLayoutTable-->\r\n");
      out.write("\t\t    <tr>\r\n");
      out.write("\t\t      <td width=\"134\" height=\"26\" valign=\"top\"><table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("\t\t        <!--DWLayoutTable-->\r\n");
      out.write("\t\t        <tr>\r\n");
      out.write("\t\t          <td width=\"154\" height=\"26\" valign=\"middle\"><div align=\"left\"><strong><span class=\"style3\">BASIC INFO. : </span></strong></div></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("\t\t        \r\n");
      out.write("\t\t        </table></td>\r\n");
      out.write("                <td width=\"294\" valign=\"top\"><table width=\"93%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("                    <!--DWLayoutTable-->\r\n");
      out.write("                    <tr>\r\n");
      out.write("                      <td width=\"274\" height=\"26\" valign=\"middle\"><div align=\"right\"><strong><span class=\"style4\">First Name:<br> \r\n");
      out.write("                                      <input name=\"fname\" value='");
      out.print( pib.getFname() );
      out.write("' type=\"text\" id=\"fname\" size=\"30\" ");
 if(basic) { 
      out.write(" disabled ");
 } 
      out.write(">\r\n");
      out.write("                      </span></strong></div></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                </table></td>\r\n");
      out.write("                <td width=\"69\">&nbsp;</td>\r\n");
      out.write("                <td width=\"263\" valign=\"top\"><table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("                    <!--DWLayoutTable-->\r\n");
      out.write("                    <tr>\r\n");
      out.write("                      <td width=\"267\" height=\"22\" valign=\"middle\"><div align=\"right\"><strong><span class=\"style4\">Last Name:<br>\r\n");
      out.write("                        <input name=\"lname\" value='");
      out.print( pib.getLname() );
      out.write("' type=\"text\" id=\"lname\" size=\"30\" ");
 if(basic) { 
      out.write(" disabled ");
 } 
      out.write(">\r\n");
      out.write("                      </span></strong></div></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                      <td height=\"4\"></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    \r\n");
      out.write("                    \r\n");
      out.write("                </table></td>\r\n");
      out.write("                <td width=\"40\">&nbsp;</td>\r\n");
      out.write("\t\t    </tr>\r\n");
      out.write("\t\t    <tr>\r\n");
      out.write("\t\t      <td height=\"13\"></td>\r\n");
      out.write("                <td></td>\r\n");
      out.write("                <td></td>\r\n");
      out.write("                <td></td>\r\n");
      out.write("                <td></td>\r\n");
      out.write("\t\t    </tr>\r\n");
      out.write("\t\t    <tr>\r\n");
      out.write("\t\t      <td height=\"26\">\r\n");
      out.write("\t\t\t  <a href=\"profile.php?btn=edit_basic\">\r\n");
      out.write("\t\t\t  <input name=\"edit_basic\" type=\"button\" id=\"edit_basic\" style=\"height:30px;\" value=\"Edit Basic Info\">\r\n");
      out.write("\t\t\t  </a>\r\n");
      out.write("\t\t\t  </td>\r\n");
      out.write("                <td valign=\"top\"><table width=\"93%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("                    <!--DWLayoutTable-->\r\n");
      out.write("                    <tr>\r\n");
      out.write("                      <td width=\"273\" height=\"26\" valign=\"top\"><div align=\"right\"><strong><span class=\"style4\">DOB :\r\n");
      out.write("\t\t\t\t\t  <br>\r\n");
      out.write("\t\t\t\t\t                  </span></strong>\r\n");
      out.write("                        \r\n");
      out.write("                        <select name=\"day\" id=\"day\" ");
 if(basic) { 
      out.write(" disabled ");
 } 
      out.write(">\r\n");
      out.write("                          <option>Day</option>\r\n");
      out.write("                          ");
 for(int i=1; i<31;i++){ 
      out.write("\r\n");
      out.write("                          <option ");
 if(day==i){ 
      out.write(" selected ");
 } 
      out.write(' ');
      out.write('>');
      out.print( i );
      out.write("</option>\r\n");
      out.write("                          ");
 } 
      out.write("\r\n");
      out.write("                          </select>\r\n");
      out.write("                        <select name=\"month\" id=\"month\" ");
 if(basic) { 
      out.write(" disabled ");
 } 
      out.write(">\r\n");
      out.write("                          <option>Month</option>\r\n");
      out.write("                          <option");
 if(dob[1].equalsIgnoreCase("jan")){ 
      out.write(" selected ");
 } 
      out.write(">Jan</option>\r\n");
      out.write("                          <option");
 if(dob[1].equalsIgnoreCase("feb")){ 
      out.write(" selected ");
 } 
      out.write(">Feb</option>\r\n");
      out.write("                          <option");
 if(dob[1].equalsIgnoreCase("mar")){ 
      out.write(" selected ");
 } 
      out.write(">Mar</option>\r\n");
      out.write("                          <option");
 if(dob[1].equalsIgnoreCase("apr")){ 
      out.write(" selected ");
 } 
      out.write(">Apr</option>\r\n");
      out.write("                          <option");
 if(dob[1].equalsIgnoreCase("may")){ 
      out.write(" selected ");
 } 
      out.write(">May</option>\r\n");
      out.write("                          <option");
 if(dob[1].equalsIgnoreCase("jun")){ 
      out.write(" selected ");
 } 
      out.write(">Jun</option>\r\n");
      out.write("                          <option");
 if(dob[1].equalsIgnoreCase("jul")){ 
      out.write(" selected ");
 } 
      out.write(">Jul</option>\r\n");
      out.write("                          <option");
 if(dob[1].equalsIgnoreCase("aug")){ 
      out.write(" selected ");
 } 
      out.write(">Aug</option>\r\n");
      out.write("                          <option");
 if(dob[1].equalsIgnoreCase("sept")){ 
      out.write(" selected ");
 } 
      out.write(">Sept</option>\r\n");
      out.write("                          <option");
 if(dob[1].equalsIgnoreCase("oct")){ 
      out.write(" selected ");
 } 
      out.write(">Oct</option>\r\n");
      out.write("                          <option");
 if(dob[1].equalsIgnoreCase("nov")){ 
      out.write(" selected ");
 } 
      out.write(">Nov</option>\r\n");
      out.write("                          <option");
 if(dob[1].equalsIgnoreCase("dec")){ 
      out.write(" selected ");
 } 
      out.write(">Dec</option>\r\n");
      out.write("                          </select>\r\n");
      out.write("                        <select name=\"year\" id=\"month\" ");
 if(basic) { 
      out.write(" disabled ");
 } 
      out.write(">\r\n");
      out.write("                          <option default>Year</option>\r\n");
      out.write("                          ");
 for(int i=1905; i<2013;i++){ 
      out.write("\r\n");
      out.write("                          <option ");
 if(year==i){ 
      out.write(" selected ");
 } 
      out.write(' ');
      out.write('>');
      out.print( i );
      out.write("</option>\r\n");
      out.write("                          ");
 } 
      out.write("\r\n");
      out.write("                          </select>\r\n");
      out.write("                        \r\n");
      out.write("                      </div></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                </table></td>\r\n");
      out.write("                <td>&nbsp;</td>\r\n");
      out.write("                <td valign=\"top\"><table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("                    <!--DWLayoutTable-->\r\n");
      out.write("                    <tr>\r\n");
      out.write("                      <td width=\"266\" height=\"26\" valign=\"top\"><div align=\"right\"><strong><span class=\"style4\">Mobile No:<br>\r\n");
      out.write("                              <input name=\"mob\" value='");
      out.print( pib.getMob() );
      out.write("' type=\"text\" id=\"mob\" size=\"30\" ");
 if(basic) { 
      out.write(" disabled ");
 } 
      out.write(">\r\n");
      out.write("                      </span></strong></div></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                </table></td>\r\n");
      out.write("                <td>&nbsp;</td>\r\n");
      out.write("\t\t    </tr>\r\n");
      out.write("\t\t    <tr>\r\n");
      out.write("\t\t      <td height=\"14\"></td>\r\n");
      out.write("                <td></td>\r\n");
      out.write("                <td></td>\r\n");
      out.write("                <td></td>\r\n");
      out.write("                <td></td>\r\n");
      out.write("\t\t    </tr>\r\n");
      out.write("\t\t    <tr>\r\n");
      out.write("\t\t      <td height=\"26\"></td>\r\n");
      out.write("                <td valign=\"top\"><table width=\"92%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("                    <!--DWLayoutTable-->\r\n");
      out.write("                    <tr>\r\n");
      out.write("                      <td width=\"271\" height=\"26\" valign=\"top\"><div align=\"right\"><strong><span class=\"style4\">City :<br>\r\n");
      out.write("                        <input name=\"city\" value='");
      out.print( pib.getCity() );
      out.write("' type=\"text\" id=\"city\" size=\"30\" ");
 if(basic) { 
      out.write(" disabled ");
 } 
      out.write(">\r\n");
      out.write("                      </span></strong></div></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                </table></td>\r\n");
      out.write("                <td>&nbsp;</td>\r\n");
      out.write("                <td valign=\"top\"><table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("                    <!--DWLayoutTable-->\r\n");
      out.write("                    <tr>\r\n");
      out.write("                      <td width=\"263\" height=\"26\" valign=\"top\"><div align=\"right\"><strong><span class=\"style4\">State :<br>\r\n");
      out.write("                        <input name=\"state\" type=\"text\" value='");
      out.print( pib.getState() );
      out.write("' id=\"state\" size=\"30\" ");
 if(basic) { 
      out.write(" disabled ");
 } 
      out.write(">\r\n");
      out.write("                      </span></strong></div></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                </table></td>\r\n");
      out.write("                <td></td>\r\n");
      out.write("\t\t    </tr>\r\n");
      out.write("\t\t    <tr>\r\n");
      out.write("\t\t      <td height=\"13\"></td>\r\n");
      out.write("                <td></td>\r\n");
      out.write("                <td></td>\r\n");
      out.write("                <td></td>\r\n");
      out.write("                <td></td>\r\n");
      out.write("\t\t    </tr>\r\n");
      out.write("\t\t    <tr>\r\n");
      out.write("\t\t      <td height=\"51\"></td>\r\n");
      out.write("\t\t      <td valign=\"top\"><table width=\"92%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("\t\t        <!--DWLayoutTable-->\r\n");
      out.write("\t\t        <tr>\r\n");
      out.write("\t\t          <td width=\"270\" height=\"50\"><div align=\"right\"><strong><span class=\"style5\">Address:<br></span></strong>\r\n");
      out.write("\t\t              <textarea name=\"address\" cols=\"22\" rows=\"3\" id=\"address\" ");
 if(basic) { 
      out.write(" disabled ");
 } 
      out.write(">\r\n");
      out.write("                               ");
      out.print( pib.getAddress() );
      out.write("\r\n");
      out.write("                              </textarea>\r\n");
      out.write("\t\t            </div></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("\t\t        </table></td>\r\n");
      out.write("                <td></td>\r\n");
      out.write("\t\t        <td valign=\"middle\"><div align=\"right\"><strong><span class=\"style4\">Country :<br>\r\n");
      out.write("\t\t              <input name=\"country\" value='");
      out.print( pib.getCountry() );
      out.write("' type=\"text\" id=\"country\" size=\"30\" ");
 if(basic) { 
      out.write(" disabled ");
 } 
      out.write(">\r\n");
      out.write("              </span></strong></div></td>\r\n");
      out.write("\t\t      <td></td>\r\n");
      out.write("\t\t    </tr>\r\n");
      out.write("\t\t    <tr>\r\n");
      out.write("\t\t      <td height=\"11\"></td>\r\n");
      out.write("\t\t      <td></td>\r\n");
      out.write("\t\t      <td></td>\r\n");
      out.write("\t\t      <td></td>\r\n");
      out.write("\t\t      <td></td>\r\n");
      out.write("\t\t    </tr>\r\n");
      out.write("\t\t    <tr>\r\n");
      out.write("\t\t      <td height=\"19\"></td>\r\n");
      out.write("\t\t      <td rowspan=\"2\" valign=\"top\"><table width=\"92%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("\t\t        <!--DWLayoutTable-->\r\n");
      out.write("\t\t        <tr>\r\n");
      out.write("\t\t          <td width=\"271\" height=\"26\"><div align=\"right\"><strong><span class=\"style4\">Add Another Email :<br>\r\n");
      out.write("\t\t                  <input name=\"add_email\" type=\"text\" id=\"add_email\" size=\"30\" ");
 if(basic) { 
      out.write(" disabled ");
 } 
      out.write(" style=\"text-transform:none\">\r\n");
      out.write("                  </span></strong></div></td>\r\n");
      out.write("\t\t            </tr>\r\n");
      out.write("\t\t        </table></td>\r\n");
      out.write("\t\t      <td></td>\r\n");
      out.write("                <td>&nbsp;</td>\r\n");
      out.write("                <td></td>\r\n");
      out.write("\t\t    </tr>\r\n");
      out.write("\t\t    <tr>\r\n");
      out.write("\t\t      <td height=\"33\"></td>\r\n");
      out.write("\t\t      <td></td>\r\n");
      out.write("\t\t      <td valign=\"top\"><table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("                    <!--DWLayoutTable-->\r\n");
      out.write("                    <tr>\r\n");
      out.write("                      <td width=\"264\" height=\"26\" valign=\"top\"><div align=\"right\">\r\n");
      out.write("                        <input name=\"Cancel\" type=\"button\" id=\"Cancel\" value=\"Cancel\" ");
 if(basic) { 
      out.write(" disabled ");
 } 
      out.write(">\r\n");
      out.write("                        &nbsp;\r\n");
      out.write("                        <input name=\"update\" type=\"submit\" id=\"update\" value=\"Update Info\" ");
 if(basic) { 
      out.write(" disabled ");
 } 
      out.write(">\r\n");
      out.write("                      </div></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                      <td height=\"7\"></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                </table></td>\r\n");
      out.write("                <td></td>\r\n");
      out.write("\t\t      </tr>\r\n");
      out.write("\t\t    </table>\r\n");
      out.write("\t\t\t</form>\t\t</td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td height=\"18\"></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td height=\"250\" valign=\"top\">\r\n");
      out.write("\t\t<form action=\"student_advance_info_update_action.php\" method=\"post\" >\r\n");
      out.write("\t\t<table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" bgcolor=\"#FFFF00\">\r\n");
      out.write("          <!--DWLayoutTable-->\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td width=\"133\" height=\"8\"></td>\r\n");
      out.write("            <td width=\"271\"></td>\r\n");
      out.write("            <td width=\"96\"></td>\r\n");
      out.write("            <td width=\"263\"></td>\r\n");
      out.write("            <td width=\"37\"></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td height=\"26\"><span class=\"style6\">Advanced Info : </span></td>\r\n");
      out.write("            <td valign=\"top\"><table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("              <!--DWLayoutTable-->\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td width=\"269\" height=\"26\" valign=\"top\"><div align=\"right\">\r\n");
      out.write("                  <div align=\"right\"><strong>Standard:\r\n");
      out.write("                    <select name=\"std\" ");
 if(adv) { 
      out.write(" disabled ");
 } 
      out.write(">\r\n");
      out.write("                        <option value=\"1\"");
 if(si.getStd().equalsIgnoreCase("1")){ 
      out.write(" selected ");
 } 
      out.write(">I</option>\r\n");
      out.write("                        <option value=\"2\"");
 if(si.getStd().equalsIgnoreCase("2")){ 
      out.write(" selected ");
 } 
      out.write(">II</option>\r\n");
      out.write("                        <option value=\"3\"");
 if(si.getStd().equalsIgnoreCase("3")){ 
      out.write(" selected ");
 } 
      out.write(">III</option>\r\n");
      out.write("                        <option value=\"4\"");
 if(si.getStd().equalsIgnoreCase("4")){ 
      out.write(" selected ");
 } 
      out.write(">IV</option>\r\n");
      out.write("                        <option value=\"5\"");
 if(si.getStd().equalsIgnoreCase("5")){ 
      out.write(" selected ");
 } 
      out.write(">V</option>\r\n");
      out.write("                        <option value=\"6\"");
 if(si.getStd().equalsIgnoreCase("6")){ 
      out.write(" selected ");
 } 
      out.write(">VI</option>\r\n");
      out.write("                        <option value=\"7\"");
 if(si.getStd().equalsIgnoreCase("7")){ 
      out.write(" selected ");
 } 
      out.write(">VII</option>\r\n");
      out.write("                        <option value=\"8\"");
 if(si.getStd().equalsIgnoreCase("8")){ 
      out.write(" selected ");
 } 
      out.write(">VIII</option>\r\n");
      out.write("                        <option value=\"9\"");
 if(si.getStd().equalsIgnoreCase("9")){ 
      out.write(" selected ");
 } 
      out.write(">IX</option>\r\n");
      out.write("                        <option value=\"10\"");
 if(si.getStd().equalsIgnoreCase("10")){ 
      out.write(" selected ");
 } 
      out.write(">X</option>\r\n");
      out.write("                        <option value=\"11\"");
 if(si.getStd().equalsIgnoreCase("11")){ 
      out.write(" selected ");
 } 
      out.write(">XI</option>\r\n");
      out.write("                        <option value=\"12\"");
 if(si.getStd().equalsIgnoreCase("12")){ 
      out.write(" selected ");
 } 
      out.write(">XII</option>\r\n");
      out.write("                      </select>\r\n");
      out.write("                    </strong></div>\r\n");
      out.write("                  </div></td>\r\n");
      out.write("                      <td width=\"2\">&nbsp;</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </table></td>\r\n");
      out.write("            <td>&nbsp;</td>\r\n");
      out.write("            <td valign=\"top\"><table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("              <!--DWLayoutTable-->\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td width=\"263\" height=\"26\"><div align=\"right\">\r\n");
      out.write("                  <div align=\"right\"><strong>Section :</strong>\r\n");
      out.write("                    <select name=\"section\" ");
 if(adv) { 
      out.write(" disabled ");
 } 
      out.write(">\r\n");
      out.write("                      <option value=\"A\"");
 if(si.getSection().equalsIgnoreCase("A")){ 
      out.write(" selected ");
 } 
      out.write(">A</option>\r\n");
      out.write("                      <option value=\"B\"");
 if(si.getSection().equalsIgnoreCase("B")){ 
      out.write(" selected ");
 } 
      out.write(">B</option>\r\n");
      out.write("                      <option value=\"C\"");
 if(si.getSection().equalsIgnoreCase("C")){ 
      out.write(" selected ");
 } 
      out.write(">C</option>\r\n");
      out.write("                      <option value=\"D\"");
 if(si.getSection().equalsIgnoreCase("D")){ 
      out.write(" selected ");
 } 
      out.write(">D</option>\r\n");
      out.write("                      <option value=\"E\"");
 if(si.getSection().equalsIgnoreCase("E")){ 
      out.write(" selected ");
 } 
      out.write(">E</option>\r\n");
      out.write("                      <option value=\"F\"");
 if(si.getSection().equalsIgnoreCase("F")){ 
      out.write(" selected ");
 } 
      out.write(">F</option>\r\n");
      out.write("                    </select>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div></td>\r\n");
      out.write("              </tr>\r\n");
      out.write("            </table>            </td>\r\n");
      out.write("            <td>&nbsp;</td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td height=\"20\"></td>\r\n");
      out.write("            <td>&nbsp;</td>\r\n");
      out.write("            <td></td>\r\n");
      out.write("            <td></td>\r\n");
      out.write("            <td></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td height=\"67\">\r\n");
      out.write("\t\t\t<a href=\"profile.php?btn=edit_advance\">\r\n");
      out.write("\t\t\t<input name=\"edit_advance\" type=\"button\" id=\"edit_advance\" style=\"height:30px;\" value=\"Edit Advance Info\">\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("            <td valign=\"top\"><table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("              <!--DWLayoutTable-->\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td width=\"271\" height=\"67\"><div align=\"right\"><strong>About Me: \r\n");
      out.write("                            <br><textarea name=\"about\" cols=\"22\" rows=\"3\" id=\"about\" placeholder=\"400 char max.\" ");
 if(adv) { 
      out.write(" disabled ");
 } 
      out.write(">\r\n");
      out.write("                             ");
 if(!si.getAbout().equals("null")){ 
      out.write("\r\n");
      out.write("                             ");
      out.print( si.getAbout() );
      out.write(' ');
 } 
      out.write("\r\n");
      out.write("                            </textarea>\r\n");
      out.write("                </strong></div></td>\r\n");
      out.write("              </tr>\r\n");
      out.write("            </table>            </td>\r\n");
      out.write("            <td></td>\r\n");
      out.write("            <td valign=\"top\"><table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("              <!--DWLayoutTable-->\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td width=\"263\" height=\"67\"><div align=\"right\"><strong>Hobbies: <br>\r\n");
      out.write("                    <textarea name=\"hobby\" cols=\"22\" rows=\"3\" id=\"hobby\" placeholder=\"One per Line\" ");
 if(adv) { 
      out.write(" disabled ");
 } 
      out.write("></textarea>\r\n");
      out.write("                </strong></div></td>\r\n");
      out.write("              </tr>\r\n");
      out.write("            </table>            </td>\r\n");
      out.write("            <td></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td height=\"21\"></td>\r\n");
      out.write("            <td>&nbsp;</td>\r\n");
      out.write("            <td></td>\r\n");
      out.write("            <td></td>\r\n");
      out.write("            <td></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td height=\"80\"></td>\r\n");
      out.write("            <td valign=\"top\"><table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("              <!--DWLayoutTable-->\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td width=\"271\" height=\"80\"><div align=\"right\"><strong>favorite Subjects : <br>\r\n");
      out.write("                    <textarea name=\"subject\" cols=\"22\" rows=\"3\" id=\"subject\" placeholder=\"One per Line\" ");
 if(adv) { 
      out.write(" disabled ");
 } 
      out.write("></textarea>\r\n");
      out.write("                </strong></div></td>\r\n");
      out.write("              </tr>\r\n");
      out.write("            </table>            </td>\r\n");
      out.write("            <td></td>\r\n");
      out.write("            <td valign=\"top\"><table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("              <!--DWLayoutTable-->\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td width=\"263\" height=\"80\"><div align=\"right\"><strong>I want to Be : <br>\r\n");
      out.write("                    <textarea name=\"future\" cols=\"22\" rows=\"3\" id=\"future\" placeholder=\"atleast 3 lines\" ");
 if(adv) { 
      out.write(" disabled ");
 } 
      out.write("></textarea>\r\n");
      out.write("                </strong></div></td>\r\n");
      out.write("              </tr>\r\n");
      out.write("            </table>            </td>\r\n");
      out.write("            <td></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td height=\"25\"></td>\r\n");
      out.write("            <td>&nbsp;</td>\r\n");
      out.write("            <td></td>\r\n");
      out.write("            <td>&nbsp;</td>\r\n");
      out.write("            <td></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td height=\"29\"></td>\r\n");
      out.write("            <td>&nbsp;</td>\r\n");
      out.write("            <td></td>\r\n");
      out.write("            <td valign=\"top\"><table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("              <!--DWLayoutTable-->\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td width=\"263\" height=\"29\"><div align=\"right\">\r\n");
      out.write("                  <input name=\"Cancel2\" type=\"button\" id=\"Cancel2\" value=\"Cancel\" ");
 if(adv) { 
      out.write(" disabled ");
 } 
      out.write(">\r\n");
      out.write("  &nbsp;\r\n");
      out.write("  <input name=\"update2\" type=\"submit\" id=\"update2\" value=\"Update Info\" ");
 if(adv) { 
      out.write(" disabled ");
 } 
      out.write(">\r\n");
      out.write("                </div></td>\r\n");
      out.write("              </tr>\r\n");
      out.write("            </table>\r\n");
      out.write("            </td>\r\n");
      out.write("            <td></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          \r\n");
      out.write("        </table>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t\t</td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td height=\"80\">&nbsp;</td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </table>    </td>\r\n");
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
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
