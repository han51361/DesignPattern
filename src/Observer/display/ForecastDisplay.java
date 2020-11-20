package Observer.display;
import Observer.Subject;
import Observer.Observer;

import java.util.Observable;


public class ForecastDisplay implements Observer, DisplayElment {
    // 픅정치를 바탕으로 기상 예보를 화면에서 보여준다.
    private Subject weatherData;

    public ForecastDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver( this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {

    }


    public void display(){
        //기상 예보 표시
    }
}
