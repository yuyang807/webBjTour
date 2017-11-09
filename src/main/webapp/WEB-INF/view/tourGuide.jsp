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
				<form id="guideform" action="/guides/confirm" method="post" >
				<ul class="tour_guide_ul">
					<li class="tour_guide_li">
						<div class="tour_guide_li_left fl">choice a guide</div>
						<select id="guidelist" name="guideNo" onchange="getallprice()" class="tour_guide_li_right fr">
							
						</select>
					</li>
					<li class="tour_guide_li">Select a date</li>
					<li class="tour_guide_li selectdatebox">
						<span class="guide_text">From</span>
						<input id="datepicker" onblur="getallprice()" reg="datepickertime" class="guide_input fr" type="text" />
						<input id="startDate" type="hidden" name="startDate"  />
						<input id="guideDay" type="hidden" name="guideDay"  />
						<span class="datepickerhide guide_text">To</span>
						<input id="datepicker2" onblur="getallprice()" reg="datepickertime2" class="datepickerhide guide_input fr" type="text" style="float:right;" />
					</li>
					<li>
						<div id="datepickertime" class="cardPaywaring fl waringhidden">start time</div>
						<div id="datepickertime2" class="cardPaywaring fr waringhidden">end time</div>
						<div style="clear:both"></div>
					</li>
					<!--<li class="tour_guide_li">
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
					</li>-->
				</ul>
				</form>
				<div class="tour_guide_total">
					<span>Total Cost:</span><span class="tour_guide_font_big">￥<span id="allprice">0</span>.</span><span>00</span>
					<button class="button100 buttoncolor1" onclick="cardpaysub()">BOOKING NOW</button>
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
						<div class="contact_input"><input id="fNameid" name="fName" reg="contactfname" class="contactinput" type="text" /></div>
						<div id="contactfname" class="cardPaywaring fl waringhidden">first name</div>
						<div style="clear:both"></div>
					</li><!--
					--><li class="contact_list displayinline">
						<div class="contact_label">Last name</div>
						<div class="contact_input"><input id="lNameid" name="lName" reg="contactlname" class="contactinput" type="text" /></div>
						<div id="contactlname" class="cardPaywaring fl waringhidden">Last name</div>
						<div style="clear:both"></div>
					</li>
					<li class="contact_list">
						<div class="contact_label">E-mail</div>
						<div class="contact_input2"><input id="emailAddressid" reg="contactemail" class="contactinput" name="emailAddress" type="text" /></div>
						<div id="contactemail" class="cardPaywaring fl waringhidden">E-mail</div>
						<div style="clear:both"></div>
					</li>
					<li class="contact_list">
						<div class="contact_label">Special requirement:</div>
						<textarea class="contact_textarea contactinput" id="contentid"  reg="contactarea" name="content"></textarea>
						<div id="contactarea" class="cardPaywaring fl waringhidden">Special requirement</div>
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
			var picker2 = new Pikaday(
		    {
		        field: document.getElementById('datepicker2'),
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
					   	<div class="tour_guide_td_inside">{name}<br>({guidetime} hours)</div></div><!--
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
			var guide_option = "<option value={id} >{name}</option>";
			/*var guidelist = [
				{
					guideNo:4,
					serviceName:"服务名称1",
					serviceDuration:"服务时长1",
					price:400,
					introduction:"You can choose one site among Tian'anmen Square&Forbidden City,Temple of Heaven,Summer Palace and so on of the city area."
				},
				{
					guideNo:4,
					serviceName:"服务名称1",
					serviceDuration:"服务时长1",
					price:400,
					introduction:"You can choose one site among Tian'anmen Square&Forbidden City,Temple of Heaven,Summer Palace and so on of the city area."
				}
			]*/
			var guidelist = ${guidesList};
			var guideliststr = table_top_html;
			var selectoption = '';
			var guidelistobj = {};
			for(var i in guidelist){
				guidelistobj[guidelist[i].guideNo] = guidelist[i].price;
				guideliststr += table_str.format2({
					name:guidelist[i].serviceName,
					guidetime:guidelist[i].serviceDuration,
					guidetext:guidelist[i].introduction,
					guideprice:guidelist[i].price
				}); 
				selectoption += guide_option.format2({
					id:guidelist[i].guideNo,
					name:guidelist[i].serviceName
				});
			}
			$("#tour_guide_table_id").html(guideliststr);
			$("#guidelist").html(selectoption);
			function cardpaysub(){
				var t_input = $("input.guide_input");
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
					var abc = (new Date(picker2['_d'])).getTime()-(new Date(picker['_d'])).getTime();
					if(abc < 0){
						alert("开始日期不可以大于结束日期");
					}else{
						//console.log(abc/3600000/24+1);
						$("#startDate").val((new Date(picker['_d'])).getTime());
						$("#guideDay").val(abc/3600000/24+1);
						$("#guideform").submit();
					}
					
				}
				//$("#guideform").submit();
			}
			function getallprice(){
				var t_day = 1;
				if($("#datepicker").val() != "" && $("#datepicker2").val() != ""){
					t_day = ((new Date(picker2['_d'])).getTime()-(new Date(picker['_d'])).getTime())/3600000/24+1;
				}
				var type = $("#guidelist").val();
				if(type == '701'){
					$(".datepickerhide").hide();
					t_day = 1;
				}else{
					$(".datepickerhide").show();
				}
				var t_prices_one = guidelistobj[type];
				$("#allprice").html(t_prices_one*t_day);
			}
			getallprice();
			$(".tour_details_right").on("focus","input",function(){
				var t_regkey = $(this).attr("reg");
				$(this).removeClass('inputerror');
				$("#"+t_regkey).addClass('waringhidden');
				//submiterror();
			});
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
							fName:$("#fNameid").val(),
							lName:$("#lNameid").val(),
							emailAddress:$("#emailAddressid").val(),
							content:$("#contentid").val()
						},
						success:function(data){
							if(data.resCode == '00000000'){
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