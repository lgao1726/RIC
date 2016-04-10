var ajaxRequest;

function processVerification(){
	if(ajaxRequest.readyState==4){
		var verified = ajaxRequest.responseText;
		
		if(verified == '1'){
			document.location = 'adminDefault.jsp'
		}else if (verified == '-1'){
			
			document.location = 'WHOOPS.jsp'
		}
	}
}

function verification(){
	
	ajaxRequest = new XMLHttpRequest();
	ajaxRequest.onreadystatechange = processVerification;
	
	
	var login = document.getElementById('inputEmail').value;
	var password = document.getElementById('inputPassword').value;
	
	var url = "Ric_Servlet?todo=ajax&task=login&user=" + escape(login) + "&password=" + escape(password);
	ajaxRequest.open("GET",url,true);
	ajaxRequest.send(null);
	
}

