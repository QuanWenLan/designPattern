package head_first_demo.four_chapter_factory.factory;

/**
 * @program: designPrinciple->Pizza
 * @description: 披萨
 * @author: lanwenquan
 * @date: 2020-03-19 22:21
 */
public abstract class Pizza {
    protected String name;
    protected Dough dough;
    protected Sauce sauce;
    protected Veggies[] veggies;
    protected Cheese cheese;
    protected Clams clams;

    public void prepare() {
        // 一个公共方法
        System.out.println("prepare()...");
    }
    // 制作pizza的原材料，各个地方的加盟店使用的不同，那就要用不同的地方的原材料来准备pizza的制作，此时需要将prepare()
//    作为一个抽象方法来实现
    public abstract void prepare2();

    public abstract void bake();
    public abstract void cut();
    public abstract void box();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
