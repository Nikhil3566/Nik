<%-- 
    Document   : bookdtail
    Created on : 5 Sep, 2017, 11:26:29 PM
    Author     : USER
--%>

<%@page import="java.util.List"%>
<%@page import="BookData.booklist"%>
<%@page import="BookData.bookdata"%>
<%@page import="java.util.ArrayList"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        booklist objBookList=new booklist();
        ArrayList<bookdata>books=objBookList.getBooklist();
         String bookId = request.getParameter("id");
        %>
        
        <center><h1>Book Details..</h1>
         <table border="1" align ="center">
            
                <tr>
                    <td>Sr No.</td>
                    <td>Book ID</td>
                    <td>Book Name</td>
                    <td>Edition</td>
                    <td>Author</td> 
                    <td>Publication</td>
                    <td>Price</td>      
                   
                </tr>
           
                <%
                    for(int i=0;i<books.size();i++)
                    {
                            if(bookId.equals(books.get(i).getBookId()))
                            {
                        
                %>
                
                <tr>
                <td><%= i+1 %></td>
                <td><%= books.get(i).getBookId()%></td>
                <td><%= books.get(i).getName()%></td>
                <td><%= books.get(i).getAddition()%></td>
                <td><%= books.get(i).getAother()%></td>
                <td><%= books.get(i).getPublication()%></td>
                <td><%= books.get(i).getPrices().toString()%></td>
                </tr>
                </table>  
                
                    <form action="urll">
                        <input type="hidden" name="id" value="<%= books.get(i).getBookId()%>" />
 	                       <br> <br><input type="submit" name="ADD_TO_CART" value="ADD_TO_CART"/>
                        <br><br><input type="submit" name="Buy" value="Buy_Book"/>
                    </form>
            
           
            <% }
                    }
                                %>
                <br><a href="home.jsp">Back to Main Book List</a></td>
            
         
   </center>
    </body>
</html>
