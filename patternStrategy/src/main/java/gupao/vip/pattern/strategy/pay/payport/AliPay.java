package gupao.vip.pattern.strategy.pay.payport;

public class AliPay extends Payment {

    public String getName() {
        return "银联支付";
    }

    protected double queryBalance(String uid) {
        return 120;
    }
}
