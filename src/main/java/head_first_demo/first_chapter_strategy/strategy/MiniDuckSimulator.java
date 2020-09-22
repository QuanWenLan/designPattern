package head_first_demo.first_chapter_strategy.strategy;

/**
 * @program: designPrinciple -->MiniDuckSimulator
 * @Description : <blue>Simulator: 模拟器，假装者</blue>
 * @author: lanwenquan
 * @creatTime: 2019-12-11 22 : 34
 **/

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.performQuack();
        mallardDuck.performFly();

        Duck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();
    }
}
