<%-- 
    Document   : landing_page
    Created on : Jan 28, 2013, 8:25:59 PM
    Author     : ajay prem shankar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
   <%@taglib  prefix="tiles" uri="/WEB-INF/struts-tiles.tld" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
    <title><tiles:getAsString name="title" /></title>
<style type="text/css">
<!--
#Layer1 {
	position:fixed;
	left:179px;
	top:300px;
	width:294px;
	height:47px;
	z-index:1;
	background-color: #666666;
}
#Layer2 {
	position:fixed;
	left:1000px;
	top:18px;
	width:121px;
	height:40px;
	z-index:2;
	background-color: #990033;
	overflow: visible;
	visibility: visible;
}
.style1 {
	font-size: medium;
	font-family: "Times New Roman", Times, serif;
	color: #FFFFFF;
	border-style:outset;
	border-width:medium;
	cursor:pointer;
}
-->
</style>
</head>

<body background="images/background.jpg">
<a href="school_reg_form.php">
<div class="style1" id="Layer2">Make Your School GLOBAL ... </div>
</a>
<table width="1000" border="0" align="center" cellpadding="0" cellspacing="0" bgcolor="#CCCCCC" style="border-style:outset">
  <!--DWLayoutTable-->
  <tr>
    <td height="150" colspan="3" valign="top"><table width="100%" border="0" cellpadding="0" cellspacing="0" bgcolor="#FFFF00">
      <!--DWLayoutTable-->
      <tr>
          <td width="1000" height="150"><tiles:insert attribute="header" /></td>
        </tr>
    </table></td>
  </tr>
  <tr>
    <td height="30" colspan="3" valign="top"><table width="100%" border="0" cellpadding="0" cellspacing="0" bgcolor="#9999FF">
      <!--DWLayoutTable-->
      <tr align="center">
          <td width="1000" height="30" align="center"><tiles:insert attribute="menu" /></td>
        </tr>
    </table></td>
  </tr>
  <tr>
    <td width="198" height="617">&nbsp;</td>
    <td width="592" valign="top"><table width="100%" border="0" cellpadding="0" cellspacing="0" bgcolor="#FFFFFF">
      <!--DWLayoutTable-->
      <tr>
        <td width="607" height="67" valign="top"><table width="100%" border="0" cellpadding="0" cellspacing="0" bgcolor="#FFFFFF">
          <!--DWLayoutTable-->
          <tr>
            <td width="607" height="67" valign="top" bgcolor="#CCCCCC" align="right"></td>
              </tr>
          </table></td>
        </tr>
      <tr>
        <td height="550" valign="top"><table width="100%" border="0" cellpadding="0" cellspacing="0" bgcolor="#CCCCCC">
          <!--DWLayoutTable-->
          <tr>
              <td width="607" height="550" valign="top" bgcolor="#CCCCCC" align="center"><tiles:insert  attribute="right_body" /></td>
              </tr>
          </table></td>
        </tr>
      
    </table></td>
  <td width="202">&nbsp;</td>
  </tr>
  <tr>
    <td height="41">&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  <tr>
    <td height="21" colspan="3" valign="top"><table width="100%" border="0" cellpadding="0" cellspacing="0" bgcolor="#FFFF00">
      <!--DWLayoutTable-->
      <tr>
        <td width="1000" height="20" align="center"><tiles:insert attribute="footer" /></td>
        </tr>
      <tr>
        <td height="1"></td>
        </tr>
    </table></td>
  </tr>
</table>
</body>
</html>
