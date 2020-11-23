package FactoryPattern;

import FactoryPattern.NYStylePizza.NYStyleCheesePizza;
import FactoryPattern.NYStylePizza.NYStyleGorgonzola;
import FactoryPattern.NYStylePizza.NYStylePeperoni;

public class NYPizzaStore extends PizzaStore {


    @Override
   public  Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if (type.equals("peperoni")) {
            return new NYStylePeperoni();
        } else if (type.equals("gorgonzola")) {
           return new NYStyleGorgonzola();
        }else return null;

    }
}
