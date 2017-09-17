<%-- 
    Document   : index
    Created on : 5 Sep, 2017, 10:14:36 PM
    Author     : USER
--%>

<%@page import="login.logdata"%>
<%@page import="java.util.ArrayList"%>
<%@page import="User.userlist"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% HttpSession mySession = request.getSession();
mySession.setAttribute("currentUser", request.getParameter("username"));
%>
<!DOCTYPE html>


<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Success Registration Page</title>
    </head>
    <body>
    <center>
         <h1>Welcome <% out.print(mySession.getAttribute("currentUser")); %>.. Your Registration is Successful. </h1>
        <h2> To continue shopping click <a href="home.jsp"> here</a></h1>
    </center>               
    </body>
</html>
