package head_first_demo.first_chapter_strategy.strategy;

/**
 * @program: designPrinciple -->FlyNoWay
 * @Description : <blue>用来给不会飞的鸭子用（不是所有的鸭子都会飞）</blue>
 * @author: lanwenquan
 * @creatTime: 2019-12-11 22 : 05
 **/

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly!");
    }
}
