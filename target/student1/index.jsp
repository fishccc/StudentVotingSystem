<%--
  Created by IntelliJ IDEA.
  User: sheting
  Date: 2019/4/3
  Time: 9:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <script src="js/jquery-2.1.1.min.js" type="text/javascript"></script>
    <script src="js/bootstrap.js" type="text/javascript"></script>
    <link href='css/bootstrap.css' rel='stylesheet' type='text/css'/>
    <%--<link href='css/signin.css' rel='stylesheet' type='text/css'/>--%>
    <link href="css/custom-styles.css" rel="stylesheet">
    <link href="css/font-awesome.css" rel="stylesheet">

    <title>index</title>

    <script type="text/javascript">
        $(function () {
            initData();
            initCourse();
            initChair();
        });

        function initChair() {
            $.ajax({
                type: 'get',
                dataType: 'json',
                url: "/chair/queryAllChair.action",
                success: function (data) {
                    $("#chair").children().remove();//清除原有的元素

                    for (var i = 0; i < 3; i++) {
                        $("#chair").append(
                            "<div class=\'col-md-4 col-sm-4\'>" +
                            "<a href=\"${pageContext.request.contextPath }/chair/queryOneChair.action?id=" + data[i].chairid + "\">" +
                            "<div class=\'panel panel-primary\'>" +
                            "<div class=\'panel-heading\'>"
                            + data[i].chairid +
                            "</div>" +
                            "<div class=\'panel-body\'>" +
                            "<p>" + data[i].description + "</p>" +
                            "</div><div class=\"panel-footer\">"
                            + data[i].topic +
                            "</div></div></a></div>"
                        )
                    }
                }
            });
        }

        function initCourse() {
            $.ajax({
                type: 'get',
                dataType: 'json',
                url: "/course/queryAllCourse.action",
                success: function (data) {

                    $.each(data, function (index, course) {//遍历json中每一个单元，随即为“tbody”添加元素
                            $("#course").append(
                                "<div class = \"col-md-3\">" +
                                "<a href=\"/course/queryOneCourse.action?id=" + course.classid + "\">" +
                                "<div class='panel panel-primary text-center no-boder bg-color-green'>" +
                                "<div class='panel-body'>" +
                                "<i class='fa fa-bar-chart-o fa-5x'></i>" +
                                "<h3>" + course.name + "</h3>" +
                                "</div>" +
                                "<div class='panel-footer back-footer-green '>" + course.name
                                + "</div> </div></a>" +
                                "</div>"
                            )
                        }
                    )
                }
            });
        }


        //加载初始化数据
        function initData() {
            $.ajax({
                type: 'GET',
                dataType: "json",
                url: "/vote/queryAllVote.action",
                success: function (data) {
                    $("tbody").children().remove();//清除原有的元素
                    $.each(data, function (index, vote) {//遍历json中每一个单元，随即为“tbody”添加元素
                            $("tbody").append(         //添加新元素（具体内容不重要）
                                "<tr>"
                                + "<td>" + vote.voteId + "</td>"
                                + "<td>" + vote.title + "</td>"
                                + "<td><a class=\"btn btn-primary btn-sm\" href=\"/vote/queryOneVote.action?id="+vote.voteId+"\">\n" +
                                "投票" +
                                "</a></td>"
                                + "</tr>"
                            )
                        }
                    )
                }
            });


        }
    </script>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<jsp:include page="sidebar.jsp"></jsp:include>
<div id="page-wrapper">
    <div id="page-inner">


        <div class="row">
            <div class="col-md-12">
                <h1 class="page-header">
                    课程列表
                    <small>所有的课程列表</small>
                </h1>
            </div>
        </div>
        <!-- /. ROW  -->

        <div class="row" id="course">

        </div>

        <!-- /. ROW  -->
        <%--<p> Test${ sessionScope.user.username}</p>--%>
        <div class="row">
            <div class="col-md-12 col-sm-12 col-xs-12">
                <div class="panel panel-default">
                    <div class="panel-heading">
                        投票列表
                    </div>
                    <div class="panel-body">
                        <div class="table-responsive">
                            <table class="table table-striped table-bordered table-hover">
                                <thead>
                                <tr>
                                    <th>No.</th>
                                    <th>标题</th>
                                    <th>操作</th>
                                </tr>
                                </thead>
                                <tbody>

                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <p>讲座信息</p>
        <div class="row" id="chair">
        </div>

        <!-- /. ROW  -->
        <footer><p>All right reserved.</p></footer>
    </div>
    <!-- /. PAGE INNER  -->
</div>
</body>
</html>
