package gupao.vip.pattern.delegate.simple;

import java.util.HashMap;
import java.util.Map;

/**
 * 承包商  不干活，负责找人干活
 */
public class Contractor {

    private Map<String,IFarmersWork> targets = new HashMap<String,IFarmersWork>();

    public Contractor() {
        targets.put("瓦工",new FarmersWorkA());
        targets.put("焊工",new FarmersWorkB());
    }

    //项目经理自己不干活
    public void doing(String command){
        targets.get(command).doing(command);
    }

}
