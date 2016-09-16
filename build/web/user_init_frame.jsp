<%-- 
    Document   : landing_page
    Created on : Jan 28, 2013, 8:25:59 PM
    Author     : ajay prem shankar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="Global.Model.ProfileInfoBundle;" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
   <%@taglib  prefix="tiles" uri="/WEB-INF/struts-tiles.tld" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<title>Untitled Document</title>
</head>

<body>
<table width="1000" border="0" cellpadding="0" cellspacing="0" align="center">
  <!--DWLayoutTable-->
  <tr>
    <td height="30" colspan="3" valign="top"><table width="100%" border="0" cellpadding="0" cellspacing="0" bgcolor="#9999FF">
      <!--DWLayoutTable-->
      <tr align="center">
          <td width="1000" height="30">Hello <%= ((ProfileInfoBundle)(session.getAttribute("user"))).getFname() %></td>
        </tr>
    </table></td>
  </tr>
  <tr>
    <td width="200" height="750" valign="top"><table width="100%" border="0" cellpadding="0" cellspacing="0" bgcolor="#999999">
      <!--DWLayoutTable-->
      <tr>
        <td width="200" height="750">sideBar</td>
        </tr>
    </table></td>
    <td width="700" valign="top"><table width="100%" border="0" cellpadding="0" cellspacing="0" bgcolor="#99FFFF">
      <!--DWLayoutTable-->
      <tr>
          <td width="700" height="750"><tiles:insert attribute="body" /></td>
        </tr>
    </table></td>
    <td width="100">&nbsp;</td>
  </tr>
  
  
  
  <tr>
    <td height="20" colspan="3" valign="top"><table width="100%" border="0" cellpadding="0" cellspacing="0" bgcolor="#FFFF00">
      <!--DWLayoutTable-->
      <tr>
        <td width="1000" height="20" align="center"><tiles:insert attribute="footer" /></td>
        </tr>
    </table></td>
  </tr>
</table>
</body>
</html>
