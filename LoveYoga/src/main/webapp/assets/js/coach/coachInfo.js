layui.use(['form', 'layedit', 'laydate'], function(){
  var form = layui.form
  ,layer = layui.layer
  ,$ = layui.jquery;
  

  
  //监听提交
  form.on('submit(coachInfo)', function(data){
      $.ajax({
          url:'/coachInfo/register',
          type:'post',
          dataType:"json",
		  contentType: 'application/json;charset=UTF-8',
		  data:JSON.stringify(data.field),
          success:function(result){
          	console.info(result);
              if (result) {
                  layer.alert('信息填写成功');
                  location.href = "/index.html";
              }else {
                  layer.alert('注册失败');
              }
          }
      })
  });
});