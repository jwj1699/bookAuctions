<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>책방</title>
    <%--<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>--%>
</head>
<body>
<div class="wrapper row1">
    <header id="header" class="clear">
        <div id="hgroup">
            <h1><a href="/" style="text-decoration:none;">책방</a></h1>
            <h2></h2>
        </div>
        <nav>
            <ul>
                <li>
                    <a href='<%=application.getContextPath()%>/login'>로그인</a>
                </li>
                <li>
                    <a href='<%=application.getContextPath()%>/join'>회원가입</a>
                </li>
                <li>
                    <a href='<%=application.getContextPath()%>/logout'>로그아웃</a>
                </li>
                <li>
                    <a href='<%=request.getContextPath()%>/mypage'>마이페이지</a>
                </li>
                <li>
                    <a href="<%=request.getContextPath()%>/list">책경매</a>
                </li>
                <li>
                    <a href='<%=application.getContextPath()%>/write'>경매등록</a>
                </li>
            </ul>
        </nav>
