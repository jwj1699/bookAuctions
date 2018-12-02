<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>회원가입</title>
    <script src="//code.jquery.com/jquery.min.js"></script>
</head>
<body>
    <div class="wrapper row2">
        <div id="container" class="clear">
            <!-- content body -->
            <section id="slider">
                <div class="overlay">

                </div>
            </section>
        </div>
    </div>
    <br>
    <center>
        <form action="/join" method="post" name="modify" onSubmit="javascript:return check()">
            <h3>회원가입</h3>
            <TABLE border=2>
                </br>
                <tr>
                    <td bgcolor="#868e96" style="color:white" width="20%" align="center">아이디</td>
                    <td width="80%" align="left"><input type="text" name="userId" id="uid" style="width: 286px" class="form-control" placeholder="아이디 입력"/>
                        <span id="IDCheck"></span>
                        <button class="btn btn-default" onclick="IdCheck()" type="button">중복확인</button>
                </tr>
                <tr>
                    <td bgcolor="#868e96" style="color:white" width="20%" align="center">비밀번호</td>
                    <td width="80%" align="left"><input style="width: 286px" type="password" class="form-control" name="userPw" placeholder="비밀번호 입력"/>
                </tr>
                <tr>
                    <td bgcolor="#868e96" style="color:white" width="20%" align="center">비밀번호 확인</td>
                    <td width="80%" align="left"><input style="width: 286px" type="password" class="form-control" name="userPw2" placeholder="비밀번호 다시 입력"/>
                </tr>
                <tr>
                    <td bgcolor="#868e96" style="color:white" width="20%" align="center">이름</td>
                    <td width="80%" align="left"><input type="text" name="uname" id="userName" style="width: 286px" class="form-control" placeholder="이름 입력"/>
                </tr>
                <tr>
                    <td bgcolor="#868e96" style="color:white" width="20%" align="center">이메일</td>
                    <td width="80%" align="left"><input type="mail" class="form-control" name="userMail" placeholder="이메일 입력"/>
                </tr>
                <tr>
                    <td bgcolor="#868e96" style="color:white" width="20%" align="center">단과대별</td>
                    <td width="80%" align="left">
                        <select name="userCollege">
                            <option value="H-LAC">H-LAC</option>
                            <option value="디자인,아트대학">디자인,아트대학</option>
                            <option value="사회과학대학">사회과학대학</option>
                            <option value="경영대학">경영대학</option>
                            <option value="공과대학">공과대학</option>
                            <option value="사회과학대학">사회과학대학</option>
                            <option value="보건의료과학대학">보건의료과학대학</option>
                            <option value="한의과대학">한의과대학</option>
                        </select>
                    </td>
                </tr>
            </TABLE>
            </br>
            <input class="btn btn-secondary my-3 my-sm-0" type="submit" value="회원가입">
            <input class="btn btn-secondary my-3 my-sm-0" type="reset" value="다시입력">
            </br>
        </form>
    </center>

</body>
<script type="text/javascript">
    function IdCheck() {
        var data = { id: $('#uid').val() };

        $.ajax({
            type: 'POST',
            url: '/idCheck',
            data : $('#uid').val(),
            contentType : "application/json; charset=utf-8",
            success: function (result) {
                if (result == 1) {
                    $('#IDCheck').css({color: "red"});
                    $('#IDCheck').html('사용할 수 없는 아이디 입니다.');
                } else {
                    $('#IDCheck').css({color: "green"});
                    $('#IDCheck').html('사용할 수 있는 아이디 입니다.');
                }
            },
            error : function (er) {
                $('#IDCheck').css({color: "green"});
                $('#IDCheck').html('사용할 수 있는 아이디 입니다.');
            }
        });
    }
</script>
</html>