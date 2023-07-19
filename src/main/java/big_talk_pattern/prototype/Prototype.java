package big_talk_pattern.prototype;

/**
 * @author Lan
 * @createTime 2023-07-18  15:51
 **/
public abstract class Prototype {
    public Prototype(String id) {
        this.id = id;
    }

    protected String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * 关键就是有这样一个方法
     */
    public abstract Prototype cloneObj();
}
