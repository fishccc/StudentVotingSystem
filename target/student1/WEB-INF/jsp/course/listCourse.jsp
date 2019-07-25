<%--
  Created by IntelliJ IDEA.
  User: sheting
  Date: 2019/4/7
  Time: 23:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Course List</title>
    <script src="../../../js/jquery-2.1.1.min.js" type="text/javascript"></script>
    <script src="../../../js/bootstrap.js" type="text/javascript"></script>
    <link href='../../../css/bootstrap.css' rel='stylesheet' type='text/css'/>
    <link href="../../../css/custom-styles.css" rel="stylesheet">
    <link href="../../../css/font-awesome.css" rel="stylesheet">


</head>
<body>
<jsp:include page="../../../header.jsp"></jsp:include>
<jsp:include page="../../../sidebar.jsp"></jsp:include>

<div id="page-wrapper">
    <div class="col-md-12">
        <h1 class="page-header">
            课程列表
            <small>所有课程</small>
        </h1>
    </div>



    <div class="row">
        <div class="panel-body">
            <form action="/course/queryCourse.action">
            <div class="row">
                <div class="col-sm-6">
                    <div id="dataTables-example_filter" class="dataTables_filter">
                        <label>
                            Search:<input type="search" name="name" class="form-control input-sm" aria-controls="dataTables-example">
                        </label>
                    </div>
                </div>
            </div>
                <button class="btn btn-primary" type="submit">查询</button>
            </form>
        </div>

        <c:forEach items="${courseList}" var="course">
            <a href="/course/queryOneCourse.action?id=${course.classid}">
        <div class="col-md-3 col-sm-12 col-xs-12">
            <div class="panel panel-primary text-center no-boder bg-color-green">
                <div class="panel-body">
                    <i class="fa fa-bar-chart-o fa-5x"></i>
                    <h3>${course.name }</h3>
                </div>
                <div class="panel-footer back-footer-green">
                        ${course.name }

                </div>
            </div>
        </div>
            </a>
        </c:forEach>
    </div>

</div>


</body>
</html>
