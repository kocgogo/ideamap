<%@page import="com.mycom.d3.vo.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%  MemberVO userInfo = (MemberVO) session.getAttribute("userInfo");	
%>
<!DOCTYPE html >
<link
	href='http://fonts.googleapis.com/css?family=Droid+Serif:700,400,400italic,700italic'
	rel='stylesheet' type='text/css'>
<style>

/*********************************************************************************/
/* top                                                                          */
/*********************************************************************************/

/*상단로고 buy yourself,login,join*/
#logo-wrapper {
	position: relative;
	height: 100px;
	background-color: #282828;
	padding: 1px;
	margin: 0px;
	font-size: 10px;
	white-space: nowrap;
}

#logo {
	position: relative;
}

#logo h1 a {
	position: absolute;
	left: 40px;
	top: 10px;
	color: #FFF;
	font-family: 'Droid Serif', serif;
	font-size: 45px;
}

#logo a {
	/* display: block; */
	/* text-transform: uppercase;  */
	text-decoration: none;
	font-size: 25px;
	color: #FFF;
}

#logo span {
	position: absolute;
	top: 50px;
	right: 50px;
	letter-spacing: 0px;
	font-weight: bold;
	/* color: rgba(255, 255, 255, .7); */
}

/*********************************************************************************/
/* nav                                                                          */
/*********************************************************************************/
#top_nav {
	padding: 1px 0px 1px 0px;
}

#top_nav>ul>li {
	display: inline-block;
}

#top_nav>ul>li:last-child {
	
}

#top_nav>ul>li>a, #nav>ul>li>span {
	display: inline-block;
	padding: 12px 24px;
	letter-spacing: 0px;
	text-decoration: none;
	text-transform: uppercase;
	font-size: 16px;
	color: #db3b5d;
	outline: 0;
}

#top_nav li.active a {
	background: #1F577C;
	border-radius: 30px;
	color: #FFF;
}

#top_nav>ul>li>ul {
	display: none;
}
</style>
<script src="http://code.jquery.com/jquery-1.9.1.min.js"></script>
<link href="css/style.css" rel="stylesheet" />

<script type="text/javascript">
		$(document).ready(function(){  
		  
		    $("ul.subnav").parent().append("<span></span>"); //제이쿼리 시동하고 ul.subnav뒤에 비어있는 span태그를 추가  
		  
		    $("ul.topnav li span").hover(function() { //클릭시 다음 이벤트를 subnav에 적용 
		  
		        $(this).parent().find("ul.subnav").slideDown('fast').show(); //클릭시 subnav을 아래로 내림
		  
		        $(this).parent("li").hover(function(){  
		              $(this).parent().find("ul.subnav").slideUp('slow'); //마우스 벗어났을때 원위치시킴  
		          });  		  
		        
		        }).hover(function() {  
		            $(this).addClass("subhover"); //마우스 오버시 subhover 클래스 추가  
		        }, function(){  //On Hover Out  
		            $(this).removeClass("subhover"); //마우스 아웃시 subhover클래스 제거  
		    });  
		  
		});  
		
	</script>

<div id="logo-wrapper">
	<div class="container">
		<!-- Logo -->
		<div id="logo">
			<h2>
				<a href="main.do">zzzzzzzz</a>
			</h2>
			<%/*if(userInfo != null) {%>
		<!-- 	<h2><%=userInfo.getId()%>
				connected
			</h2>
			<span><a href="logout.do">LogOut</a>&nbsp;&nbsp;&nbsp;</span>&nbsp;&nbsp;&nbsp;


			<%}else { %>
			<span><a href="login.do">Login</a>&nbsp;&nbsp;&nbsp; <a
				href="join.do">Join</a></span>
			<%} */%>
 -->
		</div>
	</div>
</div>
<div class="container">
	<nav id="top_nav">
		<ul class="topnav">
			<li><a href="main.do">장애 사항 조회</a>
			<ul class="subnav">
					<li><a href="blist.do">전체조회</a></li>
					<li><a href="foodlist.do">xxx</a></li>
				</ul></li>
			<li><a href="slist.do">장애 조치 조회</a>
				<ul class="subnav">
					<li><a href="slist.do">전체조회</a></li>
					<li><a href="foodlist.do">xxx</a></li>
				</ul></li>


		</ul>
	</nav>
</div>

