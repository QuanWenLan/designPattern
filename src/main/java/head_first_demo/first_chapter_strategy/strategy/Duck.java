package head_first_demo.first_chapter_strategy.strategy;

/**
 * @program: designPrinciple -->Duck
 * @Description : <blue>参考《head first设计模式》第一章节入门</blue>  鸭子的超类
 * @author: lanwenquan
 * @creatTime: 2019-12-11 21 : 53
 **/

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public abstract void display();

    /*委托给行为类*/
    public void performQuack() {
        quackBehavior.quack();
    }

    /*委托给行为类*/
    public void performFly() {
        flyBehavior.fly();
    }

    /*动态的设置各种子类的不同行为 */
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void swim() {
        System.out.println("all ducks float, even decoys!");
    }
}
