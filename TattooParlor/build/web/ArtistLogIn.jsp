<%-- 
    Document   : Dentist login page
    Created on : Mar 5, 2021, 11:24:20 AM
    Author     : kaydrien Johnson
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    
    <!-- CSS code -->
<style>
body {
margin: 0;
Padding: 0;
}
	.text {
	width: 100%;
	height: 100vh;
	background: linear-gradient(rgba(0,0,0,0.5), rgba(0,0,0,0.5)), url(bank.jpg);
	background-size: cover;
	background-position: center;
	display: flex;
	align-items: center;
	justify-content: center;
	color: #fff;
	font-size: 2vw;
	}


	</style>
        
        <!-- Main code -->
<body>
    
    

<h1>Artists, please use your studio issued ID and Password to log into your account:</h1>

<!-- Form to allow the dentist to enter their information and log into their account -->
<form action="ArtistLoginServlet">
  <label for="custid">ID:</label>
  <input type="text" id="ArtistID" name="ArtistID"><br><br>
  <label for="password">Password:</label>
  <input type="password" id="ArtistPswd" name="ArtistPswd"><br><br>
  <input type="submit" value="Login">
  <input type="reset" value="Clear">
</form>





</body>
</html>
