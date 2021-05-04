<%-- 
     Advanced Systems Project 
    Team 3
    Tattoo Parlor 
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="" media="screen"/>
  <title>Log In</title>
</head>

<body>
    <form action="Login" method="post">
        <table style="width: 50%">
            <tr>
                <td>UserName</td>
                <td><input type="text" name="username" /></td>
            </tr>
            <tr>
                <td>Password</td>
                <td><input type="text" name="password" /></td>
            </tr>
        </table>
        <input type ="submit" value="Login" />
        <h1></h1>
    </form>    
    <form action="ArtistLogIn.jsp">
       <input type="submit" value="Log in as Artist">
    </form> 
         <h1></h1>
    <form action="AdminLogIn.jsp">
    <input type="submit" value="Log in as Admin">
    </form>
      
      <p class="forgot" align="center"><a href="#">Forgot Password?</p>
      <p class="register" align="center"><a href="Register.jsp">Register</p> 
        
    </form>
 
</body>

</html>
