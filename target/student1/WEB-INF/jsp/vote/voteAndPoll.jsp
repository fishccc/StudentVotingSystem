<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: sheting
  Date: 2019/4/7
  Time: 19:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>votedetail</title>
    <script src="../../../js/jquery-2.1.1.min.js" type="text/javascript"></script>
    <script src="../../../js/bootstrap.js" type="text/javascript"></script>
    <link href='../../../css/bootstrap.css' rel='stylesheet' type='text/css'/>
    <link href="../../../css/custom-styles.css" rel="stylesheet">
    <link href="../../../css/font-awesome.css" rel="stylesheet">
    <script>
        function isLogin() {
            var user = '<%=session.getAttribute("user")%>';
            if (user == "null" || user == "") {
                alert("You cannot write please log in");
                window.location.href = "${pageContext.request.contextPath }/login.jsp";
            } else {
                document.votePoll.action =  "${pageContext.request.contextPath }/poll/insertPoll.action?voteid=${voteCustom.voteId}";
                document.votePoll.submit();
            }

        }
    </script>
</head>
<body>
<jsp:include page="../../../header.jsp"></jsp:include>
<jsp:include page="../../../sidebar.jsp"></jsp:include>
<div id="page-wrapper">
    <div class="form-group">
        <div class="row">
            <div class="col-md-6">
                <div class="panel panel-default" style="padding: 10px;">
                    <div class="panel-heading">
                        <h2>${voteCustom.title}</h2>
                    </div>
                    <form  name="votePoll" method="post">
                        <p class="help-block">${voteCustom.description}</p>

                        <div class="radio">
                            <label>
                                <input type="radio" name="optionsRadios" id="optionsRadios1" value="option1"
                                       checked="">${voteCustom.option1}
                            </label>
                        </div>
                        <div class="radio">
                            <label>
                                <input type="radio" name="optionsRadios" id="optionsRadios2"
                                       value="option2">${voteCustom.option2}
                            </label>
                        </div>
                        <c:if test="${!empty voteCustom.option3}">
                            <div class="radio">
                                <label>
                                    <input type="radio" name="optionsRadios" id="optionsRadios3"
                                           value="option3">${voteCustom.option3}
                                </label>
                            </div>
                        </c:if>
                        <c:if test="${!empty voteCustom.option4}">
                            <div class="radio">
                                <label>
                                    <input type="radio" name="optionsRadios" id="optionsRadios4"
                                           value="option4">${voteCustom.option4}
                                </label>
                            </div>
                        </c:if>

                        <button onclick="isLogin()" type="submit" class="btn-primary btn">sumbit</button>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
