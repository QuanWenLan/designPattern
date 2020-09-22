package head_first_demo.first_chapter_strategy.strategy;

/**
 * @program: designPrinciple -->FlyRocketPowered
 * @Description : <blue>用来推动 modelDuck 飞行</blue>
 * @author: lanwenquan
 * @creatTime: 2019-12-11 22 : 33
 **/

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I am flying with rocket!");
    }
}
