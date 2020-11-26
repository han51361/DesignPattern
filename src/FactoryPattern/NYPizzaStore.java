package FactoryPattern;

import FactoryPattern.NYStylePizza.NYStyleCheesePizza;
import FactoryPattern.NYStylePizza.NYStyleGorgonzola;
import FactoryPattern.NYStylePizza.NYStylePeperoni;
import FactoryPattern.PizzaMenu.CheesePizza;
import FactoryPattern.PizzaMenu.Gorgonzola;
import FactoryPattern.PizzaMenu.Peperoni;
import FactoryPattern.PizzzaIngredientFactory.NYPizzaIngredientFactory;

public class NYPizzaStore extends PizzaStore {
    protected Pizza createPizza(String item){
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory =
                new NYPizzaIngredientFactory();

        if(item.equals("cheese")){
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Cheese Pizza");
        }else if(item.equals("veggie")){
            pizza = new Gorgonzola(ingredientFactory);
            pizza.setName("Veggies gorgonzola Pizza");
        }else if(item.equals("clam")){
            pizza =new Gorgonzola(ingredientFactory);
            pizza.setName("Clam gorgonzola Pizza");
        }else if(item.equals("pepperoni")){
            pizza = new Peperoni(ingredientFactory);
            pizza.setName("NY Pepperoni Pizza");
        }
        return pizza;
    }


}
