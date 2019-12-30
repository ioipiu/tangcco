<%--
  Created by IntelliJ IDEA.
  User: Laptop
  Date: 2019/10/17
  Time: 16:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>失败页面</title>
    <link href="static/css/index.css" type="text/css" rel="stylesheet" />
</head>
<body>
<div class="Header">
    <div class="ctr pr">
        <a href="${pageContext.request.contextPath}/index.jsp" title="返回首页">
            <img src="static/picture/logo.jpg" width="158" height="58" class="Logo" />
        </a>
    </div>
</div>
<div style="width:800px; margin:60px auto; overflow:hidden; font-family:微软雅黑; color:#555555;">
    <table width="800" border="0" cellspacing="0" cellpadding="0">
        <tr>
            <td width="320">
                <img src="static/picture/shop.jpg" width="280" height="290" />
            </td>
            <td>
                <div style="font-size:24px; color:#555555; line-height:40px; margin-bottom:20px;">系统信息提示！</div>
                <p style="line-height:24px; font-size:16px; color: red">支付失败！</p>
                <p style="margin:20px 0;">
                    <a href="${pageContext.request.contextPath}/index.jsp" style="color:#555555; font-size:12px;">如果您的浏览器没有自动跳转，请点击此链接</a>
                    <script>setTimeout("window.location.href ='${pageContext.request.contextPath}/index.jsp'", 4000);</script>
                </p>
            </td>
        </tr>
    </table>
</div>
</body>
</html>

