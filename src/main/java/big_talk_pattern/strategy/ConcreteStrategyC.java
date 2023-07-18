package big_talk_pattern.strategy;

/**
 * @program: designPrinciple->ConcreteStrategyA
 * @description: 具体算法C
 * @author: lanwenquan
 * @date: 2022-11-28 20:52
 */
public class ConcreteStrategyC extends Strategy {
    @Override
    public void algorithmInterface() {
        System.out.println("算法C实现！");
    }
}
