var slider = function() {
				var t_window_w,slider_box,t_len,interval,
			    isStart = false,
			    t_index = 0 //当前页面索引
			    runtime = 1000;
			    waittime = 2000;
				return {
					s:function(str,data) {
						for(var i in data){
					  		str = str.replace(new RegExp("\\{" + i + "\\}", "g"), data[i]);
					  	}
					  	return str;
					},
					init:function(id,t_data){
						// 生成样式，格局
						var c = document.createElement('style');
							c.type='text/css';
							c.innerHTML='body{-moz-user-select:none;-webkit-user-select:none;-ms-user-select:none;-khtml-user-select:none;user-select:none}#li_box_id{position:absolute;top:0;right:0;bottom:0;left:0;overflow:hidden}#pagelistmove{position:absolute;top:0;width:100%;bottom:0;left:0;white-space:nowrap}#li_box_id .removetime{transition:all '+runtime+'ms;-moz-transition:all '+runtime+'ms;-webkit-transition:all '+runtime+'ms;-o-transition:all '+runtime+'ms}.pages{width:100%;height:100%;color:#fff;transform:translate(-100%,0);display:inline-block}';
							document.getElementsByTagName('head')[0].appendChild(c);
						// 
						document.getElementById(id).innerHTML = '<div id="li_box_id"  ><div id="pagelistmove" ></div><div id="dianbox" class="dianbox"></div></div>';
						
						t_window_w = document.getElementById("li_box_id").clientWidth;
						slider_box = document.getElementById("pagelistmove");
						t_len = t_data.length;
						
						var t_base_str = '<div class="pages" ><img src="{0}" onclick="linkfor(/list/{1})/></div>';
						var t_base_dian = '<div class="dian" onmousedown="slider.dian({0})"></div>';
						var t_all_str = slider.s(t_base_str,[t_data[t_len-1].fileUrll,t_data[t_len-1].lineNo]);
						var t_dian_str = "";
						for(var i = 0;i < t_len;i++){
							t_all_str += slider.s(t_base_str,[t_data[i].fileUrll,t_data[i].lineNo]);
							t_dian_str += slider.s(t_base_dian,[i]);
						}
						t_all_str += slider.s(t_base_str,[t_data[0].fileUrll,t_data[0].lineNo]);
						slider_box.innerHTML = t_all_str;
						document.getElementById("dianbox").innerHTML = t_dian_str;
					    document.getElementsByClassName("dian")[t_index].className = "dian dianhover";
					    slider.start();
					    $(window).resize(function() {
							//clearTimeout(interval);
							t_window_w = document.getElementById("li_box_id").clientWidth;
							//slider.run();
						});
					},
					dian:function(nowindex){
						if(isStart){
							return false;
						}
						clearInterval(interval);
						isStart = true;
						setTimeout(function(){
							isStart = false;
							slider.start();
						},runtime);
						t_index = nowindex;
						slider.run();
						
					},
					start:function(){
						interval = setInterval(function(){
							t_index++;
							if(t_index > t_len){
								t_index = 0;
							}
							slider.run();
							//slider.start();
						},waittime);
					},
					run:function(){
						document.getElementsByClassName("dianhover")[0].className = "dian";
						$("#pagelistmove").animate({left:-t_index*t_window_w+"px"},runtime,function(){
							if(t_index == t_len){
	    						t_index = 0;
		    					document.getElementById("pagelistmove").style.left = 0;
		    				}
						});
						if(t_index == t_len){
							document.getElementsByClassName("dian")[0].className = "dian dianhover";
	    			}else{
							document.getElementsByClassName("dian")[t_index].className = "dian dianhover";
	    				}
						//slider_box.style.transform = "translate("+-t_index*t_window_w+"px)";
	    				/*document.getElementsByClassName("dianhover")[0].className = "dian";
	    				if(t_index == t_len){
		    				document.getElementById("pagelistmove").style.left = 0;
		    				console.log(document.getElementById("pagelistmove").style.left);
	    				}
			    		document.getElementsByClassName("dian")[t_index].className = "dian dianhover";*/
					}
				}
			}();