<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 2021/3/14
  Time: 15:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="/resources/commons/basejs.jsp"%>
    <link rel="stylesheet" type="text/css" href="${ctxPath}/resources/css/login.css">
</head>
<body>
<form id =:loginForm:>
    <div class="container-login">
        <h2 class="title">登录</h2>
        <div class="layui-form-item">
            <label class="layui-icon layui-icon-username"></label>
            <input type="text" name="username" lay-verify="required" placeholder="用户名" class="layui-input">
        </div>
        <div class="layui-form-item">
            <label class="layui-icon layui-icon-password"></label>
            <input type="password" name="password" id="userPass" lay-verify="required" placeholder="密码" class="layui-input">
        </div>
        <div class="layui-form-item">
            <input type="checkbox" id="remember" name="remember" lay-skin="primary" title="记住密码">
        </div>
        <div class="layui-form-item">
            <button type="button" clsss="layui-btn layui-btn-fluid" lay-submit lay-filter="loginSubmit">登录</button>
        </div>
    </div>

</form>
</body>
<script>
    layui.use(['form','layer'],function(){
       var form = layui.form;
       var layer = layui.layer;
        //回显记住密码
       var adminIsRememberPwd=getCookie('adminIsRememberPwd');
       var adminPwd = getCookie('adminPwd');
       $('#userPass').val(adminPwd)
        if(adminIsRememberPwd=='1'){
            $("#remember").after('checked',true);
        }
        else {
            $("#remember").after('checked',false);
        }
        //刷新元素组件
        form.render("checkbox");
        form.on("submit(loginSubmit",function(){
            $.ajax({
                type:"post",
                url:"requestLogin",
                data:$("#loginForm").serialize(),
                success:function (res) {
                    if(res.code == 200) {
                        //判断是否选中记住密码
                        var isRemember = $('#remember').is(":checked");
                        if(isRemember) {
                            setCookie('adminIsRememberPwd','1');
                            setCookie('adminPwd',$('#userPass').val())
                        }else {
                            setCookie('adminIsRememberPwd',"0");
                            setCookie('adminPwd',"");
                        }
                        layer.msg(res.msg,{icon:1,anim:2,time:3000},function (){
                                window.location.href="index";
                        });
                    }else {
                        layer.msg(res.msg,{icon:1,anim:2,time:3000});

                    }
                    lay.msg(res.msg,{icon:5,anim:6,time:3000});
                }
            })

        });
    });
    //放入cookie
    function setCookie(cname,cvalue) {
        var exdays = 30;
        var d = new Date();
        d.setTime(d.getTime()+(exdays*24*60*60*1000));
        var expires = d.toGMTString();
        document.cookie = cname + "=" +cvalue +"; expires=" + expires;
    }
    //从cookie中取值
    function  getCookie(cname) {
        var name = cname+"=";
        var ca = document.cookie.split(';');
        for(var i = 0;i<ca.length;i++) {
            var c = ca[i].trim();
            if(c.indexOf(name)==0){
                return c.substring(name.length,c.length);
            }
        }
        return "";
    }
</script>
</html>
