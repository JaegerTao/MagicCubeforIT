var change1 = "<div ></div>";
var change2 = "<a href='#' class='dropdown-item'>我发布的简历</a><a href='#' class='dropdown-item'>我发布的招聘</a>";
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
                    if(result != null){
                    var username = result.username;
                    alert("登录成功");
                    $("#dropdownMenuButton").html(username);
                    $("#Loginchange").html(change1);
                    $("#Loginchange").append(change2);
                    }
                },
                error:function (data) {
                    alert("用户名不存在或密码不正确")
                }
            });
    })
})