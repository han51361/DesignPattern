package Observer;

import Observer.display.CurrentConditionsDisplay;
import Observer.display.ForecastDisplay;
import Observer.display.StaticsDisplay;

public class WeatherStation {
    public static void main(String[] args){

        WeatherData weatherData = new WeatherData(); //WheatherData 객체 생성

        // 세개의 디스플레이를 생성하면서 WeatherData 객체를 인자로 전달한다.
        CurrentConditionsDisplay currentConditionsDisplay =
                new CurrentConditionsDisplay(weatherData);

        StaticsDisplay staticsDisplay = new StaticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(80,65,30.4f);
        weatherData.setMeasurements(75,70,29.2f);
        weatherData.setMeasurements(90,90,29.2f);

    }


}
