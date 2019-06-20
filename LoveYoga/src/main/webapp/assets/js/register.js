function sendSMS(){
	$.ajax({
		url:"/student/sendSMS",
		type:"POST",
		data:{
			code:$("#code").val()
		},
		dataType:"json",
		success:function(data){
			
		}
	})
}