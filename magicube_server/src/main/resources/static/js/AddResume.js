var unempty = new Array();
$(function(){
    $("#send").click(function(){
        var data = {
            "username": userNameValue,
            "realname": $("#realname").val(),
            "sex": $("#sex").find("option:selected").text(),
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
                if(result != null){
                    alert("投递成功！");
                }
            },
            error:function () {
                alert("投递失败！");
            }
        });
    })
})