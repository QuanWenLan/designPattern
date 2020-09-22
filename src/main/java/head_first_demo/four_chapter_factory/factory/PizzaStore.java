package head_first_demo.four_chapter_factory.factory;

/**
 * @program: designPrinciple->PizzaStore
 * @description: 披萨店，售卖披萨，接受披萨预定
 * @author: lanwenquan
 * @date: 2020-03-19 22:17
 */
public class PizzaStore {
    // 披萨店要有一个生产披萨的工厂
    private PizzaFactory pizzaFactory;

    public PizzaStore(PizzaFactory pizzaFactory) {
        this.pizzaFactory = pizzaFactory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza = pizzaFactory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore(new PizzaFactory());
        Pizza cheese = pizzaStore.orderPizza("cheese");
        // createPizza(type);
        /**
         * 升级：将此方法定义为一个抽象方法，各个地市的加盟披萨店继承这个PizzaStore，然后由具体的子类决定需要创建哪种的Pizza
         */
    }
}
