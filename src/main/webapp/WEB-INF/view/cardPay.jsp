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
				<form id="cardpayform" action="/tour/order/submit" method="post">
					<input type="text" id="allprice" name="totalPrice" value=${adultNum*unitPrice+childNum*unitPrice*0.8+pickupPrice+dropoffPrice} />
					<input type="hidden" name="lineNo" value=${lineNo} />
					<input type="hidden" name="adultNum" value=${adultNum} />
					<input type="hidden" name="teenagerNum" value=${teenagerNum} />
					<input type="hidden" name="babyNum" value=${babyNum} />
					<input type="hidden" name="childNum" value=${childNum} />
					<input type="hidden" name="startDate" value="${startDate}" />
					<input type="hidden" name="pickupCarTypeNo" name=${pickupCarTypeNo}  />
					<input type="hidden" name="dropoffCarTypeNo" name=${dropoffCarTypeNo}  />
					<input type="hidden" name="showNo" name=${showNo}  />
					<div>
						<input type="text" class="cardPayinput fl" name="fName" reg="firstname" placeholder="First Name" />
						<input type="text" class="cardPayinput fr" name="lName" reg="lastname" placeholder="Last Name" />
						<div id="firstname" class="cardPaywaring fl waringhidden">firstname</div>
						<div id="lastname" class="cardPaywaring fr waringhidden">lastname</div>
						<div style="clear:both"></div>
						<input type="text" class="cardPayinput fl" name="emailAddress" reg="eaddress" placeholder="E-mail Address" />
						<input type="text" class="cardPayinput fr" name="phoneNum" reg="phone" placeholder="Phone" />
						<div id="eaddress" class="cardPaywaring fl waringhidden">firstname</div>
						<div id="phone" class="cardPaywaring fr waringhidden">lastname</div>
						<div class="clearboth"></div>
					</div>
					<h2 class="cardPaylisthead">
						Passport
					</h2>
					<div>
						<input type="text" class="cardPayinput fl" name="" reg="unitedstates" placeholder="Passport Number" />
						<div class="cardPayinput fr">
							<select type="text" class="cardPayselect">
								<option>United States</option>
							</select>
						</div>
						<div id="unitedstates" class="cardPaywaring fl waringhidden">firstname</div>
						<div class="clearboth"></div>
					</div>
					<h2 class="cardPaylisthead">
						Hotel
					</h2>
					<div>
						<input type="text" class="cardPayinput fl" name="hotelName" reg="hotelname" placeholder="Hotel Name" />
						<input type="text" class="cardPayinput fr" name="hotelTel" reg="hotelnumber" placeholder="Hotel Contact Number" />
						<div id="hotelname" class="cardPaywaring fl waringhidden">firstname</div>
						<div id="hotelnumber" class="cardPaywaring fr waringhidden">lastname</div>
						<div style="clear:both"></div>
						<input type="text" style="width:99%;" name="hotelAddress" class="cardPayinput fl" reg="hoteladdress" placeholder="Hotel Address" />
						<div id="hoteladdress" class="cardPaywaring fl waringhidden">firstname</div>
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
						<input type="text" class="cardPayinput fr" name="aAirplanNum" reg="arrivelairnumber" placeholder="Arrivel airplane number" />
						<div id="arrivelairnumber" class="cardPaywaring fr waringhidden">lastname</div>
						<div style="clear:both"></div>
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
						<input type="text" class="cardPayinput fr" name="departureDate" reg="depairnum" placeholder="Departure airplane number" />
						<div id="depairnum" class="cardPaywaring fr waringhidden">lastname</div>
						<div style="clear:both"></div>
					</div>
					<h2 class="cardPaylisthead">
						Tour start time
					</h2>
					<div>
						<input type="text" class="cardPayinput fl" name="startTime" reg="starttime" placeholder="start time" />
						<div class="cardPayinput fr">
							<select type="text" class="cardPayselect">
								<option>AM</option>
								<option>PM</option>
							</select>
						</div>
						<div id="starttime" class="cardPaywaring fl waringhidden">firstname</div>
						<div style="clear:both"></div>
					</div>
					<div class="cardPaytext">
						Pick up at the hotel lobby at 8:00am to 8:30am (if you prefer to start at different time pls let us know)<br><br>
						We first visit Tian’anmen Square, the world’s largest public square. Explore the sites around the square with opportunities to take some amazing pictures.
					</div>
					<textarea class="contact_textarea cardPaytextarea fr" name="instructions" ></textarea>
				<!--<form action="/tour/order/submit" method="post">
					<input type="hidden" name="lineNo" value=${lineNo} />
					<input type="hidden" name="adultNum" value=${adultNum} />
					<input type="hidden" name="teenagerNum" value=${teenagerNum} />
					<input type="hidden" name="babyNum" value=${babyNum} />
					<input type="hidden" name="childNum" value=${childNum} />
					<input type="hidden" name="startDate" value="${startDate}" />
					<input type="hidden" name="pickupCarTypeNo" name=${pickupCarTypeNo}  />
					<input type="hidden" name="dropoffCarTypeNo" name=${dropoffCarTypeNo}  />
					<input type="hidden" name="showNo" name=${showNo}  />
					<input type="hidden" name="fName" id="fName" />
					<input type="hidden" name="lName" id="lName" />
					<input type="hidden" name="emailAddress" id="emailAddress" />
					<input type="hidden" name="phoneNum" id="phoneNum" />
					<input type="hidden" name="hotelName" id="hotelName" />
					<input type="hidden" name="hotelAddress" id="hotelAddress" />
					<input type="hidden" name="hotelTell" id="hotelTell" />
					<input type="hidden" name="arrivalDate" id="arrivalDate" />
					<input type="hidden" name="aAirplanNum" id="aAirplanNum" />
					<input type="hidden" name="startTime" id="startTime" />
					<input type="hidden" name="instructions" id="instructions" />
					<input type="hidden" name="totalPrice" id="totalPrice" />-->
				</form>
				<button class="big_submit fr">submit</button>
				<div class="clearboth"></div>
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
				 			Date:${startDate}
				 		</div>
				 		<div class="cardPay_right_li">
				 			${adultNum} Adult $${unitPrice}
				 			<span>$${adultNum*unitPrice}</span>
				 		</div>
				 		<div class="cardPay_right_li">
				 			${childNum} Child $${unitPrice*0.8}
				 			<span>$${childNum*unitPrice*0.8}</span>
				 		</div>
				 		<div class="cardPay_right_li">
				 			Airport/Railway station Pick up
				 			<span>$${pickupPrice}</span>
				 		</div>
				 		<div class="cardPay_right_li">
				 			Airport Drop Off
				 			<span>$${dropoffPrice}</span>
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
		<script>
			var t_reglist = {
				
			}
			var inputandreg = {
				
			}
			function cardpaysub(){
				var t_input = $("input.cardPayinput");
				var t_len = t_input.length;
				var all_num = 0;
				for(var i = 0 ;i < t_input.length;i++){
					var t_regkey = t_input.eq(i).attr("reg");
					var t_regval = t_input.eq(i).val();
					if(t_regval == ""){
						t_input.eq(i).addClass('inputerror');
						$("#"+t_regkey).removeClass('waringhidden');
					}else{
						all_num++;
					}
				}
				if(all_num == t_len){
					$("#cardpayform").submit();
				}
			}
			$(".tour_list_box").on("focus","input",function(){
				var t_regkey = $(this).attr("reg");
				$(this).removeClass('inputerror');
				$("#"+t_regkey).addClass('waringhidden');
			});
		</script>
 	</body>
</html>