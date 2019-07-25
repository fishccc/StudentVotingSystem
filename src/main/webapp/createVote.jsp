<%--
  Created by IntelliJ IDEA.
  User: sheting
  Date: 2019/4/8
  Time: 15:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Vote</title>
    <script src="js/jquery-2.1.1.min.js" type="text/javascript"></script>
    <script src="js/bootstrap.js" type="text/javascript"></script>
    <link href='css/bootstrap.css' rel='stylesheet' type='text/css'/>
    <link href="css/custom-styles.css" rel="stylesheet">
    <link href="css/font-awesome.css" rel="stylesheet">

</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<jsp:include page="sidebar.jsp"></jsp:include>
<div id="page-wrapper">
    <form action="/vote/insertVote.action"  method="post" >
        <div class="form-group has-success">
            <label class="control-label"  >投票标题</label>
            <input type="text" name="title" class="form-control">
        </div>
        <div class="form-group has-success">
            <label class="control-label" >投票描述</label>
            <input type="text" name="description" class="form-control">
        </div>
        <div class="form-group has-success">
            <label class="control-label" >请填写选项一</label>
            <input type="text" name="option1" class="form-control" >
        </div>
        <div class="form-group has-success">
            <label class="control-label" >请填写选项二</label>
            <input type="text" name="option2" class="form-control">
        </div>
        <div class="form-group has-success">
            <label class="control-label" >请填写选项三</label>
            <input type="text" name="option3" class="form-control" >
        </div>
        <div class="form-group has-success">
            <label class="control-label" >请填写选项四</label>
            <input type="text" name="option4" class="form-control" >
        </div>
        <button class="btn-primary btn" type="submit">提交</button>
    </form>
</div>
</body>
</html>
