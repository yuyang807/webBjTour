<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/view/include/taglib.jsp"%>
<html lang="en">
	<head>
	    <meta charset="UTF-8">
	    <title>Beijing Tour Company</title>
	    <meta content="width=device-width,initial-scale=1.0,maximum-scale=1.0,user-scalable=0" name="viewport" />
		<meta name="keywords" content="Beijing Tour Company" />
		<link rel="stylesheet" href="${ctxStatic}/juhema/css/base.css?v=20171112" />
		<link rel="stylesheet" href="${ctxStatic}/juhema/css/top.css?v=20171112" />
		<link rel="stylesheet" href="${ctxStatic}/juhema/css/tourlist.css?v=20171112" />
		<link rel="stylesheet" href="${ctxStatic}/juhema/css/foot.css?v=20171112" />
		<link rel="stylesheet" href="${ctxStatic}/juhema/css/costomize.css?v=20171112" />
		<link rel="stylesheet" href="${ctxStatic}/juhema/css/faqs.css?v=20171112" />
		<link rel="stylesheet" href="${ctxStatic}/juhema/css/guide.css?v=20171112" />
	</head>
    <body>
    	<header id="tour_top_id" class="tour_top">
			
		</header>
		<div class="tour_list_box">
			<div class="tourlink">
				<a href="/">Home</a>　>　 
				<a href="/list">View The Tours</a>　>　
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
					<div class="tour_payCopy_checkbox_big" k="c1">
						<div class="tour_payCopy_checkbox_left tour_payCopy_click"></div>
						<div class="tour_payCopy_checkbox_text tour_payCopy_click" id="pricec1">$<span class="pickupprice"></span></div>
						<div class="tour_payCopy_checkbox_more">Choose Drop off</div>
						<select id="pickupselect" class="tour_payCopy_checkbox_select" onchange="changecarselect(this)">
							
						</select>
					</div>
					<div class="tour_payCopy_checkbox_big2" k="c2">
						<div class="tour_payCopy_checkbox_left tour_payCopy_click"></div>
						<div class="tour_payCopy_checkbox_text tour_payCopy_click" id="pricec2">$<span class="pickupprice"></span></div>
						<div class="tour_payCopy_checkbox_more">Choose Pick up</div>
						<select id="pickupselect2" class="tour_payCopy_checkbox_select" onchange="changecarselect(this)">
							
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
				<div class="tour_payCopy_checkbox_big" k="c3">
					<div class="tour_payCopy_checkbox_left tour_payCopy_click"></div>
					<div class="tour_payCopy_checkbox_text tour_payCopy_click" id="pricec3">$<span id="acrobatpriceid"></span></div>
					<div class="tour_payCopy_checkbox_more">Choose a row</div>
					<select id="acrobaticid" class="tour_payCopy_checkbox_select" onchange="acrobat(this)">
						
					</select>
				</div>
			</div>
			<div class="tour_payCopy_text">
				Let some of China’s most talented entertainers and athletes dazzle you for an evening with gravity-defying tricks and acrobatics. These spectacular performers will contort, balance, plate-spin, foot-juggle and more. Keep your eyes on the stage and you may even see a motorcycle or two.
			</div>
			
			<div class="tour_payCopy_top">
				<div class="tour_payCopy_top_r"></div>
					Kungfu Show In Red Theatre
				<div class="tour_payCopy_checkbox_big" k="c4">
					<div class="tour_payCopy_checkbox_left tour_payCopy_click"></div>
					<div class="tour_payCopy_checkbox_text tour_payCopy_click" id="pricec4">$<span id="kungfupriceid"></span></div>
					<div class="tour_payCopy_checkbox_more">Choose a row</div>
					<select id="kungfuid" class="tour_payCopy_checkbox_select" onchange="kungfuchange(this)">
						
					</select>
				</div>
			</div>
			<div class="tour_payCopy_text">
				Follow the tale of a young boy on his journey to becoming a kung fu master through six gripping scenes told through traditional Chinese art and live modern dance. (Don’t worry; there are subtitles above the stage). Developed by some of China’s top stage directors and designers, the performance showcases the skills of its talented cast, most of whom are just 17 years old.
			</div>
			<div class="tour_payCopy_line">
				
			</div>
			<div class="contact_list">
				<form id="payCopyformid" action="/tour/confirm" method="post">
					<input type="hidden" name="lineNo" value=${lineNo} />
					<input type="hidden" name="adultNum" value=${adultNum} />
					<input type="hidden" name="childNum" value=${childNum} />
					<input type="hidden" name="teenagerNum" value=${teenagerNum} />
					<input type="hidden" name="babyNum" value=${babyNum} />
					<input type="hidden" name="startDate" value='${startDate}' />
					<input type="hidden" id="pickupCarTypeNo" name="pickupCarTypeNo"  />
					<input type="hidden" id="dropoffCarTypeNo" name="dropoffCarTypeNo"  />
					<input type="hidden" id="showNo1" name="showNo1"  />
					<input type="hidden" id="showNo2" name="showNo2"  />
				</form>
					<div class="payCopytotalprice">
						Total Cost: <span id="total_bottom_price">$0</span>
					</div>
					<button class="big_submit fr" onclick="checkout()">Check Out</button>
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
		<script type="text/javascript" src="${ctxStatic}/juhema/js/base.js?v=20171112" ></script>
		<script type="text/javascript" src="${ctxStatic}/juhema/js/top.js?v=20171112" ></script>
		<script>
			var checkobj = {
				c1:false,
				c2:false,
				c3:false,
				c4:false
			}
			$(".tour_payCopy_click").click(function(){
				var t_p = $(this).parent();
				var tkey = t_p.attr("k");
				if(t_p.hasClass("checkbox_hover")){
					t_p.removeClass("checkbox_hover");
					checkobj[tkey] = false;
				}else{
					t_p.addClass("checkbox_hover");
					checkobj[tkey] = true;
				}
				getallprice();
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
			
			var carList = ${carList};
		    var carmap = {};
		    var cartypeobj = {};
		    for(var i in carList){
		    	var carkey = carList[i]['carTypeName'];
		    	var cartypeno = carList[i]['carTypeNo'];
		    	if(carmap[carkey] == undefined){
		    		carmap[carkey] = [];
		    	}
		    	carmap[carkey].push(carList[i]);
		    	cartypeobj[cartypeno] = {
		    		name:carList[i]['carName'],
		    		price:carList[i]['transferPrice']
		    	};
		    }
		    console.log(carmap);
		    var t_all_table = '';
		    for(var i in carmap){
		    	var onecarmap = carmap[i];
		    	var t_car_list = "";
		    	for(var j in onecarmap){
		    		t_car_list += car_str.format2({
		    			carName:onecarmap[j]['carName'],
		    			carPicUrl:onecarmap[j]['fileUrl']
		    		})
		    	}
		    	t_all_table += table_str.format2({
		    		carnum:i,
		    		carlist:t_car_list
		    	});
		    }
			$("#tour_guide_table_id").html(table_top_html+t_all_table+table_str_more);
		    var carselectstr = '<option value={carid} >{carname}</option>';
		    var carselectall = '';
		    for(var i in cartypeobj){
		    	carselectall += carselectstr.format2({
		    		carid:i,
		    		carname:cartypeobj[i]['name']
		    	})
		    }
		    $("#pickupselect,#pickupselect2").html(carselectall);
		    var t_select = $("#pickupselect").val();
		    $(".pickupprice").html(cartypeobj[t_select]['price']);
		    function changecarselect(tthis){
		    	$(tthis).eq(0).parent().find(".pickupprice").html(cartypeobj[tthis.value]['price']);
		    	getallprice()
		    }
		    
		    var showlist = ${showList};
		    var showlistobj = {};
		    for(var i in showlist){
		    	var name = showlist[i]['showName'];
		    	var showNo = showlist[i]['showNo'];
		    	if(showlistobj[name]){
		    		showlistobj[name][showNo] = showlist[i];
		    	}else{
		    		showlistobj[name] = {};
		    		showlistobj[name][showNo] = showlist[i];
		    	}
		    }
		    
		    for(var i in showlistobj){
		    	var showselectstr = '<option value={showid} >{showname}</option>';
		    	var showselectall = '';
		    	var showchild = showlistobj[i]
		    	for(var j in showchild){
		    		showselectall += showselectstr.format2({
		    			showid:showchild[j]['showNo'],
		    			showname:showchild[j]['rows'],
		    		})
		    	}
		    	if(i == 'kungfu'){
		    		$("#kungfuid").html(showselectall);
				    var t_select = $("#kungfuid").val();
				    $("#kungfupriceid").html(showchild[t_select]['showPrice']);
		    	}else{
		    		$("#acrobaticid").html(showselectall);
				    var t_select = $("#acrobaticid").val();
				    
				    $("#acrobatpriceid").html(showchild[t_select]['showPrice']);
		    	}
		    }
		    function acrobat(tthis){
		    	var arcobatobj = showlistobj['acrobatic show'];
		    	var t_price = arcobatobj[tthis.value]['showPrice'];
		    	$("#acrobatpriceid").html(t_price);
		    	getallprice()
		    }
		    function kungfuchange(tthis){
		    	var arcobatobj = showlistobj['kungfu'];
		    	var t_price = arcobatobj[tthis.value]['showPrice'];
		    	$("#kungfupriceid").html(t_price);
		    	getallprice()
		    }
		    function checkout(){
		    	if(checkobj['c1']){
		    		$("#pickupCarTypeNo").val($("#pickupselect2").val());
		    	}else{
		    		$("#pickupCarTypeNo").remove();
		    	}
		    	if(checkobj['c2']){
					$("#dropoffCarTypeNo").val($("#pickupselect").val());
		    	}else{
		    		$("#dropoffCarTypeNo").remove();
		    	}
		    	if(checkobj['c3']){
		    		$("#showNo1").val($("#acrobaticid").val());
		    	}else{
		    		$("#showNo1").remove();
		    	}
		    	if(checkobj['c4']){
					$("#showNo2").val($("#kungfuid").val());
		    	}else{
		    		$("#showNo2").remove();
		    	}
				$("#payCopyformid").submit();
		    }
		    function getallprice(){
		    	var t_price = 0;
		    	for(var i in checkobj){
		    		if(checkobj[i]){
		    			console.log($("#price"+i).html());
		    			var all = 1;
		    			if(i == "c3" || i == "c4"){
		    				all = personnum;
		    			}else{
		    				
		    			}
		    			t_price += parseInt($("#price"+i+" span").html())*all;
		    		}
		    	}
		    	$("#total_bottom_price").html("$"+(t_price+allprice));
		    }
		    getallprice();
		</script>
	</body>
</html>