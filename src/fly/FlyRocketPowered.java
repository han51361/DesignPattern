package fly;

public class FlyRocketPowered  implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("로켓추진으로 날아가버려");
    }
}
