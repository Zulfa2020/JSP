<% //read form data
String name=request.getParameter("name");
float price=Float.parseFloat(request.getParameter("price"));
float qty=Float.parseFloat(request.getParameter("qty"));
//calculate bill amount
float billamt=price*qty;
//forward request to discount.jsp
if(billamt>=50000){%>
	<jsp:forward page="discount.jsp">
	<jsp:param name="billamt" value="<%= billamt %>"/>
	</jsp:forward>
<%}
else{%>
<style>
b{
color:blue;
font-weight:bold;
}
a{color:red;
font-weight:bold;
}
</style>
	<b>Item Name: <%=name %></b><br>
	<b>Item Price: <%=price %></b><br>
	
	<b>Item Qty: <%=qty %></b><br>
	
	<b>BillAmt: <%=billamt %></b><br><br>
	<a href="input.html">Home</a>
<%}%>


