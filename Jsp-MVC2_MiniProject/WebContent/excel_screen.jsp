<%@page import="java.util.*,com.nt.dto.BookDTO"%>
<%
//make response of this jsp file as downloadable excel file
response.setContentType("application/vnd.ms-excel");
response.addHeader("content-disposition","attachment;fileName=catalog.xls");
//read request attribute value
List<BookDTO> listDTO=null;
listDTO=(List<BookDTO>)request.getAttribute("bookslist");
//display database table having records
if(listDTO.size()!=0){
%>
<h1 style='coloR:red;text-align:center'>Books Report for <%=request.getParameter("category") %></h1>
<table border="2" style="border-color: red">
<tr style="margin: 2px;padding: 5px">
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
<%}
else{
%>
<h1 style='color:red;text-align:center'>No Books Found</h1>
<%}%>
