package kong.study.myproxy;

public class WxPayment implements Payment {
    @Override
    public void doPay() {
        System.out.println("使用微信支付");
    }
}
