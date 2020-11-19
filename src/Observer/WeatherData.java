package Observer;

/*

출판사(주재) + 구독자(옵저버) = 옵저버 페턴
옵저버 패턴에서 일련의 객체들 사이에서 1:다 관계를 정의
한 객체의 상태가 변경되면 그 객체에 의존하는 모든 객체에 연락 간다.

*/

import java.util.ArrayList;


public class WeatherData implements Subject{
// weatherdata 에서 subject 인터페이스를 구현

    //인스턴스 변수 선언
    private ArrayList observers; // observer 객체들을 저장하기 위해
    private float temperature;
    private float humidity;
    private float pressure;


//    getTemperature();
//    getHumidity();
//    getPressure();

    public WeatherData() {
        this.observers = new ArrayList();
    }


    //세가지 메소드는 각각 가장 최근의 측정된 온도,습도,기압 을 리턴하는 메소드,




    public void registerObserver(Observer o) {
        observers.add(o); //옵저버 추가시 목록 맨뒤로 추가
    }


    public void removeObserver(Observer o) {
        //옵저버 탈퇴신
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }





    @Override
    public void notifyObservers() {
            // 상태에 대하여 옵저버들에게 알려주는 부분
        // 두 옵저버 인터페이스를 구현하는, 즉 update() 메소드가 잇는 객체들이므로 쉽게 알려줄 수 있다.
        for(int i =0;i <observers.size();i++){
            Observer observer = (Observer)observers.get(i);
            observer.update(temperature,humidity,pressure);
        }
    }

    public void measurementsChanged(){
        //기상 관측값이 갱신 될 때마다 알려주기 위한 메소드
        // weather data 의 게터메소드를 써서 최신 측정값을 가져온다.
    notifyObservers();
    }

    public void setMeasurements(float temp, float humidity, float pressure ){
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }


}
