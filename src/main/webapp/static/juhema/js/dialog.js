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
					<input type="hidden" name="carTypeNo" value="{carTypeNo}" />
					<input type="hidden" name="carDay" id="guideDay" />
					<div class="dialog_main_li_top">Select start date</div>
					<input id="datepicker" name="startDate" reg="datepickertime" class="guide_input fl" type="text" />
					<div id="datepickertime" class="cardPaywaring fl waringhidden">start time</div>
					<div style="clear:both"></div>
				</li>
				<li class="dialog_main_li">
					<div class="dialog_main_li_top">Select end date</div>
					<input id="datepicker2" reg="datepickertime2" class="guide_input fl" type="text" />
					<div id="datepickertime2" class="cardPaywaring fl waringhidden">end time</div>
					<div style="clear:both"></div>
				</li>
				<li class="dialog_main_li">
					<div class="dialog_main_li_top">Tour Option</div>
					<select class="dialog_main_li_input">
						<option>1</option>
						<option>2</option>
					</select>
				</li>
			</ul>
		</form>
		<div class="dialog_bottom_total">Total Cost: 　<span>￥600</span>.00</div>
		<button class="dialog_bottom_btn buttoncolor1" onclick="dialogsubmit()">Submit</button>
	</div>
`;
var picker = 0;
var picker2 = 0;
$("#tour_guide_table_id").on("click",".tour_book_now",function(){
	var t
	document.body.style.overflow = "hidden";
	$("body").append(dialog_str.format2({
		carTypeNo:$("#tour_book_now_id").attr("regt")
	}));
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
    
	$(".dialog_main").on("focus","input",function(){
		var t_regkey = $(this).attr("reg");
		$(this).removeClass('inputerror');
		$("#"+t_regkey).addClass('waringhidden');
		//submiterror();
	});
});
function dialogsubmit(){
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
			$("#guideDay").val(abc/3600000/24+1);
			$("#carrenform").submit();
		}
		
	}
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
		<div class="dialog_title">Car Rental<div class="closedialog" onclick="removedialog()"></div></div>
		<ul class="dialog_main">
			<li class="dialog_main_li">
				<div class="dialog_main_li_top">Size of party</div>
				<select class="dialog_main_li_input">
					<option>1</option>
					<option>2</option>
				</select>
			</li>
			<li class="dialog_main_li">
				<div class="dialog_main_li_top">Select a date</div>
				<input id="datepicker" class="guide_input fr" type="text" />
			</li>
			<li class="dialog_main_li">
				<div class="dialog_main_li_top">Tour Option</div>
				<select class="dialog_main_li_input">
					<option>1</option>
					<option>2</option>
				</select>
			</li>
		</ul>
		<div class="dialog_bottom_total">Total Cost: 　<span>￥600</span>.00</div>
		<button class="dialog_bottom_btn buttoncolor1">Submit</button>
	</div>
`;
var errordialogstr = `
	<div class="dialog_bg dialog_remove" onclick="removedialog()"></div>
	<div class="dialog_box dialog_remove">
		<div class="dialog_title">Car Rental<div class="closedialog" onclick="removedialog()"></div></div>
		<ul class="dialog_main">
			<li class="dialog_main_li">
				<div class="dialog_main_li_top">Size of party</div>
				<select class="dialog_main_li_input">
					<option>1</option>
					<option>2</option>
				</select>
			</li>
			<li class="dialog_main_li">
				<div class="dialog_main_li_top">Select a date</div>
				<input id="datepicker" class="guide_input fr" type="text" />
			</li>
			<li class="dialog_main_li">
				<div class="dialog_main_li_top">Tour Option</div>
				<select class="dialog_main_li_input">
					<option>1</option>
					<option>2</option>
				</select>
			</li>
		</ul>
		<div class="dialog_bottom_total">Total Cost: 　<span>￥600</span>.00</div>
		<button class="dialog_bottom_btn buttoncolor1">Submit</button>
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
