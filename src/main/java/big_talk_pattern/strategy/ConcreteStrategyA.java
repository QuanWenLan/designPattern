package big_talk_pattern.strategy;

/**
 * @program: designPrinciple->ConcreteStrategyA
 * @description: 具体算法A
 * @author: lanwenquan
 * @date: 2022-11-28 20:52
 */
public class ConcreteStrategyA extends Strategy {
    @Override
    public void algorithmInterface() {
        System.out.println("算法A实现！");
    }
}
