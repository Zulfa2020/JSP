<script language="JavaScript">
function isValid(){
	if(f.tsu_id.value==""){
		alert(f.stu_id.name +" "+"Field Missed");
		f.stu_id.focus();
		return false;
	}
	if(isNaN(f.stu_id.value)){
		alert("stu_id should be numeric value");
		f.stu_id.focus();
		return false;
	}
	return true;
}//isValid
</script>

<form name="f" action="delete" method="POST" onSubmit="return isValid()">
<table border=1 cellpadding=7 cellspacing=7 align="center">
<caption><i><font size=4><u>Delete Records</caption>
<tr>
<th><b>Student ID:</b><input type="text" name="stu_id"></tr>
<tr>
<th>Click<input type="submit" value="DELETE"></tr>
</table>


</form>