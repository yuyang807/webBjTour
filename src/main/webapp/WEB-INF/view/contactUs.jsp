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
		<link rel="stylesheet" href="${ctxStatic}/juhema/css/tourlist.css?v=20170316" />
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
					<div class="contact_input"><input type="text" id="contactnameid" reg="contactname" class="contactinput" /></div>
					<div id="contactname" class="cardPaywaring fl waringhidden">name</div>
					<div style="clear:both"></div>
				</li>
				<li class="contact_list">
					<div class="contact_label">E-mail</div>
					<div class="contact_input"><input type="text" id="contactmailid" reg="contactmail" class="contactinput" /></div>
					<div id="contactmail" class="cardPaywaring fl waringhidden">email</div>
					<div style="clear:both"></div>
				</li>
				<li class="contact_list">
					<div class="contact_label">How did you hear about us?</div>
					<div class="contact_input">
						<select id="knowid">
							<option value=1 >Google search</option>
							<option value=2 >TripAdvisor</option>
							<option value=3 >friend''s recommending</option>
						</select>
					</div>
				</li>
				<li class="contact_list">
					<div class="contact_label">Name of Personal Referral?</div>
					<div class="contact_input"><input type="text" id="contactrefid" /></div>
				</li>
				<li class="contact_list">
					<div class="contact_label">How may I help you?</div>
					<textarea id="contacttextareaid" class="contact_textarea contactinput" reg="contacttextarea" ></textarea>
					<div id="contacttextarea" class="cardPaywaring fl waringhidden">Referral</div>
					<div style="clear:both"></div>
				</li>
			</ul>
			<button class="buttoncolor1 contact_submit" onclick="contactsub()">Submit</button>
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
			function contactsub(){
				var t_input = $(".contactinput");
				var t_len = t_input.length;
				var all_len = t_len;
				for(var i = 0 ;i < t_input.length;i++){
					var t_regkey = t_input.eq(i).attr("reg");
					var t_val = t_input.eq(i).val();
					if(t_val == ""){
						all_len--;
						t_input.eq(i).addClass('inputerror');
						$("#"+t_regkey).removeClass('waringhidden');
					}
				}
				if(all_len == t_len){
					$.ajax({
						type:"post",
						url:"/advice/submit",
						data:{
							TMemberDto:{
								lName:$("#contactnameid").val(),
								emailAddress:$("#contactmailid").val(),
								content:$("#contacttextareaid").val(),
								knowWay:$("#knowid").val(),
								referralName:$("#contactrefid").val()
							}
						},
						success:function(data){
							console.log(data);
						}
					});
				}
			}
			$(".contactbox").on("focus",".contactinput",function(){
				var t_regkey = $(this).attr("reg");
				$(this).removeClass('inputerror');
				$("#"+t_regkey).addClass('waringhidden');
				//submiterror();
			});
		</script>
	</body>
</html>