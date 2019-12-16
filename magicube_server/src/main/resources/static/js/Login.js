var change1 = "<div ></div>";
var change2 = "<a href='#' class='dropdown-item'>我发布的简历</a><a href='#' class='dropdown-item'>我发布的招聘</a>";
var change3 = "<button id='exit' type='button' class='btn btn-secondary rbtn'>退出</button>"
function addCookie(name,value,days,path){  /**添加设置cookie**/
    var name = escape(name);
    var value = escape(value);
    var expires = new Date();
    expires.setTime(expires.getTime() + days * 3600000 * 24);
    //path=/，表示cookie能在整个网站下使用，path=/temp，表示cookie只能在temp目录下使用
    path = path == "" ? "" : ";path=" + path;
    //GMT(Greenwich Mean Time)是格林尼治平时，现在的标准时间，协调世界时是UTC
    //参数days只能是数字型
    var _expires = (typeof days) == "string" ? "" : ";expires=" + expires.toUTCString();
    document.cookie = name + "=" + value + _expires + path;
}
function getCookieValue(name){ /**获取cookie的值，根据cookie的键获取值**/
    //用处理字符串的方式查找到key对应value
    var name = escape(name);
    //读cookie属性，这将返回文档的所有cookie
    var allcookies = document.cookie;
    //查找名为name的cookie的开始位置
    name += "=";
    var pos = allcookies.indexOf(name);
    //如果找到了具有该名字的cookie，那么提取并使用它的值
    if (pos != -1){                       //如果pos值为-1则说明搜索"version="失败
      var start = pos + name.length;         //cookie值开始的位置
      var end = allcookies.indexOf(";",start);    //从cookie值开始的位置起搜索第一个";"的位置,即cookie值结尾的位置
      if (end == -1) end = allcookies.length;    //如果end值为-1说明cookie列表里只有一个cookie
      var value = allcookies.substring(start,end); //提取cookie的值
      return (value);              //对它解码
    }else{ //搜索失败，返回空字符串
      return "";
    }
  }
  function deleteCookie(name,path){  /**根据cookie的键，删除cookie，其实就是设置其失效**/
    var name = escape(name);
    var expires = new Date(0);
    path = path == "" ? "" : ";path=" + path;
    document.cookie = name + "="+ ";expires=" + expires.toUTCString() + path;
  }
function login(){
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
                var userName = result.username;//获取cookie
                var passWord = result.password;
                addCookie("userName",userName,7,"/");//设置cookie
                addCookie("passWord",passWord,7,"/");
                $("#dropdownMenuButton").html(userName);
                $("#Loginchange").html(change1);
                $("#Loginchange").append(change2);
                $("#register").html(change3);
                $("#exit").click(function(){
                    addCookie("userName","",7,"/");//退出,设置cookie为空
                    addCookie("passWord","",7,"/");
                    window.location.reload()
                })
                }
            },
            error:function (data) {
                alert("用户名不存在或密码不正确")
            }
        });
    }


$(function(){
        var userNameValue = getCookieValue("userName");
        $("#name").val(userNameValue);
        var userPassValue = getCookieValue("passWord");
        $("#password").val(userPassValue);
        if(userNameValue != null && userNameValue !="" && userPassValue != null && userPassValue !=""){
            login();
        }
    $("#login").click(function(){
        login();
    })
})