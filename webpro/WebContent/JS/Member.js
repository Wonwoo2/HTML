/**
 * 
 */
// function idchk() { }

var datachk = function() {
	userId = f.id.value.trim();
	
	// 공백 체크
	if(userId.length < 1) {
		alert("id를 입력하세요.");
		f.id.focus();
		return false;
	}
	
	// 길이 체크
	if(userId.length < 4 || userId.length > 12) {
		alert("id는 4 ~ 12사이 입니다.");
		f.id.focus();
		return false;
	}
	
	// 정규식 - 영문자로 시작 숫자와 조합
	idReg = /^[a-zA-Z][0-9a-zA-Z]{3,11}$/;
	
	if(!(idReg.test(userId))) {
		alert("id 형식오류 입니다.");
		f.id.focus();
		return false;
	}
	
	// pass 체크(공백, 길이, 정규식)
	pwReg = /^[a-zA-Z][0-9a-zA-Z]{7,19}$/;
	userPw = f.pw.value.trim();
	userPw1 = f.pw1.value.trim();
	
	// 공백 체크
	if(userPw.length < 1 && userPw1.length < 1) {
		alert("pw를 입력하세요.");
		f.pw.focus();
		return false;
	}
	
	// 길이 체크
	if((userPw.length < 8 || userPw.length > 20)
			&& (userPw1.length < 8 || userPw1.length > 20)) {
		alert("pw는 8 ~ 20사이 입니다.");
		f.pw.focus();
		return false;
	}
	
	// 정규식 체크
	if(!(pwReg.test(userPw) && pwReg.test(userPw1))) {
		alert("pw 형식 오류 입니다.");
		f.pw.focus();
		return false;
	}
	
	// 이름 체크 (공백, 길이, 정규식)
	userName = f.nm.value.trim();
	nameReg = /^[가-힣]{2,5}$/;
	
	// 공백 체크
	if(userName.length < 1) {
		alert("name을 입력하세요.");
		f.name.focus();
		return false;
	}
	
	// 길이 체크
	if(userName.length < 2 || userName.length > 5) {
		alert("name은 2 ~ 5사이 입니다.");
		f.nm.focus();
		return false;
	}
	
	// 정규식 체크
	if(!(nameReg.test(userName))) {
		alert("name 형식 오류 입니다.");
		f.nm.focus();
		return false;
	}
	
	// 전화번호 체크(공백, 정규식)
	userTel = f.tel.value.trim();
	telReg = /^\d{2,3}-\d{3,4}-\d{4}$/;
	
	// 공백 체크
	if(userTel.length < 1) {
		alert("tel을 입력하세요.");
		f.tel.focus();
		return false;
	}
	
	// 정규식 체크
	if(!(telReg.test(userTel))) {
		alert("tel 형식 오류 입니다.");
		f.tel.focus();
		return false;
	}
	
	// 이메일 체크(공백, 정규식)
	emailReg = /^[a-zA-Z0-9-_]+@[a-zA-Z0-9-_]+(\.[a-zA-Z0-9]+){1,2}$/;
	userEmail = f.email.value.trim();
	
	// 공백 체크
	if(userEmail.length < 1) {
		alert("email을 입력하세요.");
		f.email.focus();
		return false;
	}
	
	// 정규식 체크
	if(!(emailReg.test(userEmail))) {
		alert("email 형식 오류 입니다.");
		f.email.focus();
		return false;
	}
	return true;
}