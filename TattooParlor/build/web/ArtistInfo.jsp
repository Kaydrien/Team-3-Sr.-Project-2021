<%-- 
    Document   : CustomerInfo
    Created on : Mar 30, 2021, 9:56:31 AM
    Author     : Kaydrien Johnson
--%>

<!-- Import all packages needed -->

<%@page import = "Tattoo.Admin"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<!-- Main code -->

<html>
    <head>
        
        <!-- Java code to get the variable from the session that will provide the current info for the patient -->

          <%
        Admin c2;
        
        c2 = (Admin)session.getAttribute("a");
        
        //p1.selectDB("A906");
        c2.display();
        
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
        <title>Patient Info</title>
    </head>
    <body>
        
        <!-- A table to hold the customers current info that they are trying to change -->

        <h1>Change Info</h1>
        <h3>The information we currently have on file for you:</h3>
        
        <table id="t01">
            <tr>
                <th>Firstname</th>
                <th>Lastname</th> 
                <th>Username</th>
                <th>Password</th>
            </tr>
            <tr>
                <td><%=c2.getfname()%></td>
                <td><%=c2.getlname()%></td>
                <td><%=c2.getunam()%></td>
                <td><%=c2.getpassword()%></td>
            </tr>
</table>
        
            <!-- Textboxes for inputing new information and an action that calls on the change 
            infor servlet touse the account class to change the information in the database -->

        <h1>Change your info here:</h1>

        <form action="ArtistInfoServlet">
            <label for="fnam">FirstName:</label>
            <input type="text" id="afnam" name="afnam"><br><br>
            <label for="Lnam">LastName:</label>
            <input type="text" id="aLnam" name="aLnam"><br><br>
            <label for="eml">Username:</label>
            <input type="text" id="aunm" name="aunm"><br><br>
            <label for="Adrs">Password:</label>
            <input type="text" id="apswd" name="apswd"><br><br>
            <input type="reset" value="Clear">
            <input type="submit" value="Update">
        </form>
        
        <h1> </h1>
        
        <!-- A button that simply retirned the patient to their information page witout making any changes -->

        <form action="ArtistHome.jsp">
        <input type="submit" value="Return To Home">
        </form>

    </body>
</html>
