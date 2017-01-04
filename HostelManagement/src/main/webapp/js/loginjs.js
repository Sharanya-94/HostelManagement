/**
 * 
 */
function regValidation(){
	var pwd1 = document.getElementById("pwd").value;
	var pwd2 = document.getElementById("re_pwd").value;

	if(pwd1 != pwd2) {
		alert("Passwords do not match");
		return false;
	}else{
		return true;
	}
	}