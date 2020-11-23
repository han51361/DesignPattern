package FactoryPattern;

import FactoryPattern.NYStylePizza.NYStyleCheesePizza;
import FactoryPattern.NYStylePizza.NYStyleGorgonzola;
import FactoryPattern.NYStylePizza.NYStylePeperoni;
import FactoryPattern.PizzaMenu.CheesePizza;
import FactoryPattern.PizzaMenu.Gorgonzola;
import FactoryPattern.PizzaMenu.Peperoni;

public class NYPizzaFactory {
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new NYStyleCheesePizza();
        } else if (type.equals("peperoni")) {
            pizza = new NYStylePeperoni();
        } else if (type.equals("gorgonzola")) {
            pizza = new NYStyleGorgonzola();
        }

        return pizza;
    }
}