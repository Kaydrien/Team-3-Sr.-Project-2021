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
        Admin ss;
        
        ss = (Admin)session.getAttribute("a");

        ss.display();
        
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
        <h1>Here you can view your favorite artists schedules and find the perfect time for your next inking!</h1>

        
        <!-- A table to hold the customer information drawn from the database using the p1 variable and the Account class -->
        
        
        <!-- Table to hold date and time appointment info -->
        
       <table id="t01">
           <tr>
               <th>Artist ID</th>
                <th>Artist</th>
                <th>Day</th>
                <th>Time</th>
                

            </tr>
           
           <%
    try{
         
        Connection connection;
         
        Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
	System.out.println("Driver loaded");
                       
	connection = DriverManager.getConnection("jdbc:ucanaccess://C:/Users/kaydr/Documents/School/Java/TattooParlorDatabase.accdb"); 
	System.out.println("Database connected");

        Statement statement = connection.createStatement();
        
        ResultSet resultSet = statement.executeQuery ("SELECT ArtistID, ArtistName, Day, Time from Schedule where working = \"yes\"");
        while (resultSet.next())
        {
        
%>

            <tr>
                <td><%=resultSet.getString("ArtistID")%></td>
                <td><%=resultSet.getString("ArtistName")%></td>
                 <td><%=resultSet.getString("Day")%></td>
                  <td><%=resultSet.getString("Time")%></td>
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
        
        <h3></h3> 
        
        
        <!-- Table to hold date and time appointment info -->
       <table id="t01">
           <tr>
                <th>Your Appointments:</th>

            </tr>
           
           <%
    try{
         
        Connection connection;
         
        Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
	System.out.println("Driver loaded");
                       
	connection = DriverManager.getConnection("jdbc:ucanaccess://C:/Users/kaydr/Documents/School/Java/TattooParlorDatabase.accdb"); 
	System.out.println("Database connected");

        Statement statement = connection.createStatement();
        
        ResultSet resultSet = statement.executeQuery ("SELECT day, ApmntTime from Appointments where Appointments.CustomerID = " + ss.getid());
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

        
                <form action="CreateAppointmentServlet">
            <label for="AptID">AppointmentID:</label>
            <input type="text" id="AptID" name="AptID"><br><br>
            <label for="artID">Artist ID:</label>
            <input type="text" id="artID" name="artID"><br><br>
            <label for="dday">Day:</label>
            <input type="text" id="dday" name="dday"><br><br>
            <label for="AptTime">Time:</label>
            <input type="text" id="AptTime" name="AptTime"><br><br>
            <input type="reset" value="Clear">
            <input type="submit" value="Schedule Appointment">
        </form>
        <h1>  </h1>
        
        <!-- Button that moves the user back to the login page -->
        <form action="CustomerHome.jsp">
            <input type="submit" value="Back to My Info">
        </form>

    </body>
</html>
