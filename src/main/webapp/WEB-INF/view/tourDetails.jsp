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
		<link rel="stylesheet" href="${ctxStatic}/juhema/css/slider2.css?v=20170316" />
	</head>
    <body>
		<header id="tour_top_id" class="tour_top">
			
		</header>
		<div class="tour_list_box">
			<div class="tourlink">
				<a href="home.html">Home</a>　>　 
				<a href="viewTheTour.html">View The Tours</a>　>　
				<span>Day Tour / Layover Tour</span>
			</div>
			<div class="public_title2">Day Tour / Layover Tour</div>
		</div>
		<div class="tour_list_box">
			<div class="tour_details_left">
				<!--<img class="tour_list_left_pic" src="img/detail_left.png" />-->
				<div class="tour_list_left_pic">
					<div class="tour_list_left_inside"></div>
					<div id="tour_slider_main" ></div>
				</div>
				<div class="tour_details_overview">
					<h1 class="tour_details_overview_top">Over View</h1>
					<ul id="overviewid" class="tour_details_overview_list">
						
					</ul>
				</div>
				<div class="tour_details_left_list">
					<div class="tour_details_left_list_title">Detailed Itinerary</div>
					<div class="tour_details_left_list_text">
						Pick up at the hotel lobby at 8:00am to 8:30am (if you prefer to start at different time pls let us know)

We first visit Tian’anmen Square, the world’s largest public square. Explore the sites around the square with opportunities to take some amazing pictures.

We venture northward to the Tian’anmen Rostrum guarded by the enormous and portrait of Mao for all to see and what has universally been photographed all over the world.

Next, the magnificent Forbidden City, the largest Imperial Palace in the world. We’ll spend a couple of hours wandering around this amazing example of Imperial architecture and learning about the history of the palace.
					</div>
				</div>
				<div class="tour_details_left_list">
					<div class="tour_details_left_list_title">What`s included</div>
					<ul class="tour_details_left_list_text">
						<li>English-speaking tour guide service fee</li>
						<li>Air-conditioned vehicle with a private driver</li>
						<li>Delicious lunch in a local Chinese restaurant</li>
						<li>All entrance tickets to the sights listed above</li>
						<li>Round Trip cable car or chair lift up and toboggan down the wall</li>
 					</ul>
				</div>
				<div class="tour_details_left_list">
					<div class="tour_details_left_list_title">What`s excluded</div>
					<ul class="tour_details_left_list_text tour_wrong">
						<li>Gratuity to the guide and driver</li>
						<li>Chinese visa</li>
						<li>Dinner</li>
						<li>Accommodation</li>
						<li>Personal Costs</li>
 					</ul>
				</div>
				<div class="tour_details_left_list">
					<div class="tour_details_left_list_title">Notice</div>
					<div class="tour_details_left_list_text">
						1. The quoted price is for a-8 hour tour per day. If you use more than 6 hours or less than 8 hours per day it will still be considered a full day.
