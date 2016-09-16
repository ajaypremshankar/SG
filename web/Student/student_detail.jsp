<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<title>Untitled Document</title><style type="text/css">
<!--
.style12 {font-size: large}
.style22 {font-size: x-large}
.style3 {font-size: medium}
.table {
border-radius:50px;
background-color:#FFFFFF;
overflow:hidden;
}

-->
</style></head>
<%@page import="Global.Model.ProfileInfoBundle, Global.Model.Student_Info ;" %>
<jsp:scriptlet>
ProfileInfoBundle pib=(ProfileInfoBundle)session.getAttribute("user");
Student_Info si=(Student_Info)pib.getUser_specific();

</jsp:scriptlet>


<body>
<table width="500" border="0" cellpadding="0" cellspacing="0" class="table">
  <!--DWLayoutTable-->
  <tr>
      <td width="246" height="52" valign="top"><div align="center"><em><strong><span class="style12">Student At </span></strong></em><strong><span class="style22"><%=pib.getSchool() %></span></strong></div></td>
      <td width="250" rowspan="2" valign="top"><div align="center"><em><strong><span class="style12">from </span></strong></em><strong><span class="style22"><%= pib.getCity() %></span></strong></div></td>
  </tr>
  <tr>
    <td height="2"></td>
  </tr>
  <tr>
    <td height="6"></td>
    <td></td>
  </tr>
  
  
  
  
  
  <tr>
    <td rowspan="2" valign="top"><div align="center"><em><strong><span class="style3">Gender : </span></strong></em><strong><span class="style3"><span class="style1"><%=pib.getSex() %></span></span></strong> </div></td>
    <td height="2"></td>
  </tr>
  <tr>
    <td height="21" valign="top"><div align="center"><em><strong><span class="style3">Born On :</span></strong></em><strong><span class="style1"> <%=pib.getDob() %> </span></strong> </div></td>
  </tr>
  
  
  
  
  
  
  
  
  
  
  <tr>
    <td height="1"></td>
    <td></td>
  </tr>
</table>
</body>
</html>
