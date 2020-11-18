package Observer.display;

import Observer.Observer;

public class ThirdPartytDisplay implements Observer {

    //확장성을 위하여 다른 개발자들이 옵저버와 디스플레이 인터페이스를 구현하여 새로운 디스플레이를 만들수잇게함.
    @Override
    public void update(float temp, float humidity, float pressure) {

    }

    public void display(){

    }
}
