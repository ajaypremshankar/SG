<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<title>Untitled Document</title>
<script type="text/JavaScript">
<!--
function MM_jumpMenu(targ,selObj,restore){ //v3.0
  eval(targ+".location='"+selObj.options[selObj.selectedIndex].value+"'");
  if (restore) selObj.selectedIndex=0;
}
//-->
</script>
</head>

<body>
<table width="595" border="0" cellpadding="0" cellspacing="0" bgcolor="#CCCCCC">
  <!--DWLayoutTable-->
  <tr>
      <td width="595" height="67" valign="top"><div align="center" style="text-transform:capitalize">
        <form name="form1">
          <div align="center">
            <p>&nbsp;            </p>
            <p align="right">
              <select name="user" onChange="MM_jumpMenu('parent',this,0)" style="width:200px">
                <option>--------</option>
                <option value="landing_page.php?user_type=student">Student</option>
                <option value="landing_page.php?user_type=parent">Parent</option>
                <option value="landing_page.php?user_type=teacher">Teacher</option>
              </select>
              </p>
          </div>
        </form>
        <p align="right"><font color="#666666" size="+2"><strong>Register As: ${param["user_type"]}&nbsp;&nbsp;
        &nbsp;&nbsp;&nbsp;&nbsp;
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        &nbsp;&nbsp;&nbsp;</strong></font></p><font color="#666666" size="+2"><strong> </strong></font> </div></td>
  </tr>
  <tr>
    <td height="7"></td>
  </tr>
</table>
</body>
</html>
