package FactoryPattern;
import java.util.ArrayList;

public abstract class Pizza {
  public String name;
  public Dough dough;
  public Sauce sauce;
  Veggies veggies[];
  public Cheese cheese;
  Pepperoni pepperoni;
  public Clams clam;


  public ArrayList toppings = new ArrayList();


    public abstract void prepare();

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

  public  void setName(String name){
      this.name = name;
  };
}
