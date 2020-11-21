package Decorate;

public class Espresso extends Beverage{
    Beverage beverage;
    public Espresso(){
        description = "Espresso";
        this.cost = 5000;
    }

    @Override
    public double cost() {

        if(getSize() == "tall"){
            return cost;
        }else if(getSize() == "grande"){
            cost += 500;
        }else if(getSize() == "venti"){
            cost +=1000;
        }
        return cost;
    }

    @Override
    public String getSize() {
        return size;
    }

    @Override
    public void setSize(String size) {
       this.size = size;
    }
}
