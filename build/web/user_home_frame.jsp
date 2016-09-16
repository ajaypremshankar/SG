<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<title>Untitled Document</title>
<%@page import="Global.Model.ProfileInfoBundle" %>
</head>
<%@taglib prefix="tiles" uri="/WEB-INF/struts-tiles.tld" %>
<body>
<table width="1000" border="0" cellpadding="0" cellspacing="0" align="center">
  <!--DWLayoutTable-->
  <tr>
    <td height="150" colspan="2" valign="top"><table width="100%" border="0" cellpadding="0" cellspacing="0" bgcolor="#9966FF">
      <!--DWLayoutTable-->
      <tr>
        <td width="1000" height="150"><tiles:insert attribute="cover" /></td>
        </tr>
    </table></td>
  </tr>
  <tr>
    <td height="30" colspan="2" valign="top"><table width="100%" border="0" cellpadding="0" cellspacing="0">
      <!--DWLayoutTable-->
      <tr>
        <td width="1000" height="30"><tiles:insert attribute="menu" /></td>
      </tr>
    </table>
    </td>
  </tr>
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  <tr>
    <td width="200" height="600" valign="top"><table width="100%" border="0" cellpadding="0" cellspacing="0">
      <!--DWLayoutTable-->
      <tr>
          <td width="200" height="600"><tiles:insert attribute="navigation" /></td>
        </tr>
    </table></td>
    <td width="800" valign="top"><table width="100%" border="0" cellpadding="0" cellspacing="0" bgcolor="#0099FF">
      <!--DWLayoutTable-->
      <tr>
        <td width="800" height="600"><tiles:insert attribute="body" /></td>
      </tr>
    </table>    </td>
  </tr>
  
  
  <tr>
    <td height="20" colspan="2" valign="top"><table width="100%" border="0" cellpadding="0" cellspacing="0" bgcolor="#CCCCCC">
      <!--DWLayoutTable-->
      <tr>
          <td width="1000" height="20" align="center"><tiles:insert attribute="footer" /></td>
        </tr>
    </table></td>
  </tr>
</table>
</body>
</html>
