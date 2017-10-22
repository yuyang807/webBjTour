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
		<link rel="stylesheet" href="${ctxStatic}/juhema/css/details.css?v=20170316" />
		<link rel="stylesheet" href="${ctxStatic}/juhema/css/guide.css?v=20170316" />
		<link rel="stylesheet" href="${ctxStatic}/juhema/css/pikaday.css?v=20170316" />
	</head>
    <body>
		<header id="tour_top_id" class="tour_top">
			
		</header>
		<div class="tour_list_box">
			<div class="tourlink">
				<a href="/">Home</a>　>　 
				<a href="/list">View The Tours</a>　>　
				<span>Hire a Tour Guide</span>
			</div>
			<h1 class="public_title2">Hire a Tour Guide</h1>
		</div>
		<div class="tour_list_box">
			<img class="tour_details_left" src="${ctxStatic}/juhema/img/guide_img.png" /><!--
			--><div class="tour_details_right">
				<img class="tour_guide_top" src="${ctxStatic}/juhema/icon/order_top.png" />
				<div class="tour_guide_top_text">Hire a Tour Guide</div>
				<ul class="tour_guide_ul">
					<li class="tour_guide_li">Select a date</li>
					<li class="tour_guide_li selectdatebox">
						<span class="guide_text">From</span>
						<input id="datepicker" class="guide_input fr" type="text" />
						<span class="guide_text">To</span>
						<input id="datepicker2" class="guide_input fr" type="text" style="float:right;" />
					</li>
					<li class="tour_guide_li">
						<div class="tour_guide_li_left fl">Select a currency</div>
						<select class="tour_guide_li_right fr">
							<option>CNY</option>
							<option>2</option>
						</select>
					</li>
					<li class="tour_guide_li">
						<div class="tour_guide_li_left fl">Tour Options</div>
						<select class="tour_guide_li_right fr">
							<option>Full day</option>
							<option>2</option>
						</select>
					</li>
				</ul>
				<div class="tour_guide_total">
					<span>Total Cost:</span><span class="tour_guide_font_big">￥600.</span><span>00</span>
					<button class="button100 buttoncolor1">BOOKING NOW</button>
				</div>
			</div>
			<div class="tour_guide_table_box">
				<div id="tour_guide_table_id" class="tour_guide_table tour_guide_table_none">
					
				</div>
			</div>
			<div class="tour_carRental_notice">
				<div class="tour_carRental_notice_top">Notice</div>
				<ul class="tour_carRental_notice_ul">
					<li>1.The quoted price is for a-8 hour tour per day. If you use more than 6 hours or less than 8 hours per day it will still be considered a full day.It doesn't include the Gratuity to your guide.</li>
					<li>2.Additional hours are billed at 50CNY to 100CNY for the guide </li>
					<li>3.Pls note that the itinerary is flexible and we can adjust it according to your personal interests, the weather or any unexpected conditions.</li>
					<li>4.We conduct only private tour but not group tour and won’t mix you with others.</li>
					<li>5.Our tours are complete non-forced shopping tour and we won’t take you to any factories without request to waste your valuable time.</li>
				</ul>
			</div>
		</div>
		<div id="tour_reviews_id" class="tour_reviewslist_bg">
			<div class="tour_list_box">
				<div class="public_title3">Costomise your own tour?</div>
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
		<script type="text/javascript" src="${ctxStatic}/juhema/js/base.js?v=20170316" ></script>
		<script type="text/javascript" src="${ctxStatic}/juhema/js/top.js?v=20170316" ></script>
		<script type="text/javascript" src="${ctxStatic}/juhema/js/pikaday.js?v=20170316" ></script>
		<script>
			var picker = new Pikaday(
		    {
		        field: document.getElementById('datepicker'),
		        firstDay: 1,
		        minDate: new Date('2000-01-01'),
		        maxDate: new Date('2020-12-31'),
		        yearRange: [2000,2020]
		    });
		    var table_top_html = `
				<div class="tour_guide_table_top">
					<button class="tour_guide_list tour_guide_24"><span>TOUR GUIDE SERVICE</span><div class="tour_guide_list_line"></div></button><!--
					--><button class="tour_guide_list tour_guide_24"><span>HOW IT WORKS</span><div class="tour_guide_list_line"></div></button><!--
					--><button class="tour_guide_list tour_guide_24"><span>CUSTOMIZIBLE</span><div class="tour_guide_list_line"></div></button><!--
					--><button class="tour_guide_list tour_guide_24"><span>PRICE</span></button>
				</div>
			`;
			var table_str = `
				<div class="tour_guide_table_list">
					   <div class="tour_guide_td_list tour_guide_24">
					   	<div class="tour_guide_td_inside">HALF DAY<br>({guidetime} hours)</div></div><!--
					--><div class="tour_guide_td_list tour_guide_24">
							<div class="tour_guide_td_inside">
							{guidetext}
							</div>
						</div><!--
					--><div class="tour_guide_td_list tour_guide_24">
						<div class="tour_guide_td_inside">
							YES
						</div>
					</div><!--
					--><div class="tour_guide_td_list tour_guide_24">
						<div class="tour_guide_td_inside">
							{guideprice}RMB
						</div>
					</div>
				</div>
			`;
			var guidelist = [
				{
					guidetime:4,
					guidetext:"You can choose one site among Tian'anmen Square&Forbidden City,Temple of Heaven,Summer Palace and so on of the city area.",
					guideprice:"400RMB"
				},
				{
					guidetime:6,
					guidetext:"You can choose two sites among Tian'anmen Square&Forbidden City,Temple of Heaven,Summer Palace and so on of the city area,or go the outskirt of Beijing like Great Wall.",
					guideprice:"600RMB"
				},
			];
			var guideliststr = table_top_html;
			for(var i in guidelist){
				guideliststr += table_str.format2({
					guidetime:guidelist[i].guidetime,
					guidetext:guidelist[i].guidetext,
					guideprice:guidelist[i].guideprice
				}); 
			}
			$("#tour_guide_table_id").html(guideliststr);
		</script>
	</body>
</html>