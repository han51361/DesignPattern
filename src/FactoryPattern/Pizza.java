package FactoryPattern;
import java.util.ArrayList;

public abstract class Pizza {
  String name;
  Dough dough;
  Sauce sauce;
  Veggies veggies[];
  Cheese cheese;
  Pepperoni pepperoni;
  Clams clam;


  public ArrayList toppings = new ArrayList();


    public void prepare(){
        System.out.println("Preparing :"+ name);
        System.out.println("Tossing dough");
        System.out.println("Adding sauce");
        System.out.println("Adding topping : ");
        for(int i =0; i<toppings.size();i++){
            System.out.println("    "+ toppings.get(i));
        }
    }
    public void bake(){
        System.out.println("Bake for 25 min at 350");
    }
    public void cut(){
        System.out.println("Cutting the pizza into diagonal slices");
    }
    public void box(){
        System.out.println("Place pizza in official PizzaStore BOX");
    }

    public String getName(){
        return name;
    }

}
