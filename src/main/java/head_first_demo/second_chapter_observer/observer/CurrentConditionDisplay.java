package head_first_demo.second_chapter_observer.observer;

/**
 * @program: designPrinciple -->CurrentConditionDisplay
 * @Description : <blue>观察者实现</blue>
 * @author: lanwenquan
 * @creatTime: 2019-12-15 16 : 26
 **/

public class CurrentConditionDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherData;

    // 传递进来的参数是一个接口，面向接口编程，数据改变的主题对象
    public CurrentConditionDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current Conditions: "+ temperature + "F degrees and "+ humidity + "% humidity and pressure "+ pressure);
    }
}
