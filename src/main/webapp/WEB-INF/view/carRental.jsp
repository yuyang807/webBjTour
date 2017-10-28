<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/view/include/taglib.jsp"%>
<html lang="en">
	<head>
		<meta charset="UTF-8">
		<title></title>
		<meta content="width=device-width,initial-scale=1.0,maximum-scale=1.0,user-scalable=0" name="viewport" />
		<link rel="stylesheet" href="${ctxStatic}/juhema/css/base.css" />
		<link rel="stylesheet" href="${ctxStatic}/juhema/css/top.css" />
		<link rel="stylesheet" href="${ctxStatic}/juhema/css/foot.css" />
		<link rel="stylesheet" href="${ctxStatic}/juhema/css/tourlist.css" />
		<link rel="stylesheet" href="${ctxStatic}/juhema/css/reviewslist.css" />
		<link rel="stylesheet" href="${ctxStatic}/juhema/css/costomize.css" />
		<link rel="stylesheet" href="${ctxStatic}/juhema/css/details.css" />
		<link rel="stylesheet" href="${ctxStatic}/juhema/css/guide.css" />
		<link rel="stylesheet" href="${ctxStatic}/juhema/css/pikaday.css" />
	</head>
	<body>
		<div id="tour_top_id" class="tour_top">
			
		</div>
		<div class="tour_list_box">
			<div class="tourlink">
				<a href="/">Home</a>　>　 
				<a href="/list">View The Tours</a>　>　
				<span>Car Rental</span>
			</div>
			<div class="public_title4">Car Rental</div>
		</div>
		
		<div class="tour_list_box">
			<div class="tour_guide_table_box_top">
				<select>
					<option>CNY</option>
				</select>
			</div>
			<div class="tour_guide_table_box">
				<div id="tour_guide_table_id" class="tour_guide_table">
					
				</div>
			</div>
			<div class="tour_carRental_notice">
				<div class="tour_carRental_notice_top">Notice</div>
				<ul class="tour_carRental_notice_ul">
					<li>The rates above are quoted separately only with Chinese-speaking driver since Most of the drivers speaks little English. </li>
					<li>Our Standard Cars (Nissan, Passat, Sonata...) are in a random arrangement.</li>
					<li>Your driver will pick you up at your hotel holding a piece of paper with your name. For urgent matters, please call your trip advisor on her or his mobile.</li>
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
		<div class="tour_foot_bg">
			<div class="tour_foot">
				<ul id="tour_foot_id" class="tour_foot_ul">
					
				</ul>
			</div>
		</div>
		<script type="text/javascript" src="${ctxStatic}/juhema/js/jquery-1.11.0.js" ></script>
		<script type="text/javascript" src="${ctxStatic}/juhema/js/base.js" ></script>
		<script type="text/javascript" src="${ctxStatic}/juhema/js/top.js" ></script>
		<script type="text/javascript" src="${ctxStatic}/juhema/js/dialog.js" ></script>
		<script type="text/javascript" src="${ctxStatic}/juhema/js/pikaday.js" ></script>
		<script>
			var table_top_html = `
				<div class="tour_guide_table_top">
					<button class="tour_guide_list tour_guide_12"><span>Size of party</span><div class="tour_guide_list_line"></div></button><!--
					--><button class="tour_guide_list tour_guide_12"><span>Size of party</span><div class="tour_guide_list_line"></div></button><!--
					--><button class="tour_guide_list tour_guide_12"><span>Photo</span><div class="tour_guide_list_line"></div></button><!--
					--><button class="tour_guide_list tour_guide_12"><span>half day(4 hours in the downtown)</span><div class="tour_guide_list_line"></div></button><!--
					--><button class="tour_guide_list tour_guide_12"><span>full day(8 hours in the downtown)</span><div class="tour_guide_list_line"></div></button><!--
					--><button class="tour_guide_list tour_guide_12"><span>Mutianyu Great Wall</span><div class="tour_guide_list_line"></div></button><!--
					--><button class="tour_guide_list tour_guide_12"><span>Jinshanling Great Wall</span><div class="tour_guide_list_line"></div></button><!--
					--><button class="tour_guide_list tour_guide_12"><span>Lick the Book button</span></button>
				</div>
			`;
			var car_str = `
				<div class="tour_guide_car_list">
					<div class="tour_guide_td_list_in_new"></div>
				 	<button class="tour_guide_car_text">{carName}</button>
				 	<img class="tour_guide_car_img" src="{carPicUrl}" />
				</div>
			`;
			var table_str = `
				<div class="tour_guide_table_list2">
				   	<button class="tour_guide_td_button_new tour_guide_12 carrentaltable1">{carnum}<br>traveling<br>party</button>
					<div class="tour_guide_td_list_new carrentallist tour_guide_24">
						{carlist}
				   </div>
				   	<button class="tour_guide_td_button_new tour_guide_12 carrentaltable2">{halfDayPrice}</button>
				   	<button class="tour_guide_td_button_new tour_guide_12 carrentaltable3">{fullDayPrice}</button>
				   	<button class="tour_guide_td_button_new tour_guide_12 carrentaltable4">{mtyPrice}</button>
				   	<button class="tour_guide_td_button_new tour_guide_12 carrentaltable5">{jslPrice}</button>
				   	<button class="tour_guide_td_button_new tour_guide_12 carrentaltable6"><div id="tour_book_now_id" class="tour_book_now" regt="{carTypeNo}">Book Now</div></button>
				   	<div style="clear:both;"></div>
				</div>
			`;
			/*var touroption = `
				<option value=1 >halfDayPrice</option>
				<option value=2 >fullDayPrice</option>
				<option value=3 >mtyPrice</option>
				<option value=4 >jslPrice</option>
			`;*/
			var servicelist = ${serviceList};
			var touroption = '';
			for(var i in servicelist){
				touroption += '<option value='+servicelist[i]['carServiceNo']+' >'+servicelist[i]['carServiceName']+'</option>'
			}
		    var carList = ${carsList};
		    var carmap = {};
		    for(var i in carList){
		    	var carkey = carList[i]['carTypeName'];
		    	if(carmap[carkey] == undefined){
		    		carmap[carkey] = [];
		    	}
		    	carmap[carkey].push(carList[i]);
		    }
		    console.log(carmap);
		    var t_all_table = '';
		    for(var i in carmap){
		    	var onecarmap = carmap[i];
		    	var t_car_list = "";
		    	for(var j in onecarmap){
		    		t_car_list += car_str.format2({
		    			carName:onecarmap[j]['carName'],
		    			carPicUrl:onecarmap[j]['carPicUrl']
		    		})
		    	}
		    	t_all_table += table_str.format2({
		    		carnum:i,
		    		carlist:t_car_list,
		    		halfDayPrice:onecarmap[0].halfDayPrice,
		    		fullDayPrice:onecarmap[0].fullDayPrice,
		    		mtyPrice:onecarmap[0].mtyPrice,
		    		jslPrice:onecarmap[0].jslPrice,
		    		carTypeNo:onecarmap[0].carTypeNo
		    	});
		    	
		    }
			$("#tour_guide_table_id").html(table_top_html+t_all_table);
		</script>
	</body>
</html>
