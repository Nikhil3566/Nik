<%-- 
    Document   : reg
    Created on : 5 Sep, 2017, 10:20:33 PM
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration Page</title>
    </head>
    <body background="bg.jpg">
    <center><h1>New User?? Register Here!!</h1></center>
      <table align = "center">
          <form action="rushi" >
                <tr>
                    <td>User Name</td>
                    <td><input type="text" name="username" required/></td>
                </tr>
                <tr>
                    <td>Password</td>
                    <td><input type="password" name="pwd" required/></td>
                </tr>
                <tr>
                    <td>Confirm Password</td>
                    <td><input type="password" name="confirmpwd" required/></td>
                </tr>
                <tr>
                    <td>Email Id</td>
                    <td><input type="email" name="email" required/></td>
                </tr>
                <tr>
                    <td>Contact Number</td>
                    <td><input type="tel" name="contact" required/></td>
                </tr>
                <tr>
                    <td>Date Of Birth</td>
                    <td><input type="date" name="DoB" required/></td>
                </tr>
                <tr>
                    <td align="center" colspan="2">
                    <input type="submit" value="Register ME!!"/></td>>
                </tr>
            </form>
        </table>
       </body>
</html>
