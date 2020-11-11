package DuckPackage;

import DuckPackage.Duck;
import fly.FlyWithWings;

public class MallardDuck extends Duck {

    public MallardDuck(){
        //Quack = QuackBehavior 을 구현한 구상 클래스
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();

    }

    public void display(){
        System.out.println("저는 물오리 입니다.");
    }


}
