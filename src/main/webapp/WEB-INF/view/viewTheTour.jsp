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
		<link rel="stylesheet" href="${ctxStatic}/juhema/css/tourlist.css?v=20170316" />
		<link rel="stylesheet" href="${ctxStatic}/juhema/css/reviewslist.css?v=20170316" />
		<link rel="stylesheet" href="${ctxStatic}/juhema/css/foot.css?v=20170316" />
		<link rel="stylesheet" href="${ctxStatic}/juhema/css/costomize.css?v=20170316" />
	</head>
    <body id="viewTheTour">
		<header id="tour_top_id" class="tour_top">
			
		</header>
		<div class="tour_list_box">
			
			<div class="tourlink">
				<a href="home.html">Home</a>　>　 
				<span>View The Tours</span>
			</div>
			<div class="public_title2">Day Tour / Layover Tour</div>
			<ul id="tour_list_id" class="tour_list_ul">
				
			</ul>
			<div>&nbsp;</div>
		</div>
		<div class="tour_list_box">
			<h1 class="public_title2">Beijing Tour Package</h1>
			<ul id="tour_list_id2" class="tour_list_ul">
				
			</ul>
			<div>&nbsp;</div>
		</div>
		<div class="tour_list_box">
			<div class="public_title2">Beijing Layover Tour</div>
			<ul id="tour_list_id3" class="tour_list_ul">
				
			</ul>
			<div>&nbsp;</div>
		</div>
		<div class="tour_list_box">
			<div class="public_title2">Beijing Great Wall Hiking Day Tour</div>
			<ul id="tour_list_id4" class="tour_list_ul">
				
			</ul>
			<div>&nbsp;</div>
		</div>
		<div class="tour_list_box">
			<div class="public_title2">Beijing Half Day Tour</div>
			<ul id="tour_list_id5" class="tour_list_ul">
				
			</ul>
			<div>&nbsp;</div>
		</div>
		<div class="tour_list_box">
			<div class="public_title2">Beijing City Hutong Walking/Biking Tour</div>
			<ul id="tour_list_id6" class="tour_list_ul">
				
			</ul>
			<div>&nbsp;</div>
		</div>
		<div id="tour_reviews_id" class="tour_reviewslist_bg">
			<div class="public_title">Costomize?</div>
			
			<div class="tour_list_box">
				<div class="tour_contomize_ul">
					<a href="tourGuide.html" class="tour_contomize_list">
						<div class="tour_contomize_list_inbox"></div>
						<img src="${ctxStatic}/juhema/img/hire.png" />
					</a><!--
					--><a href="carRental.html"  class="tour_contomize_list">
						<div class="tour_contomize_list_inbox"></div>
						<img src="${ctxStatic}/juhema/img/carrental.png" />
					</a>
				</div>
				<div class="tour_contomize_text">If you have special requirements,please let us konw ,we would line to constomize a tour for you,and quote for you.</div>
				<ul class="contact_list_ul contomize_magin">
					<li class="contact_list displayinline">
						<div class="contact_label">First name</div>
						<div class="contact_input"><input type="text" /></div>
					</li><!--
					--><li class="contact_list displayinline">
						<div class="contact_label">Last name</div>
						<div class="contact_input"><input type="text" /></div>
					</li>
					<li class="contact_list">
						<div class="contact_label">E-mail</div>
						<div class="contact_input2"><input type="text" /></div>
					</li>
					<li class="contact_list">
						<div class="contact_label">Special requirement:</div>
						<textarea class="contact_textarea"></textarea>
					</li>
				</ul>
				<button class="buttonpublic_nochange buttoncolor3 costomizesubmit">Submit</button>
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
		<script type="text/javascript" src="${ctxStatic}/juhema/js/base.js" ></script>
		<script type="text/javascript" src="${ctxStatic}/juhema/js/top.js" ></script>
		<script type="text/javascript" src="${ctxStatic}/juhema/js/tourlist.js" ></script>
		<script>
			var t_tours_list6 = [
				{
					'img':'IMG_1343.JPG',
					'text_left':'Getting Cheap Airfare For Last Minute Travel',
					'prise':'$39',
				},
				{
					'img':'IMG_1343.JPG',
					'text_left':'Getting Cheap Airfare For Last Minute TravelLast Minute Minute Travel',
					'prise':'$46',
				},
				{
					'img':'IMG_1343.JPG',
					'text_left':'Getting Cheap Airfare For Last Minute Travel',
					'prise':'$38',
				},
				{
					'img':'IMG_1343.JPG',
					'text_left':'Getting Cheap Airfare',
					'prise':'$38',
				},
				{
					'img':'IMG_1375.JPG',
					'text_left':'Getting Cheap Airfare For Last Minute Travel Minute Travel',
					'prise':'$38',
				}
			];
			var t_tours_list3 = [
				{
					'img':'IMG_1343.JPG',
					'text_left':'Getting Cheap Airfare For Last Minute Travel',
					'prise':'$39',
				},
				{
					'img':'IMG_1343.JPG',
					'text_left':'Getting Cheap Airfare For Last Minute TravelLast Minute Minute Travel',
					'prise':'$46',
				},
				{
					'img':'IMG_1343.JPG',
					'text_left':'Getting Cheap Airfare For Last Minute Travel',
					'prise':'$38',
				}
			];
			tourlist.pushlist("tour_list_id",t_tours_list6);
			tourlist.pushlist("tour_list_id2",t_tours_list6);
			tourlist.pushlist("tour_list_id3",t_tours_list3);
			tourlist.pushlist("tour_list_id4",t_tours_list3);
			tourlist.pushlist("tour_list_id5",t_tours_list3);
			tourlist.pushlist("tour_list_id6",t_tours_list3);
		</script>
	</body>
</html>