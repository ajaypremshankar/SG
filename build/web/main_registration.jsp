<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@taglib prefix="html" uri="/WEB-INF/struts-html.tld" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<title>Untitled Document</title>
<style>
.element{
height:40px;
border-bottom-style:double;
background-color:#FFFFFF;
cursor:text;
vertical-align:middle;
}
#LayerXY {
	position:absolute;
	left:13px;
	top:19px;
	width:397px;
	height:47px;
	z-index:1;
}
.style111 {
	font-size: large;
	font-weight: bold;
	color: #FF0000;
}
.style2 {color: #FFFFFF}
</style>
<script>
function confirm()
{
var x=document.forms["Registration_Bean"]["password"].value;
var y=document.forms["Registration_Bean"]["confirm_password"].value;

if(x!=y)
{
alert("Password doesn't match");
}
}
</script>
</head>
<html:javascript formName="Registration_Bean" />
<html:form action="register.php" method="post" onsubmit="return validateRegistration_Bean(this)">

<table width="456" border="0" cellpadding="0" cellspacing="0" bgcolor="#CCCCCC">
  <!--DWLayoutTable-->
  <tr>
    <td width="400" height="50" valign="top"><div align="center" class="style111">${sessionScope["Exception"]}<span class="style2">
        <% session.removeAttribute("Exception"); %>
    </span></div></td>
    <td width="56"></td>
  </tr>
  <tr>
    <td height="506" colspan="2" valign="top"><table width="457" height="500" border="0" cellspacing="5" bordercolor="#FFFFFF" bgcolor="#CCCCCC">
      <!--DWLayoutTable-->
      <tr>
        <th scope="row" colspan="2"><div style="color:#666666; font-size:x-large; text-transform:uppercase"><strong>SIGN UP</strong> AS ${param["user_type"]}</div></th>
          <td width="12"></td>
        </tr>
      <tr>
        <th width="158" scope="row"><div align="right">Email:</div></th>
            <td width="260"><input name="email" type="text" id="email" size="40"></td>
            <td></td>
        </tr>
      <tr>
        <th scope="row"><div align="right">First Name : </div></th>
            <td><input name="fname" type="text" id="fname" size="40"></td>
            <td></td>
        </tr>
      <tr>
        <th scope="row"><div align="right"><strong>Last Name : </strong></div></th>
            <td><input name="lname" type="text" id="lname" size="40"></td>
            <td></td>
        </tr>
      <tr>
        <th scope="row"><div style="color:#666666; font-size:x-large">
          <div align="right"><strong>D.O.B. : </strong></div>
            </div></th>
            <td><div align="center">
              <select name="day" id="day">
                <option>Day</option>
                <option>1</option>
                <option>2</option>
                <option>3</option>
                <option>4</option>
                <option>5</option>
                <option>6</option>
                <option>7</option>
                <option>8</option>
                <option>9</option>
                <option>10</option>
                <option>11</option>
                <option>12</option>
                <option>13</option>
                <option>14</option>
                <option>15</option>
                <option>16</option>
                <option>17</option>
                <option>18</option>
                <option>19</option>
                <option>20</option>
                <option>21</option>
                <option>22</option>
                <option>23</option>
                <option>24</option>
                <option>25</option>
                <option>26</option>
                <option>27</option>
                <option>28</option>
                <option>29</option>
                <option>30</option>
                <option>31</option>
                </select>
              <select name="month" id="month">
                <option>Month</option>
                <option>Jan</option>
                <option>Feb</option>
                <option>Mar</option>
                <option>Apr</option>
                <option>May</option>
                <option>Jun</option>
                <option>Jul</option>
                <option>Aug</option>
                <option>Sept</option>
                <option>Oct</option>
                <option>Nov</option>
                <option>Dec</option>
                </select>
              <select name="year" id="month">
                <option default>Year</option>	
                  <option>1905</option>
                  <option>1906</option>
                  <option>1907</option>
                  <option>1908</option>
                  <option>1909</option>
                  <option>1910</option>
                  <option>1911</option>
                  <option>1912</option>
                  <option>1913</option>
                  <option>1914</option>
                  <option>1915</option>
                  <option>1916</option>
                  <option>1917</option>
                  <option>1918</option>
                  <option>1919</option>
                  <option>1920</option>
                  <option>1921</option>
                  <option>1922</option>
                  <option>1923</option>
                  <option>1924</option>
                  <option>1925</option>
                  <option>1926</option>
                  <option>1927</option>
                  <option>1928</option>
                  <option>1929</option>
                  <option>1930</option>
                  <option>1931</option>
                  <option>1932</option>
                  <option>1933</option>
                  <option>1934</option>
                  <option>1935</option>
                  <option>1936</option>
                  <option>1937</option>
                  <option>1938</option>
                  <option>1939</option>
                  <option>1940</option>
                  <option>1941</option>
                  <option>1942</option>
                  <option>1943</option>
                  <option>1944</option>
                  <option>1945</option>
                  <option>1946</option>
                  <option>1947</option>
                  <option>1948</option>
                  <option>1949</option>
                  <option>1950</option>
                  <option>1951</option>
                  <option>1952</option>
                  <option>1953</option>
                  <option>1954</option>
                  <option>1955</option>
                  <option>1956</option>
                  <option>1957</option>
                  <option>1958</option>
                  <option>1959</option>
                  <option>1960</option>
                  <option>1961</option>
                  <option>1962</option>
                  <option>1963</option>
                  <option>1964</option>
                  <option>1965</option>
                  <option>1966</option>
                  <option>1967</option>
                  <option>1968</option>
                  <option>1969</option>
                  <option>1970</option>
                  <option>1971</option>
                  <option>1972</option>
                  <option>1973</option>
                  <option>1974</option>
                  <option>1975</option>
                  <option>1976</option>
                  <option>1977</option>
                  <option>1978</option>
                  <option>1979</option>
                  <option>1980</option>
                  <option>1981</option>
                  <option>1982</option>
                  <option>1983</option>
                  <option>1984</option>
                  <option>1985</option>
                  <option>1986</option>
                  <option>1987</option>
                  <option>1988</option>
                  <option>1989</option>
                  <option>1990</option>
                  <option>1991</option>
                  <option>1992</option>
                  <option>1993</option>
                  <option>1994</option>
                  <option>1995</option>
                  <option>1996</option>
                  <option>1997</option>
                  <option>1998</option>
                  <option>1999</option>
                  <option>2000</option>
                  <option>2001</option>
                  <option>2002</option>
                  <option>2003</option>
                  <option>2004</option>
                  <option>2005</option>
                  <option>2006</option>
                  <option>2007</option>
                  <option>2008</option>
                  <option>2009</option>
                  <option>2010</option>
                  <option>2011</option>
                  <option>2012</option>
                  <option>2013</option>
                </select>
            </div></td>
            <td></td>
        </tr>
      <tr>
        <th scope="row"><div align="right"><strong>School Name: </strong></div></th>
            <td><input name="school_name" type="text" id="school_name" size="40"></td>
            <td></td>
        </tr>
      <tr>
        <th scope="row"><div align="right">Gender : </div></th>
            <td><select name="sex" id="sex" style="width:260px">
              <option>male</option>
              <option>female</option>
            </select></td>
            <td></td>
        </tr>
      <tr>
        <th scope="row"><div align="right">Mobile No. : </div></th>
            <td><input name="mob" type="text" id="mob" size="40"></td>
            <td></td>
        </tr>
      <tr>
        <th scope="row"><div align="right">Password : </div></th>
            <td><input name="password" type="password" id="password" size="40"></td>
            <td></td>
        </tr>
      <tr>
        <th scope="row"><div align="right">Confirm Password : </div></th>
            <td><input name="confirm_password" type="password" id="confirm_password" size="40"></td>
            <td></td>
        </tr>
      <tr>
        
        <td colspan="2"><div align="right" >
          <input name="reset" type="reset" id="reset" value="Refill Form" style=" width:80px; cursor:pointer;">
          <input name="user_type" type="hidden" id="user_type" value="${param["user_type"]}">
          <input name="Get Started !" type="submit" id="Get Started !" value="Get Started !" style=" width:170px; cursor:pointer;">
          </div></td>
          <td></td>
        </tr>
      <tr>
        <td height="12"></td>
            <td></td>
            <td></td>
        </tr>
    </table></td>
    </tr>
  <tr>
    <td height="25">&nbsp;</td>
    <td></td>
  </tr>
</table>
</html:form>
</body>
</html>
