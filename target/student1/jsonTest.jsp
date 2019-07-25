<%--
  Created by IntelliJ IDEA.
  User: sheting
  Date: 2019/4/3
  Time: 10:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<%--<script type="text/javascript" type="text/javascript"--%>
<%--src="${pageContext.request.contextPath}/js/jquery-2.1.1.min.js></script>"></script>--%>
<script src="js/jquery-2.1.1.min.js" type="text/javascript"></script>

<script type="text/javascript">
    function requestJson() {
        $.ajax({
            type: 'post',
            url: '${pageContext.request.contextPath }/requestJson',
            contentType: 'application/json;charset=utf-8',
            //数据格式是json串，商品信息
            data: '{"title":"手机","option1":1}',
            success: function (data) {//返回json结果
                alert(data);
            }

        });
    }

    function responseJson() {
        $.ajax({
            type: 'post',
            url: '${pageContext.request.contextPath }/responseJson',
            // contentType: 'application/json;charset=utf-8',
            //数据格式是json串，商品信息
            data: 'title=手机&option1=2',
            success: function (data) {//返回json结果
                alert(data.title);
            }
        });

    }
</script>
<body>
<input type="button" onclick="requestJson()" value="请求json，输出是json"/>
<input type="button" onclick="responseJson()" value="请求key/value，输出json"/>
</body>
</html>
