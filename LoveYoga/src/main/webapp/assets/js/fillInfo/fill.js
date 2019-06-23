layui.use(['form', 'layedit', 'laydate','upload','element'], function(){
  var form = layui.form
  ,layer = layui.layer
  ,$ = layui.jquery
  ,upload = layui.upload
  ,element = layui.element;
  
  //执行实例
  var uploadInst = upload.render({
    elem: '#headImg' //绑定元素
    ,url: '/upload/student' //上传接口
    ,accept: 'file',auto: false
      ,method:'post'
    ,bindAction: '#headImg'
    ,done: function(res){
        layer.alert("上传头像成功！");
    }
    ,error: function(){
      layer.alert("上传头像失败！");
    }
  });

  
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
                  layer.alert('信息提交成功');
                  location.href = "/index.html";
              }else {
                  layer.alert('信息提交失败！请稍候重新提交！');
              }
          }
      })
  });
});