<%@page  import="com.nt.service.*,com.nt.dto.*" %>

<!-- create or locate java bean class object -->
<jsp:useBean id="dto" class="com.nt.dto.EmployeeDTO" scope="session"></jsp:useBean>

<!-- set form data bean property -->
<jsp:setProperty property="*" name="dto"/>

<!-- use service  -->
<% 
SalaryService service=new SalaryService();
service.paySlip(dto);

%>
<!-- Read and display the results -->
<b>No: <jsp:getProperty property="eno" name="dto"/></b><br>
<b>Name: <jsp:getProperty property="ename" name="dto"/></b><br>
<b>BasicSalary: <jsp:getProperty property="basicSal" name="dto"/></b><br>
<b>Gross Salary: <jsp:getProperty property="grossSal" name="dto"/></b><br>
<b>NetSalary: <jsp:getProperty property="netSal" name="dto"/></b><br>