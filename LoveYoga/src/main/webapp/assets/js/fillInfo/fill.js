layui.use(['form', 'layedit', 'laydate','element'], function(){
  var form = layui.form
  ,layer = layui.layer
  ,$ = layui.jquery
  ,element = layui.element;

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
      });
  });
  //调用地图
  $("#choose").click(function(){
	  	layer.open({
	  		  title:"请添加您的位置",
	  		  type: 2, 
	  		  area:['450px','400px'],
	  		  skin:"layui-layer-molv",
	  		  maxmin:true,
	  		  content: '/html/addLocation.html'
	  	  }); 
	  })
});