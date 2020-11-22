package FactoryPattern;

public class SimplePizzaFactory {
    public Pizza createPizza(String type){
        Pizza pizza = null;
        if(type.equals("cheese")){
            pizza = new CheesePizza();
        }else if(type.equals("peperoni")){
            pizza = new Peperoni();
        }else if(type.equals("gorgonzola")){
            pizza = new Gorgonzola();
        }

        return pizza;
    }
}
