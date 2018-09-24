<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/view/include/taglib.jsp"%>
<html lang="en">
	<head>
	    <meta charset="UTF-8">
	    <title>Beijing Tour Company</title>
	    <meta content="width=device-width,initial-scale=1.0,maximum-scale=1.0,user-scalable=0" name="viewport" />
		<meta name="keywords" content="Beijing Tour Company" />
		<link rel="stylesheet" href="${ctxStatic}/juhema/css/base.css?v=20180326" />
		<link rel="stylesheet" href="${ctxStatic}/juhema/css/top.css?v=20180326" />
		<link rel="stylesheet" href="${ctxStatic}/juhema/css/tourlist.css?v=20180326" />
		<link rel="stylesheet" href="${ctxStatic}/juhema/css/reviewslist.css?v=20180326" />
		<link rel="stylesheet" href="${ctxStatic}/juhema/css/foot.css?v=20180326" />
		<link rel="stylesheet" href="${ctxStatic}/juhema/css/costomize.css?v=20180326" />
	</head>
    <body id="viewTheTour">
		<header id="tour_top_id" class="tour_top">
			
		</header>
		<div class="tour_list_box">
			
			<div class="tourlink">
				<a href="/">Home</a>　>　 
				<span>View The Tours</span>
			</div>
		</div>
		
		<div id="tour_list_box_all">
			
		</div>
		<div id="tour_reviews_id" class="tour_reviewslist_bg">
			<div class="public_title">Costomize?</div>
			
			<div class="tour_list_box">
				<div class="tour_contomize_ul">
					<a href="/list/guides" class="tour_contomize_list">
						<div class="tour_contomize_list_inbox"></div>
						<img src="${ctxStatic}/juhema/icon/ATIQ0483.png" />
						<div class="tour_contomize_div">Hire a Tour Guide</div>
					</a><!--
					--><a href="/list/cars"  class="tour_contomize_list">
						<div class="tour_contomize_list_inbox"></div>
						<img src="${ctxStatic}/juhema/icon/FXSG2704.png" />
						<div class="tour_contomize_div">Car Rental</div>
					</a>
				</div>
				<div class="tour_contomize_text">If you have special requirements,please let us konw ,we would line to constomize a tour for you,and quote for you.</div>
				<ul class="contact_list_ul contomize_magin">
					<li class="contact_list displayinline">
						<div class="contact_label">First name</div>
						<div class="contact_input"><input id="fNameid" name="fName" reg="contactfname" class="contactinput" type="text" /></div>
						<div id="contactfname" class="cardPaywaring fl waringhidden">The First name is required!</div>
						<div style="clear:both"></div>
					</li><!--
					--><li class="contact_list displayinline">
						<div class="contact_label">Last name</div>
						<div class="contact_input"><input id="lNameid" name="lName" reg="contactlname" class="contactinput" type="text" /></div>
						<div id="contactlname" class="cardPaywaring fl waringhidden">The Last name is required!</div>
						<div style="clear:both"></div>
					</li>
					<li class="contact_list">
						<div class="contact_label">E-mail</div>
						<div class="contact_input2"><input id="emailAddressid" reg="contactemail" class="contactinput" name="emailAddress" type="text" /></div>
						<div id="contactemail" class="cardPaywaring fl waringhidden">The E-mail is required!</div>
						<div style="clear:both"></div>
					</li>
					<li class="contact_list">
						<div class="contact_label">Special requirement:</div>
						<textarea class="contact_textarea contactinput" id="contentid"  reg="contactarea" name="content"></textarea>
						<div id="contactarea" class="cardPaywaring fl waringhidden">The Special requirementis required!</div>
						<div style="clear:both"></div>
					</li>
				</ul>
				<button class="buttonpublic_nochange buttoncolor3 costomizesubmit" onclick="contactsub()">Submit</button>
				<div>&nbsp;</div>
			</div>
		</div>
		<footer class="tour_foot_bg">
			<div class="tour_foot">
				<ul id="tour_foot_id" class="tour_foot_ul">
					
				</ul>
			</div>
		</footer>
		<script type="text/javascript" src="${ctxStatic}/juhema/js/jquery-1.11.0.js" ></script>
		<script type="text/javascript" src="${ctxStatic}/juhema/js/base.js?v=20180326" ></script>
		<script type="text/javascript" src="${ctxStatic}/juhema/js/top.js?v=20180326" ></script>
		<script type="text/javascript" src="${ctxStatic}/juhema/js/tourlist.js?v=20180326" ></script>
		<script type="text/javascript" src="${ctxStatic}/juhema/js/dialog.js?v=20180326" ></script>
		<script>
			var t_tours_list = ${lineList};
			var t_all_html = {};
			for(var i in t_tours_list){
				//var t_key = t_tours_list[i]['typeName'];
				var t_key = t_tours_list[i]['sort'];
				if(!t_all_html[t_key]){
					t_all_html[t_key] = [];
				}
				t_all_html[t_key].push(t_tours_list[i]);
			}
			var t_html_str = '<div class="tour_list_box">'+
				'<h1 class="public_title2">{name}</h1>'+
				'<ul id="tour_list_id{id}" class="tour_list_ul">'+
				'</ul>'+
				'<div>&nbsp;</div>'+
			'</div>';
			var htmlindex = 0;
			for(var j in t_all_html){
				htmlindex++;
				$("#tour_list_box_all").append(t_html_str.format2({name:t_all_html[j][0]['typeName'],id:htmlindex}));
				tourlist.pushlist("tour_list_id"+htmlindex,t_all_html[j]);
			}
			
			$(".contactinput").focus(function(){
				var t_regkey = $(this).attr("reg");
				$(this).removeClass('inputerror');
				$("#"+t_regkey).addClass('waringhidden');
			});
			/*$(".tour_details_right").on("focus","input",function(){
				
				//submiterror();
			});*/
			function contactsub(){
				var t_input = $(".contactinput");
				var t_len = t_input.length;
				var all_len = t_len;
				for(var i = 0 ;i < t_input.length;i++){
					var t_regkey = t_input.eq(i).attr("reg");
					var t_val = t_input.eq(i).val();
					var reg_key = regobj[t_regkey];
					if(reg_key && !reg_key.test(t_val)){
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
							fName:$("#fNameid").val(),
							lName:$("#lNameid").val(),
							emailAddress:$("#emailAddressid").val(),
							content:$("#contentid").val()
						},
						success:function(data){
							if(data.resultCode == '00000000'){
								submitsuccess();
							}else{
								submiterror();
							}
						}
					});
				}
			}
		</script>
	</body>
</html>