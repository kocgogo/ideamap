<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>

<jsp:setProperty property="*" name="userInfo" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link
	href="http://netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/css/bootstrap-combined.min.css"
	rel="stylesheet">
<link
	href="http://netdna.bootstrapcdn.com/bootstrap/3.1.0/css/bootstrap.min.css"
	rel="stylesheet">

<style type="text/css">
a,a:hover,a:visited {
	color: #fff;
	text-decoration: none;
}

#controls {
	width: 250px;
	height: 400px;
	background: gray;
	color: black;
	position: absolute;
	top: 300px;
	left: 500px;
	text-align: center;
	border: 2px solid #000;
}

#pop_bt {
	border: 1px solid #000;
	width: 100px;
	right: 50px;
	cursor: pointer;
	font-weight: bold;
	text-align: center;
	padding: 5px;
}

#close {
	width: 100px;
	margin: auto;
	cursor: pointer;
	font-weight: bold;
}
</style>
<script src="http://code.jquery.com/jquery-1.10.2.min.js"></script>
<script
	src="http://netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.0.min.js"></script>
<script src="//code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
<script src="http://code.jquery.com/jquery-latest.js"></script>
  <script type="text/javascript" src="http://code.jquery.com/jquery-1.9.1.min.js"></script>
   <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.3/jquery.min.js"></script>
<script type="text/javascript">

var flag = 1;
var flag2 = 1;
   $(document).ready(function() {
	   $("#idchecked").on("click" , function() {
		   var id = $("#id").val();
			if (id.length < 1 || id == null) {
				alert("중복체크할 이메일을 입력하십시오");
				return false;
			}
			else{
				$.ajax({
					url:'http://localhost:8088/d3/idcheck.do',
					type : "post", 
					data:{id:id},
					dataType : "json",
					success:function(data){ 
						if(data.id=="1"){
							flag=0;
							$('.idcheckran').empty();
							$('.idcheckran').append('사용가능한 이메일입니다.');
						}
						else{
							flag=1;					
							$('.idcheckran').empty();
							$('.idcheckran').append('이미 사용중인 이메일입니다.');
						}
			           
					}
				});
			}
		   
	   });
	
    $('#pop_bt').click(function() {
     $('#controls').show();
    });
    $('#input').click(function() {   	
    });
   });

   var url = "${url}";
   $(function() {

	      $("form").submit(function() {
	          if (flag ==1) {
	        	  alert("이메일 중복을 검사하세요.");
		          $("#id").focus();
		          return false;
	          }
	          

	       });
	     	   

      $("form").submit(function() {
         if ($("#password").val().length >= 8) {
            return true;
         }
         alert("비밀번호를 8자 이상 입력하세요.");
         $("#password").focus();
         return false;

      });

      $("form").submit(function() {
         var lcase = new RegExp("[a-z]+");
         if (lcase.test($("#password").val())) {
            return true;
         }
         alert("영어 소문자 1자 이상 사용하세요.");
         $("#password").focus();
         return false;

      });

      $("form").submit(function() {
         var num = new RegExp("[0-9]+");
         if (num.test($("#password").val())) {
            return true;
         }
         alert("숫자 1자 이상 사용하세요.");
         $("#password").focus();
         return false;

      });

      $("form").submit(function() {
         var password = $("#password").val().trim();
         var password_confirm = $("#password_confirm").val().trim();
         if (password != password_confirm) {
            alert("비밀번호가 다릅니다.");
            return false;
         }

         return true;
      });

      $("input[type=password]").keyup(function() {

         var lcase = new RegExp("[a-z]+");
         var num = new RegExp("[0-9]+");

         if ($("#password").val().length >= 8) {
            $("#8char").removeClass("glyphicon-remove");
            $("#8char").addClass("glyphicon-ok");
            $("#8char").css("color", "#00A41E");
         } else {
            $("#8char").removeClass("glyphicon-ok");
            $("#8char").addClass("glyphicon-remove");
            $("#8char").css("color", "#FF0004");
         }

         if (lcase.test($("#password").val())) {
            $("#lcase").removeClass("glyphicon-remove");
            $("#lcase").addClass("glyphicon-ok");
            $("#lcase").css("color", "#00A41E");
         } else {
            $("#lcase").removeClass("glyphicon-ok");
            $("#lcase").addClass("glyphicon-remove");
            $("#lcase").css("color", "#FF0004");
         }

         if (num.test($("#password").val())) {
            $("#num").removeClass("glyphicon-remove");
            $("#num").addClass("glyphicon-ok");
            $("#num").css("color", "#00A41E");
         } else {
            $("#num").removeClass("glyphicon-ok");
            $("#num").addClass("glyphicon-remove");
            $("#num").css("color", "#FF0004");
         }

         if ($("#password").val() == $("#password_confirm").val()) {
            $("#pwmatch").removeClass("glyphicon-remove");
            $("#pwmatch").addClass("glyphicon-ok");
            $("#pwmatch").css("color", "#00A41E");
         } else {
            $("#pwmatch").removeClass("glyphicon-ok");
            $("#pwmatch").addClass("glyphicon-remove");
            $("#pwmatch").css("color", "#FF0004");
         }
      });

   });
   
	
</script>
</head>
<body>
	<form class="form-horizontal" action='joinImpl.do' method="POST">
		<fieldset>
			<div id="legend">
				사용자 등록
			</div>
			<div class="control-group">

				<div class="control-group">
					<!-- E-mail -->
					<label class="control-label" for="id">이메일</label>
					<div class="controls">
						<input type="text" id="id" name="id" placeholder=""
							class="input-xlarge" value="${userInfo.id }"> 
							<input type="button" value="중복확인" name="idchecked" id="idchecked" >
							<input
							type="hidden" name="isDupId" id="isDupId" />
						<p class="help-block">이메일을 입력해 주세요.</p><p class="idcheckran"></p>
					</div>
				</div>

				<div class="control-group">
					<!-- Password-->
					<label class="control-label" for="password">비밀번호</label>
					<div class="controls">
						<input type="password" id="password" name="password"
							placeholder="" class="input-xlarge">
						<p class="help-block">비밀번호를 입력해 주세요.</p>

						<span id="8char" class="glyphicon glyphicon-remove"
							style="color: #FF0004;"></span> 8 Characters Long<br> <span
							id="lcase" class="glyphicon glyphicon-remove"
							style="color: #FF0004;"></span> One Lowercase Letter<br> <span
							id="num" class="glyphicon glyphicon-remove"
							style="color: #FF0004;"></span> One Number


					</div>
				</div>

				<div class="control-group">
					<!-- Password -->
					<label class="control-label" for="password_confirm">비밀번호 확인</label>
					<div class="controls">
						<input type="password" id="password_confirm"
							name="password_confirm" placeholder="" class="input-xlarge">
						<p class="help-block">비밀번호를 재입력해 주세요.</p>

						<span id="pwmatch" class="glyphicon glyphicon-remove"
							style="color: #FF0004;"></span> Passwords Match


					</div>
				</div>




				<!-- Username -->
				<label class="control-label" for="M_name">닉네임</label>
				<div class="controls">
					<input type="text" id="M_name" name="M_name" placeholder=""
						class="input-xlarge" value="${userInfo.M_name }">
					<p class="help-block">닉네임을 입력해 주세요.</p>
				</div>
			</div>

			

			<div class="control-group">
				<!-- Button -->
				<div class="controls">
					<button class="btn btn-success">등록</button>
				</div>
			</div>

		</fieldset>
	</form>



</body>
</html>