package head_first_demo.first_chapter_strategy.strategy;

/**
 * @program: designPrinciple -->MallardDuck
 * @Description : <blue></blue>
 * @author: lanwenquan
 * @creatTime: 2019-12-11 22 : 07
 **/

public class MallardDuck extends Duck {
    @Override
    public void display() {
        System.out.println("I am a real Mallard");
    }

    public MallardDuck () {
//        野鸭子真会飞也会叫
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
        // 以上这两个接口就是 策略
    }

    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();  // 利用了 多态  的特性 （运行时数据绑定）
        mallardDuck.performQuack();
        mallardDuck.performFly();
    }
}
