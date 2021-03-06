<%--
  Created by IntelliJ IDEA.
  User: Jzw
  Date: 2018/1/18
  Time: 12:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <base href="<%@include file="../../../common/basehead.jsp"%>"/>
    <title>蓝科客户关系管理系统</title>
    <meta charset="UTF-8">
    <!-- easyUI样式信息 -->
    <%@include file="../../../common/base"%>
</head>
<body id="layout_body" class="easyui-layout">
<div data-options="region:'west',split:true,collapsible:false" style="width:180px;">
    <table id="admin_info">
        <tr>
            <td rowspan="2"><img src="images/user.png" style="width: 50px;height: 50px;" /></td>
            <td>
                <strong><shiro:principal/></strong>
            </td>
        </tr>
        <tr>
            <td>
                <span class="left">
                    <a href="user/logout">退出</a>
                </span>
                <span>&nbsp;|&nbsp;</span>
                <span class="right">
                    <a href="javascript:loadWin('个人配置','to/view/authority/user_personal_center')">配置</a>
                </span>
            </td>
        </tr>
    </table>
    <!-- 左边功能分类面板 -->
    <div id="accordion_div" class="easyui-accordion"  data-options="fit:false,animate:true,multiple:true" ></div>
</div>
<div data-options="region:'center',border:false">

    <div id="win_main" class="easyui-window" title=""
         data-options="modal:true,closed:true" style="padding: 10px;">
    </div>
    <div id="win_main_2" class="easyui-window" title=""
         data-options="modal:true,closed:true">
    </div>
    <div id="sys_tab"  class="easyui-tabs"  data-options="fit:'true'">
    </div>

</div>
<script type="text/javascript" src="mylib/js/default.js"></script>
<script type="text/javascript" src="mylib/js/left.js"></script>
</body>
</html>
