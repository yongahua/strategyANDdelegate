package gupao.vip.pattern.strategy.pay.payport;

public class JDPay extends Payment{
    public String getName() {
        return "京东支付";
    }

    protected double queryBalance(String uid) {
        return 200;
    }
}
