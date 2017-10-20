
var location_obj = [
	{
		"url":"",
		"key":"",
		"text":"Home"
	},
	{
		"url":"/list",
		"key":"/list",
		"text":"Our Tours"
	},
	{
		"url":"travelTips.html",
		"key":"travelTips.html",
		"text":"Travel Tips"
	},
	{
		"url":"FAQs.html",
		"key":"FAQs.html",
		"text":"FAQs"
	},
	{
		"url":"contactUs.html",
		"key":"contactUs.html",
		"text":"Contact Us"
	}
];

var t_top_str = `<div class="tour_top_padding fl"></div>
			<div class="tour_top_left"><div class="top_icon"></div>Beijing Tour Company</div>
			<div class="tour_top_padding fr"></div>
			<div class="tour_top_click" onclick="showmenu()"></div>
			<div class="tour_top_right">
				<ul id="tour_top_ul_id" class="tour_top_ul">
					{li_list}
				</ul>
			</div>`;
			
var t_foot_str = `<li class="tour_foot_li tour_foot_short color1 tour_foot_shai"><a class="tour_foot_link"  style="color:#e44e47;"><div class="footicon"></div>Beijing Tour Company</a></li><!--
					--><li class="tour_foot_li tour_foot_long tour_foot_align_right tour_foot_shai">{li_list}</li><!--
					--><li class="tour_foot_li"><a class="tour_foot_link">@Copyright 2017 Beijing Tour Company</a></li><!--
					--><li class="tour_foot_li tour_foot_align_right"><a class="tour_foot_link">Phone number:+86 13939494902</a></li>`;
var t_list = '<li><a class="{class}" href="{url}">{text}</a></li>';
var t_list_foot = '<a class="{class} {classmargin}" href="{url}" >{text}</a>';
var now_location = window.location.href;
var t_li_list = '';
var t_foot_li_list = '';
for(var i in location_obj){
	var t_url = location_obj[i]['url'];
	var t_text = location_obj[i]['text'];
	var t_class = isindexof(now_location,location_obj[i]['key'])? 'tour_top_ul_hover' : '';
	var t_class_foot = isindexof(now_location,location_obj[i]['key'])? 'tour_foot_link tour_foot_link_hover' : 'tour_foot_link';
	var marginnone = '';
	if(i == location_obj.length-1){marginnone = 'marginnone';}
	t_li_list += t_list.format2({
		'class':t_class,
		'url':t_url,
		"text":t_text
	});
	t_foot_li_list += t_list_foot.format2({
		'class':t_class_foot,
		'url':t_url,
		'text':t_text,
		'classmargin':marginnone
	});
}
$("#tour_top_id").html(t_top_str.format2({"li_list":t_li_list}));
$("#tour_foot_id").html(t_foot_str.format2({"li_list":t_foot_li_list}));
function showmenu(){
	if($("#tour_top_ul_id").hasClass("tour_top_hide")){
		$("#tour_top_ul_id").removeClass("tour_top_hide");
	}else{
		$("#tour_top_ul_id").addClass("tour_top_hide");
	};
}
function isindexof(key,list){
	if(key.indexOf("/") < 0 && list.indexOf("/") < 0){
		return true;
	}else if(key.indexOf(list) > -1 && list.indexOf("/") > -1){
		return true;
	}else{
		return false;
	}
	/*for(var i in list){
		if(key.indexOf(list[i]) > -1){
			return true;
		}
	}*/
	return false;
}
$(window).scroll(function(event){  
    var wScrollY = window.scrollY; // 当前滚动条位置  
    console.log(wScrollY);
    if(wScrollY > 60){
    	$("#tour_top_id").addClass("tour_top_black");
    }else{
    	$("#tour_top_id").removeClass("tour_top_black");
    }
    /*var wInnerH = window.innerHeight; // 设备窗口的高度（不会变）    
    var bScrollH = document.body.scrollHeight; // 滚动条总高度        
    if (wScrollY + wInnerH >= bScrollH) {            
        showMore();  
    }   */ 
});  
