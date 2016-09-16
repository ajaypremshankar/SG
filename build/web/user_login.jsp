<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<title>Untitled Document</title>
<style type="text/css">
<!--
a:link {
	color: #006699;
	text-decoration: none;
}
a:visited {
	text-decoration: none;
}
a:hover {
	text-decoration: none;
	color: #999999;
}
a:active {
	text-decoration: none;
}
.style2 {color: #FFFFFF}
.style3 {
	font-size: x-large;
	color: #FF0000;
}
-->
</style></head>
<%@taglib prefix="html" uri="/WEB-INF/struts-html.tld"%>
<html:javascript formName="Login_Action_Bean" />
<body><html:form action="login_action.php" method="post" onsubmit="return validateLogin_Action_Bean(this)">
<table width="500" border="0" cellpadding="0" cellspacing="0">
  <!--DWLayoutTable-->
  <tr>
    <td width="500" height="128">&nbsp;</td>
  </tr>
  <tr>
    <td height="49" valign="top"><table width="100%" border="0" cellpadding="0" cellspacing="0">
      <!--DWLayoutTable-->
      <tr>
          <td width="500" height="49"><div align="center"><strong><span class="style3">${sessionScope["Exception"]}
                          <% session.removeAttribute("Exception"); %>
                      </span></strong></div></td>
      </tr>
    </table>
    </td>
  </tr>
  <tr>
    <td height="373" valign="top"><table width="472" height="200" border="0" cellspacing="5" bgcolor="#FFFFFF">
      <!--DWLayoutTable-->
      <tr>
        <td colspan="2"><div align="center">
          <div style="color:#666666; font-size:x-large"><strong>LOGIN :</strong> </div>
          </div></td>
          <td width="2"></td>
        </tr>
      <tr>
        <td width="193"><div align="right"><strong>User Name : </strong></div></td>
          <td width="258"><input name="email" type="text" id="email" size="40" placeholder="Email/Registration Id "></td>
          <td></td>
        </tr>
      <tr>
        <td><div align="right"><strong>Password : </strong></div></td>
          <td><input name="password" type="password" id="password" size="40" placeholder="Password Here "></td>
          <td></td>
        </tr>
      <tr>
        
        <td colspan="2">
          <div align="center">
            <input name="remember_me" type="checkbox" id="remember_me" value="remember_me">
            Keep Me Logged in</div>
          <div align="center"><a href="#">forgot password !</a></div></td>
          <td></td>
        </tr>
      <tr>
        <td height="33"><div align="right"></div></td>
          <td rowspan="2" valign="top">
            <div align="left" class="style2">
              <input name="Reset" type="reset" id="Reset" value="Reset" style="width:80px">
              <input name="Login" type="submit" id="Login" value="Login" style="width:150px">
            </div></td>
          <td>&nbsp;</td>
        </tr>
      <tr>
        <td height="1"></td>
          <td></td>
        </tr>
    </table></td>
  </tr>
</table>
</html:form>
</body>
</html>
