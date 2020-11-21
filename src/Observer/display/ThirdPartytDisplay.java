package Observer.display;

import Observer.Observer;

import java.util.Observable;

public class ThirdPartytDisplay implements Observer {

    //확장성을 위하여 다른 개발자들이 옵저버와 디스플레이 인터페이스를 구현하여 새로운 디스플레이를 만들수잇게함.


    public void display(){

    }

    @Override
    public void update(Observable o, Object arg) {

    }
}
