package head_first_demo.second_chapter_observer.observer;

/**
 * @program: designPrinciple -->Subject
 * @Description : <blue>观察者模式-----主题对象（一个状态可变的对象）</blue>
 * @author: lanwenquan
 * @creatTime: 2019-12-15 15 : 39
 **/

public interface Subject {
    /*这两个方法是用来注册和删除观察者*/
    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    /*当主题状态改变时，方法调用，通知所有观察者*/
    void notifyObservers();
}
