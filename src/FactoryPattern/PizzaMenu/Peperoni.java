package FactoryPattern.PizzaMenu;

import FactoryPattern.Pizza;
import FactoryPattern.PizzaIngredientFactory;

public class Peperoni extends Pizza {
    PizzaIngredientFactory ingredientFactory;
    public Peperoni(PizzaIngredientFactory ingredientFactory) {
    this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing"+ name);
        dough = ingredientFactory.createDough();
        cheese = ingredientFactory.createCheese();
        sauce = ingredientFactory.createSauce();
        clam = ingredientFactory.createClam();
    }
}
