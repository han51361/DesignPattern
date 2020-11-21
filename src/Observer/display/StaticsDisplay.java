package Observer.display;
import Observer.Subject;
import Observer.Observer;
import Observer.WeatherData;
import java.util.Observable;


public class StaticsDisplay implements Observer, java.util.Observer {
    private float temperature;
    private float humidity;
    private float pressure;
    Observable observable;
    // 여기에서는 측정치의 최소값/평균/최대값을 추적하고 화면에 표시한다.

    public StaticsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver( this);
    }


    public void display() {
        //평균,최저,최고치 표시
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }
}
