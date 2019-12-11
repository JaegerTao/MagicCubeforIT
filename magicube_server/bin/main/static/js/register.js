$(function(){
    $("#regis").click(function(){
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
            if(result != null) {
                alert("注册成功！");
            }
        },
        error:function (data) {
            alert("注册失败！");
        }
    });
    })
})