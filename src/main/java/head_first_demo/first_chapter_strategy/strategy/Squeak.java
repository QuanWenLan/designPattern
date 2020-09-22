package head_first_demo.first_chapter_strategy.strategy;

/**
 * @program: designPrinciple -->Squeak
 * @Description : <blue>Squeak: 吱吱声</blue>
 * @author: lanwenquan
 * @creatTime: 2019-12-11 22 : 13
 **/

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
