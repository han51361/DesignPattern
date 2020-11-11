package DuckPackage;

import fly.FlyBehavior;

public abstract class Duck {
    //행동 인터페이스 형식의 레퍼런스 변수 두개 선언
//    모든 서브클래스에서 이 변수를 상속받는다.
    QuackBehavior quackBehavior;
    FlyBehavior flyBehavior;

    public Duck() {
    }

    public void performQuack(){
        //행동 클래스에게 위임
        quackBehavior.quack();
    }



    public void swim(){
        System.out.println("오리는 물에뜬다. 가짜오리도 포함하여");
    }
    public abstract void display();

    public void performFly(){
        flyBehavior.fly(); //행동 클래스에 위임
    }


    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior = fb; //동적으로 움직일 수 있는 오리를 만든다.
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior; //getter 와 setter를 통해 동적인 오리를 만든다.
    }
}
