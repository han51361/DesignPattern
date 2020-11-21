package Observer.display;
import Observer.Subject;
import Observer.Observer;
import Observer.WeatherData;
import java.util.Observable;


public class ForecastDisplay implements Observer, DisplayElment, java.util.Observer {
    // 픅정치를 바탕으로 기상 예보를 화면에서 보여준다.
    Observable weatherData;
    private float temperature;
    private float humidity;
    private float pressure;

    public ForecastDisplay(Observable weatherData) {
        this.weatherData = weatherData;
        weatherData.addObserver( this);
    }


    public void display() {
        //기상 예보 표시
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