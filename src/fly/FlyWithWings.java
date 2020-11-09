package fly;

import fly.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    //실제로 날 수 있는 오리들의 클래스
    @Override
    public void fly() {
        System.out.println("날개 휘젓고 난다요");
    }
}
