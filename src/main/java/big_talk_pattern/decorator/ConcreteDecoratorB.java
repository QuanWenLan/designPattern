package big_talk_pattern.decorator;

/**
 * @program: designPrinciple->ConcreteDecorator
 * @description:
 * @author: lanwenquan
 * @date: 2022-11-28 22:22
 */
public class ConcreteDecoratorB extends Decorator {

    @Override
    public void operation() {
        super.operation();
        addedBehavior();
        System.out.println("具体装饰对象A的操作");
    }

    public void addedBehavior() {
        System.out.println("装饰对象B独有的方法");
    }
}
