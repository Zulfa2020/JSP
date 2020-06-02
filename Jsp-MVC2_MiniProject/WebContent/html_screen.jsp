<%@page import="java.util.*,com.nt.dto.BookDTO"%>

<%
//read request attribute value
List<BookDTO> listDTO=null;
listDTO=(List<BookDTO>)request.getAttribute("bookslist");
//display database table having records
if(listDTO!=null && listDTO.size()!=0){
%>
<h1 style='color:red;text-align:center'><b>Books Report for:: </b><%=request.getParameter("category") %></h1>
<div align="center">
<table border="2" style="border-color: red;background-color: lightpink">
<tr style="margin: 2px;padding: 5px;background-color: yellow">
<th>BookId</th><th>BookName</th><th>Author</th><th>Status</th><th>Category</th>
</tr>
<%
for(BookDTO dto:listDTO){
%>
<tr>
<td><%=dto.getBkid() %></td>
<td><%=dto.getBookname() %></td>
<td><%=dto.getAuthor() %></td>
<td><%=dto.getStatus() %></td>
<td><%=dto.getCategory() %></td>
</tr>
<%} %>
</table>
</div>
<%}
else{
%>
<h1 style="color:red;text-align:center">No Books Found</h1>
<%}%>
<br>
<div align="center">
<a href="search.html"><b>Home</b></a> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<a href="JavaScript:showPrint()"><b>Print</b></a>
</div>
<script language="JavaScript">
function showPrint(){
	frames.focus();
	frames.print();
}
</script>