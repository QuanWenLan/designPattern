package head_first_demo.four_chapter_factory.factory.snapshot2;

import head_first_demo.four_chapter_factory.factory.Pizza;

/**
 * @program: designPrinciple->PizzaStore
 * @description: 披萨店，售卖披萨，接受披萨预定
 * @author: lanwenquan
 * @date: 2020-03-19 22:17
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
//        pizza.prepare();
        pizza.prepare2();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    /*
    * 工厂方法是抽象的，所以依赖子类来处理对象创建。
    * 工厂方法必须返回一个产品
    * */
    public abstract Pizza createPizza(String type);

    public static void main(String[] args) {
        // 由顾客决定要哪种风味的pizza
        ChicagoPizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        Pizza chess = chicagoPizzaStore.orderPizza("veggie");

    }
}
