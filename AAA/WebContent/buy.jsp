<%-- 
    Document   : buy
    Created on : 5 Sep, 2017, 11:27:04 PM
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
        <title>CheckOut Page</title>
    </head>
    <body background="bg.jpg">
    
    <%
            
             String bookId = request.getParameter("id");
             ArrayList<String> cartlist=new ArrayList();
             cartlist.add(bookId);
            booklist objBookList = new booklist();
            ArrayList<bookdata> books = objBookList.getBooklist();
            Integer totalPrice = 0;
        %>

	<%
                ArrayList<String> list =(ArrayList<String>)session.getAttribute("cartList");
                
            %>
    <center>
          <h1>Hi <% out.print(request.getSession().getAttribute("currentUser")); %> .. Please make payment for selected items .. Thanks for shopping !!</h1>
                    
      	<table align="center" border="5">
		<tr>
			<th>Item Name</th>
			<th>Price</th>


		</tr>
		<%
                for(int i=0;i<books.size();i++)
                {
                    for(int j=0; j <list.size();j++)
                    {
                    if(books.get(i).getBookId().equals(list.get(j)))
                    {
                    	totalPrice = totalPrice + books.get(i).getPrices();
            %>
		<tr>
			<td>
				<% out.print(books.get(i).getName());%>
			</td>
			<td><%= books.get(i).getPrices() %></td>
		</tr>

		<%
                 }
                }
                }
            %>
	</table><br>
	
	Total Amount :  <% 
	out.print(totalPrice.toString());
                 %>	
        <form >
                
            </form>
          <form>
              <table>
                <tr>
                      <tr>
                      <td>Address of Delivery</td>
                      <td><textarea rows="4" cols="50" required>Please type delivery address here.</textarea></td>
                      </tr>
                	            <tr><td>Contact Number</td><td><input type="tel" name="contactNo" required/></td></tr>
               <tr>
                     
          </form>
        </table><br	>
     <a href="buysuccess.jsp">Buy</a><br><br>
                 <a href="home.jsp">Cancel</a></td>
   </center> </body>
</html>
