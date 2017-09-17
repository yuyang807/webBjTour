
var tourlist = function() {
	var t_tours_str = `<li class="tour_list_li" onclick="linkfor(/list/{lineNo})">
					<div class="tour_list_imgbox">
						<div class="tour_list_imginner"></div>
						<img src="{fileUrl}"/>
						<div class="tour_list_day">
							<div class="tour_list_day_inner"></div>
							<div class="tour_list_day_number">{duration0}</div>
							<div class="tour_list_day_text">{duration1}</div>
						</div>
					</div>
					<div class="tour_list_textall">
						<div class="tour_list_textbox">{lineName}</div><div class="tour_list_textbox_right">
							<div>From</div>
							<div>{tenP} USD</div>
						</div>
						<div class="tour_list_textbox_more"></div>
						<button class="tour_list_textbox_button buttoncolor1">View this trip</button>
					</div>
				</li>`;
	return {
		pushlist:function(id,data){
			var t_str = '';
			for(var i = 0,len = data.length;i < len;i++){
				t_str += t_tours_str.format2({
					'fileUrl':data[i].fileUrl,
					'duration0':data[i].duration.split(" ")[0],
					'duration1':data[i].duration.split(" ")[1],
					'typeName':data[i].typeName,
					'tenP':data[i].tenP,
					'lineName':data[i].lineName,
					'lineNo':data[i].lineNo
				})
			}
			$("#"+id).html(t_str);
			$("#"+id).on("mouseover","img",function(){
				this.style.transform= "translate(-50%, -50%) scale(1.3)";
			});
			$("#"+id).on("mouseover",".tour_list_li",function(){
				this.style.boxShadow= "0px 0px 6px 0 #999";
			});
			$("#"+id).on("mouseleave","img",function(){
				this.style.transform= "translate(-50%, -50%) scale(1)";
			});
			$("#"+id).on("mouseleave",".tour_list_li",function(){
				this.style.boxShadow= "0px 0px 3px 0 #ccc";
			});
			$("#"+id).on("click",".tour_list_li",function(){
				window.location.href = "tourDetails.html";
			});
		}
	}
}();
