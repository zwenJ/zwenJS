<%--
  Created by IntelliJ IDEA.
  User: kai
  Date: 2018/1/21
  Time: 17:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>客户关系管理系统--归档服务处理查看</title>
</head>
<body>
<br/>
<div class="page_title">客户服务管理 &gt; 归档服务</div>
<br/><br/><br/>
<div class="button_bar">
    <button class="common_button" onclick="help('');">帮助</button>
    <button class="common_button" onclick="back();">返回</button>
</div>
<table class="query_form_table">
    <tr>
        <th>编号</th>
        <td></td>
        <th>服务类型</th>
        <td></td>
    </tr>
    <tr>
        <th>概要</th>
        <td colspan="3"></td>
    </tr>
    <tr>
        <th>客户</th>
        <td></td>
        <th>状态</th>
        <td></td>
    </tr>
    <tr>
        <th>服务请求</th>
        <td colspan="3"><br>
            　</td>
    </tr>
    <tr>
        <th>创建人</th>
        <td></td>
        <th>创建时间</th>
        <td></td>
    </tr>
</table>
<br />
<table class="query_form_table" id="table3">
    <tr>
        <th>分配给</th>
        <td></td>
        <th>分配时间</th>
        <td></td>
    </tr>
</table>
<br />
<table class="query_form_table" id="table1">
    <tr>
        <th>服务处理</th>
        <td colspan="3"></td>
    </tr>
    <tr>
        <th>处理人</th>
        <td></td>
        <th>处理时间</th>
        <td></td>
    </tr>
</table>
<br />
<table class="query_form_table" id="table2">
    <tr>
        <th>处理结果</th>
        <td></td>
        <th>满意度</th>
        <td>☆☆☆</td>
    </tr>
</table>
</body>

</html>
