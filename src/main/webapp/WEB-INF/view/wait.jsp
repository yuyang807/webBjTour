<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/view/include/taglib.jsp"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="format-detection" content="telephone=no" />
    <title>付款页面</title>
    <script src="${ctxStatic}/juhema/flexible.js"></script>
    <script src="${ctxStatic}/juhema/jquery.js"></script>
    <link href="${ctxStatic}/juhema/self.css?v=20180124" rel="stylesheet">
</head>
<body>
<div class="wait-page" data-orderNo="${orderNo}">
    <div class="words">
        <p>订单待支付（<span>5s</span>）</p>
        <img src="${ctxStatic}/juhema/img/wait.gif">
    </div>
    <div class="support"></div>
</div>
<script>
    var orderNo=$('.wait-page').attr('data-orderNo');
    var n=5;
    var timer=null;
    timer=setInterval(function () {
        n--;
        if(n==-1){
            clearInterval(timer);
            location.href="/success/"+orderNo;
        }else{
            $('.words p span').html(n+'s');
        }
    },1000);
    function ajaxFunction(){
        $.ajax({
            url: "/checkStatus",
            type: "POST",
            data:{
                orderNo:orderNo
            },
            cache:false,
            dataType: "json",
            contentType: "application/x-www-form-urlencoded",
            success:function(json){
                var data=JSON.stringify(json);
                if(json.tradeStatus==5){
                    setTimeout(ajaxFunction,1000);
                }else{
                    clearInterval(timer);
                    location.href="/success/"+json.orderNo;
                }
            }
        })
    }
    ajaxFunction();

</script>
</body>
</html>