package FactoryPattern;

public class orderPizza {
    Pizza orderPizza(String type) {
        //유연성을 감안하여 추상클래스나 인터페이스로 만들면 좋겟지만 추상 클래스나 인터페이스는 직접 인스턴스를 만들 수 없다.
        Pizza pizza = new Pizza();

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;

    }


}
