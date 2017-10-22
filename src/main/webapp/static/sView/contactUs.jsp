<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/view/include/taglib.jsp"%>
<html lang="en">
	<head>
	    <meta charset="UTF-8">
	    <title>Beijing Tour Company</title>
	    <meta content="width=device-width,initial-scale=1.0,maximum-scale=1.0,user-scalable=0" name="viewport" />
		<meta name="keywords" content="Beijing Tour Company" />
		<link rel="stylesheet" href="${ctxStatic}/juhema/css/base.css?v=20170316" />
		<link rel="stylesheet" href="${ctxStatic}/juhema/css/top.css?v=20170316" />
		<link rel="stylesheet" href="${ctxStatic}/juhema/css/foot.css?v=20170316" />
		<link rel="stylesheet" href="${ctxStatic}/juhema/css/contact.css?v=20170316" />
	</head>
    <body>
		<header id="tour_top_id" class="tour_top">
			
		</header>
		<div class="contactbox">
			<div class="tourlink">
				<a href="/">Home</a>　>　 
				<span>Contect Us</span>
			</div>
			<div class="contacttitle">Copntact Us</div>
			<div class="contacttext">
				We are here to answer any questions you may have about our combadi experiences. Reach out to us and we'll respond as soon as we can.<br><br>
				Even if there is something you have always wanted to experience and can't find it on combadi, let us know and we promise we'll do our best to find it for you and send you there.<br><br>
			</div>
			<ul class="contact_list_ul">
				<li class="contact_list">
					<div class="contact_label">Name</div>
					<div class="contact_input"><input type="text" /></div>
				</li>
				<li class="contact_list">
					<div class="contact_label">E-mail</div>
					<div class="contact_input"><input type="text" /></div>
				</li>
				<li class="contact_list">
					<div class="contact_label">How did you hear about us?</div>
					<div class="contact_input">
						<select>
							<option>Personal Referral</option>
							<option>Personal Referral2</option>
							<option>Personal Referral3</option>
						</select>
					</div>
				</li>
				<li class="contact_list">
					<div class="contact_label">Name of Personal Referral?</div>
					<div class="contact_input"><input type="text" /></div>
				</li>
				<li class="contact_list">
					<div class="contact_label">How may I help you?</div>
					<textarea class="contact_textarea"></textarea>
				</li>
			</ul>
			<button class="buttoncolor1 contact_submit">Submit</button>
		</div>
		
		<footer class="tour_foot_bg">
			<div class="tour_foot">
				<ul id="tour_foot_id" class="tour_foot_ul">
					
				</ul>
			</div>
		</footer>
		<script type="text/javascript" src="${ctxStatic}/juhema/js/jquery-1.11.0.js" ></script>
		<script type="text/javascript" src="${ctxStatic}/juhema/js/base.js" ></script>
		<script type="text/javascript" src="${ctxStatic}/juhema/js/top.js" ></script>
		<script>
			function showmenu(){
				if($("#tour_top_ul_id").hasClass("tour_top_hide")){
					$("#tour_top_ul_id").removeClass("tour_top_hide");
				}else{
					$("#tour_top_ul_id").addClass("tour_top_hide");
				};
				/*menudisplay = !menudisplay;
				var isblock = menudisplay?"block":"none";
				$("#tour_top_ul_id").css("display",menudisplay?"block":"none");*/
			}
		</script>
	</body>
</html>