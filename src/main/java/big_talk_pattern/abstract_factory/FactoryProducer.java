package big_talk_pattern.abstract_factory;

/**
 * @program: designPrinciple -->FactoryProducer
 * @Description : <blue> 一个工厂创造器/生成器类，通过传递形状或颜色信息来获取工厂。</blue>
 * @author: lanwenquan
 * @creatTime: 2020-01-13 22 : 12
 **/

public class FactoryProducer {
    // 这个地方和之前的简单工厂模式相比，抽象层次更加往上一层了，之前是直接根据不同选择创建不同工厂类
    // 基于简单工厂模式，增加了一系列 产品族 (SHAPE、COLOR等等)
    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();
        } else if(choice.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }
        return null;
    }
}
