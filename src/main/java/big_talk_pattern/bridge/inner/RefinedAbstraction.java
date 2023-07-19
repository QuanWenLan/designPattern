package big_talk_pattern.bridge.inner;

/**
 * @author Lan
 * @createTime 2023-07-19  09:59
 **/
public class RefinedAbstraction extends Abstraction {
    @Override
    public void operation() {
        implementor.operation();
    }
}
