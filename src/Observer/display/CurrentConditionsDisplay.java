package Observer.display;
import Observer.Subject;
import Observer.Observer;

import java.util.Observable;

public class CurrentConditionsDisplay  implements Observer,DisplayElment{

    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        // 생성자에 weatherdata라는 주제 객체가 전달되어 그 객체를 써서 디스플레이를 옵저버로 등
        this.weatherData = weatherData;
        weatherData.registerObserver( this);
    }


    public void update(float temp, float humidity, float pressure) {
        this.temperature =temp;
        this.humidity = humidity;
        display();
    }
    //이 디스플레이 항목에서는 weatherdata 객체로부터 얻은 현재 측정값들을 보여준다.
    public void display(){
        //현재 측정값을 화면에 표시
        System.out.println("Current Condition : "+ temperature + "F degree : "+ humidity + "% humidity");
    }
}
