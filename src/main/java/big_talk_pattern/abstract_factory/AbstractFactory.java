package big_talk_pattern.abstract_factory;

/**
 * @program: designPrinciple -->AbstractFactory
 * @Description : <blue>为 Color 和 Shape 对象创建抽象类来获取工厂</blue>
 * @author: lanwenquan
 * @creatTime: 2020-01-13 22 : 07
 **/

public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape) ;
}
