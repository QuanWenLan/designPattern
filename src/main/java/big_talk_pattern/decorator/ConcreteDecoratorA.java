package big_talk_pattern.decorator;

/**
 * @program: designPrinciple->ConcreteDecorator
 * @description:
 * @author: lanwenquan
 * @date: 2022-11-28 22:22
 */
public class ConcreteDecoratorA extends Decorator {
    /**
     * 本类独有的功能，区别越
     */
    private String addedState;
    @Override
    public void operation() {
        super.operation();
        addedState = "new state";
        System.out.println("设置 state 为: " + addedState);
        System.out.println("具体装饰对象A的操作");
    }
}
