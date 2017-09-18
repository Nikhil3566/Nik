<%-- 
    Document   : index
    Created on : 5 Sep, 2017, 10:14:36 PM
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body background="/OnlineBookStore/bg.jpg">
    <center><h1>Already a member? Login to continue!</h1>
          <table>
              <form action="url">
               <tr>
                   <td>User Name</td>
                   <td><input type="text" name="username" required>
                       </tr>
                        <tr>
                   <td>Password</td>
                   <td><input type="password" name="password" required>
                       </tr>
                       <tr>
                           
                    <td align="center" colspan="2">
                    <input type="submit" value="LogIn"/> 
              
                       </tr>
           </form>
       </table>
       <h3>OR</h3>
       </center>
    </body>
    <jsp:include page="reg.jsp" />
</html>
