package FactoryPattern.ChicagoStylePizza;

import FactoryPattern.Pizza;

public class CCPeperoni extends Pizza {
    public CCPeperoni() {
        name = "Chicago Style Deap Dish Peperoni Pizza";
        dough = "Extra THick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
    }

    @Override
    public void cut(){
        System.out.println("Cutting the Pizza into square slices");
    }
    }

