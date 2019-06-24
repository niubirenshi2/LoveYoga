$(function(){
	
	//学员约私教
	$("#约私教").click(function(coachID){
		$.ajax({
			url:"../studentSign/sendRequest",
			type:"POST",
			data:{
				"couchID":coachID
			},
			dataType:"json",
			success:function(data){
				alert(data.message);
			}
			
		})
	})
	
	
	
		
	
})

//教练同意学员申请
function coachAcceptSign(json){
		$.ajax({
			url:"../studentSign/coachAcceptSign",
			type:"POST",
			data:{
				"id":json.id,
				/*"studentID":json.studentID,
				"coachID":json.coachID,
//				"form":json.form,
				"createTime":json.createTime*/
			},
			dataType:"json",
			success:function(data){
				alert(data.message);
				location.reload();
			}
		})
	}

//教练拒绝学员申请
function coachRefuseSign(json){
		$.ajax({
			url:"../studentSign/coachRefuseSign",
			type:"POST",
			data:{
				"id":json.id
			},
			dataType:"json",
			success:function(data){
				alert(data.message);
				location.reload();
			}
		})
	}