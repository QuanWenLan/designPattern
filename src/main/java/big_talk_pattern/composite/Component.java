package big_talk_pattern.composite;

/**
 * @program: designPrinciple->Component
 * @description: 组合中的对象声明接口
 * @author: lanwenquan
 * @date: 2022-12-05 21:55
 */
public abstract class Component {
    protected String name;

    public Component() {

    }

    public Component(String name) {
        this.name = name;
    }

    /**
     * 增加或删除树枝的功能
     */
    public abstract void add(Component component);

    public abstract void remove(Component component);

    public abstract void display(int depth);
}
