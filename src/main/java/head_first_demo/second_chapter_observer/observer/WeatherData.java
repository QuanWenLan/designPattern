package head_first_demo.second_chapter_observer.observer;

import java.util.ArrayList;

/**
 * @program: designPrinciple -->WeatherData
 * @Description : <blue>天气数据的观察类</blue>
 * @author: lanwenquan
 * @creatTime: 2019-12-15 14 : 42
 **/

public class WeatherData implements Subject {
    private ArrayList observers;   // 许多观察者
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList();
    }

    public float getTemperature() {
        return 0.1f;
    }

    public float getHumidity() {
        return 0.2f;
    }

    public float getPressure() {
        return 0.3f;
    }

    /*
     * 此方法是用来检测数据变化，一变化就会调用这个方法*/
    private void measurementsChanged() {
/*//        第一种实现监听三者数据的变化（温度，湿度，气压）
        float temperature = getTemperature();
        float humidity = getHumidity();
        float pressure = getPressure();

//        更新布告板*/

        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if (i > 0) {
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        for (Object observer : observers) {
            Observer o = (Observer) observer;
            o.update(temperature, humidity, pressure);
        }
    }

    public void setMeasurements(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
