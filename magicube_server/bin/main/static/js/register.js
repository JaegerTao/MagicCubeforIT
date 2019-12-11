$(function(){
    $("#regis").click(function(){
        /*if($("#name").val()==''){
            var span=$("<span>用户名不能为空</span>");
            $("#username").append(span);
        }else if($("#phonenumber").val()==''){
            var span=$("<span>电话号码不能为空</span>");
            $("#telephone").append(span);
        }else if($("#checkemail").val()==''){
            var span=$("<span>邮箱不能为空</span>");
            $("#checkemail").append(span);
        }else if($("#checkpsw").val()==''){
            var span=$("<span>密码不能为空</span>");
            $("#checkpsw").append(span);
        }else{*/
        var data = {
            "name": $("#name").val(),
            "phonenumber": $("#phonenumber").val(),
            "email": $("#email").val(),
            "password": $("#password").val()
             };
        $.ajax({
            url:'http://localhost:8080/register/doRegister',
            method:'post',
            data: data,
            dataType:'JSON',
            success:function(result){
                if(result == "1"){
                    alert("注册成功！");
                }
            },
            error:function () {
                alert("注册失败！");
            }
        });
    })

    $("#login").click(function(){
        var data = {
            "name": $("#name").val(),
            "password": $("#password").val()
            };
            $.ajax({
                url:'http://localhost:8080/index/doLogin',
                method:'post',
                data: data,
                dataType:'JSON',
                success:function(result){
                    if(result != null) {
                        alert("登录成功！");
                    }
                },
                error:function (data) {
                    alert("登录失败！");
                }
            });
    })
})