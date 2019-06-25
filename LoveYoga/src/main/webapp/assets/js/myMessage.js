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
				var json = JSON.stringify(data[i]);
				content+='<tr>'
					+'<td>'+(i+1)+'</td>'
					/*+'<td>'+data[i].studentID+'</td>'
					+'<td>'+data[i].coachID+'</td>'
					+'<td>'+data[i].gymID+'</td>'*/
					+'<td>'+data[i].message+'</td>'
					+'<td>'+data[i].form+'</td>'
					+'<td>'+data[i].createTime+'</td>'
					+"<td><u onclick='studentSureSign("+json+")'>确认</u></td>"
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
					+'<td>'+(i+1)+'</td>'
					/*+'<td>'+data[i].studentID+'</td>'
					+'<td>'+data[i].coachID+'</td>'
					+'<td>'+data[i].gymID+'</td>'*/
					+'<td>'+data[i].message+'</td>'
					+'<td>'+data[i].form+'</td>'
					+'<td>'+data[i].createTime+'</td>'
				if(data[i].state==0 || data[i].state==3){
					content+="<td><u onclick='coachAcceptSign("+json+")'>同意</u></br>"
					+"<u onclick='coachRefuseSign("+json+")'>拒绝</u></td>"
					+'</tr>'
				}
				if(data[i].state==5){
					content+="<td><u onclick='studentSureSign("+json+")'>确认</u></td>"
					+'</tr>'
				}
					
			}
			console.info(data);
			$("#coachMessage").html(content);
		}
	})
	
	//场馆查看收到的消息
	$.ajax({
		url:"../showMyMessage/gymMessage",
		type:"POST",
		data:{},
		dataType:"json",
		success:function(data){
			var content="";
			for(var i=0;i<data.length;i++){
				var json = JSON.stringify(data[i]);
				content+='<tr>'
					+'<td>'+(i+1)+'</td>'
					/*+'<td>'+data[i].studentID+'</td>'
					+'<td>'+data[i].coachID+'</td>'
					+'<td>'+data[i].gymID+'</td>'*/
					+'<td>'+data[i].message+'</td>'
					+'<td>'+data[i].form+'</td>'
					+'<td>'+data[i].createTime+'</td>'
				if(data[i].state==2){
					content+="<td><u onclick='gymAcceptSign("+json+")'>同意</u></br></br>"
					+"<u onclick='gymRefuseSign("+json+")'>拒绝</u></td>"
					+'</tr>'
				}
				if(data[i].state==4){
					content+="<td><u onclick='studentSureSign("+json+")'>确认</u></td>"
					+'</tr>'
				}
			}
			console.info(data);
			$("#gymMessage").html(content);
		}
	})
	
	
})


