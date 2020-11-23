package FactoryPattern.ChicagoStylePizza;

import FactoryPattern.Pizza;

public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza() {
        name = "Chicago Style Deap Dish Cheese Pizza";
        dough = "Extra THick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
    }

    @Override
    public void cut(){
        System.out.println("Cutting the Pizza into square slices");
    }
}
