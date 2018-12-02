<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>로그인</title>
    <script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
</head>
<body>
<%@ include file="top.jsp" %>

<div class="wrapper row2">
    <div id="container" class="clear">
        <!-- content body -->
        <section id="slider">
            <div class="overlay">

            </div>
        </section>
    </div>
</div>
    <center>
        <fieldset style="width: 300px; height: 150px" class="tab_center">
            <legend align="tab_center">로그인</legend>
            <hr width=350 color=#868e96>
            <form action="login" method="post">
                &nbsp;<label for="userid">아이디</label>
                <input type="text" name="userId" id="userId"></br></br>
                &nbsp;<label for="userPw">비밀번호</label>
                <input type="password" name="userPw" id="userPw"></br>
                &nbsp;
                <input class="btn btn-secondary my-3 my-sm-0" type="button" id="loginBtn" value="로그인">
            </form>
            </br>
        </fieldset>
    </center>
</body>
<script type="text/javascript">

    var loginBtn = $("#loginBtn");

    $("#loginBtn").on("click", function (e) {
        var data = {
            userId : $('#userId').val(),
            userPw : $('#userPw').val()
        };
        console.log("pwCheck() 실행" + JSON.stringify(data));
        $.ajax({
            type: 'POST',
            url: '/pwCheck',
            data : JSON.stringify(data),
            contentType : "application/json; charset=UTF-8",
            success: function (result) {
                console.log("success");
                window.location.href = '<%=request.getContextPath()%>/';
            },
            error : function (er) {
                console.log("error");
            }
        });
    });

</script>
</html>