<%-- 
    Document   : CustomerInfo
    Created on : Mar 30, 2021, 9:56:31 AM
    Author     : kaydrien Johnson
--%>


<!-- Import all packages needed -->

<%@page import = "Tattoo.Admin"%>
<%@page import = "java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!-- Main code -->

<!DOCTYPE html>
<html>
    <head>
        
        
        <!-- Java code to bring variable a1 from the session and retrieve all the customer info in the database-->
        
        <%
        Admin c1;
        
        c1 = (Admin)session.getAttribute("a");

        c1.display();
        
        %>
        
        
        <!-- CSS code -->
        
        <style>
            table {
                width:100%;
            }
            table, th, td {
                border: 1px solid black;
                border-collapse: collapse;
            }
            th, td {
                padding: 15px;
                text-align: left;
            }
            #t01 tr:nth-child(even) {
                background-color: #eee;
            }
            #t01 tr:nth-child(odd) {
                background-color: #fff;
            }
            #t01 th {
                background-color: black;
                color: white;
            }
            
            MyAppmnt {
                padding: 15px;
            }
            
        </style>
 
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>UserHome</title>
    </head>
    
    <!-- Body -->
    
    
    <body>
        <h1>Welcome, <%=c1. getfname()%></h1>
        <h3>We here at Team 3 are excited to see you!</h3>
        
        <!-- A table to hold the customer information drawn from the database using the p1 variable and the Account class -->
        
        <table id="t01">
            <tr>
                <th>Firstname</th>
                <th>Lastname</th> 
                <th>Username</th>
                <th>Password</th>

            </tr>
            <tr>
                <td><%=c1. getfname()%></td>
                <td><%=c1. getlname()%></td>
                <td><%=c1. getunam()%></td>
                <td><%=c1. getpassword()%></td>

            </tr>
        </table>
        
        
       <!-- H1 tags for visual adjustemnt --> 
        <h1> </h1>
        
        <!-- A button leading to the change info page where the use can change their information in the database -->
        <form action="MyAccount.jsp">
        <input type="submit" value="Change My Information">
        </form>
        
        <h3></h3> 
        
        
        <!-- Table to hold date and time appointment info -->
       <table id="t01">
           <tr>
                <th>Your Past and upcoming Appointments:</th>

            </tr>
           
           <%
    try{
         
        Connection connection;
         
        Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
	System.out.println("Driver loaded");
                       
	connection = DriverManager.getConnection("jdbc:ucanaccess://C:/Users/kaydr/Documents/School/Java/TattooParlorDatabase.accdb"); 
	System.out.println("Database connected");

        Statement statement = connection.createStatement();
        
        ResultSet resultSet = statement.executeQuery ("SELECT day, ApmntTime from Appointments where Appointments.CustomerID = " + c1.getid());
        while (resultSet.next())
        {
        
%>

            <tr>
                <td><%=resultSet.getString("day")%>, <%=resultSet.getString("ApmntTime")%></td>
            </tr>
            
            
            <%
        }//end of while loop
    }//end of try
    catch (Exception e) {
%>
<h1 color="red">Exception!</h1> <!-- This will display for a caught excpetion -->
<%
}
 %> 
       </table>
            
            
            
        <h1>  </h1>
        
        <!-- A button to go to the page where the user can change their appointemnt -->
       <form action="Schedule.jsp">
            <input type="submit" value="Make appointment/View schedule">
       </form>
        
        <h1>  </h1>
        
        <!-- Button that moves the user back to the login page -->
        <form action="home.jsp">
            <input type="submit" value="Log Out">
        </form>

    </body>
</html>
