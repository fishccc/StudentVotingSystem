<%--
  Created by IntelliJ IDEA.
  User: sheting
  Date: 2019/3/29
  Time: 22:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<head>
    <title>课程列表</title>
</head>
<body>
<form id="voteForm" action="${pageContext.request.contextPath }/vote/submitVote" method="post">
    修改商品信息：
    <table width="100%" border=1>
        <tr>
            <td>id</td>
            <td><input type="text" name="voteId" value="${voteCustom.voteId }"/></td>
        </tr>
        <tr>
            <td>标题</td>
            <td><input type="text" name="title" value="${voteCustom.title }"/></td>
        </tr>
        <tr>
            <td>啊啊</td>
            <td><input type="text" name="option1" value="${voteCustom.option1 }"/></td>
        </tr>
        <tr>
            <td>哦哦</td>
            <td><input type="text" name="option2" value="${voteCustom.option2 }"/></td>
        </tr>

        <tr>
            <td colspan="2" align="center"><input type="submit" value="提交"/>
            </td>

    </table>

</form>
</form>
</body>
</html>
