package Decorate;

public class ColdBrew extends Beverage {


    public ColdBrew(){
        description = "ColdBrew";
        size = "tall";
        cost = 6500;
    }


    @Override
    public double cost() {

        if(getSize().equals("tall")){
            return cost;
        }else if(getSize().equals("grande")){
            cost += 500;
        }else if(getSize().equals("venti")){

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
