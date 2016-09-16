<%@page import="Global.Model.Parent_Info"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<title>Untitled Document</title><style type="text/css">
<!--
.style1x {
	font-size: xx-large;
	color: #333333;
        text-transform: capitalize
}
-->
</style></head>
<%@page import="Global.Model.ProfileInfoBundle, Global.Model.Student_Info, Global.Model.Teacher_Info,  Global.Model.Parent_Info ;" %>
<jsp:scriptlet>
ProfileInfoBundle pib=(ProfileInfoBundle)session.getAttribute("user");
if(pib.getUser_type().equalsIgnoreCase("student")){
Student_Info si=(Student_Info)pib.getUser_specific();
}
else if(pib.getUser_type().equalsIgnoreCase("teacher")){
Teacher_Info si=(Teacher_Info)pib.getUser_specific();
}
else{
Parent_Info si=(Parent_Info)pib.getUser_specific();
}
</jsp:scriptlet>
<%@taglib prefix="html" uri="http://struts.apache.org/tags-html" %>

<%@taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles" %>
<body>
<table width="1000" border="0" cellpadding="0" cellspacing="0" bgcolor="blue" align="center" background="images/cover.jpg" style="background-position:center; background-repeat:repeat-x">
  <!--DWLayoutTable-->
  <tr>
      <td width="812" height="150" valign="top"><table width="100%" border="0" cellpadding="0" cellspacing="0">
        <!--DWLayoutTable-->
        <tr>
          <td width="500" height="35" valign="top"><table width="100%" border="0" cellpadding="0" cellspacing="0">
            <!--DWLayoutTable-->
            <tr>
              <td width="71" height="35">&nbsp;</td>
              <td width="333" valign="top" bgcolor="#FFFFFF"><div align="center"><strong><span class="style1x"><%=pib.getFname() %>&nbsp;&nbsp;<%= pib.getLname() %></span></strong></div></td>
              <td width="96">&nbsp;</td>
            </tr>
          </table>
          </td>
          <td width="312">&nbsp;</td>
        </tr>
        <tr>
          <td height="40">&nbsp;</td>
          <td>&nbsp;</td>
        </tr>
        <tr>
          <td height="75" valign="top"><table width="100%" border="0" cellpadding="0" cellspacing="0">
            <!--DWLayoutTable-->
            <tr>
                <td width="500" height="75">
                    <tiles:insert attribute="user_about" /></td>
              </tr>
          </table></td>
          <td>&nbsp;</td>
        </tr>
        
      </table>
      </td>
      <td width="150" valign="top"><table width="100%" border="0" cellpadding="0" cellspacing="0">
        <!--DWLayoutTable-->
        <tr>
            <td width="150" height="150" bgcolor="#00FFCC">
                <html:img src='<%=pib.getPic_path().replace(config.getServletContext().getRealPath("/"),"")%>' height="150" width="150" alt="Profile Pic" /></td>
        </tr>
      </table></td>
  <td width="38">&nbsp;</td>
  </tr>
</table>
</body>
</html>
