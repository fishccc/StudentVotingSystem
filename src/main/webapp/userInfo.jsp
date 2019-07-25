<%--
  Created by IntelliJ IDEA.
  User: sheting
  Date: 2019/4/5
  Time: 23:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script src="js/jquery-2.1.1.min.js" type="text/javascript"></script>
    <script src="js/bootstrap.js" type="text/javascript"></script>
    <link href='css/bootstrap.css' rel='stylesheet' type='text/css'/>
    <link href="css/custom-styles.css" rel="stylesheet">
    <link href="css/font-awesome.css" rel="stylesheet">
    <title>UserInfo</title>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<jsp:include page="sidebar.jsp"></jsp:include>
<div id="page-wrapper">
    <div id="page-inner">
        <div class="row">
            <div class="col-md-3">
                <img style="width: 100%;border-radius: 80px; " src="img/me.jpg">
            </div>
            <div class="col-md-6">
                <form class="form-horizontal" role="form" action="/user/changePassword.action">
                    <div style="margin-top: 20px" class="form-group">
                        <label class="col-sm-2 control-label">username</label>
                        <div class="col-sm-3">

                            <input type="username" class="form-control" id="username" name="username"
                                   value="${sessionScope.user.username}">
                        </div>
                    </div>
                    <div class="form-group">

                        <label for="inputPassword" class="col-sm-2 control-label">password</label>
                        <div class="col-sm-6">
                            <input type="password" class="form-control" id="inputPassword" name="password"
                                   placeholder="password">


                            <button style="margin-top: 30px;" type="submit" class="btn btn-primary">提交修改</button>

                        </div>

                    </div>
                </form>

            </div>
        </div>
    </div>
</div>

</body>
</html>
