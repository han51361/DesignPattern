package FactoryPattern;

public abstract class PizzaStore {

    public Pizza orderPizza(String type){
        //팩토리를 사용하여 피자 객체를 만든다. 주문 받은 형식을 전달만 하면 끝
        Pizza pizza;
        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    abstract Pizza createPizza(String type);

    //기타 메소드
}
