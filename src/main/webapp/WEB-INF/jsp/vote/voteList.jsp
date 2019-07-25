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
    <script src="../../../js/jquery-2.1.1.min.js" type="text/javascript"></script>
    <script src="../../../js/bootstrap.js" type="text/javascript"></script>
    <link href='../../../css/bootstrap.css' rel='stylesheet' type='text/css'/>
    <link href="../../../css/custom-styles.css" rel="stylesheet">
    <link href="../../../css/font-awesome.css" rel="stylesheet">
    <title>vote list</title>
    <script type="text/javascript">
        function deleteVote() {
            document.voteForm.action = "${pageContext.request.contextPath }/vote/deleteVote.action";
            document.voteForm.submit();
        }

        function updateVote() {
            document.voteForm.action = "${pageContext.request.contextPath }/vote/queryVote.action";
            document.voteForm.submit();
        }

    </script>
</head>
<body>
<jsp:include page="../../../header.jsp"></jsp:include>
<jsp:include page="../../../sidebar.jsp"></jsp:include>
<%--<form name="voteForm" method="post">--%>
<%--查询条件：--%>
<%--<table width="100%" border=1>--%>
<%--<tr>--%>
<%--<td><input name="voteCustom.title"/></td>--%>
<%--<td><input type="button" value="查询" onclick="queryVote()"/></td>--%>
<%--<td><input type="button" value="批量删除" onclick="deleteVote()"/></td>--%>

<%--</tr>--%>
<%--</table>--%>
<%--商品列表：--%>
<%--</form>--%>
<div id="page-wrapper">
    <div class="col-md-12">
        <h1 class="page-header">
            Vote List
            <small>all votes</small>
        </h1>
    </div>
    <div class="row">
        <div class="col-md-12">
            <!-- Advanced Tables -->
            <div class="panel panel-default">
                <div class="panel-heading">
                    所有的投票列表
                </div>
                <div class="panel-body">
                    <div class="table-responsive">
                    </div>
                    <form name="voteForm" method="post">
                    <table class="table table-striped table-bordered table-hover dataTable no-footer"
                           id="dataTables-example" aria-describedby="dataTables-example_info">
                        <thead>
                        <tr role="row">

                            <th class="sorting" tabindex="0" aria-controls="dataTables-example" rowspan="1" colspan="1"
                                aria-label="Browser: activate to sort column ascending" style="width: 231px;">V id
                            </th>
                            <th class="sorting" tabindex="0" aria-controls="dataTables-example" rowspan="1" colspan="1"
                                aria-label="Platform(s): activate to sort column ascending" style="width: 209px;">
                                标题
                            </th>

                            <th class="sorting" tabindex="0" aria-controls="dataTables-example" rowspan="1" colspan="1"
                                aria-label="Engine version: activate to sort column ascending" style="width: 125px;">
                                操作
                            </th>

                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach items="${voteList }" var="vote">
                            <tr>
                                <td>${vote.voteId}</td>
                                <td>${vote.title}</td>
                                <td>
                                    <a class="btn btn-primary btn-sm" href="${pageContext.request.contextPath }/vote/queryOneVote.action?id=${vote.voteId}">
                                        投票
                                    </a>

                                    <c:if test="${sessionScope.admin==1}">
                                        <a href="${pageContext.request.contextPath }/vote/deleteVote.action?id=${vote.voteId}" class="btn btn-danger btn-sm">
                                            删除
                                        </a>
                                    </c:if>

                                </td>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>
                    </form>
                </div>
            </div>
            <!--End Advanced Tables -->
        </div>
    </div>
    <c:if test="${sessionScope.admin==1}">
        <a href="${pageContext.request.contextPath }/createVote.jsp">发起投票</a>
    </c:if>
</div>
</body>
</html>
