package gupao.vip.pattern.delegate.simple;

public class FarmersWorkA implements IFarmersWork {
    @Override
    public void doing(String command) {
        System.out.println("我是农民工A，我现在开始干" + command + "工作");
    }
}
