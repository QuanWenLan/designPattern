package big_talk_pattern.bridge.inner;

/**
 * @author Lan
 * @createTime 2023-07-19  09:56
 **/
public class ConcreteBImplementor extends Implementor {
    @Override
    public void operation() {
        System.out.println("具体实现B的方法执行");
    }
}
