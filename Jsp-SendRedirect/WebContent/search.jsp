<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<% 
//read form value
String ss=request.getParameter("ss");
//redirect the request to google page
response.sendRedirect("https://www.google.com/search?q="+ss);


%>