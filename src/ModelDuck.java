import fly.FlyNoWay;

public class ModelDuck extends Duck {
    //DUCK 의 subclass
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior= new Quack();

    }

    @Override
    public void display() {
        System.out.println("I'm model duck");
    }


}
