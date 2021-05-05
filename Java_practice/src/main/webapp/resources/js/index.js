var menus=[
{
    name:'分类管理',
    menus:[
        {
            name:'分类管理',
            url:'goodsType/listPage'
        }
    ]
},
]
//
layui.use('element',function () {
    var element = layui.element;
    initMenu();
    element.render('nav_layui');
});
function initMenu() {
    $('#nav_layui').empty();
    var leftMenu='';
    $.each(menus,function (index,parent) {
        leftMenu+='<li class="layui-nav-item">';
        leftMenu+='<a class="" href="javascript:;">'+parent.name+'</a>';
        leftMenu+='<dl class="layui-nav-child">';
        $.each(parent.menus,function (childIndex,child) {
            var childEl ='<dd>' +
            '<a href="'+child.url+'" target="myframe">'+ child.name+'</a>'+
            '</dd>';
            leftMenu+=childEl;
        });
        leftMenu+='</dl>';
        leftMenu+='</li>';
    });
    $('#nav_layui').html(leftMenu);
}