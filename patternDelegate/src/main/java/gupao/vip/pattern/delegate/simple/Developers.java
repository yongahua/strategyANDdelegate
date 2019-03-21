package gupao.vip.pattern.delegate.simple;

/**
 * 开发商
 */
public class Developers {

    public void command(String command,Contractor contractor){
        contractor.doing(command);
    }
}
