package head_first_demo.second_chapter_observer.observer.viaJdk;

import java.util.Observable;

/**
 * @program: designPrinciple -->WeatherData2
 * @Description : <blue>可观察对象</blue>
 * @author: lanwenquan
 * @creatTime: 2020-01-01 21 : 56
 **/

public class WeatherData2 extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData2() {
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void measurementsChanged() {
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
