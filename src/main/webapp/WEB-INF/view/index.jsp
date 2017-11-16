<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/view/include/taglib.jsp"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="format-detection" content="telephone=no" />
    <title>付款页面</title>
    <script src="${ctxStatic}/juhema/flexible.js"></script>
    <script src="${ctxStatic}/juhema/jquery.js"></script>
    <link href="${ctxStatic}/juhema/self.css?v=20171116" rel="stylesheet">
    <script>
        //判断微信支付宝
        var ua = navigator.userAgent.toLowerCase();
        if(!(ua.match(/MicroMessenger/i)=="micromessenger" || ua.indexOf("alipay")!=-1))
        {
           // location.href="${ctxView}/null.jsp"
        }
    </script>
</head>
<body>
<div class="payment-page">
	<p>${lineList}</p>
	<p>${picList}</p>
    <!-- <input type="hidden" id="myData" data-code="${merchantCode}" data-ksn="${machineSn}">
    <h3>${merchantName}</h3>
    <div class="input-box">
        <p class="lArea">请输入金额</p>
        <p class="rArea">${orderAmt}</p>
        <i></i>
    </div>
    <div class="num-box">
        <div class="left-area">
            <div>
                <a href="javascript:;">1</a>
                <a href="javascript:;">2</a>
                <a href="javascript:;">3</a>
            </div>
            <div>
                <a href="javascript:;">4</a>
                <a href="javascript:;">5</a>
                <a href="javascript:;">6</a>
            </div>
            <div>
                <a href="javascript:;">7</a>
                <a href="javascript:;">8</a>
                <a href="javascript:;">9</a>
            </div>
            <div>
                <a href="javascript:;" class="null"></a>
                <a href="javascript:;">0</a>
                <a href="javascript:;">.</a>
            </div>
        </div>
        <div class="right-area">
            <a href="javascript:;" class="del"></a>
            <a href="javascript:;" class="sure">确认<br>支付</a>
        </div>
        <div class="support"></div>
    </div>
    <div class="wrong-tip">
        <div class="words">
            <p>
                <i></i>
                <span></span>
            </p>
        </div>
        <div class="support"></div>
    </div> -->
</div>
<script>
    if($('.input-box .rArea').html()){
        $('.num-box .sure').addClass('active');
    }
    //输入金额
    $(document).on('touchend','.num-box .left-area a:not(".null")',function (ev) {
        var amount=$('.input-box .rArea').html();
        var tempA=$(this).html();
        var amount2=amount+tempA;
        var reg=/^(([1-9]\d{0,12})|0)(\.\d{0,2})?$/;
        if(reg.test(amount2)){
            $('.input-box .rArea').html(amount2);
            if(!parseFloat(amount2)){
                $('.num-box .sure').removeClass('active');
            }else{
                $('.num-box .sure').addClass('active');
            }
        }
        ev.preventDefault();
        ev.stopPropagation();
    });
    //删除一位
    $(document).on('touchend','.num-box .del',function (ev) {
        var amount=$('.input-box .rArea').html();
        if(amount!=''){
            amount=amount.substring(0,amount.length-1);
            $('.input-box .rArea').html(amount);
            if(!parseFloat(amount)){
                $('.num-box .sure').removeClass('active');
            }else{
                $('.num-box .sure').addClass('active');
            }
        }
        ev.preventDefault();
        ev.stopPropagation();
    });
    //确认支付
    var bClick=true;
    $(document).on('touchend','.num-box .sure.active',function (ev) {
        var amount=$('.input-box .rArea').html()
        amount=Number(amount)*100;
        amount=amount.toFixed(0);
        var code=$('#myData').attr('data-code');
        var ksn=$('#myData').attr('data-ksn');
        if(ua.match(/MicroMessenger/i)=="micromessenger"){
            var payType=3;
        }
        if(ua.indexOf("alipay")!=-1){
            var payType=2;
        }
        if(bClick){
            bClick=false;
            $.ajax({
                url: "/forwardAccredit",
                type: "POST",
                data:{
                    merchantCode:code,
                    machineSn:ksn,
                    payType:payType,
                    orderAmt:amount
                },
                cache:false,
                dataType: "json",
                contentType: "application/x-www-form-urlencoded",
                success:function(json){
                    if(!json.httpForm){
                        $('.wrong-tip').show();
                        $('.wrong-tip p span').html(json.errInfo.errMsg);
                        bClick=true;
                    }else{
                        var data=JSON.parse(json.httpForm);
                        location.href=data.submitUrl;
                        bClick=true;
                    }
                },
                error:function(err){

                    bClick=true;
                }
            })
        }
        ev.preventDefault();
        ev.stopPropagation();
    });
    $(document).on('touchstart','.wrong-tip', function (ev) {
        ev.preventDefault();
        ev.stopPropagation();
    });
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