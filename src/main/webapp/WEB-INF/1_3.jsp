<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="/jscript/jquery/jquery-2.2.0.min.js"></script>
<style type="text/css">
.iframe{ border:solid 1px #888;font-size:13px;}
.title{ padding:6px;background-color:#EEE;}
.content{ padding:8px 0px;font-size:12px; text-align:center;display:none;}
.curcol{ background-color:#CCC}
</style>
<title>Insert title here</title>
<script type="text/javascript">
$(function(){
    $(".content").html("欢迎来到jquery");
    $(".title").click(function(){
        $(this).addClass("curcol").next(".content").css("display","block");
        
        
    });
    
})

</script>
</head>
<body>
<div class="iframe">
<div class="title">标题</div>
<div class="content"></div>
</div>
</body>
</html>