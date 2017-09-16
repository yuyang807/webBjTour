var dialog_str = `
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
$(".tour_book_now").click(function(){
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
});
function removedialog(){
	document.body.style.overflow = "auto";
	$(".dialog_remove").remove();
}
