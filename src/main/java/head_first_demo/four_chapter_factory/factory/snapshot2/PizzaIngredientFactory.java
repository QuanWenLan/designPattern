package head_first_demo.four_chapter_factory.factory.snapshot2;

import head_first_demo.four_chapter_factory.factory.*;

public interface PizzaIngredientFactory {
    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Veggies[] createVeggies();
    Clams createClams();
}