<br><br>
2. Additional hours are billed at 50CNY to 100CNY for the guide and 50CNY to 100CNY for the driver.
<br><br>
3. Pls note that the itinerary is flexible and we can adjust it according to your personal interests, the weather or any unexpected conditions.
<br><br>
4. For the lunch, we will take you to the authentic Chinese local restaurant catering for the locals. If you prefer to take a lunch in a fancy restaurant or order the dishes above our budget then you can just cover the cost difference above our budget! The guide will assist you to order some dishes and you can share the lunch with the guide
<br><br>
5. We conduct only private tour but not group tour and won’t mix you with others.
<br><br>
6. Our tours are complete non-forced shopping tour and we won’t take you to any factories without request to waste your valuable time.

 					</div>
				</div>
			</div><!--
			--><div class="tour_details_right_box">
				<div class="tour_details_right_in">
					<img class="tour_guide_top" src="${ctxStatic}/juhema/icon/order_top.png" />
					<div class="tour_guide_top_text">Book this Tour</div>
					<ul class="tour_guide_ul">
						<li class="tour_guide_li">Select a date</li>
						<li class="tour_guide_li ">
							<input id="datepicker" class="guide_input fr" type="text" />
						</li>
						<li class="tour_guide_li">
							<div class="tour_guide_li_left fl">Select a currency</div>
							<select class="tour_guide_li_right fr">
								<option>CNY</option>
								<option>2</option>
							</select>
						</li>
						<li class="tour_guide_li">
							<div class="tour_guide_li_left fl">Adults <span>$75</span></div>
							<select class="tour_guide_li_right fr">
								<option>Full day</option>
								<option>2</option>
							</select>
						</li>
						<li class="tour_guide_li">
							<div class="tour_guide_li_left fl">Children(3-11) <span>$65</span></div>
							<select class="tour_guide_li_right fr">
								<option>Full day</option>
								<option>2</option>
							</select>
						</li>
					</ul>
					<div class="tour_guide_total">
						<span>Total Cost:</span><span class="tour_guide_font_big">$600</span>
						<button class="button100 buttoncolor1">BOOKING NOW</button>
					</div>
				</div>
				<div class="tour_details_right_more_top">
					You might also like…..
				</div>
				<ul id="tour_details_right_img_ul">
					<li class="tour_details_right_img_li">
						<div class="tour_details_right_img_li_inner"></div>
						<img class="tour_details_right_img_li_img" src="${ctxStatic}/juhema/img/WechatIMG63.jpeg" />
						<div class="tour_details_right_img_bg"></div>
						<div class="tour_details_right_img_text">
							<div class="tour_details_right_img_text_center">
								Mu Tian Yu Great Wall + Tian`an Men Square and Forbidden City
							</div>
						</div>
					</li>
					<li class="tour_details_right_img_li">
						<div class="tour_details_right_img_li_inner"></div>
						<img class="tour_details_right_img_li_img" src="${ctxStatic}/juhema/img/WechatIMG63.jpeg" />
						<div class="tour_details_right_img_bg"></div>
						<div class="tour_details_right_img_text">
							<div class="tour_details_right_img_text_center">
								Mu Tian Yu Great Wall + Tian`an Men Square and Forbidden City
							</div>
						</div>
					</li>
					<li class="tour_details_right_img_li">
						<div class="tour_details_right_img_li_inner"></div>
						<img class="tour_details_right_img_li_img" src="${ctxStatic}/juhema/img/WechatIMG63.jpeg" />
						<div class="tour_details_right_img_bg"></div>
						<div class="tour_details_right_img_text">
							<div class="tour_details_right_img_text_center">
								Mu Tian Yu Great Wall + Tian`an Men Square and Forbidden City
							</div>
						</div>
					</li>
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
		<script type="text/javascript" src="${ctxStatic}/juhema/js/lbx_slider_new.js?v=20170316" ></script>
		<script>
			var datalist = [
				{
					"name":"page1",
					"img":"IMG_1450.JPG"
				},
				{
					"name":"page2",
					"img":"IMG_1451.JPG"
				},
				{
					"name":"page3",
					"img":"IMG_1452.JPG"
				},
				{
					"name":"page2",
					"img":"IMG_1451.JPG"
				},
				{
					"name":"page3",
					"img":"IMG_1452.JPG"
				},
				{
					"name":"page3",
					"img":"IMG_1452.JPG"
				},
				{
					"name":"page2",
					"img":"IMG_1451.JPG"
				},
				{
					"name":"page3",
					"img":"IMG_1452.JPG"
				},
				{
					"name":"page2",
					"img":"IMG_1451.JPG"
				},
				{
					"name":"page3",
					"img":"IMG_1452.JPG"
				},
				{
					"name":"page2",
					"img":"IMG_1451.JPG"
				}
			];
			slider.init("tour_slider_main",datalist);
			
			
			var picker = new Pikaday(
		    {
		        field: document.getElementById('datepicker'),
		        firstDay: 1,
		        minDate: new Date('2000-01-01'),
		        maxDate: new Date('2020-12-31'),
		        yearRange: [2000,2020]
		    });
		    $(".tour_details_left_list_title").click(function(){
		    	var t_parent = $(this).parent();
		    	if(t_parent.hasClass("parentclose")){
		    		t_parent.removeClass("parentclose");
		    	}else{
		    		t_parent.addClass("parentclose");
		    	}
		    });
		    
		    var t_obj = ${lineList}[0];
		    var viewhtml = `
		    	<li class="icon_attr">Attraction: {attraction}</li>
				<li class="icon_attr">Duration: {duration}</li>
				<li class="icon_attr">language: {language}</li>
				<li class="icon_attr">Tour type: {tourtype}</li>
				<li class="icon_attr">Amount of Walking: {amount}</li>
				<li class="icon_attr">Customizable: {customizable}</li>
		    `;
		    $("#overviewid").html(viewhtml.format2({
		    	attraction:t_obj['attractions'],
		    	duration:t_obj['duration'],
		    	language:t_obj['language'],
		    	tourtype:t_obj['isPrivate'],
		    	amount:t_obj['phylevel'],
		    	customizable:t_obj['customizable']
		    }));
		</script>
	</body>
</html>