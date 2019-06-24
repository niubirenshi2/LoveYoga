layui.use(['upload'], function(){
  var layer = layui.layer
  ,$ = layui.jquery
  ,upload = layui.upload;
  
  //执行实例
  var uploadInst = upload.render({
    elem: '#headImg' //绑定元素
    ,url: '/upload/user' //上传接口
    ,accept: 'file'
    ,auto: false
    ,bindAction: '#upload'
    ,choose: function(obj) {
        obj.preview(function (index, file, result) {
            $('#img').attr('src',result);
        });
	}
    ,done: function(res){
    	if (res.code == 1) {
            layer.alert("上传成功！");
		}else {
            layer.alert("上传失败！");
		}
    }
    ,error: function(){
        //演示失败状态，并实现重传
        var message = $('#message');
        message.html('<span style="color: #FF5722;">上传失败</span> <a class="layui-btn layui-btn-xs demo-reload">重试</a>');
        message.find('.demo-reload').on('click', function(){
          uploadInst.upload();
        });
      }
  });
});