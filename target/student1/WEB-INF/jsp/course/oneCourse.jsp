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
    <script src="../../../js/jquery-2.1.1.min.js" type="text/javascript"></script>
    <script src="../../../js/bootstrap.js" type="text/javascript"></script>
    <link href='../../../css/bootstrap.css' rel='stylesheet' type='text/css'/>
    <link href="../../../css/custom-styles.css" rel="stylesheet">
    <link href="../../../css/font-awesome.css" rel="stylesheet">

    <style type="text/css">

        .aa {
            background: #f2fbf2;
            width: 80%;
            padding: 10px;
            margin-bottom: 10px;
        }

    </style>
    <script>
        $(function () {
            initChair();
            initComment();
        });

        function isLogin() {
            var user = '<%=session.getAttribute("user")%>';
            if (user == "null" || user == "") {
                alert("You cannot write please log in");
                window.location.href = "${pageContext.request.contextPath }/login.jsp";
            } else {
                document.insertComment.action = "${pageContext.request.contextPath }/comment/insertComment.action?classid=${course.classid}";
                document.insertComment.submit();
            }

        }


        function initChair() {
            $.ajax({
                type: 'get',
                dataType: 'json',
                url: "/chair/jsonQueryOneChair.action?id=${course.classid}",
                success: function (data) {
                    $("#chair").children().remove();//清除原有的元素
                    if(data!=''){
                        $("#chair").append(
                            "<div class=\'col-md-4 col-sm-4\'>" +
                            "<a href=\"${pageContext.request.contextPath }/chair/queryOneChair.action?id=" + data.chairid + "\">" +
                            "<div class=\'panel panel-primary\'>" +
                            "<div class=\'panel-heading\'>"
                            + data.chairid +
                            "</div>" +
                            "<div class=\'panel-body\'>" +
                            "<p>" + data.description + "</p>" +
                            "</div><div class=\"panel-footer\">"
                            + data.topic +
                            "</div></div></a></div>"
                        )
                    }else {
                        $("#chair").append(
                            "<p>该课程没有相关讲座信息</p>"
                        )
                    }

                }
            });
        }

        function initComment() {
            $.ajax({
                type: 'get',
                dataType: 'json',
                url: "${pageContext.request.contextPath }/comment/queryAllComment.action?classid=${course.classid}",
                success: function (data) {
                    $("#comment").children().remove();//清除原有的元素
                    for (var i = 0; i < data.length; i++) {
                        $("#comment").append(
                            "<div class=\"row aa\">" +
                            "<div class=\"col-md-2\">" +
                            "<img style=\"width: 70%;\" src=\"../../../img/me.jpg\"></div>" +
                            "<div class=\"col-md-6\"><span> "
                            + data[i].username +
                            "</span><p>"
                            + data[i].content +
                            "</p></div></div>"
                        )
                    }
                }
            });
        }
    </script>
</head>
<body>
<jsp:include page="../../../header.jsp"></jsp:include>
<jsp:include page="../../../sidebar.jsp"></jsp:include>
<div id="page-wrapper">
    <div class="row">
        <div class="col-md-12">
            <h1 class="page-header">
                ${course.name}
                <small>这是关于课程的描述</small>
            </h1>
        </div>
    </div>
    <div class="row">
        <div class="col-md-12">
            <div class="panel panel-default">
                <div class="panel-heading">
                    相关信息
                </div>
                <div class="panel-body">
                    <div class="alert alert-success">
                        <strong>${course.name}:</strong><br>
                        ${course.description}
                    </div>

                </div>
            </div>
        </div>
    </div>
    <div class="col-md-12">
        <h1 class="page-header">
            讲座信息
            <small>这是关于讲座信息的描述</small>
        </h1>
        <div class="row" id="chair">
        </div>
    </div>


    <i class="fa fa-comment-o" style="margin-bottom:10px; " aria-hidden="true">评论列表</i>
    <div id="comment">
    </div>


    <form name="insertComment" method="post">
        <div class="form-group">
            <label>写评论</label>
            <input name="content" type="text" class="form-control" placeholder="写下你的评论">
        </div>
        <input class="btn btn-primary" type="button" value="submit" onclick="isLogin()"/>
        <a href="${pageContext.request.contextPath }/login.jsp">You can't write a comment if you're not logged in!</a>
    </form>

</div>
</body>
</html>
