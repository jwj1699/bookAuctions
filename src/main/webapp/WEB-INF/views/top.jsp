<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>책방</title>
    <%--<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>--%>
</head>
<c:set var="loginCheck" value="0"/>

<c:if test="${ sessionScope.sessionId != null }">
    <c:set var="loginCheck" value="1"/>
</c:if>
<body>
<div class="wrapper row1">
    <header id="header" class="clear">
        <div id="hgroup">
            <h1><a href="/" style="text-decoration:none;">책방</a></h1>
            <h2></h2>
        </div>
        <nav>
            <ul>
                <c:choose>
                    <c:when test="${ loginCheck==0 }">
                        <li>
                            <a href='<%=application.getContextPath()%>/login'>로그인</a>
                        </li>
                        <li>
                            <a href='<%=application.getContextPath()%>/join'>회원가입</a>
                        </li>
                    </c:when>
                    <c:otherwise>
                        <li>
                            <a href='<%=application.getContextPath()%>/logout'>로그아웃</a>
                        </li>
                        <li>
                            <a href='<%=request.getContextPath()%>/mypage'>마이페이지</a>
                        </li>
                    </c:otherwise>
                </c:choose>
                <li>
                    <a href="<%=request.getContextPath()%>/list">책경매</a>
                </li>
                <c:if test="${ loginCheck==1 }">
                    <li>
                        <a href='<%=application.getContextPath()%>/write'>경매등록</a>
                    </li>
                </c:if>
            </ul>
        </nav>
