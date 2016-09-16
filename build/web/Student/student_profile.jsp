<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<title>Untitled Document</title>

<%@page import="Global.Model.ProfileInfoBundle, Global.Model.Student_Info, Global.Model.*;" %>


<jsp:scriptlet>
ProfileInfoBundle pib=(ProfileInfoBundle)session.getAttribute("user");
Student_Info si=(Student_Info)pib.getUser_specific();
String dob[]=pib.getDob().split("\\.");
int day=Integer.parseInt(dob[0]);
int year=Integer.parseInt(dob[2]);
</jsp:scriptlet>


<jsp:scriptlet>
Student_Profile_Manager spm=(Student_Profile_Manager)ObjectSerializer.Reader(pib.getId(), ObjectSerializer.PROFILE, config.getServletContext().getRealPath("/"));


</jsp:scriptlet>
<style type="text/css">
<!--
.style2 {font-family: "Courier New", Courier, monospace;
font-weight:bold;
color:#003399;
font-size: xx-large;
}
input,textarea,select {
border-width:1px;
background-color:#FFFF00;
border-radius:4px;
box-shadow: -1px 0 0 rgba(255,255,255,.3);		
border-color:#CCCCCC;
margin:0px;
text-align:right;
font-size:16px;
text-transform:capitalize;
}
.style3 {
	font-size: large;
	color: #333333;
}
.style4 {color: #333333}
.style5 {font-size: medium}
.style6 {
	font-size: large;
	font-weight: bold;
}
a:link {
	text-decoration: none;
}
a:visited {
	text-decoration: none;
}
a:hover {
	text-decoration: none;
}
a:active {
	text-decoration: none;
}
-->
</style></head>
<jsp:scriptlet>
String btn=request.getParameter("btn");
boolean basic=true, adv=true;
if(btn!=null&&!btn.equals("")){
if(btn.equalsIgnoreCase("edit_basic"))
basic=false;
else if(btn.equalsIgnoreCase("edit_advance"))
adv=false;
}
</jsp:scriptlet>
<body>
<table width="800" border="0" cellpadding="0" cellspacing="0" bgcolor="#CCCCCC" align="center">
  <!--DWLayoutTable-->
  <tr>
    <td width="550" height="36" valign="top"><table width="100%" border="0" cellpadding="0" cellspacing="0">
      <!--DWLayoutTable-->
      <tr>
        <td width="550" height="36" valign="top"><div align="center"><span class="style2">Profile </span><span class="style2">:</span></div></td>
        </tr>
      
    </table></td>
    <td width="250" rowspan="2" valign="top"><!--DWLayoutEmptyCell-->&nbsp;</td>
  </tr>
  <tr>
    <td height="6"></td>
  </tr>
  <tr>
    <td height="8"></td>
    <td></td>
  </tr>
  <tr>
    <td height="550" colspan="2" valign="top"><table width="100%" border="0" cellpadding="0" cellspacing="0" bgcolor="#CCCCCC">
      <!--DWLayoutTable-->
      <tr>
        <td width="800" height="282" valign="top">
		
		<form action="basic_info_update_action.php" method="post" name="basic" />
		  <table width="100%" border="0" cellpadding="0" cellspacing="0" bgcolor="#FFFF00">
		    <!--DWLayoutTable-->
		    <tr>
		      <td width="134" height="26" valign="top"><table width="100%" border="0" cellpadding="0" cellspacing="0">
		        <!--DWLayoutTable-->
		        <tr>
		          <td width="154" height="26" valign="middle"><div align="left"><strong><span class="style3">BASIC INFO. : </span></strong></div></td>
                    </tr>
		        
		        </table></td>
                <td width="294" valign="top"><table width="93%" border="0" cellpadding="0" cellspacing="0">
                    <!--DWLayoutTable-->
                    <tr>
                      <td width="274" height="26" valign="middle"><div align="right"><strong><span class="style4">First Name:<br> 
                                      <input name="fname" value='<%= pib.getFname() %>' type="text" id="fname" size="30" <% if(basic) { %> disabled <% } %>>
                      </span></strong></div></td>
                    </tr>
                </table></td>
                <td width="69">&nbsp;</td>
                <td width="263" valign="top"><table width="100%" border="0" cellpadding="0" cellspacing="0">
                    <!--DWLayoutTable-->
                    <tr>
                      <td width="267" height="22" valign="middle"><div align="right"><strong><span class="style4">Last Name:<br>
                        <input name="lname" value='<%= pib.getLname() %>' type="text" id="lname" size="30" <% if(basic) { %> disabled <% } %>>
                      </span></strong></div></td>
                    </tr>
                    <tr>
                      <td height="4"></td>
                    </tr>
                    
                    
                </table></td>
                <td width="40">&nbsp;</td>
		    </tr>
		    <tr>
		      <td height="13"></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
		    </tr>
		    <tr>
		      <td height="26">
			  <a href="profile.php?btn=edit_basic">
			  <input name="edit_basic" type="button" id="edit_basic" style="height:30px;" value="Edit Basic Info">
			  </a>
			  </td>
                <td valign="top"><table width="93%" border="0" cellpadding="0" cellspacing="0">
                    <!--DWLayoutTable-->
                    <tr>
                      <td width="273" height="26" valign="top"><div align="right"><strong><span class="style4">DOB :
					  <br>
					                  </span></strong>
                        
                        <select name="day" id="day" <% if(basic) { %> disabled <% } %>>
                          <option>Day</option>
                          <% for(int i=1; i<31;i++){ %>
                          <option <% if(day==i){ %> selected <% } %> ><%= i %></option>
                          <% } %>
                          </select>
                        <select name="month" id="month" <% if(basic) { %> disabled <% } %>>
                          <option>Month</option>
                          <option<% if(dob[1].equalsIgnoreCase("jan")){ %> selected <% } %>>Jan</option>
                          <option<% if(dob[1].equalsIgnoreCase("feb")){ %> selected <% } %>>Feb</option>
                          <option<% if(dob[1].equalsIgnoreCase("mar")){ %> selected <% } %>>Mar</option>
                          <option<% if(dob[1].equalsIgnoreCase("apr")){ %> selected <% } %>>Apr</option>
                          <option<% if(dob[1].equalsIgnoreCase("may")){ %> selected <% } %>>May</option>
                          <option<% if(dob[1].equalsIgnoreCase("jun")){ %> selected <% } %>>Jun</option>
                          <option<% if(dob[1].equalsIgnoreCase("jul")){ %> selected <% } %>>Jul</option>
                          <option<% if(dob[1].equalsIgnoreCase("aug")){ %> selected <% } %>>Aug</option>
                          <option<% if(dob[1].equalsIgnoreCase("sept")){ %> selected <% } %>>Sept</option>
                          <option<% if(dob[1].equalsIgnoreCase("oct")){ %> selected <% } %>>Oct</option>
                          <option<% if(dob[1].equalsIgnoreCase("nov")){ %> selected <% } %>>Nov</option>
                          <option<% if(dob[1].equalsIgnoreCase("dec")){ %> selected <% } %>>Dec</option>
                          </select>
                        <select name="year" id="month" <% if(basic) { %> disabled <% } %>>
                          <option default>Year</option>
                          <% for(int i=1905; i<2013;i++){ %>
                          <option <% if(year==i){ %> selected <% } %> ><%= i %></option>
                          <% } %>
                          </select>
                        
                      </div></td>
                    </tr>
                </table></td>
                <td>&nbsp;</td>
                <td valign="top"><table width="100%" border="0" cellpadding="0" cellspacing="0">
                    <!--DWLayoutTable-->
                    <tr>
                      <td width="266" height="26" valign="top"><div align="right"><strong><span class="style4">Mobile No:<br>
                              <input name="mob" value='<%= pib.getMob() %>' type="text" id="mob" size="30" <% if(basic) { %> disabled <% } %>>
                      </span></strong></div></td>
                    </tr>
                </table></td>
                <td>&nbsp;</td>
		    </tr>
		    <tr>
		      <td height="14"></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
		    </tr>
		    <tr>
		      <td height="26"></td>
                <td valign="top"><table width="92%" border="0" cellpadding="0" cellspacing="0">
                    <!--DWLayoutTable-->
                    <tr>
                      <td width="271" height="26" valign="top"><div align="right"><strong><span class="style4">City :<br>
                        <input name="city" value='<%= pib.getCity() %>' type="text" id="city" size="30" <% if(basic) { %> disabled <% } %>>
                      </span></strong></div></td>
                    </tr>
                </table></td>
                <td>&nbsp;</td>
                <td valign="top"><table width="100%" border="0" cellpadding="0" cellspacing="0">
                    <!--DWLayoutTable-->
                    <tr>
                      <td width="263" height="26" valign="top"><div align="right"><strong><span class="style4">State :<br>
                        <input name="state" type="text" value='<%= pib.getState() %>' id="state" size="30" <% if(basic) { %> disabled <% } %>>
                      </span></strong></div></td>
                    </tr>
                </table></td>
                <td></td>
		    </tr>
		    <tr>
		      <td height="13"></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
		    </tr>
		    <tr>
		      <td height="51"></td>
		      <td valign="top"><table width="92%" border="0" cellpadding="0" cellspacing="0">
		        <!--DWLayoutTable-->
		        <tr>
		          <td width="270" height="50"><div align="right"><strong><span class="style5">Address:<br></span></strong>
		              <textarea name="address" cols="22" rows="3" id="address" <% if(basic) { %> disabled <% } %>>
                               <%= pib.getAddress() %>
                              </textarea>
		            </div></td>
                    </tr>
		        </table></td>
                <td></td>
		        <td valign="middle"><div align="right"><strong><span class="style4">Country :<br>
		              <input name="country" value='<%= pib.getCountry() %>' type="text" id="country" size="30" <% if(basic) { %> disabled <% } %>>
              </span></strong></div></td>
		      <td></td>
		    </tr>
		    <tr>
		      <td height="11"></td>
		      <td></td>
		      <td></td>
		      <td></td>
		      <td></td>
		    </tr>
		    <tr>
		      <td height="19"></td>
		      <td rowspan="2" valign="top"><table width="92%" border="0" cellpadding="0" cellspacing="0">
		        <!--DWLayoutTable-->
		        <tr>
		          <td width="271" height="26"><div align="right"><strong><span class="style4">Add Another Email :<br>
		                  <input name="add_email" type="text" id="add_email" size="30" <% if(basic) { %> disabled <% } %> style="text-transform:none">
                  </span></strong></div></td>
		            </tr>
		        </table></td>
		      <td></td>
                <td>&nbsp;</td>
                <td></td>
		    </tr>
		    <tr>
		      <td height="33"></td>
		      <td></td>
		      <td valign="top"><table width="100%" border="0" cellpadding="0" cellspacing="0">
                    <!--DWLayoutTable-->
                    <tr>
                      <td width="264" height="26" valign="top"><div align="right">
                        <input name="Cancel" type="button" id="Cancel" value="Cancel" <% if(basic) { %> disabled <% } %>>
                        &nbsp;
                        <input name="update" type="submit" id="update" value="Update Info" <% if(basic) { %> disabled <% } %>>
                      </div></td>
                    </tr>
                    <tr>
                      <td height="7"></td>
                    </tr>
                </table></td>
                <td></td>
		      </tr>
		    </table>
			</form>		</td>
      </tr>
      <tr>
        <td height="18"></td>
      </tr>
      <tr>
        <td height="250" valign="top">
		<form action="student_advance_info_update_action.php" method="post" >
		<table width="100%" border="0" cellpadding="0" cellspacing="0" bgcolor="#FFFF00">
          <!--DWLayoutTable-->
          <tr>
            <td width="133" height="8"></td>
            <td width="271"></td>
            <td width="96"></td>
            <td width="263"></td>
            <td width="37"></td>
          </tr>
          <tr>
            <td height="26"><span class="style6">Advanced Info : </span></td>
            <td valign="top"><table width="100%" border="0" cellpadding="0" cellspacing="0">
              <!--DWLayoutTable-->
              <tr>
                <td width="269" height="26" valign="top"><div align="right">
                  <div align="right"><strong>Standard:
                    <select name="std" <% if(adv) { %> disabled <% } %>>
                        <option value="1"<% if(si.getStd().equalsIgnoreCase("1")){ %> selected <% } %>>I</option>
                        <option value="2"<% if(si.getStd().equalsIgnoreCase("2")){ %> selected <% } %>>II</option>
                        <option value="3"<% if(si.getStd().equalsIgnoreCase("3")){ %> selected <% } %>>III</option>
                        <option value="4"<% if(si.getStd().equalsIgnoreCase("4")){ %> selected <% } %>>IV</option>
                        <option value="5"<% if(si.getStd().equalsIgnoreCase("5")){ %> selected <% } %>>V</option>
                        <option value="6"<% if(si.getStd().equalsIgnoreCase("6")){ %> selected <% } %>>VI</option>
                        <option value="7"<% if(si.getStd().equalsIgnoreCase("7")){ %> selected <% } %>>VII</option>
                        <option value="8"<% if(si.getStd().equalsIgnoreCase("8")){ %> selected <% } %>>VIII</option>
                        <option value="9"<% if(si.getStd().equalsIgnoreCase("9")){ %> selected <% } %>>IX</option>
                        <option value="10"<% if(si.getStd().equalsIgnoreCase("10")){ %> selected <% } %>>X</option>
                        <option value="11"<% if(si.getStd().equalsIgnoreCase("11")){ %> selected <% } %>>XI</option>
                        <option value="12"<% if(si.getStd().equalsIgnoreCase("12")){ %> selected <% } %>>XII</option>
                      </select>
                    </strong></div>
                  </div></td>
                      <td width="2">&nbsp;</td>
                </tr>
            </table></td>
            <td>&nbsp;</td>
            <td valign="top"><table width="100%" border="0" cellpadding="0" cellspacing="0">
              <!--DWLayoutTable-->
              <tr>
                <td width="263" height="26"><div align="right">
                  <div align="right"><strong>Section :</strong>
                    <select name="section" <% if(adv) { %> disabled <% } %>>
                      <option value="A"<% if(si.getSection().equalsIgnoreCase("A")){ %> selected <% } %>>A</option>
                      <option value="B"<% if(si.getSection().equalsIgnoreCase("B")){ %> selected <% } %>>B</option>
                      <option value="C"<% if(si.getSection().equalsIgnoreCase("C")){ %> selected <% } %>>C</option>
                      <option value="D"<% if(si.getSection().equalsIgnoreCase("D")){ %> selected <% } %>>D</option>
                      <option value="E"<% if(si.getSection().equalsIgnoreCase("E")){ %> selected <% } %>>E</option>
                      <option value="F"<% if(si.getSection().equalsIgnoreCase("F")){ %> selected <% } %>>F</option>
                    </select>
                  </div>
                </div></td>
              </tr>
            </table>            </td>
            <td>&nbsp;</td>
          </tr>
          <tr>
            <td height="20"></td>
            <td>&nbsp;</td>
            <td></td>
            <td></td>
            <td></td>
          </tr>
          <tr>
            <td height="67">
			<a href="profile.php?btn=edit_advance">
			<input name="edit_advance" type="button" id="edit_advance" style="height:30px;" value="Edit Advance Info">
			</a>
			</td>
            <td valign="top"><table width="100%" border="0" cellpadding="0" cellspacing="0">
              <!--DWLayoutTable-->
              <tr>
                <td width="271" height="67"><div align="right"><strong>About Me: 
                            <br><textarea name="about" cols="22" rows="3" id="about" placeholder="400 char max." <% if(adv) { %> disabled <% } %>>
<% if(!si.getAbout().equals("null")){ %>
<%= si.getAbout() %> <% } %>
</textarea>
                </strong></div></td>
              </tr>
            </table>            </td>
            <td></td>
            <td valign="top"><table width="100%" border="0" cellpadding="0" cellspacing="0">
              <!--DWLayoutTable-->
              <tr>
                <td width="263" height="67"><div align="right"><strong>Hobbies: <br>
                    <textarea name="hobbies" cols="22" rows="3" id="hobbies" placeholder="One per Line" <% if(adv) { %> disabled <% } %>>
<% if(spm!=null&&spm.getHobbies()!=null) { %><%= spm.getHobbies().toString().substring(1, spm.getHobbies().toString().length()-1) %><% } %></textarea>
                </strong></div></td>
              </tr>
            </table>            </td>
            <td></td>
          </tr>
          <tr>
            <td height="21"></td>
            <td>&nbsp;</td>
            <td></td>
            <td></td>
            <td></td>
          </tr>
          <tr>
            <td height="80"></td>
            <td valign="top"><table width="100%" border="0" cellpadding="0" cellspacing="0">
              <!--DWLayoutTable-->
              <tr>
                <td width="271" height="80"><div align="right"><strong>favorite Subjects : <br>
                    <textarea name="subjects" cols="22" rows="3" id="subjects" placeholder="One per Line" <% if(adv) { %> disabled <% } %>>
<% if(spm!=null&&spm.getSubjects()!=null) { %><%= spm.getSubjects().toString().substring(1, spm.getSubjects().toString().length()-1) %><% } %></textarea>
                </strong></div></td>
              </tr>
            </table>            </td>
            <td></td>
            <td valign="top"><table width="100%" border="0" cellpadding="0" cellspacing="0">
              <!--DWLayoutTable-->
              <tr>
                <td width="263" height="80"><div align="right"><strong>I want to Be : <br>
                    <textarea name="career" cols="22" rows="3" id="career" placeholder="atleast 3 lines" <% if(adv) { %> disabled <% } %>>
<% if(spm!=null&&spm.getCareer()!=null) { %><%= spm.getCareer() %><% } %></textarea>
                </strong></div></td>
              </tr>
            </table>            </td>
            <td></td>
          </tr>
          <tr>
            <td height="25"></td>
            <td>&nbsp;</td>
            <td></td>
            <td>&nbsp;</td>
            <td></td>
          </tr>
          <tr>
            <td height="29"></td>
            <td>&nbsp;</td>
            <td></td>
            <td valign="top"><table width="100%" border="0" cellpadding="0" cellspacing="0">
              <!--DWLayoutTable-->
              <tr>
                <td width="263" height="29"><div align="right">
                  <input name="Cancel2" type="button" id="Cancel2" value="Cancel" <% if(adv) { %> disabled <% } %>>
  &nbsp;
  <input name="update2" type="submit" id="update2" value="Update Info" <% if(adv) { %> disabled <% } %>>
                </div></td>
              </tr>
            </table>
            </td>
            <td></td>
          </tr>
          
        </table>
		</form>
		</td>
      </tr>
      <tr>
        <td height="80">&nbsp;</td>
      </tr>
    </table>    </td>
  </tr>
</table>
</body>
</html>
