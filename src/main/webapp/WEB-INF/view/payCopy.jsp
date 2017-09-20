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
		<link rel="stylesheet" href="${ctxStatic}/juhema/css/guide.css?v=20170316" />
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
		</div>
		<h1 class="public_title5">Shopping Basket</h1>
		<div class="tour_list_box">
			<div id="personlist" class="tour_faqs_ul">
				<img src="${ctxStatic}/juhema/img/IMG_1450.JPG" class="payCopy_img" />
				
			</div>
			<div class="tour_guide_table_box">
				<div class="tour_payCopy_top">
					<div class="tour_payCopy_top_r"></div>
					Airport/Railway station Pick up
					<div class="tour_payCopy_checkbox_big">
						<div class="tour_payCopy_checkbox_left tour_payCopy_click"></div>
						<div class="tour_payCopy_checkbox_text tour_payCopy_click">$250</div>
						<div class="tour_payCopy_checkbox_more">Choose a row</div>
						<select class="tour_payCopy_checkbox_select">
							<option>row 1-4</option>
						</select>
					</div>
				</div>
				<div class="tour_guide_table_wai">
					<div id="tour_guide_table_id" class="tour_guide_table">
						
					</div>
				</div>
			</div>
			
			<div class="tour_payCopy_top">
				<div class="tour_payCopy_top_r"></div>
					Acrabatic Show In Chaoyang Theatre
				<div class="tour_payCopy_checkbox_big">
					<div class="tour_payCopy_checkbox_left tour_payCopy_click"></div>
					<div class="tour_payCopy_checkbox_text tour_payCopy_click">$250</div>
					<div class="tour_payCopy_checkbox_more">Choose a row</div>
					<select class="tour_payCopy_checkbox_select">
						<option>row 1-4</option>
					</select>
				</div>
			</div>
			<div class="tour_payCopy_text">
				Let some of China’s most talented entertainers and athletes dazzle you for an evening with gravity-defying tricks and acrobatics. These spectacular performers will contort, balance, plate-spin, foot-juggle and more. Keep your eyes on the stage and you may even see a motorcycle or two.
			</div>
			
			<div class="tour_payCopy_top">
				<div class="tour_payCopy_top_r"></div>
					Kungfu Show In Red Theatre
				<div class="tour_payCopy_checkbox_big">
					<div class="tour_payCopy_checkbox_left tour_payCopy_click"></div>
					<div class="tour_payCopy_checkbox_text tour_payCopy_click">$250</div>
					<div class="tour_payCopy_checkbox_more">Choose a row</div>
					<select class="tour_payCopy_checkbox_select">
						<option>row 1-4</option>
					</select>
				</div>
			</div>
			<div class="tour_payCopy_text">
				Follow the tale of a young boy on his journey to becoming a kung fu master through six gripping scenes told through traditional Chinese art and live modern dance. (Don’t worry; there are subtitles above the stage). Developed by some of China’s top stage directors and designers, the performance showcases the skills of its talented cast, most of whom are just 17 years old.
			</div>
			<div class="tour_payCopy_line">
				
			</div>
			<div class="contact_list">
				<div class="payCopytotalprice">
					Total Cost: <span>$230</span>
				</div>
				<button class="big_submit fr">Check Out</button>
				<div class="clearboth"></div>
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
		<script>
			$(".tour_payCopy_click").click(function(){
				var t_p = $(this).parent();
				if(t_p.hasClass("checkbox_hover")){
					t_p.removeClass("checkbox_hover");
				}else{
					t_p.addClass("checkbox_hover");
				}
			});
			var table_top_html = `
				<div class="tour_guide_table_top">
					<button class="tour_guide_list tour_guide_10"><span>Size of party</span><div class="tour_guide_list_line"></div></button><!--
					--><button class="tour_guide_list tour_guide_20"><span>Type of vehicle</span><div class="tour_guide_list_line"></div></button><!--
					--><button class="tour_guide_list tour_guide_20"><span>Photo</span><div class="tour_guide_list_line"></div></button><!--
					--><button class="tour_guide_list tour_guide_45"><span>Notice</span></button>
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
				   	<button class="tour_guide_td_button_new">{carnum}<br>traveling<br>party</button>
					<div class="tour_guide_td_list_new tour_guide_50">
						{carlist}
				   </div>
				   	<div style="clear:both;"></div>
				</div>
			`;
			var table_str_more = `
				<div class="tour_guide_td_button_more_new">
		   			<div class="tour_guide_text_inner">
			   			1.The rates above are quoted separately only with Chinese-speaking driver since Most of the drivers speaks little English.<br>                                             
						2.Our Standard Cars (Nissan, Passat, Sonata...) are in a random arrangement.<br>
						3.Your driver will pick you up at your hotel holding a piece of paper with your name. For urgent matters, please call your trip advisor on her or his mobile.
					</div>
		   		</div>
			`;
			$("#tour_guide_table_id").html(table_top_html+table_str+table_str+table_str_more);
			var person_str = `
				<ul class="payCopy_top_ul">
					<li>The Great Wall Tour</li>
					<li>{personnum} people, ${allprice} </li>
					<li>Date: 14/07/2017</li>
				</ul>
				<div style="float:right;font-size:2rem;color:#9B9B9B;">${allprice}</div>
			`;

			var personnum = ${adultNum}+${teenagerNum}+${childNum}+${babyNum};
			var allprice = ${adultNum}*${unitPrice}+
			${teenagerNum}*${unitPrice}*0.9+
			${childNum}*${unitPrice}*0.8;
			$("#personlist").append(person_str.format2({
				personnum:personnum,
				allprice:allprice
			}));
			
			//var carList = ${carList};
		    var carList = [{
		    	carTypeName:1,
		    	carName:'1-1'
		    },{
		    	carTypeName:2,
		    	carName:'2-1'
		    },{
		    	carTypeName:2,
		    	carName:'2-2'
		    },{
		    	carTypeName:2,
		    	carName:'2-3'
		    },{
		    	carTypeName:3,
		    	carName:'3-1'
		    },{
		    	carTypeName:1,
		    	carName:'1-2'
		    },{
		    	carTypeName:3,
		    	carName:'3-2'
		    }];
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
		    		carlist:t_car_list
		    	});
		    }
		</script>
	</body>
</html>