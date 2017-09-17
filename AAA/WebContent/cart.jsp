<%-- l
    Document   : cart
    Created on : 6 Sep, 2017, 10:16:09 AM
    Author     : USER
--%>

<%@page import="BookData.bookdata"%>
<%@page import="java.util.ArrayList"%>
<%@page import="BookData.booklist"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<form action="cart">
	<%
		String bookId = request.getParameter("id");
		ArrayList<String> cartlist = new ArrayList();
		cartlist.add(bookId);
		booklist objBookList = new booklist();
		ArrayList<bookdata> books = objBookList.getBooklist();
		ArrayList<String> list = (ArrayList<String>) session.getAttribute("cartList");
	%>


	<center>
		<h1>Your Orders ...</h1>

		<table align="center" border="5">
			<tr>
				<th>Sr No.</th>
				<th>ID</th>
				<th>Name</th>
				<th>Edition</th>
				<th>Author</th>
				<th>Publication</th>
				<th>Price</th>


			</tr>
			<%
				for (int i = 0; i < books.size(); i++) {
					for (int j = 0; j < list.size(); j++) {
						if (books.get(i).getBookId().equals(list.get(j))) {
			%>
			<tr>
				<td><%=j + 1%></td>
				<td><%=books.get(i).getBookId()%></td>
				<td>
					<%
						out.print(books.get(i).getName());
					%>
				</td>
				<td><%=books.get(i).getAddition()%></td>
				<td><%=books.get(i).getAother()%></td>
				<td><%=books.get(i).getPublication()%></td>
				<td><%=books.get(i).getPrices().toString()%></td>
			</tr>

			<%
				}
					}
				}
			%>
		</table>
		<br> <a href="home.jsp">Add More Items</a><br>
		<br> <a href="logout.jsp">Logout</a><br>
		<br> <a href="buy.jsp">Checkout and Pay!!</a><br>
		<br>
		<form action="urll">
			<input type="submit" name="EmptyCart" value="EmptyCart" />
		</form>
</form>
</center>
</body>
</html>
