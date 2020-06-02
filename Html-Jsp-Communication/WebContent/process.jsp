<% 
  int v1;
int v2;
int sum;

v1=Integer.parseInt(request.getParameter("t1"));
v2=Integer.parseInt(request.getParameter("t2"));

sum=v1+v2;
   %>
   
 <br>
 <b>Sum :<%= sum %> </b> <br>
 <%
 if(sum>=1000){%>
 <b>  Sum Is Too Big</b>  
 
 <%}
 else
 {%>
 <b>  Sum Is Too Small</b>  
 <% }%>