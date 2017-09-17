<%-- 
    Document   : home
    Created on : 5 Sep, 2017, 11:20:57 PM
    Author     : USER
--%>

<%@page import="BookData.bookdata"%>
<%@page import="java.util.ArrayList"%>
<%@page import="BookData.booklist"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Page</title>
</head>
<body>
	<%  booklist objuserlist=new booklist();
            ArrayList<bookdata> books=objuserlist.getBooklist();
           
        %>
	<center>
		<h1>Welcome <% out.print(request.getSession().getAttribute("currentUser")); %> .. Buy Books here!!</h1>

		<table border="1">

			<tr>
				<td>Sr No.</td>
				<td>Book_Id</td>
				<td>Book Name</td>
				<td>Edition</td>
				<td>Author</td>
				<td>Publication</td>
				<td>Price</td>
				<td align="Center">Buy_Book</td>
			</tr>
			<%
            for(int i=0;i<books.size();i++)
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


				<td>
					<form action="urll">
						<input type="hidden" name="id"
							value="<%= books.get(i).getBookId()%>" /> <input type="submit"
							name="Book_Details" value="Book_Details" /> <input type="submit"
							name="ADD_TO_CART" value="ADD_TO_CART" /> <input type="submit"
							name="Buy" value="Buy_Book" />
					</form>
				</td>
			</tr>
			<%
            }
            %>

		</table>
	</center>
</body>
</html>
