<%@ page  import="com.nt.*" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <jsp:useBean id="rotator" class="com.nt.Rotator" scope="session"></jsp:useBean>
    <%
    rotator.nextAdvertisement();
    response.setHeader("refresh", "12");
    %>
    <style>
    img{
    border-radius:50%;
    }
</style>
<marquee>
     <a href="<jsp:getProperty name="rotator" property="link"/>">
    <img src="<jsp:getProperty name="rotator" property="image"/>"
                                           width="100" height="100"/>
    </a>
</marquee>