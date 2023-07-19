package big_talk_pattern.bridge.inner;

/**
 * @author Lan
 * 第二个具体实现
 * @createTime 2023-07-19  09:59
 **/
public class RefinedAbstraction2 extends Abstraction {
    @Override
    public void operation() {
        implementor.operation();
    }
}
