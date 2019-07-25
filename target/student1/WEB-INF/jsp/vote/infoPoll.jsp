<%--
  Created by IntelliJ IDEA.
  User: sheting
  Date: 2019/4/7
  Time: 21:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>show poll</title>
    <script src="../../../js/jquery-2.1.1.min.js" type="text/javascript"></script>
    <script src="../../../js/bootstrap.js" type="text/javascript"></script>
    <link href='../../../css/bootstrap.css' rel='stylesheet' type='text/css'/>
    <link href="../../../css/custom-styles.css" rel="stylesheet">
    <link href="../../../css/font-awesome.css" rel="stylesheet">
    <script src="../../../js/echarts.min.js" type="text/javascript"></script>

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


        function initComment() {
            $.ajax({
                type: 'get',
                dataType: 'json',
                url: "${pageContext.request.contextPath }/comment/queryAllCommentByVoteid.action?voteid=${vote.voteId}",
                success: function (data) {
                    $("#comment").children().remove();//清除原有的元素
                    for (var i = 0; i < 3; i++) {
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
    <div id="mainPoll" style="width: 600px;height:400px;"></div>
    <%--<i class="fa fa-comment-o" style="margin-bottom:10px; " aria-hidden="true">Comment List</i>--%>
    <%--<div id="comment">--%>

    <%--</div>--%>

</div>
</body>
<script type="text/javascript">
    // 基于准备好的dom，初始化echarts实例
    var myChart = echarts.init(document.getElementById("mainPoll"));
    // 指定图表的配置项和数据
    myChart.setOption({
        title: {
            text: '${vote.title}'
        },
        tooltip: {},
        legend: {
            data: ['vote number']
        },
        xAxis: {
            data: ["${vote.option1}", "${vote.option2}", "${vote.option3}", "${vote.option4}"]
        },
        yAxis: {},
        series: [{
            name: 'number',
            type: 'bar',
            data: ["${poll.option1Num}", "${poll.option2Num}", "${poll.option3Num}", "${poll.option4Num}"]
        }]
    });

</script>

</html>
