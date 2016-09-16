<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<title>Untitled Document</title>
<style type="text/css">
<!--
#Layer1 {
	position:absolute;
	left:211px;
	top:24px;
	width:682px;
	height:53px;
	z-index:1;
}
.style4 {font-size: 18px}
.style5 {color: #FF0000}
-->
</style>
</head>
<%@taglib prefix="html" uri="/WEB-INF/struts-html.tld" %>

<html:javascript formName="School_reg_Bean" />
<body><html:form action="school_reg_action.php" method="post" onsubmit="return validateSchool_reg_Bean(this)">
<table width="700" border="0" cellpadding="0" cellspacing="0" align="center" style="vertical-align:top">
  <!--DWLayoutTable-->
  <tr>
    <td width="702" height="575" valign="top"><div style="text-align:center; color:#666666; font-size:24px; background-color:#CCCCCC">
      <p bgcolor="white"><span class="style5">ERROR</span></p>
      <p>SCHOOL REGISTRATION : &nbsp;</p>
    </div>
      <div style="text-align:center; font-size:24px; color:#999999; height:50px; vertical-align:bottom">
        <p>Basic Info : </p>
      </div>
      <table width="702" height="345" border="0" align="center" cellspacing="7" bordercolor="#FF00FF" bgcolor="#CCCCCC">
        <!--DWLayoutTable-->
        <tr>
          <th width="324" height="24" valign="middle" class="style4" scope="row"><div align="right">School Name : <font color="#FF0000">*</font></div></th>
            <th width="353" class="style4" scope="row">
              <div align="left">
                <input name="school_name" type="text" id="school_name" size="50">
            </div></th></tr>
        <tr>
          <th height="24" scope="row"><div align="right">Board :<font color="#FF0000">*</font></div></th>
            <th scope="row">
              <div align="left">
                <select name="board" id="board">
                  <option>Allahabad Board (UP Board)</option>
                  <option>CSBE</option>
                  <option>ICSE</option>
                  <option>ICS</option>
                </select>
          </div></th></tr>
        <tr>
          <th height="24" scope="row"><div align="right">Registered Under : <font color="#FF0000">*</font></div></th>
            <th scope="row">
              <div align="left">
                <select name="registered_under" id="registered_under">
                  <option>UGC</option>
                  <option>AICTE</option>
                </select>
          </div></th></tr>
        <tr>
          <th height="24" scope="row"><div align="right">Type Of School : </div></th>
            <th scope="row"><div align="left">
              <select name="school_type" id="school_type">
                <option>Private</option>
                <option>Government</option>
                <option>Undertaken by Gov.</option>
                </select>
            </div></th>
          </tr>
        <tr>
          <th height="24" scope="row"><div align="right">Website : <font color="#FF0000">*</font></div></th>
            <th scope="row">
              <div align="left">
                <input name="website" type="text" id="website" size="50">
          </div></th></tr>
        <tr>
          <th height="24" scope="row"><div align="right">School Mailing Address ( Email ) : <font color="#FF0000">*</font></div></th>
            <th scope="row">
              <div align="left">
                <input name="school_email" type="text" id="school_email" size="50">
          </div></th></tr>
        <tr>
          <th height="24" scope="row"><div align="right">Established In ( Year ) : &nbsp;&nbsp;</div></th>
            <th scope="row">
              <div align="left">
                <input name="estb_year" type="text" id="estb_year" size="50" maxlength="4">
          </div></th></tr>
        <tr>
          <th height="21" bgcolor="#CCCCCC" scope="row">&nbsp;</th>
          <th bgcolor="#CCCCCC" scope="row">&nbsp;</th>
        </tr>
        <tr>
          <th height="24" scope="row"><div align="right">School Landline No. : <font color="#FF0000">*</font></div></th>
            <th scope="row">
              <div align="left">
                <input name="school_phone" type="text" id="school_phone" size="50">
          </div></th></tr>
        <tr>
          <th height="24" scope="row"><div align="right">City : <font color="#FF0000">*</font></div></th>
            <th scope="row">
              <div align="left">
                <input name="city" type="text" id="city" size="50">
          </div></th></tr>
        <tr>
          <th height="24" scope="row"><div align="right">State :&nbsp;&nbsp;</div></th>
            <th scope="row"><div align="left">
              <input name="state" type="text" id="state" size="50">
            </div></th>
          </tr>
        </table>
      <div style="text-align:center; font-size:24px; color:#999999; height:50px; vertical-align:bottom">
        <p>Principal's Info :</p>
      </div>      <table width="700" border="0" cellspacing="7" bgcolor="#CCCCCC">
        <tr>
          <th width="335" scope="row"><div align="right">Principal's Name :<font color="#FF0000">*</font> </div></th>
            <td width="340"><input name="principal_name" type="text" id="principal_name" size="50"></td>
          </tr>
        <tr>
          <th scope="row"><div align="right">Principal's Mobile No. :<font color="#FF0000">*</font> </div></th>
            <td><input name="principal_mob" type="text" id="principal_mob" size="50"></td>
          </tr>
        <tr>
          <th scope="row"><div align="right">Principal's Email : <font color="#FF0000">*</font></div></th>
            <td><input name="principal_email" type="text" id="principal_email" size="50"></td>
          </tr>
        </table></td>
  </tr>
  <tr>
    <td height="179" valign="bottom"><div style="text-align:center; font-size:24px; color:#999999; height:50px; vertical-align:bottom">
      <p style="vertical-align:bottom">Account Detail  :</p>
    </div>
      <table width="700" border="0" cellspacing="7" bgcolor="#CCCCCC">
          <tr>
            <th width="338" scope="row"><div align="right">Password : <font color="#FF0000">*</font></div></th>
            <td width="337"><input name="password" type="password" id="password" size="50"></td>
          </tr>
          <tr>
            <th scope="row"><div align="right">Confirm Password : <font color="#FF0000">*</font></div></th>
            <td><input name="confirm_password" type="password" id="confirm_password" size="50"></td>
          </tr>
        </table>
      <p>&nbsp;</p>
      <table width="699" border="0" cellspacing="7" bgcolor="#CCCCCC">
        <tr>
          <th width="339" scope="row"><div align="right">
            <input name="reset" type="reset" id="reset" style="width:250px; cursor:pointer;" value="Refill Form">
            </div></th>
            <th width="305" scope="row">
                
              <div align="right">
                <input type="submit" name="Submit" value="get global" style="width:250px; cursor:pointer; text-transform:capitalize">
              </div></th>
          </tr>
      </table>
      <p>&nbsp;</p></td>
  </tr>
</table>
</html:form>
</body>
</html>
