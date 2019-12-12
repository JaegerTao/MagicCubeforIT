$(function(){
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