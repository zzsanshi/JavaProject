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
    <%@include file="/resources/commons/basejs.jsp" %>
    <script src="${ctxPath}/resources/js/index.js"/>
</head>

<body class="layui-layout-body">
    <div class="layui-lyout layui-layout-admin">
        <div class="layui-header">
            <div class="layui-logo" >校园购物系统</div>
            <ul class="layui-nav layui-layui-layout-left">
                <li class="layui-nav-item"><a href="#" target="myFrame">主页</a> </li>
            </ul>
            <ul class="layui-nav layui-layui-layout-right">
                <li class="'layui-nav-item">
                <img src="${ctxPath}/upload/headpic.jpg" class="layui-nav-img">${sessionScope.sysUserInfo.name}
            </li>
            <li class="'layui-nav-item">
                 <a href="logout">退出</a>
             </li>
            </ul>
        </div>
<%--        左侧导航栏--%>
        <div class="layui-side layui-bg-black">
            <div class="layui-side-sroll">
                <ul class=" layui-nav layui-nav-tree" lay-filter="test" id="nav_layui"></ul>
            </div>
        </div>

<%--        右侧主体部分--%>
        <div class="layui-body">
            <iframe src="orders/listPage" name = "myframe" frameborder="0" style="width: 100%;height: 100%;"></iframe>
        </div>
    </div>
</body>

</html>
