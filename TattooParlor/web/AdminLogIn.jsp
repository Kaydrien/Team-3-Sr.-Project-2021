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
    
    

<h1>Admin Login:</h1>

<!-- Form to allow the dentist to enter their information and log into their account -->
<form action="AdminLoginServlet">
  <label for="AdminID">Admin ID:</label>
  <input type="text" id="AdminID" name="AdminID"><br><br>
  <label for="AdminPswd">Password:</label>
  <input type="password" id="AdminPswd" name="AdminPswd"><br><br>
  <input type="submit" value="Login">
  <input type="reset" value="Clear">
</form>





</body>
</html>
