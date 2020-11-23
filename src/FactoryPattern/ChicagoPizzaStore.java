package FactoryPattern;

import FactoryPattern.ChicagoStylePizza.CCGorgonzola;
import FactoryPattern.ChicagoStylePizza.CCPeperoni;
import FactoryPattern.ChicagoStylePizza.ChicagoStyleCheesePizza;
import FactoryPattern.NYStylePizza.NYStyleCheesePizza;
import FactoryPattern.NYStylePizza.NYStyleGorgonzola;
import FactoryPattern.NYStylePizza.NYStylePeperoni;

public class ChicagoPizzaStore extends PizzaStore{
    Pizza pizza;
    @Override
    public Pizza createPizza(String type) {
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

