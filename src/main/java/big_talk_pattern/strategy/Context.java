package big_talk_pattern.strategy;

/**
 * @program: designPrinciple->Context
 * @description: 策略上下文
 * @author: lanwenquan
 * @date: 2022-11-28 20:54
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public Context() {
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 具体的算法
     */
    public void concreteAlgorithmInterface() {
        // 做一些相同的操作
        strategy.algorithmInterface();
        // 做一些相同的操作
    }
}
