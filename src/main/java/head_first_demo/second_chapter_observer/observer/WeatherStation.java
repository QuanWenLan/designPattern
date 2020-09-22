package head_first_demo.second_chapter_observer.observer;

/**
 * @program: designPrinciple -->WeatherStation
 * @Description : <blue>气象站测试类</blue>
 * @author: lanwenquan
 * @creatTime: 2019-12-24 21 : 35
 **/

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        // 注册观察者，构造器中初始化（当前天气状况布控板）
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

//        weatherData.setMeasurements(80, 65, 34.0f);
        weatherData.setMeasurements(82, 70, 29.2f);
    }
}
