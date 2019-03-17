package kong.study.myproxy;

public class MyProxyTest {

    public static void main(String[] args) throws Exception {
        Payment payment = new WxPayment();
        Payment proxyPayment = (Payment)new PaymentProxy().getInstance(payment);
        proxyPayment.doPay();
    }
}
