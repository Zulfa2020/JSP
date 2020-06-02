<% int a=10;
int square=a*a;
%>
<jsp:forward page="b.jsp">
<jsp:param value="<%=square %>" name="result"/>
<jsp:param value="thinking in java" name="bookname"/>
</jsp:forward>
