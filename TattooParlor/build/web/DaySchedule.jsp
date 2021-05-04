<%-- 
    Document   : CustomerInfo
    Created on : Mar 30, 2021, 9:56:31 AM
    Author     : Kaydrien Johnson
--%>

<%@page import="java.sql.*"%>
<!-- Import all packages needed -->

<%@page import = "Tattoo.Admin"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<!-- Main code -->

<html>
    <head>
        
        <!-- Java code to get the variable from the session that will provide the current info for the patient -->

          <%
        Admin d;
        
        d = (Admin)session.getAttribute("v");
        
        //p1.selectDB("A906");
        d.display();
        
        %>
        
        <!-- Style for pizazz -->

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
 
        <!-- Body -->

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Your Schedule</title>
    </head>
    <body>
        
        <!-- A table to hold the customers current info that they are trying to change -->

        <h1>Daily Schedule</h1>

        
                <table id="t01">
           <tr>
                <th>Your Schedule for Monday:</th>


                

            </tr>
           
           <%
    try{
         
        Connection connection;
         
        Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
	System.out.println("Driver loaded");
                       
	connection = DriverManager.getConnection("jdbc:ucanaccess://C:/Users/kaydr/Documents/School/Java/TattooParlorDatabase.accdb"); 
	System.out.println("Database connected");

        Statement statement = connection.createStatement();
        
        ResultSet resultSet = statement.executeQuery ("SELECT FName, LName, ApmntTime, Day from Appointments WHERE AritistID = \"" + d.getid() + "\" AND day = \"" + d.getday() + "\"" );
        while (resultSet.next())
        {
        
%>

            <tr>
                <td><%=resultSet.getString("FName")%> <%=resultSet.getString("LName")%>, <%=resultSet.getString("Day")%>, <%=resultSet.getString("ApmntTime")%></td>

                

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


        
        <h1> </h1>
        
        <!-- A button that simply retirned the patient to their information page witout making any changes -->

        <form action="ArtistHome.jsp">
        <input type="submit" value="Return To Home">
        </form>

    </body>
</html>
