<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
</body>
<div align="center">
    <form action="${pageContext.request.contextPath}/sendAlipay" method="post">
        付款多少:	<input type="text" name="total_amount"/>
        订单名称： <input type="text" name="subject" />
        商品描述：	<input type="text" name="product_name"/>
        <input type="submit" value="去付款" />
    </form>

    <div align="center">
        <p>商户订单号：${out_trade_no}</p>
        <p>支付宝交易号：${trade_no}</p>
        <p>付款金额：${total_amount}</p>
    </div>
</div>
</html>
