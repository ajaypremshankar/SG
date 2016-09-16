<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<title>Untitled Document</title>
</head>
<%@taglib prefix="tiles" uri="/WEB-INF/struts-tiles.tld" %>
<body>
<table width="1000" border="0" align="center" cellpadding="0" cellspacing="0" bgcolor="#FFFFCC">
  <!--DWLayoutTable-->
  <tr>
    <td width="1000" height="30" valign="top"><table width="100%" border="0" cellpadding="0" cellspacing="0">
      <!--DWLayoutTable-->
      <tr>
          <td width="1000" height="30"><div align="center"><tiles:insert attribute="menu" /></div></td>
        </tr>
    </table></td>
  </tr>
  <tr>
    <td valign="top"><table width="100%" border="0" cellpadding="0" cellspacing="0">
      <!--DWLayoutTable-->
      <tr>
        <td width="1000"><div align="center"><tiles:insert attribute="body" /></div></td>
      </tr>
    </table>
    </td>
  </tr>
  <tr>
    <td height="20" valign="top"><table width="100%" border="0" cellpadding="0" cellspacing="0">
      <!--DWLayoutTable-->
      <tr>
        <td width="1000" height="20"><div align="center"><tiles:insert attribute="footer" /></div></td>
        </tr>
    </table></td>
  </tr>
</table>
</body>
</html>
