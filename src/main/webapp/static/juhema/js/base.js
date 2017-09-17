String.prototype.format2 = function ()
  {
  	var t_obj = arguments[0],temS = this;
  	for(var i in t_obj){
  		temS = temS.replace(new RegExp("\\{" + i + "\\}", "g"), t_obj[i]);
  	}
  	return temS;
  };
function linkfor(url){
	window.location.href = url;
}
