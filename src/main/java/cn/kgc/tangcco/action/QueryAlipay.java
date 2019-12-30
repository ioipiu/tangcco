package cn.kgc.tangcco.action;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "QueryAlipay" ,urlPatterns = "/queryAlipay")
public class QueryAlipay extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //商户订单号
        String out_trade_no = new String(request.getParameter("out_trade_no").getBytes("ISO-8859-1"),"UTF-8");

        //支付宝交易号
        String trade_no = new String(request.getParameter("trade_no").getBytes("ISO-8859-1"),"UTF-8");

        //付款金额
        String total_amount = new String(request.getParameter("total_amount").getBytes("ISO-8859-1"),"UTF-8");

        System.out.println("商户订单号:"+out_trade_no);
        System.out.println("支付宝交易号:"+trade_no);
        System.out.println("付款金额:"+total_amount);

        request.setAttribute("out_trade_no",out_trade_no);
        request.setAttribute("trade_no",trade_no);
        request.setAttribute("total_amount",total_amount);
        request.getRequestDispatcher("index.jsp").forward(request,response);
    }
}
