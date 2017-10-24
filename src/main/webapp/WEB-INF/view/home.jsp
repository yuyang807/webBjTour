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
		<link rel="stylesheet" href="${ctxStatic}/juhema/css/step.css?v=20170316" />
		<link rel="stylesheet" href="${ctxStatic}/juhema/css/tourlist.css?v=20170316" />
		<link rel="stylesheet" href="${ctxStatic}/juhema/css/reviewslist.css?v=20170316" />
		<link rel="stylesheet" href="${ctxStatic}/juhema/css/foot.css?v=20170316" />
		<link rel="stylesheet" href="${ctxStatic}/juhema/css/slider.css?v=20170316" />
		<style>
			.tour_top{
				background:transparent;
			}
		</style>
	</head>
	<body>
		<header id="tour_top_id" class="tour_top">
			
		</header>
		<div class="tour_slider">
			<div class="tour_slider_inside"></div>
			<div id="tour_slider_main"></div>
			<h1 class="tour_slider_title">Discover New Views In Beijing</h1>
			<div class="tour_slider_title_text">We are committed to offering travel services of the highest quality, combining our energy and enthusiasm, with our years of experience.</div>
			<button class="buttonpublic buttoncolor1 button_slider_top" onclick="javascript:window.location.href='list'">
				VIEW THE TOURS
			</button>
			<button class="buttonpublic buttoncolor2 button_slider_bottom" onclick="javascript:window.location.href='#howtobook'">
				HOW TO BOOK
			</button>
		</div>
		<div class="tour_list_box">
			<div class="public_title">Most Popular Beijing Tours</div>
			<ul id="tour_list_id" class="tour_list_ul">
				
			</ul>
			<a class="linktours" href="/list">View all tours >></a>
			<!--<button class="buttonpublic_nochange buttoncolor1 viewalltours">View all tours</button>-->
			<div>&nbsp;</div>
		</div>
		<div id="tour_reviews_id" class="tour_reviewslist_bg">
			<div class="public_title">What Our Clients Say</div>
			
			<div class="tour_list_box">
				<ul class="tour_list_ul">
					<li class="tour_list_li tour_reviewslist_list_bg">
						<div class="tour_toursbox_list_inbox"></div>
						<img class="tour_reviews_all_img" src="${ctxStatic}/juhema/icon/ADSH6844.png" />
						<div class="tour_toursbox_top">
							<div class="tour_toursbox_topfrom">- from -</div>
							<div class="tour_toursbox_topname">Steven Byrd</div>
						</div>
						<div class="tour_reviews_bg"></div>
						<div class="tour_reviewslist_bottom">
							<div class="tour_reviews_img_top">
								
							</div>
							<div class="tour_reviewslist_main">
								<div class="tour_reviewslist_text">
									We recently toured Beijing taking 2 day tour with Beijing tour company. Our tour of the main Beijing sites, and the Great Wall was absolutely wonderful. Susan our guide was fantastic, fun and very accommodating. She taught us lots of history of various sites. She also went the extra miles to make our trip special, and accommodate our requirements. I highly recommend both Beijing tour company, and Susan if you are looking for tour in Beijing.
								</div>
							</div>
							<img class="tour_reviews_img" src="${ctxStatic}/juhema/icon/Group13.png" />
							<div class="tour_reviews_img_bottom">
								
							</div>
						</div>
					</li><!--
					--><li class="tour_list_li tour_reviewslist_list_bg">
						<div class="tour_toursbox_list_inbox"></div>
						<img class="tour_reviews_all_img" src="${ctxStatic}/juhema/icon/ADSH6844.png" />
						<div class="tour_toursbox_top">
							<div class="tour_toursbox_topfrom">- from -</div>
							<div class="tour_toursbox_topname">Steven Byrd</div>
						</div>
						<div class="tour_reviews_bg"></div>
						<div class="tour_reviewslist_bottom">
							<div class="tour_reviews_img_top">
								
							</div>
							<div class="tour_reviewslist_main">
								<div class="tour_reviewslist_text">
									We recently toured Beijing taking 2 day tour with Beijing tour company. Our tour of the main Beijing sites, and the Great Wall was absolutely wonderful. Susan our guide was fantastic, fun and very accommodating. She taught us lots of history of various sites. She also went the extra miles to make our trip special, and accommodate our requirements. I highly recommend both Beijing tour company, and Susan if you are looking for tour in Beijing.
								</div>
							</div>
							<img class="tour_reviews_img" src="${ctxStatic}/juhema/icon/Group13.png" />
							<div class="tour_reviews_img_bottom">
								
							</div>
						</div>
					</li><!--
					--><li class="tour_list_li tour_reviewslist_list_bg_none">
						<div class="tour_toursbox_list_inbox"></div>
						<div class="tour_reviewslist_icon">
							<img src="${ctxStatic}/juhema/icon/tripadvisor.png" style="width:100%" />
						</div>
						<a class="tour_reviewslist_text1" href="">Beijing Tour company</a>
						<div class="tour_reviewslist_text2">TripAdvisor Traveller Rating</div>
						<div class="tour_reviewslist_text3">Based on 2,242 traveller reviews</div>
					</li>
				</ul>
			</div>
			<a id="howtobook" class="linklist" href="/list">View all Reviews >></a>
			<!--<button class="buttonpublic_nochange buttoncolor3 viewallreviews">View all Reviews</button>-->
			<div>&nbsp;</div>
		</div>
		
		<div class="tour_step_bg">
			<div class="tour_list_box">
				<div class="tour_step_box">
					<div class="public_title">How To Book</div>
					<div class="tour_step_list">
						<img  class="tour_step_list_icon_for" src="${ctxStatic}/juhema/icon/Group6Copy4.png" />
						<img class="tour_step_list_icon" src="${ctxStatic}/juhema/icon/Group9.png" />
						<div class="tour_step_list_top">Step One</div>
						<div class="tour_step_list_text">First browse our menu of the sample itineraries,choose the one you like,set your date and number of travel mates,and then click "book" button</div>
					</div><br class="br_show_all"><!--
					--><div class="tour_step_list">
						<img  class="tour_step_list_icon_for tour_step_list_icon_for_hidden" src="${ctxStatic}/juhema/icon/Group6Copy4.png" />
						<img class="tour_step_list_icon" src="${ctxStatic}/juhema/icon/Group13.png" />
						<div class="tour_step_list_top">Step Two</div>
						<div class="tour_step_list_text">Fill in the form to complete your booking.No advance or booking fee is needed at this booking stage.You will ony be required to pay when you finally meet your tour guide in Beijing.</div>
					</div><br class="br_show"><!--
					--><div class="tour_step_list">
						<img  class="tour_step_list_icon_for" src="${ctxStatic}/juhema/icon/Group6Copy4.png" />
						<img class="tour_step_list_icon" src="${ctxStatic}/juhema/icon/Group14.png" />
						<div class="tour_step_list_top">Step Three</div>
						<div class="tour_step_list_text">A confirmation email will be sent within 24 hours of your booking.</div>
						<!--<img class="tour_step_list_text" src="icon/step3_text.png" />-->
					</div><br class="br_show_all"><!--
					--><div class="tour_step_list">
						<img class="tour_step_list_icon" src="${ctxStatic}/juhema/icon/Group15.png" />
						<div class="tour_step_list_top">Step Four</div>
						<div class="tour_step_list_text">Once you get our confirm-ation, your booking is finali-sed and just be prepared for the exciting journey ahead! Looking forward to seeing you in Beijing soon!</div>
						<!--<img class="tour_step_list_text" src="icon/step4_text.png" />-->
					</div>
				</div>
			</div>
		</div>
		<div class="homepic_box">
			<div style="padding:18% 50%;"></div>
			<img class="homepic_img_w" src="${ctxStatic}/juhema/img/IMG_1210.JPG" />
			
			<h1 class="tour_slider_title">Explore the Distant Corners of Beijing</h1>
			<div class="tour_slider_title_text">We are committed to offering travel services of the highest quality, combining our energy and enthusiasm, with our years of experience.</div>
			<button class="buttonpublic buttoncolor2 button_slider_bottom" onclick="javascript:window.location.href='/contactUs'">
				CONTACT US
			</button>
		</div>
		<footer class="tour_foot_bg tour_foot_bg_home">
			<div class="tour_foot">
				<ul id="tour_foot_id" class="tour_foot_ul">
					
				</ul>
			</div>
		</footer>
			<script type="text/javascript" src="${ctxStatic}/juhema/js/jquery-1.11.0.js" ></script>
			<script type="text/javascript" src="${ctxStatic}/juhema/js/lbx_slider.js?v=20170316" ></script>
			<script type="text/javascript" src="${ctxStatic}/juhema/js/base.js?v=20170316" ></script>
			<script type="text/javascript" src="${ctxStatic}/juhema/js/top.js?v=20170316" ></script>
			<script type="text/javascript" src="${ctxStatic}/juhema/js/tourlist.js?v=20170316" ></script>
			<script>
				
				/*var datalist = [
					{
						"name":"page1",
						"img":"${ctxStatic}/juhema/img/IMG_1450.JPG"
					},
					{
						"name":"page2",
						"img":"${ctxStatic}/juhema/img/IMG_1451.JPG"
					},
					{
						"name":"page3",
						"img":"${ctxStatic}/juhema/img/IMG_1452.JPG"
					}
				];*/
				var datalist = ${picList};
				slider.init("tour_slider_main",datalist);
				var t_tours_list = ${lineList};
				/*var t_tours_list = [
					{
						"typeName":"BEIJING PRIVATE GREAT WALL DAY TOUR/GREAT WALL HIKING DAY TOUR",
						"duration":"8 hours",
						"lineTypeNo":true,
						"popularLevel":1,
						"lineName":"Beijing Private Great Wall Day Tour At The Mutianyu Section",
						"lineNo":1,
						"available":"Daily",
						"tenP":500,
						"fileUrl":"${ctxStatic}/juhema/img/IMG_1343.JPG"
					},
					{
						"typeName":"BEIJING PRIVATE GREAT WALL DAY TOUR/GREAT WALL HIKING DAY TOUR",
						"duration":"7 hours",
						"lineTypeNo":true,
						"popularLevel":3,
						"lineName":"Beijing Private Great Wall Day Tour At The Mutianyu Section",
						"lineNo":1,
						"available":"Daily",
						"tenP":500,
						"fileUrl":"${ctxStatic}/juhema/img/IMG_1343.JPG"
					},
					{
						"typeName":"BEIJING PRIVATE GREAT WALL DAY TOUR/GREAT WALL HIKING DAY TOUR",
						"duration":"6 hours",
						"lineTypeNo":true,
						"popularLevel":2,
						"lineName":"Beijing Private Great Wall Day Tour At The Mutianyu Section",
						"lineNo":1,
						"available":"Daily",
						"tenP":500,
						"fileUrl":"${ctxStatic}/juhema/img/IMG_1343.JPG"
					}
				];*/
				function tosort(a,b){
					return b.popularLevel-a.popularLevel;
				}
				//tourlist.pushlist("tour_list_id",data.lineList.sort(tosort));
				tourlist.pushlist("tour_list_id",t_tours_list.sort(tosort));
				$("#tour_reviews_id").on("mouseover",".tour_list_li",function(){
					//$(this).find('.tour_reviewslist_bottom')[0].style.top = 20000/745+"%";
					
					$(this).find('.tour_reviewslist_bottom').eq(0).animate({top:16000/740+"%"},200);
					$(this).find('.tour_reviews_bg').eq(0).animate({opacity:0.5},200);
				});
				$("#tour_reviews_id").on("mouseleave",".tour_list_li",function(){
					$(this).find('.tour_reviewslist_bottom').eq(0).animate({top:50+"%"},200);
					$(this).find('.tour_reviews_bg').eq(0).animate({opacity:0},200);
				});
				
			</script>
	</body>
</html>