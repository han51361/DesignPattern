package Decorate;

public class Shot extends CondimentDecorator{
    Beverage beverage;

    public Shot(Beverage beverage) {
        this.beverage = beverage;
        this.size = beverage.size;
        this.cost = beverage.cost;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "add shot" ;
    }

    @Override
    public double cost() {
        return beverage.cost() + 1000;
    }

    @Override
    public String getSize() {
       return beverage.getSize();
    }

    @Override
    public void setSize(String size) {

    }
}
