package head_first_demo.four_chapter_factory.factory.snapshot2;

import head_first_demo.four_chapter_factory.factory.Pizza;

/**
 * @program: designPrinciple->ChicagoCheesePizza
 * @description:
 * @author: lanwenquan
 * @date: 2020-03-22 16:28
 */
public class ChicagoCheesePizza extends Pizza {

    @Override
    public void prepare2() {

    }

    @Override
    public void bake() {
        System.out.println("ChicagoCheesePizza...bake()");
    }

    @Override
    public void cut() {
        System.out.println("ChicagoCheesePizza...cut()");
    }

    @Override
    public void box() {
        System.out.println("ChicagoCheesePizza...box()");
    }
}
