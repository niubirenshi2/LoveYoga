$(document).ready(function() {
	$.ajax({
		url:"/show/coach",
		type:"post",
		success:function(data){
			var content ='<div class="layui-form-item">'
			+'<label class="layui-form-label">头像：<img src='+data.headImg+'></a></label>'
			+'</div>'
			+'<div class="layui-form-item">'
			+'	<label class="layui-form-label" style="width: 100px">个人信息权限：'+data.authority+'</label>'
			+'</div>'
			
			+'<div class="layui-form-item">'
			+'	<label class="layui-form-label">课时费：'+data.price+'</label>'
			+'</div>'
			
			+'<div class="layui-form-item">'
			+'	<label class="layui-form-label">空闲时间：'+data.freetime+'</label>'
			+'</div>'
			
			+'<div class="layui-form-item">'
			+'	<label class="layui-form-label">是否接课：'+data.acceptState+'</label>'
			+'</div>'
			+'<div class="layui-form-item">'
			+'	<label class="layui-form-label">电话权限：'+data.telvisible+'</label>'
			+'</div>'
			+'<div class="layui-form-item">'
			+'	<label class="layui-form-label">手机号码：'+data.telphone+'</label>'
			+'</div>'
			+'<div class="layui-form-item">'
			+'	<label class="layui-form-label" style="width: 100px">是否接授私教：'+data.persoalTrainer+'</label>'
			+'</div>'
			+'<div class="layui-form-item">'
			+'	<label class="layui-form-label">期望薪资：'+data.expectedSalary+'</label>'
			+'</div>'
			+'<div class="layui-form-item">'
			+'	<label class="layui-form-label">qq号码：'+data.qq+'</label>'
			+'</div>'
			+'<div class="layui-form-item">'
			+'<div class="layui-input-block">'
			+'	<button class="layui-btn" lay-submit lay-filter="coachInfo">修改信息</button>'
			+'</div>'
			+'</div>'
			
			("#info").append(content);
		}
	});
	
	layui.use(['layer','element'], function(){
		  var form = layui.form
		  ,layer = layui.layer
		  ,$ = layui.jquery
		  ,element = layui.element;
		  
		  $(document).on('click','#userInfo',function(){
			  var index = layer.open();
	    	  layer.open({
	    		  title:"修改个人信息",
	    		  type: 2, 
	    		  area:['450px','400px'],
	    		  skin:"layui-layer-molv",
	    		  maxmin:true,
	    		  content: '/html/fill.html' 
	    		});
		  });
		  
	});
	
	
});




