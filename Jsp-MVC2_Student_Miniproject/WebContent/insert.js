function isValid(frm){
	var sid=frm.stu_id;
	var snm=frm.stu_name;
	var sadd=frm.stu_add;
	if(check(sid) && isNumber(sid) && check(snm) && check(sadd)){
		return true;
	}
	else{
		return false;
	}
}//isValid

function check(cmd){
	if(cmd.value==""){
		alert(cmd.name+" "+"Field Missed");
		cmd.focus();
		return false;
	}
	return true;
}//check
function isNumber(cmd){
	if(isNaN(cmd.value)){
		alert("stu_ID should be numeric value");
		cmd.focus();
		return false;
	}
	return true;
}//isNumber