package head_first_demo.first_chapter_strategy.strategy;

/**
 * @program: designPrinciple -->FlyWithWings
 * @Description : <blue>用来给会飞的鸭子用</blue>
 * @author: lanwenquan
 * @creatTime: 2019-12-11 22 : 05
 **/

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying!");
    }
}
