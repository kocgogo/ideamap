<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
  
    <title>login</title>
     <link rel="shortcut icon" href="http://flash.flowplayer.org/favicon.ico">
        <meta name="viewport" content="width=device-width, initial-scale=1">
   
    <link href="http://netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css" rel="stylesheet">

    <script src="http://code.jquery.com/jquery-1.10.2.min.js"></script>
    <script src="http://netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>
   
       <style type="text/css">
 
#loginpage{
   position: relative;
   width:100%;
   clear: both;
}  
.login{
   width:80%;
   margin-left: auto;
   margin-right: auto;
} 
/* #contents{
   width:500px;
}  */    
  
.panel-default {
opacity: 0.7;
margin-top:70px;
margin-left:auto;
margin-right:auto;
}

.form-group.last { margin-bottom:20px; }    </style>
  
   
    <script src="http://code.jquery.com/jquery-1.10.2.min.js"></script>
    <script src="http://netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>
</head>
<body>

<div  id="loginpage">
    <div class="login" >
       
            <div  class="panel panel-default ">
         
                <div class="panel-heading">
                    <span class="glyphicon glyphicon-lock"></span> Login</div>
                <div class="panel-body">
                    <form class="form-horizontal" method="post"   action="loginImpl.do">
                    <div class="form-group">
                        <label for="inputEmail3" class="col-sm-3 control-label">
                            ID</label>
                        <div class="col-sm-9">
                            <input type="text" class="form-control" name="id" id="id" placeholder="id" required>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputPassword3" class="col-sm-3 control-label">
                            Password</label>
                        <div class="col-sm-9">
                            <input type="password" class="form-control" name="password"  id="password" placeholder="password" required>
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-sm-offset-3 col-sm-9">
                            <div class="checkbox">
                                <label>
                                    <input type="checkbox"/>
                                    Remember me
                                </label>
                            </div>
                        </div>
                    </div>
                    <div class="form-group last">
                        <div class="col-sm-offset-3 col-sm-9">
                              
                                 <button type="submit" class="btn btn-success btn-sm" name="submit">
                                login</button>
                                <button type="reset" class="btn btn-default btn-sm">
                                cancel</button><br><br>
                              
                        </div>
                    </div>
                    </form>
                </div>
                <div class="panel-footer">
                    Not Registred? <a href="join.do">Register here</a></div>
                 
            </div>
        </div>
    </div>


<script type="text/javascript">
</script>