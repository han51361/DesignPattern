package Decorate;

public abstract class Beverage {
    String description = "제목 없음";
    String size;
    double cost;
    public String getDescription() {
        return description;
    }
    public abstract double cost(); //추상 클래스 / 서브 클래스에서 구현해야한다.

    public abstract String  getSize();

    public abstract void setSize(String size);

}
