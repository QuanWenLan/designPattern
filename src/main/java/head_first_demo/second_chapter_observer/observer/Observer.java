package head_first_demo.second_chapter_observer.observer;

/**
 * @program: designPrinciple -->Observer
 * @Description : <blue>观察者模式-----观察者</blue>
 * @author: lanwenquan
 * @creatTime: 2019-12-15 15 : 40
 **/

public interface Observer {
    void update(float temp, float humidity, float pressure);
}
