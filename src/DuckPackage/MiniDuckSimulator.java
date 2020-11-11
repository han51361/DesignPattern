package DuckPackage;


import fly.FlyRocketPowered;

public class MiniDuckSimulator {


    public static void main(String[] args){
        Duck mallard = new MallardDuck();
        mallard.performFly(); // 말라 덕체 객
        mallard.performQuack();



        Duck model= new ModelDuck();
        model.performFly(); // 처음엔 못날아
       model.setFlyBehavior(new FlyRocketPowered()); // 행동 세터 메소드 호출 -> 추진력을 얻는다.
        model.performFly();

    }
}





