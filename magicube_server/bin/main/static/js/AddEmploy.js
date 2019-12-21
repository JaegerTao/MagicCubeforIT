var unempty = new Array();
$(function(){
    $("#publish").click(function(){
        var data = {
            "jobname": $("#jobname").val(),
            "pay": $("#pay").val(),
            "education": $("#education").val(),
            "workexperience": $("#workexperience").val(),
            "age": $("#age").val(),
            "employnumber": $("#employnumber").val(),
            "askphone": $("#askphone").val(),
            "workaddress": $("#workaddress").val(),
            "worktime": $("#worktime").val(),
             };
        $.ajax({
            url:'http://localhost:8080/addemploy/doaddemploy',
            method:'post',
            data: data,
            dataType:'JSON',
            success:function(result){
                console.log(result);
                if(result != null){
                    alert("发布成功！");
                }
            },
            error:function () {
                alert("发布失败！");
            }
        });
    })
})