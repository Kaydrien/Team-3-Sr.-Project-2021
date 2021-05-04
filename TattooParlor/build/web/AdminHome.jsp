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

<h1>Admin Home</h1>


<!-- From allowing customer to log into their account using their id and password -->
<form action="AddArtistServlet">
  <label>Add a new Artist to the Studio Records:</label>
  <br> 
  <h1></h1>
  <label for="arrid">Artist ID:</label>
  <input type="text" id="arrid" name="arrid"><br><br>
  <label for="arrfn">First Name:</label>
  <input type="text" id="arrfn" name="arrfn"><br><br>
  <label for="arrln">Last Name:</label>
  <input type="text" id="arrln" name="arrln"><br><br>
  <label for="arrun">Username:</label>
  <input type="text" id="arrun" name="arrun"><br><br>
  <label for="arrpwd">Password:</label>
  <input type="password" id="arrpwd" name="arrpwd"><br><br>

  <input type="submit" value="Add">
  <input type="reset" value="Clear">
</form>

</body>

</html>
