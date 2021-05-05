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
            <div class="layui-form-item">
                <label class="layui-form-label">名称</label>
                <div class="layui-input-inline">
                    <input type="text" name="name" lay-verify="required" placeholder="请输入分类名称" class="layui-input" value="">
                </div>

                <div class="layui-input-inline">
                    <input type="text" name="witer" lay-verify="required" placeholder="请输入作者" class="layui-input" value="">
                </div>

                <div class="layui-input-inline">
                    <input type="text" name="des" lay-verify="required" placeholder="请输入简介" class="layui-input" value="">
                </div>

                <label class="layui-form-label">图片</label>
                <div class="layui-form-inline" style="position:relative">
                    <button type="button" class="layui-btn layui-btn-normal" id="image-upload-show">
                        <i class="layui-icon layui-icon-upload"></i>上传图片
                    </button>
                    <div class="image-upload-show"></div>
                </div>





            </div>










            <div class="layui-form-item" style="display: none">
                <button type="button" lay-submit lay-filter="btn_form_submit" id="btn_form_submit" class="layui-btn layui-btn=lg"></button>
            </div>
        </form>
    </div>
</body>
<script>
    var modelName = "${ctxPath}/advertisement";
    function onLayuiInit() {
        loadOptionList({
            url:'${ctxPath}/advertisementType/getList',
            elementId:'typeId',
        });
        //绑定上传的内容()
        bindUpload("image-upload-show","coverImage");
        //绑定监听表单的提交时间
        bindSubmit(modelName,'add','btn_form_submit','');
    }
</script>
</html>
