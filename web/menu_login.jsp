<html>

<head>
<link rel="stylesheet" type="text/css" href="menu1.css" />

</head>
<%@page import="Global.Model.ProfileInfoBundle;" %>

<jsp:scriptlet>
ProfileInfoBundle pib=(ProfileInfoBundle)session.getAttribute("user");
</jsp:scriptlet>
<body>
<ul id="menu">
    <li> <a href='home.php'>Home</a></li>
	<li><a href="#">Your School</a></li>
	<li class="main">
		<a href="profile.php">Profile</a>
		<ul class="submenu">
                    <li><a href="profile.php">Edit Profile</a></li>
			
		</ul>
  </li>
	<li><a href="#">About</a></li>
	<li><a href="#">Contact Us</a></li>
	<li><a href="#">Settings</a></li>	
	<li><a href="logout.php">Logout</a></li>
	
</ul>

</body>
</html>