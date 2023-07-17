package big_talk_pattern.factory;

/**
 * @program: designPrinciple->UndergraduateFactory
 * @description: 学雷锋的大学生工厂
 * @author: lanwenquan
 * @date: 2022-11-30 21:51
 */
public class UndergraduateFactory implements IFactory {
    @Override
    public LeiFeng createLeiFeng() {
        return new Undergraduate();
    }
}
