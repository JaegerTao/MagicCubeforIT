var unempty1 = 0;
var unempty2 = 0;
var unempty3 = 0;
var unempty4 = 0;
$(function(){
    $("#name").blur(function(){
        var name = $("#name").val();
        if (name == "") {
            $("#nameError").show();
        }else{
            unempty1 = 1
        }
    })
    $("#phonenumber").blur(function(){
        var phonenumber = $("#phonenumber").val();
        if(phonenumber == ""){
            $("#phonenumberError").show();
        }else{
            unempty2 = 1
        }
    })
    $("#email").blur(function(){
        var email = $("#email").val();
        if(email == ""){
            $("#emailError").show();
        }else{
            unempty3 = 1
        }
    })
    $("#password").blur(function(){
        var password = $("#password").val();
        if(password == ""){
            $("#passwordError").show();
        }else{
            unempty4 = 1
        }
    })
    $("#regis").click(function(){
    if(unempty1 != 1){
        $("#nameError").show();
        return ;
    }else if(unempty2 != 1){
        $("#phonenumberError").show();
        return ;
    }else if(unempty3 != 1){
        $("#emailError").show();
        return ;
    }else if(unempty4 != 1){
        $("#passwordError").show();
        return ;
    }else{
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
                if(result != null){
                    alert("注册成功！");
                }
            },
            error:function () {
                alert("注册失败！");
            }
        });
    }
    })

})