<%--
  Created by IntelliJ IDEA.
  User: sheting
  Date: 2019/4/3
  Time: 9:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script src="js/jquery-2.1.1.min.js" type="text/javascript"></script>
    <script src="js/bootstrap.js" type="text/javascript"></script>
    <link href='css/bootstrap.css' rel='stylesheet' type='text/css'/>
    <link href='css/signin.css' rel='stylesheet' type='text/css'/>
    <link href="css/custom-styles.css" rel="stylesheet">
    <link href="css/font-awesome.css" rel="stylesheet">
    <title>login</title>
</head>


<body>



<div id="container_demo">
    <!-- import header.jsp -->
    <!-- login -->
    <div class="container">

        <form class="form-signin" method="post" action="${pageContext.request.contextPath}/user/checkLogin.action">
            <h2 class="form-signin-heading">Please sign in</h2>
            <label for="inputEmail" class="sr-only">username</label>
            <input type="text" id="inputEmail" class="form-control" name="username" placeholder="Username" required
                   autofocus>
            <label for="inputPassword" class="sr-only">Password</label>
            <input type="password" id="inputPassword" class="form-control" name="password" placeholder="Password"
                   required>
            <label>请选择角色登录</label>
            <div class="radio">
                <label>
                    <input type="radio" name="roles" id="optionsRadios1"
                           value="student" checked> 学生
                </label>
            </div>
            <div class="radio">
                <label>
                    <input type="radio" name="roles" id="optionsRadios2"
                           value="lecturer">
                    讲师
                </label>
            </div>


            <button class="btn btn-lg btn-primary btn-block"  type="submit">登录</button>
            <a href="register.jsp">没有账号?点击这里注册</a>
        </form>

    </div>

    <p>${message}</p>
</div>


</body>
</html>
