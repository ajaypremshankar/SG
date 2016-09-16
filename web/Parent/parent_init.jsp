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
<html:javascript formName="Parent_comp_reg_Bean" />
<body><html:form action="parent_comp_reg.php" method="post" onsubmit="return validateParent_comp_reg_Bean(this)" enctype="multipart/form-data">
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
    <td colspan="3" valign="top"><table width="100%" border="0" cellpadding="0" cellspacing="0" bgcolor="#CCCCCC" style="border-style:outset; border-color:#FFFFFF">
      <!--DWLayoutTable-->
      <tr>
        <td width="20" height="30">&nbsp;</td>
          <td width="139" rowspan="3" valign="top"><table width="100%" border="0" cellpadding="0" cellspacing="0" bgcolor="#FFFFFF">
            <!--DWLayoutTable-->
            <tr>
              <td width="150" height="150">&nbsp;</td>
              </tr>
          </table></td>
          <td width="17">&nbsp;</td>
          <td width="153">&nbsp;</td>
          <td width="18">&nbsp;</td>
        </tr>
      <tr>
        <td height="36"></td>
          <td></td>
          <td valign="top"><div align="center">
            <input name="file" type="file" size="5">
          </div></td>
          <td>&nbsp;</td>
        </tr>
      <tr>
        <td height="84"></td>
          <td></td>
          <td></td>
          <td></td>
        </tr>
      

    </table></td>
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
        <td width="347" height="26" valign="top"><table width="100%" border="0" cellpadding="0" cellspacing="0">
          <!--DWLayoutTable-->
          <tr>
            <td width="347" height="26" valign="top"><div align="center">
              <input name="occupation" type="text" id="occupation" size="50" placeholder="Occupation ">
                <font color="#FF0000" style="vertical-align:super">*</font></div></td>
              </tr>
        </table></td>
          </tr>
      <tr>
        <td height="28">&nbsp;</td>
      </tr>
      
      
      
      <tr>
        <td height="32" valign="top"><table width="100%" border="0" cellpadding="0" cellspacing="0">
          <!--DWLayoutTable-->
          <tr>
            <td width="347" height="32" valign="top"><div align="center">
              <input name="education" type="text" id="education" size="50" placeholder="Degree You Hold">
              <font color="#FF0000" style="vertical-align:super">*</font>
              </div></td>
              </tr>
          </table></td>
        </tr>
      <tr>
        <td height="5"></td>
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
    <td colspan="3" valign="top"><table width="100%" border="0" cellpadding="0" cellspacing="1" bgcolor="#CCCCCC" style="border-style:outset">
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
    <td height="28">&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td height="231">&nbsp;</td>
    <td colspan="3" valign="top"><table width="100%" border="0" cellpadding="0" cellspacing="0" bgcolor="#CCCCCC" style="border:outset">
      <!--DWLayoutTable-->
      <tr>
        <td width="347" height="57" valign="top"><table width="100%" border="0" cellpadding="0" cellspacing="0">
          <!--DWLayoutTable-->
          <tr>
            <td width="347" height="57" valign="middle"><div align="center">
              <select name="spouse_gender" id="spouse_gender">
                <option value="Mr.">Mr.</option>
                <option value="Mrs.">Mrs.</option>
              </select>
              <input name="spouse" type="text" id="spouse" size="40" placeholder="Your spouse name...">
            </div></td>
          </tr>
        </table>
        </td>
          </tr>
      <tr>
        <td height="25">&nbsp;</td>
      </tr>
      <tr>
        <td height="103" valign="middle"><div align="center">
          <textarea name="about" cols="50" rows="5" id="about" placeholder="Introduce Yourself (max. 400 char)" style="resize:none"></textarea>
        </div></td>
          </tr>
      <tr>
        <td height="38">&nbsp;</td>
      </tr>
      
      
      
      
      
    </table></td>
    <td>&nbsp;</td>
  </tr>
  
  
  
  
  
  
  
  

  <tr>
    <td height="46">&nbsp;</td>
    <td>&nbsp;</td>
    <td valign="top"><table width="100%" border="0" cellpadding="0" cellspacing="0">
      <!--DWLayoutTable-->
      <tr>
        <td width="160" height="46" valign="middle"><div align="center">
          <input name="update" type="submit" id="update" value="Update Info" style="height:40px; width:120px">
        </div></td>
        </tr>
    </table></td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
  </table>
</html:form>
</body>
</html>
