package head_first_demo.first_chapter_strategy.strategy;

/**
 * @program: designPrinciple -->MuteQuack
 * @Description : <blue></blue>
 * @author: lanwenquan
 * @creatTime: 2019-12-11 22 : 12
 **/

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<< silence >>");
    }
}
