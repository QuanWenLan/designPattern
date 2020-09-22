package head_first_demo.second_chapter_observer.observer;

/**
 * @program: designPrinciple -->StatisticsDisplay
 * @Description : <blue>统计面板</blue>
 * @author: lanwenquan
 * @creatTime: 2020-01-01 16 : 26
 **/

public class StatisticsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("StatisticsDisplay Conditions: "+ temperature + "F degrees and "+ humidity + "% humidity and pressure "+ pressure);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
