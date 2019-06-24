$(function(){
	//学员查看收到的消息
	$.ajax({
		url:"../showMyMessage/studentMessage",
		type:"POST",
		data:{},
		dataType:"json",
		success:function(data){
			var content="";
			for(var i=0;i<data.length;i++){
				content+='<tr>'
					+'<td>'+data[i].id+'</td>'
					+'<td>'+data[i].studentID+'</td>'
					+'<td>'+data[i].coachID+'</td>'
					+'<td>'+data[i].gymID+'</td>'
					+'<td>'+data[i].message+'</td>'
					+'<td>'+data[i].form+'</td>'
					+'<td>'+data[i].createTime+'</td>'
					+'</tr>'
			}
			console.info(data);
			$("#studentMessage").html(content);
		}
	})
	
	//教练查看收到的消息
	$.ajax({
		url:"../showMyMessage/coachMessage",
		type:"POST",
		data:{},
		dataType:"json",
		success:function(data){
			var content="";
			
			for(var i=0;i<data.length;i++){
				var json = JSON.stringify(data[i]);
				content+='<tr>'
					+'<td>'+data[i].id+'</td>'
					+'<td>'+data[i].studentID+'</td>'
					+'<td>'+data[i].coachID+'</td>'
					+'<td>'+data[i].gymID+'</td>'
					+'<td>'+data[i].message+'</td>'
					+'<td>'+data[i].form+'</td>'
					+'<td>'+data[i].createTime+'</td>'
					+"<td><u onclick='coachAcceptSign("+json+")'>同意</u></br>"
					+"<u onclick='coachRefuseSign("+json+")'>拒绝</u></td>"
					+'</tr>'
			}
			console.info(data);
			$("#coachMessage").html(content);
		}
	})
	
	
	
})


