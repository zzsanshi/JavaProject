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
    <table id="id_table" lay-filter="lineToolFilter"></table>
</body>
<script>
    var modelName = "${ctxPath}/advertisement";
    function onLayuiInit() {
        //渲染表格
        renderTable({
            elem:'#id_table',
            id:'id_table',
            toolbar:'#toolbar',
            url:modelName+"/getList",
            cols:[[
                {type:'checkbox',LAY_CHECKED:false},
                {field:'id',title:'ID',align:'centre'},
                {field: 'name',title: '分类名称',align: 'centre'},
                {field: 'state',title: '状态',align: 'centre',templet:function (d) {
                    if (d.state==1){
                        return "<input type='checkbox' lay-filter='switchState' name='" + d.id+"'lay-skin='switch' lay-text='禁用|正常'>";
                    }else {
                        return "<input type='checkbox' lay-filter='switchState' name='" + d.id+"'lay-skin='switch' lay-text='禁用|正常'checked>";
                    }
                    }
                },
                {field: 'createTime',title: '创建时间',align: 'centre',templet:function (d) {
                    return layui.util.toDateString(d.createTime);
                    }
                },
                {field: 'updateTime',title: '更新时间',align: 'centre',templet:function (d){
                        return layui.util.toDateString(d.updateTime);
                    }
                },
                {title: '操作',align: 'centre',toolbar:'#bar2'},
            ]]
        });
        //使用父类的航工具栏
        useParentToolEvent(modelName);
    }
</script>
</html>
