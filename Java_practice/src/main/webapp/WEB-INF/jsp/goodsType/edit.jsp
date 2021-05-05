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

</head>

<body >
    <div style="width: 400px ;padding-top:10px;">
        <form id="form_submit" class="layui-form">
            <input type="hidden" name="id">
            <div class="layui-form-item">
                <label class="layui-form-label">分类名称</label>
                <div class="layui-input-inline">
                    <input type="text" name="name" lay-verify="required" placeholder="请输入分类名称" class="layui-input" value="">
                </div>
            </div>

            <div class="layui-form-item" style="display: none">
                <button type="button" lay-submit lay-filter="btn_form_submit" id="btn_form_submit" class="layui-btn layui-btn=lg"></button>
            </div>
        </form>
    </div>
</body>
<script>
    var modelName = "${ctxPath}/goodsType";
    function onLayuiInit() {
        //绑定监听表单的提交时间
        bindSubmit(modelName,'update','btn_form_submit','');
    }
</script>
</html>
