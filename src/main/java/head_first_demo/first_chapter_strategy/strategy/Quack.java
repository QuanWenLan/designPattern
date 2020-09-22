package head_first_demo.first_chapter_strategy.strategy;

/**
 * @program: designPrinciple -->Quack
 * @Description : <blue></blue>
 * @author: lanwenquan
 * @creatTime: 2019-12-11 22 : 11
 **/

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("I am real quacking!");
    }
}
