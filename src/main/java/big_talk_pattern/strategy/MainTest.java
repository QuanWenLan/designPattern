package big_talk_pattern.strategy;

/**
 * @program: designPrinciple->MainTest
 * @description:
 * @author: lanwenquan
 * @date: 2022-11-28 20:57
 */
public class MainTest {
    public static void main(String[] args) {
        Context context;
        context = new Context(new ConcreteStrategyA());
        context.concreteAlgorithmInterface();
        context = new Context(new ConcreteStrategyB());
        context.concreteAlgorithmInterface();
        context = new Context(new ConcreteStrategyC());
        context.concreteAlgorithmInterface();
    }
}
