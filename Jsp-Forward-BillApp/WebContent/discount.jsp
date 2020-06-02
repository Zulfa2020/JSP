<% 
//read additional request params 
float billamt=Float.parseFloat(request.getParameter("billamt"));
//calculate bill amount
float disc=billamt*0.3f;
//get final amount
float finalAmt=billamt-disc;
%>
<!-- Display Details -->
<style>
b{
color:blue;
font-weight:bold;
}
a{color:red;
font-weight:bold;
}
</style>
<b>ItemName: <%= request.getParameter("name")%></b><br>
<b>ItemPrice: <%= request.getParameter("price")%></b><br>
<b>ItemQty: <%= request.getParameter("qty")%></b><br>
<b>BillAmount: <%= billamt %></b><br>
<b>Discount: <%= disc %></b><br>
<b>FinalAmount: <%=finalAmt %></b><br><br>
<a href="input.html">Home</a>
