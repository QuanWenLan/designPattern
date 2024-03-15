package big_talk_pattern.decorator;

/**
 * @program: designPrinciple->Test
 * @description:
 * @author: lanwenquan
 * @date: 2022-11-28 22:26
 */
public class Test {
    public static void main(String[] args) {
        ConcreteComponent c = new ConcreteComponent();
        Decorator d1 = new ConcreteDecoratorA();
        Decorator d2 = new ConcreteDecoratorB();

        d1.setComponent(c);
        d2.setComponent(d1);
        d2.operation();
        /**
         * 装饰的方法：首先用 ConcreteComponent 实例化对象 c，然后用 d1 包装 c，再用 d2 包装 d1，最终执行 d2.operation()
         * 每个装饰对象只关心自己的功能，不需要关心如何被添加到对象链中。
         */
    }
}
