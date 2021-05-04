<%-- 
    Document   : Login
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
        background: linear-gradient(rgba(0,0,0,0.5), rgba(0,0,0,0.5));
        background-image: url("HomeImage.jpg");
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

<h1>Register with your info</h1>


<!-- From allowing customer to log into their account using their id and password -->
<form action="RegisterServlet">
  <label for="custid">Account ID:</label>
  <input type="text" id="rid" name="rid"><br><br>
  <label for="custid">First Name:</label>
  <input type="text" id="rfname" name="rfname"><br><br>
  <label for="custid">Last Name:</label>
  <input type="text" id="rlname" name="rlname"><br><br>
  <label for="custid">Username:</label>
  <input type="text" id="runame" name="runame"><br><br>
  <label for="password">Password:</label>
  <input type="password" id="rpswd" name="rpswd"><br><br>

  <input type="submit" value="Create Account">
  <input type="reset" value="Clear">
</form>

</body>

</html>
