<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>

<nav class="navbar-default navbar-side" role="navigation">
    <div class="sidebar-collapse">
        <ul class="nav" id="main-menu">

            <li>
                <a class="active-menu"><i class="fa fa-dashboard"></i>
                   <%--Hello:${ sessionScope.user.username}!--%>

                    <%--Hello:<c:if test="${empty sessionScope.user.username}">--%>
                        <%--visitor!--%>
                    <%--</c:if>--%>

                    Hello:
                    <c:choose>
                        <c:when test="${empty sessionScope.user.username}">
                               游客!
                        </c:when>
                        <c:otherwise>
                            ${ sessionScope.user.username}
                        </c:otherwise>
                    </c:choose>
                </a>
            </li>
            <li>
                <a href="/index.jsp"><i class="fa fa-desktop"></i>首页</a>
            </li>
            <li>
                <a href="/vote/queryVote.action"><i class="fa fa-desktop"></i>所有投票</a>
            </li>
            <li>
                <a href="/course/queryCourse.action"><i class="fa fa-bar-chart-o"></i>所有课程</a>
            </li>



        </ul>

    </div>

</nav>