package head_first_demo.first_chapter_strategy.strategy;

/**
 * @program: designPrinciple -->ModelDuck
 * @Description : <blue></blue>
 * @author: lanwenquan
 * @creatTime: 2019-12-11 22 : 30
 **/

public class ModelDuck extends Duck {
    @Override
    public void display() {
        System.out.println("I am a real ModelDuck");
    }

    public ModelDuck () {
        quackBehavior = new Quack();
        flyBehavior = new FlyNoWay();   // modelDuck一开始是不会 飞 的
    }
}
