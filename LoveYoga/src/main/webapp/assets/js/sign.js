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
	
	//教练签约场馆
	$("#约场馆").click(function(gymID){
		$.ajax({
			url:"../coachSign/sendRequest",
			type:"POST",
			data:{
				"gymID":gymID
			},
			dataType:"json",
			success:function(data){
				alert(data.message);
			}
			
		})
	})
	
	//场馆签约教练
	$("#约教练").click(function(gymID){
		$.ajax({
			url:"../coachSign/sendRequest",
			type:"POST",
			data:{
				"gymID":gymID
			},
			dataType:"json",
			success:function(data){
				alert(data.message);
			}
			
		})
	})
	
		
	
})

//学员确认教练的同意消息
function studentSureSign(json){
		$.ajax({
			url:"../studentSign/sureMessage",
			type:"POST",
			data:{
				"id":json.id
			},
			dataType:"json",
			success:function(data){
				alert("已确认通知");
				location.reload();
			}
		})
	}

//教练同意学员申请
function coachAcceptSign(json){
	//教练同意学员申请
	if(json.state==0){
		$.ajax({
			url:"../studentSign/coachAcceptSign",
			type:"POST",
			data:{
				"id":json.id,
			},
			dataType:"json",
			success:function(data){
				alert(data.message);
				location.reload();
			}
		})
	}
	//教练同意场馆申请
	if(json.state==3){
		$.ajax({
			url:"../coachSign/acceptRequest",
			type:"POST",
			data:{
				"id":json.id,
			},
			dataType:"json",
			success:function(data){
				alert(data.message);
				location.reload();
			}
		})
	}
}
		

//教练拒绝学员申请
function coachRefuseSign(json){
	//教练拒绝学员申请
	if(json.state==0){
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
	//教练拒绝场馆申请
	if(json.state==3){
		$.ajax({
			url:"../coachSign/refuseRequest",
			type:"POST",
			data:{
				"id":json.id,
			},
			dataType:"json",
			success:function(data){
				alert(data.message);
				location.reload();
			}
		})
	}
}
		

//场馆同意教练的申请
function gymAcceptSign(json){
		$.ajax({
			url:"../gymSign/acceptRequest",
			type:"POST",
			data:{
				"id":json.id,
			},
			dataType:"json",
			success:function(data){
				alert(data.message);
				location.reload();
			}
		})
	}
//场馆拒绝教练的申请
function gymRefuseSign(json){
		$.ajax({
			url:"../gymSign/refuseRequest",
			type:"POST",
			data:{
				"id":json.id,
			},
			dataType:"json",
			success:function(data){
				alert(data.message);
				location.reload();
			}
		})
	}
