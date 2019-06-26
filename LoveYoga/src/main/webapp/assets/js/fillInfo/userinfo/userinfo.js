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
			("#info").append(content);
		}
	});
});