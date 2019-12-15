var unempty = new Array();
$(function(){
    /*$("#name").blur(function(){
        var name = $("#name").val();
        if (name == "") {
            $("#nameError").show();
        }else{
            $("#nameError").hide();
            unempty[0] = 1
        }
    })
    $("#phonenumber").blur(function(){
        var phonenumber = $("#phonenumber").val();
        if(phonenumber == ""){
            $("#phonenumberError").show();
        }else{
            $("#phonenumberError").hide();
            unempty[1] = 1
        }
    })
    $("#email").blur(function(){
        var email = $("#email").val();
        if(email == ""){
            $("#emailError").show();
        }else{
            $("#emailError").hide();
            unempty[2] = 1
        }
    })
    $("#password").blur(function(){
        var password = $("#password").val();
        if(password == ""){
            $("#passwordError").show();
        }else{
            $("#passwordError").hide();
            unempty[3] = 1
        }
    })*/
    $("#send").click(function(){
    /*if(unempty[0] != 1){
        $("#nameError").show();
        return ;
    }else if(unempty[1] != 1){
        $("#phonenumberError").show();
        return ;
    }else if(unempty[2] != 1){
        $("#emailError").show();
        return ;
    }else if(unempty[3] != 1){
        $("#passwordError").show();
        return ;
    }else{*/
        var data = {
            "realname": $("#realname").val(),
            "sex": $("#sex").val(),
            "age": $("#age").val(),
            "city": $("#city").val(),
            "telephone": $("#telephone").val(),
            "email": $("#email").val(),
            "jobtype": $("#jobtype").val(),
            "salary": $("#salary").val(),
            "introduce": $("#introduce").val(),
             };
        $.ajax({
            url:'http://localhost:8080/addresume/doaddresume',
            method:'post',
            data: data,
            dataType:'JSON',
            success:function(result){
                console.log(result);
                if(result != null){
                    alert("投递成功！");
                }
            },
            error:function () {
                alert("投递失败！");
            }
        });
    /*}*/
    })
})