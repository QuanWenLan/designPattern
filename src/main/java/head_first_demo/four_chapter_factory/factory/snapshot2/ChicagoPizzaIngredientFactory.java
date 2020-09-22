package head_first_demo.four_chapter_factory.factory.snapshot2;

import head_first_demo.four_chapter_factory.factory.*;

/**
 * @program: designPrinciple->NYPizzaIngredientFactory
 * @description:
 * @author: lanwenquan
 * @date: 2020-03-22 18:30
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new Dough();
    }

    @Override
    public Sauce createSauce() {
        return new Sauce();
    }

    @Override
    public Cheese createCheese() {
        return new Cheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[0];
    }

    @Override
    public Clams createClams() {
        return new Clams();
    }
}
