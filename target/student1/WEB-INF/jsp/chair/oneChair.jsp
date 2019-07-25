<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: sheting
  Date: 2019/4/8
  Time: 11:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Chair Info</title>
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
    <div class="row">
        <div class="col-md-12">
            <h1 class="page-header">
                讲座信息
            </h1>
        </div>
    </div>
    <div class="col-md-4 col-sm-4">
        <div class="panel panel-primary">
            <div class="panel-heading">${chairCustom.chairid}</div>
            <div class="panel-body"><p>${chairCustom.description}</p></div>
            <div class="panel-footer">${chairCustom.topic}</div>
        </div>
    </div>

    <c:if test="${sessionScope.admin==1}">
        <form action="${pageContext.request.contextPath}/fileUpload.action" method="post" enctype="multipart/form-data"
              onsubmit="return check()">
            请选择上传的材料：<input id="file" type="file" name="uploadfile" multiple="multiple"/>
            <input type="submit" value="files upload"/>
        </form>
    </c:if>



    <div class="row">
        <div class="col-md-12">
            <h1 class="page-header">
                下载讲座材料
            </h1>
        </div>
    </div>
    <a href="${pageContext.request.contextPath }/download.action?filename=me.jpg">file download
    </a>
</div>
</body>
<script>
    function check() {
        var file = document.getElementById("file").value;

        if (file.length == 0 || file == "") {
            alert("请选择上传材料");
            return false;
        }
        return true;
    }
</script>
</html>
