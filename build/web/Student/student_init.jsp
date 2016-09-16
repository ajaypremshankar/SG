<%-- 
    Document   : student_init_profile
    Created on : Jan 29, 2013, 4:24:55 AM
    Author     : ajay prem shankar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
   <%@taglib prefix="html" uri="/WEB-INF/struts-html.tld" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<title>Untitled Document</title>
</head>
<html:javascript formName="Student_comp_reg_Bean" />
<body><html:form action="student_comp_reg.php" method="post" onsubmit="return validateStudent_comp_reg_Bean(this)" enctype="multipart/form-data">

<table width="700" border="0" cellpadding="0" cellspacing="0" bgcolor="#FFFFCC" align="center">
  <!--DWLayoutTable-->
  <tr>
    <td width="161" height="35"></td>
    <td colspan="3" valign="top" style="text-align:center; color:#990033; border-style:dotted"><font size="+2">Fill Up Your Info:</font> </td>
    <td width="184"></td>
  </tr>
  <tr>
    <td height="17"></td>
    <td width="94"></td>
    <td width="160"></td>
    <td width="101"></td>
    <td></td>
  </tr>
  <tr>
    <td height="158">&nbsp;</td>
    <td colspan="3" valign="top">
		  
	<table width="100%" border="0" cellpadding="0" cellspacing="0" bgcolor="#CCCCCC" style="border-style:outset; border-color:#FFFFFF">
      <!--DWLayoutTable-->
      <tr>
        <td width="20" height="30">&nbsp;</td>
          <td width="139" rowspan="5" valign="top">
		  <table width="100%" border="0" cellpadding="0" cellspacing="0" bgcolor="#FFFFFF">
            <!--DWLayoutTable-->
            <tr>
              <td width="150" height="150">&nbsp;</td>
              </tr>
          </table></td>
          <td width="17">&nbsp;</td>
          <td width="30">&nbsp;</td>
          <td width="100">&nbsp;</td>
          <td width="23">&nbsp;</td>
          <td width="18">&nbsp;</td>
        </tr>
		
      <tr>
        <td height="36"></td>
          <td></td>
          <td colspan="3" valign="top"><div align="center">
              <input type="file" name="file" />
          </div></td>
          <td>&nbsp;</td>
        </tr>
      <tr>
        <td height="15"></td>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
        </tr>
      <tr>
        <td height="46">&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td valign="top"><!--DWLayoutEmptyCell-->&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
        </tr>
      <tr>
        <td height="23">&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
        </tr>

    </table>
        </td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td height="29">&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
    <tr>
    <td height="99">&nbsp;</td>
    <td colspan="3" valign="top"><table width="100%" border="0" cellpadding="0" cellspacing="0" bgcolor="#CCCCCC" style="border-style:outset">
      <!--DWLayoutTable-->
      <tr>
        <td width="174" height="5"></td>
          <td width="173"></td>
        </tr>
      <tr>
        <td height="32" valign="top"><div align="center">Standard:
          <select name="std">
            <option value="1">I</option>
            <option value="2">II</option>
            <option value="3">III</option>
            <option value="4">IV</option>
            <option value="5">V</option>
            <option value="6">VI</option>
            <option value="7">VII</option>
            <option value="8">VIII</option>
            <option value="9">IX</option>
            <option value="10">X</option>
            <option value="11">XI</option>
            <option value="12">XII</option>
              </select>
            <font color="#FF0000" style="vertical-align:super">*</font></div></td>
          <td valign="top"><div align="center">Section :
              <select name="section">
                <option value="A">A</option>
                <option value="B">B</option>
                <option value="C">C</option>
                <option value="D">D</option>
                <option value="E">E</option>
                <option value="F">F</option>
                </select>
              <font color="#FF0000" style="vertical-align:super">*</font>
                                                                      </div></td>
        </tr>
      <tr>
        <td height="17"></td>
          <td></td>
        </tr>
      <tr>
        <td height="32" colspan="2" valign="top"><table width="100%" border="0" cellpadding="0" cellspacing="0">
          <!--DWLayoutTable-->
          <tr>
            <td width="347" height="32" valign="top"><div align="center">
              <input name="parent_id" type="text" id="parent_id" size="50" placeholder="Parent's Email">
              <font color="#FF0000" style="vertical-align:super">*</font>
              </div></td>
              </tr>
          </table></td>
        </tr>
      <tr>
        <td height="5"></td>
          <td></td>
        </tr>
    </table></td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td height="30">&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td height="77">&nbsp;</td>
    <td colspan="3" valign="top">
        <table width="100%" border="0" cellpadding="0" cellspacing="1" bgcolor="#CCCCCC" style="border-style:outset">
      <!--DWLayoutTable-->
      <tr>
        <td width="13" height="19">&nbsp;</td>
          <td width="162">&nbsp;</td>
          <td width="160">&nbsp;</td>
          <td width="20">&nbsp;</td>
        </tr>
      <tr>
        <td height="23">&nbsp;</td>
          <td valign="top"><input name="city" type="text" id="city" placeholder="Your City"></td>
          <td valign="top"><div align="right">
            <input name="state" type="text" id="state" placeholder="Your state">
          </div></td>
          <td>&nbsp;</td>
        </tr>
      <tr>
        <td height="23">&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
        </tr>
    </table></td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td height="20">&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td height="231"></td>
    <td colspan="3" valign="top"><table width="100%" border="0" cellpadding="0" cellspacing="0" bgcolor="#CCCCCC" style="border:outset">
      <!--DWLayoutTable-->
      <tr>
        <td width="347" height="100" valign="middle"><div align="center">
          <textarea name="about" cols="50" rows="5" id="about" placeholder="Introduce Yourself (max. 400 char)" style="resize:none"></textarea>
          </div></td>
        </tr>
      <tr>
        <td height="17"></td>
        </tr>
      <tr>
        <td height="98" valign="middle"><table width="100%" border="0" cellpadding="0" cellspacing="0">
          <!--DWLayoutTable-->
          <tr>
            <td width="347" height="98" valign="top"><div align="center">
              <textarea name="hobby" cols="50" rows="5" id="hobby" placeholder="Your Hobbies (eg. Swimming,Reading)" style="resize:none"></textarea>
              </div></td>
              </tr>
          </table>          </td>
        </tr>
      <tr>
        <td height="8"></td>
        </tr>
    </table></td>
    <td></td>
  </tr>
  <tr>
    <td height="8"></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
  </tr>

  <tr>
    <td height="46">&nbsp;</td>
    <td>&nbsp;</td>
    <td valign="top"><table width="100%" border="0" cellpadding="0" cellspacing="0">
      <!--DWLayoutTable-->
      <tr>
        <td width="160" height="46" valign="top"><div align="center">
          <input name="update" type="submit" id="update" value="Update Info" style="height:40px; width:120px">
        </div></td>
        </tr>
    </table></td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
  </table></html:form>
</body>
</html>
