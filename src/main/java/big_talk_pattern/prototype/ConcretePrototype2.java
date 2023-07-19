package big_talk_pattern.prototype;

/**
 * @author Lan
 * @createTime 2023-07-18  15:52
 **/
public class ConcretePrototype2 extends Prototype {

    public ConcretePrototype2(String id) {
        super(id);
    }

    @Override
    public Prototype cloneObj() {
        return new ConcretePrototype2(getId());
    }

    @Override
    public String toString() {
        return "ConcretePrototype2{" +
                "id='" + id + '\'' +
                '}';
    }
}
