var dialog_str = `
	<div class="dialog_bg dialog_remove" onclick="removedialog()"></div>
	<div class="dialog_box dialog_remove">
		<div class="dialog_title">Car Rental<div class="closedialog" onclick="removedialog()"></div></div>
		<form id="carrenform" action="/cars/confirm" method="post" >
			<ul class="dialog_main">
				<!--<li class="dialog_main_li">
					<div class="dialog_main_li_top">Size of party</div>
					<select class="dialog_main_li_input">
						<option>1</option>
						<option>2</option>
					</select>
				</li>-->
				<li class="dialog_main_li">
					<input type="hidden" id="carTypeNoid" name="carTypeNo" value={carTypeNo} />
					<input type="hidden" name="carDay" id="guideDay" />
					<input type="hidden" name="startDate" id="startDate" />
					<div class="dialog_main_li_top">Select start date</div>
					<input id="datepicker" onblur="touroptionchange()" reg="datepickertime" class="guide_inputtime guide_input fl" type="text" />
					<div id="datepickertime" class="cardPaywaring fl waringhidden">start time</div>
					<div style="clear:both"></div>
				</li>
				<li id="datepicker2box" class="dialog_main_li">
					<div class="dialog_main_li_top">Select end date</div>
					<input id="datepicker2" reg="datepickertime2" class="guide_input fl" type="text" />
					<div id="datepickertime2" onblur="touroptionchange()" class="cardPaywaring fl waringhidden">end time</div>
					<div style="clear:both"></div>
				</li>
				<li class="dialog_main_li">
					<div class="dialog_main_li_top">Tour Option</div>
					<select id="touroption" name="carServiceNo" onchange="touroptionchange()" class="dialog_main_li_input">
						
					</select>
				</li>
			</ul>
		</form>
		<div class="dialog_bottom_total">Total Cost: 　<span>￥<span id="cardialogprice">600</span></span>.00</div>
		<button class="dialog_bottom_btn buttoncolor1" onclick="dialogsubmit()">Submit</button>
	</div>
`;
var picker = 0;
var picker2 = 0;
var t_regkey = 0;
$("#tour_guide_table_id").on("click",".tour_book_now",function(){
	document.body.style.overflow = "hidden";
	$("body").append(dialog_str.format2({
		carTypeNo:$("#tour_book_now_id").attr("regt")
	}));
	$("#touroption").html(touroption);
	picker = new Pikaday(
    {
        field: document.getElementById('datepicker'),
        firstDay: 1,
        minDate: new Date('2000-01-01'),
        maxDate: new Date('2020-12-31'),
        yearRange: [2000,2020]
    });
	picker2 = new Pikaday(
    {
        field: document.getElementById('datepicker2'),
        firstDay: 1,
        minDate: new Date('2000-01-01'),
        maxDate: new Date('2020-12-31'),
        yearRange: [2000,2020]
    });
    
	t_regkey = $(this).attr("regt");
	$(".dialog_main").on("focus","input",function(){
		$(this).removeClass('inputerror');
		$("#"+t_regkey).addClass('waringhidden');
		//submiterror();
	});
});
function touroptionchange(){
	var t_key = $("#touroption").val();
	var t_obj = carmap[t_regkey][0];
	var price_key = '';
	if(t_key == 1101){
		price_key = 'fullDayPrice';
	}else if(t_key == 1102){
		price_key = 'mtyPrice';
	}else if(t_key == 1103){
		price_key = 'jslPrice';
	}else if(t_key == 1104){
		price_key = 'halfDayPrice';
	};
	var t_select_price = t_obj[price_key];
	var t_day = 1;
	if($("#datepicker").val() != "" && $("#datepicker2").val() != "" && t_key == 1101){
		t_day = ((new Date(picker2['_d'])).getTime()-(new Date(picker['_d'])).getTime())/3600000/24+1;
	}
	$("#cardialogprice").html(t_select_price*t_day);
	//找到当前种类对象
	//找到当前种类的价格
	if(t_key == 1101){
		$("#datepicker2box").show();
	}else{
		$("#datepicker2box").hide();
	}
}
function dialogsubmit(){
	var t_input = $("input.guide_inputtime");
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
		if($("#datepickertime2").val() == ""){
			$("#startDate").val((new Date(picker['_d'])).getTime());
			$("#guideDay").val(1);
			$("#carrenform").submit();
		}else{
			var abc = (new Date(picker2['_d'])).getTime()-(new Date(picker['_d'])).getTime();
			if(abc < 0){
				alert("开始日期不可以大于结束日期");
			}else{
				//console.log(abc/3600000/24+1);
				$("#startDate").val((new Date(picker['_d'])).getTime());
				$("#guideDay").val(abc/3600000/24+1);
				$("#carrenform").submit();
			}
		}
	}
}
function getallprice(){
	var t_day = 1;
	if($("#datepicker").val() != "" && $("#datepicker2").val() != ""){
		t_day = ((new Date(picker2['_d'])).getTime()-(new Date(picker['_d'])).getTime())/3600000/24+1;
	}
	var type = $("#guidelist").val();
	//var t_prices_one = guidelistobj[type];
	//$("#allprice").val(t_prices_one*t_day);
}
/*$(".tour_book_now").click(function(){
	document.body.style.overflow = "hidden";
	$("body").append(dialog_str);
	
			var picker = new Pikaday(
		    {
		        field: document.getElementById('datepicker'),
		        firstDay: 1,
		        minDate: new Date('2000-01-01'),
		        maxDate: new Date('2020-12-31'),
		        yearRange: [2000,2020]
		    });
});*/
function removedialog(){
	document.body.style.overflow = "auto";
	$(".dialog_remove").remove();
}

var successdialogstr = `
	<div class="dialog_bg dialog_remove" onclick="removedialog()"></div>
	<div class="dialog_box dialog_remove">
		<div class="submit_s_icon"></div>
		<div class="submit_s_text">
			Your order has been submited successfully
		</div>
		<button class="dialog_bottom_btn buttoncolor1" onclick="javascript:window.location.href = '/'">back to home page</button>
	</div>
`;
var errordialogstr = `
	<div class="dialog_bg dialog_remove" onclick="removedialog()"></div>
	<div class="dialog_box dialog_remove">
		<div class="submit_s_icon_error"></div>
		<div class="submit_s_text">
			Submission failure
		</div>
		<button class="dialog_bottom_btn buttoncolor1" onclick="submitfunction()">resubmit</button>
	</div>
`;
function submitsuccess(){
	document.body.style.overflow = "hidden";
	$("body").append(successdialogstr);
}
function submiterror(){
	document.body.style.overflow = "hidden";
	$("body").append(errordialogstr);
}
