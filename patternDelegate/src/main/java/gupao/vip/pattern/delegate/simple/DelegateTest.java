package gupao.vip.pattern.delegate.simple;

public class DelegateTest {
    public static void main(String[] args) {
        new Developers().command("焊工",new Contractor());
    }
}
