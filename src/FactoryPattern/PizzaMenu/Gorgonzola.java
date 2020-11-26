package FactoryPattern.PizzaMenu;

import FactoryPattern.Pizza;
import FactoryPattern.PizzaIngredientFactory;

public class Gorgonzola extends Pizza {
    PizzaIngredientFactory ingredientFactory;
    public Gorgonzola(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory =ingredientFactory;
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
