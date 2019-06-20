layui.use(['form','jquery','layer'], function () {
        var form   = layui.form;
        var $      = layui.jquery;
        var layer  = layui.layer;
        //添加表单失焦事件
        //验证表单
        $('#user').blur(function() {
            var user = $(this).val();
             $.ajax({
                url:'/coach/findCoach',
                type:'post',
                dataType:'text',
                data:{"account":user},
                //验证用户名是否可用
                success:function(data){
                    if (data == 0 || data == null) {
                        $('#ri').removeAttr('hidden');
                        $('#wr').attr('hidden','hidden');
                    } else {
                        $('#wr').removeAttr('hidden');
                        $('#ri').attr('hidden','hidden');
                        layer.msg('当前用户名已被占用! ')
 
                    }
 
                }
            })
 
        });
 
        // you code ...
        // 为密码添加正则验证
        $('#pwd').blur(function() {
                var reg = /^[\w]{6,12}$/;
                if(!($('#pwd').val().match(reg))){
                    //layer.msg('请输入合法密码');
                    $('#pwr').removeAttr('hidden');
                    $('#pri').attr('hidden','hidden');
                    layer.msg('请输入合法密码');
                }else {
                    $('#pri').removeAttr('hidden');
                    $('#pwr').attr('hidden','hidden');
                }
        });

        //验证两次密码是否一致
        $('#rpwd').blur(function() {
                if($('#pwd').val() != $('#rpwd').val()){
                    $('#rpwr').removeAttr('hidden');
                    $('#rpri').attr('hidden','hidden');
                    layer.msg('两次输入密码不一致!');
                }else {
                    $('#rpri').removeAttr('hidden');
                    $('#rpwr').attr('hidden','hidden');
                };
        });
 
        //
        //添加表单监听事件,提交注册信息
        form.on('submit(sub)', function(data) {
            $.ajax({
                url:'/coach/register',
                type:'post',
                dataType:"json",
   				contentType: 'application/json;charset=UTF-8',
   				data:JSON.stringify(data.field),
                success:function(result){
                	console.info(result);
                    if (result) {
                        layer.alert('注册成功');
                        location.href = "/index.html";
                    }else {
                        layer.alert('注册失败');
                    }
                }
            })
        });
    });