package Observer.display;
import Observer.Observer;
import Observer.WeatherData;
import java.util.Observable;

public class CurrentConditionsDisplay implements Observer, DisplayElment, java.util.Observer {

    private float temperature;
    private float humidity;
    private float pressure;
    Observable observable;
    public CurrentConditionsDisplay(Observable observable) {
        // 생성자에 weatherdata라는 주제 객체가 전달되어 그 객체를 써서 디스플레이를 옵저버로 등
        this.observable = observable;
        observable.addObserver( this);
    }



    //이 디스플레이 항목에서는 weatherdata 객체로부터 얻은 현재 측정값들을 보여준다.
    public void display(){
        //현재 측정값을 화면에 표시
        System.out.println("Current Condition : "+ temperature + "F degree : "+ humidity + "% humidity");
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData){
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }
}
