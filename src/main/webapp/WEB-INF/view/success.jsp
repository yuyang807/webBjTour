<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/view/include/taglib.jsp"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>支付成功</title>
    <script src="${ctxStatic}/juhema/jquery.js"></script>
    <script src="${ctxStatic}/juhema/flexible.js"></script>
    <link href="${ctxStatic}/juhema/self.css?v=20180124" rel="stylesheet">
</head>
<body>
<div class="state-page success">
    <div class="top-area">
        <span>交易成功</span>
    </div>
    <div class="cont">
        <div class="item">
            <h3>付款金额</h3>
            <p>${orderAmt}</p>
        </div>
        <div class="item">
            <h3>订单后6位</h3>
            <p class="red">${orderNo}</p>
        </div>
    </div>
    <div class="finish">
        <a href="javascript:;">完成</a>
    </div>
    <div class="support"></div>
</div>
<script>
    var page_loaded=false;
    var u = navigator.userAgent;
    var isAndroid = u.indexOf('Android') > -1 || u.indexOf('Adr') > -1; //android终端
    var isiOS = !!u.match(/\(i[^;]+;( U;)? CPU.+Mac OS X/); //ios终端
    if(isiOS){
        var ver = (navigator.appVersion).match(/OS (\d+)_(\d+)_?(\d+)?/);
        ver=ver[0].replace(/_/g,'.');
        ver=parseFloat(ver.split(' ')[1]);
        page_loaded=ver<9.3?false:true
    }else{
        page_loaded=true;
    }
    pushHistory();
    window.addEventListener("popstate", function(event) {
        if(!page_loaded){
            page_loaded = true;
            return false;
        }else{
            pushHistory();
            closePage();
        }
    }, false);
    $(document).on('click','.finish a',function () {
        closePage();
    });
    function closePage() {
        var ua = navigator.userAgent.toLowerCase();
        if(ua.match(/MicroMessenger/i)=="micromessenger") {
            WeixinJSBridge.call('closeWindow');
        } else if(ua.indexOf("alipay")!=-1){
            AlipayJSBridge.call('closeWebview');
        } else{
            window.close();
        }
    }
    function pushHistory() {
        var state = {
            title: "title",
            url: "#"
        };
        window.history.pushState(state, "title", "#");
    }
</script>
</body>
</html>