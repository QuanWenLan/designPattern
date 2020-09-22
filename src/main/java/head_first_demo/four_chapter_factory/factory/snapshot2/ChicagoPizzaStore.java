package head_first_demo.four_chapter_factory.factory.snapshot2;

import head_first_demo.four_chapter_factory.factory.Pizza;

/**
 * @program: designPrinciple->ChicagoPizzaStore
 * @description: 芝加哥风味的pizza
 * @author: lanwenquan
 * @date: 2020-03-22 16:27
 */
public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        ChicagoPizzaIngredientFactory chicagoPizzaIngredientFactory = new ChicagoPizzaIngredientFactory();
        Pizza pizza = null;
        if ("cheese".equals(type)) {
            return new ChicagoCheesePizza();
        } else if ("veggie".equals(type)) {
            pizza = new ChicagoVeggiePizza(chicagoPizzaIngredientFactory);
            pizza.setName("chicago veggie pizza");
            return pizza;
//            return new ChicagoVeggiePizza();
        } else {
            return null;
        }
    }
}
