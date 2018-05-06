import com.zt.WeatherData;
import com.zt.observer.impl.CurrentConditionDisplay;

public class Main {

    public static void main(String[] args) {
        WeatherData weatherData=new WeatherData();
        CurrentConditionDisplay currentConditionDisplay=new CurrentConditionDisplay(weatherData);
        weatherData.setData(80,76,30.4f);
    }
}
