<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/view/include/taglib.jsp"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Beijing Tour Company</title>
    <meta content="width=device-width,initial-scale=1.0,maximum-scale=1.0,user-scalable=0" name="viewport" />
	<meta name="keywords" content="Beijing Tour Company" />
	<link rel="stylesheet" href="${ctxStatic}/juhema/css/base.css?v=20171111" />
	<link rel="stylesheet" href="${ctxStatic}/juhema/css/top.css?v=20171111" />
	<link rel="stylesheet" href="${ctxStatic}/juhema/css/foot.css?v=20171111" />
	<style>
		html,body{
			height:100%;
			width:100%;
		}
		.tour_foot_bg{
			position:absolute;
			bottom:0;
			left:0;
		}
		.errorbox{
			width:180px;
			height:160px;
			position:absolute;
			top:50%;
			left:50%;
			margin-left:-86px;
			margin-top:-150px;
		}
		.buttonpublic{
			border:1px solid #ad6662;
			color:#ad6662;
			position:absolute;
			left:-15px;
			top:180px;
		}
	</style>
</head>
<body>
	<header id="tour_top_id" class="tour_top">
		
	</header>
	<div class="errorbox">
		<img src="${ctxStatic}/juhema/icon/20171023135306.png" />
		<button class='buttonpublic' onclick="javascript:window.location.href=''">refresh the page</button>
	</div>
	<footer class="tour_foot_bg">
		<div class="tour_foot">
			<ul id="tour_foot_id" class="tour_foot_ul">
				
			</ul>
		</div>
	</footer>
	<script type="text/javascript" src="${ctxStatic}/juhema/js/jquery-1.11.0.js" ></script>
	<script type="text/javascript" src="${ctxStatic}/juhema/js/base.js?v=20171111" ></script>
	<script type="text/javascript" src="${ctxStatic}/juhema/js/top.js?v=20171111" ></script>
</body>
</html>