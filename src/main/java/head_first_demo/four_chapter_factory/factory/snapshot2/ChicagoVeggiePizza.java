package head_first_demo.four_chapter_factory.factory.snapshot2;

import head_first_demo.four_chapter_factory.factory.Pizza;

/**
 * @program: designPrinciple->ChicagoVeggiePizza
 * @description:
 * @author: lanwenquan
 * @date: 2020-03-22 16:29
 */
public class ChicagoVeggiePizza extends Pizza {
    private ChicagoPizzaIngredientFactory pizzaIngredientFactory;

    public ChicagoVeggiePizza(ChicagoPizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    public ChicagoVeggiePizza() {
    }

    @Override
    public void prepare2() {
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        veggies = pizzaIngredientFactory.createVeggies();
        cheese = pizzaIngredientFactory.createCheese();
        clams = pizzaIngredientFactory.createClams();
    }

    @Override
    public void bake() {
        System.out.println("ChicagoVeggiePizza...bake()");
    }

    @Override
    public void cut() {
        System.out.println("ChicagoVeggiePizza...cut()");
    }

    @Override
    public void box() {
        System.out.println("ChicagoVeggiePizza...box()");
    }
}
