package FactoryPattern;

import FactoryPattern.ChicagoStylePizza.CCGorgonzola;
import FactoryPattern.ChicagoStylePizza.CCPeperoni;
import FactoryPattern.ChicagoStylePizza.ChicagoStyleCheesePizza;
import FactoryPattern.PizzaMenu.CheesePizza;
import FactoryPattern.PizzaMenu.Gorgonzola;
import FactoryPattern.PizzaMenu.Peperoni;

public class CCPizzaFactory {
    public Pizza createPizza(String type){
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new ChicagoStyleCheesePizza();
        } else if (type.equals("peperoni")) {
            pizza = new CCPeperoni();
        } else if (type.equals("gorgonzola")) {
            pizza = new CCGorgonzola();
        }

        return pizza;
    }
}
