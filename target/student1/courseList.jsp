<%--
  Created by IntelliJ IDEA.
  User: sheting
  Date: 2019/4/5
  Time: 16:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Course</title>
    <script src="js/jquery-2.1.1.min.js" type="text/javascript"></script>
    <script src="js/bootstrap.js" type="text/javascript"></script>
    <link href='css/bootstrap.css' rel='stylesheet' type='text/css'/>
    <link href="css/custom-styles.css" rel="stylesheet">
    <link href="css/font-awesome.css" rel="stylesheet">
    <%--<script type="text/javascript">--%>
        <%--$(function () {--%>
            <%--initCourse();--%>
        <%--});--%>

        <%--function initCourse() {--%>
            <%--$.ajax({--%>
                <%--type: 'get',--%>
                <%--dataType: 'json',--%>
                <%--url: "${pageContext.request.contextPath }/course/queryAllCourse.action",--%>
                <%--success: function (data) {--%>
                    <%--$("#course").children().remove();//清除原有的元素--%>
                    <%--$.each(data, function (index, course) {//遍历json中每一个单元，随即为“tbody”添加元素--%>
                            <%--$("#course").append(--%>
                                <%--"<div class = \"col-md-3\">" +--%>
                                <%--"<a href=\"${pageContext.request.contextPath }/course/queryOneCourse.action?id=" + course.classid + "\">" +--%>
                                <%--"<div class=\'panel panel-primary text-center no-boder bg-color-green\'>" +--%>
                                <%--"<div class=\'panel-body\'>" +--%>
                                <%--"<i class='fa fa-bar-chart-o fa-5x'></i>" +--%>
                                <%--"<h3>" + course.name + "</h3>" +--%>
                                <%--"</div>" +--%>
                                <%--"<div class=\'panel-footer back-footer-green \'>" + course.name--%>
                                <%--+ "</div> </div></a></div>"--%>
                            <%--)--%>
                        <%--}--%>
                    <%--)--%>
                <%--}--%>
            <%--});--%>
        <%--}--%>
    <%--</script>--%>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<jsp:include page="sidebar.jsp"></jsp:include>
<div id="page-wrapper">
    <div class="row">
        <div class="col-md-12">
            <h1 class="page-header">
                CourseList<small>This is all the course information</small>
            </h1>
        </div>
    </div>
    <label>Search:<input type="search" class="form-control input-sm" aria-controls="dataTables-example"></label>
    <div class="row" id="course">
    </div>

</div>
</body>
</html>
