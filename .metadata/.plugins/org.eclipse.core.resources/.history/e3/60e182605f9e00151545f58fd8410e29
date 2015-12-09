<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>



<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>TEST</title>
<style>
body {
   background-color: white;
}

/*********************************************************************************/
/* header                                                                          */
/*********************************************************************************/
#header {
   position: relative;
   background-color: #91D8f7;
   color: white;
   width: auto;
   height: 11em;
}

/*********************************************************************************/
/* main                                                                          */
/*********************************************************************************/
#main {
   position: relative;
   /* margin: 0 auto; */
   background-color: white;
   width: auto;
   min-height: 500px;
   /* overflow: scroll; */
}

#contents {
   float: left;
   position: relative;
   min-height: 500px;
   width: 100%;
}

/*********************************************************************************/
/* center                                                                          */
/*********************************************************************************/
#center {
   position: relative;
   float: left;
   left: 0;
   width: 84%;
}

/*********************************************************************************/
/* aside                                                                          */
/*********************************************************************************/
#right {
   position: relative;
   float: right;
   width: 15%;
   right: 0;
   margin-top: 21.440px;
}

/*********************************************************************************/
/* bottom                                                                          */
/*********************************************************************************/
#bottom {
   position: relative;
   float: left;
   margin: 0 auto;
   background-color: #3A3A3A;
   width: 100%;
   height: 8em;
   margin-top: 50px;
}

/*********************************************************************************/
/* banner                                                                          */
/*********************************************************************************/
#banner {
   /* height: 13em; */
   position: relative;
   background-size: cover;
   color: #fff;
}
/*    #banner
   {
      padding: 5em 0em;
   } */

/*    .homepage #banner
   {
      padding: 15em 0em;
   }
 */
.container {
   width: 1200px;
   margin-left: auto;
   margin-right: auto;
}
</style>

</head>

<body>
   <!-- Header -->
   <div id="header"><jsp:include page="${view.top}.jsp" /></div>
   <!--taglib prefix="s" 를 추가하면 속성으로 등록한 view의 값을 쓸수있다   -->
   <!-- Header -->
   
   <!-- /Banner -->
   <div id="main">
      <!-- Main -->
      <div class="container">
         <!-- center -->
         <div id="contents">
            <div id="center"><jsp:include page="${view.center}.jsp" /></div>
            <!-- center -->
         </div>
      </div>
      <!-- Main -->
   </div>
   <!-- Footer -->
   <div id="bottom"><jsp:include page="${view.bottom}.jsp" /></div>
   <!-- Footer -->
</body>
</html>