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
		<link rel="stylesheet" href="${ctxStatic}/juhema/css/foot.css?v=20170316" />
		<link rel="stylesheet" href="${ctxStatic}/juhema/css/costomize.css?v=20170316" />
		<link rel="stylesheet" href="${ctxStatic}/juhema/css/faqs.css?v=20170316" />
	</head>
    <body>
    	<header id="tour_top_id" class="tour_top">
			
		</header>
		<div class="cardPay_bg_right"></div>
		<div class="tour_list_box cardpay_bg">
			 <div class="cardPay_left fl">
				<form action="/tour/order/submit" method="post">
					<input type="hidden" name="lineNo" value="${lineNo}" />
					<input type="hidden" name="adultNum" value="${adultNum}" />
					<input type="hidden" name="teenagerNum" value="${teenagerNum}" />
					<input type="hidden" name="babyNum" value="${babyNum}" />
					<input type="hidden" name="startDate" value="${startDate}" />
					<input type="hidden" name="pickupCarTypeNo" name="${pickupCarTypeNo}"  />
					<input type="hidden" name="dropoffCarTypeNo" name="${dropoffCarTypeNo}"  />
					<input type="hidden" name="showNo" name="${showNo}"  />
					<div class="tourlink">
						<a href="home.html">Home</a>　>　 
						<a href="viewTheTour.html">View The Tours</a>　>　
						<span>Day Tour / Layover Tour</span>
					</div>
					<h1 class="cardPayhead">
						Customer information
					</h1>
					<h2 class="cardPaylisthead">
						Contact address
					</h2>
					<div>
						<input type="text" class="cardPayinput fl" placeholder="First Name" />
						<input type="text" class="cardPayinput fr" placeholder="Last Name" />
						<input type="text" class="cardPayinput fl" placeholder="E-mail Address" />
						<input type="text" class="cardPayinput fr" placeholder="Phone" />
						<div class="clearboth"></div>
					</div>
					<h2 class="cardPaylisthead">
						Passport
					</h2>
					<div>
						<input type="text" class="cardPayinput fl" placeholder="Passport Number" />
						<div class="cardPayinput fr">
							<select type="text" class="cardPayselect">
								<option>United States</option>
							</select>
						</div>
						<div class="clearboth"></div>
					</div>
					<h2 class="cardPaylisthead">
						Hotel
					</h2>
					<div>
						<input type="text" class="cardPayinput fl" placeholder="Hotel Name" />
						<input type="text" class="cardPayinput fr" placeholder="Hotel Contact Number" />
						<input type="text" class="cardPayinputlong fl" placeholder="Hotel Address" />
						<div class="clearboth"></div>
					</div>
					<h2 class="cardPaylisthead">
						Arrival information
					</h2>
					<div>
						<div class="cardPayinput fl">
							<select type="text" class="cardPayselect">
								<option>Arrival date</option>
							</select>
						</div>
						<input type="text" class="cardPayinput fr" placeholder="Arrivel airplane number" />
						<div class="clearboth"></div>
					</div>
					<h2 class="cardPaylisthead">
						Departure information
					</h2>
					<div>
						<div class="cardPayinput fl">
							<select type="text" class="cardPayselect">
								<option>Departure date</option>
							</select>
						</div>
						<input type="text" class="cardPayinput fr" placeholder="Departure airplane number" />
						<div class="clearboth"></div>
					</div>
					<h2 class="cardPaylisthead">
						Tour start time
					</h2>
					<div>
						<input type="text" class="cardPayinput fl" placeholder="start time" />
						<div class="cardPayinput fr">
							<select type="text" class="cardPayselect">
								<option>AM</option>
								<option>PM</option>
							</select>
						</div>
						<div class="clearboth"></div>
					</div>
					<div class="cardPaytext">
						Pick up at the hotel lobby at 8:00am to 8:30am (if you prefer to start at different time pls let us know)<br><br>
						We first visit Tian’anmen Square, the world’s largest public square. Explore the sites around the square with opportunities to take some amazing pictures.
					</div>
					<textarea class="contact_textarea cardPaytextarea fr" ></textarea>
					<button class="big_submit fr">submit</button>
					<div class="clearboth"></div>
				</form>
			 </div>
			 <div class="cardPay_mid fl"></div>
			 <div class="cardPay_right fr">
			 	<div class="cardPay_right_box">
				 	<img class="cardPay_right_img fl" src="${ctxStatic}/juhema/img/WechatIMG58.jpeg" />
				 	<div class="cardPay_right_ul fr">
				 		<div class="cardPay_name">
				 			The Great Wall Tour
				 		</div>
				 		<div class="cardPay_right_li">
				 			Date:14/07/2017
				 		</div>
				 		<div class="cardPay_right_li">
				 			1 Adult $100
				 			<span>$100</span>
				 		</div>
				 		<div class="cardPay_right_li">
				 			1 Child $100
				 			<span>$80</span>
				 		</div>
				 		<div class="cardPay_right_li">
				 			Airport/Railway station Pick up
				 			<span>$20</span>
				 		</div>
				 		<div class="cardPay_right_li">
				 			Airport Drop Off
				 			<span>$20</span>
				 		</div>
				 	</div>
					<div class="clearboth"></div>
				 	<div class="cardPay_right_total">
				 		Total Cost: <span>$200</span>
				 	</div>
			 	</div>
			 </div>
			 <div class="clearboth"></div>
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
 	</body>
</html>