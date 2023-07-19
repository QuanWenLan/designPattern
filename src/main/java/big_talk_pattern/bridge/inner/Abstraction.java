package big_talk_pattern.bridge.inner;

/**
 * @author Lan
 * @createTime 2023-07-19  09:57
 **/
public abstract class Abstraction {
    protected Implementor implementor;

    public abstract void operation();

    public Implementor getImplementor() {
        return implementor;
    }

    public void setImplementor(Implementor implementor) {
        this.implementor = implementor;
    }
}
