package Observer.display;
import Observer.Subject;
import Observer.Observer;



public class StaticsDisplay implements Observer{
    // 여기에서는 측정치의 최소값/평균/최대값을 추적하고 화면에 표시한다.
    private Subject weatherData;
    public StaticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {

    }

    public void display(){
        //평균,최저,최고치 표시
    }
}
