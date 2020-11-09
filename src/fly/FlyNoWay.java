package fly;

public class FlyNoWay implements FlyBehavior{
    //flybehavior  을 상속받아 날 수 없는 애들의 클래스
    public void fly(){
        System.out.println("나는 못난");
    }
}
