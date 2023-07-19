package big_talk_pattern.prototype;

/**
 * @author Lan
 * @createTime 2023-07-18  15:52
 **/
public class ConcretePrototype1 extends Prototype {

    public ConcretePrototype1(String id) {
        super(id);
    }

    @Override
    public Prototype cloneObj() {
        return new ConcretePrototype1(getId());
    }

    @Override
    public String toString() {
        return "ConcretePrototype1{" +
                "id='" + id + '\'' +
                '}';
    }
}
