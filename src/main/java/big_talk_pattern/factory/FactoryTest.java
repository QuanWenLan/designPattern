package big_talk_pattern.factory;

/**
 * @program: designPrinciple->FactoryTest
 * @description:
 * @author: lanwenquan
 * @date: 2022-11-30 21:56
 */
public class FactoryTest {
    public static void main(String[] args) {
//        IFactory fa = new UndergraduateFactory();
        IFactory fa = new VolunteerFactory();
        LeiFeng leiFeng = fa.createLeiFeng();

        leiFeng.buyRice();
        leiFeng.sweep();
        leiFeng.wash();
        // 如果要换成志愿者学习雷锋，则只需要换 factory 即可，不需要改变后面的代码
        // 工厂方法克服了简单工厂违背 开放-封闭 原则，又保持了封装对象创建过程的优点
    }
}
