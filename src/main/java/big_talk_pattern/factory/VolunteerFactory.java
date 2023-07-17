package big_talk_pattern.factory;

/**
 * @program: designPrinciple->VolunteerFactory
 * @description: 学雷锋的社区志愿者工厂
 * @author: lanwenquan
 * @date: 2022-11-30 21:51
 */
public class VolunteerFactory implements IFactory {
    @Override
    public LeiFeng createLeiFeng() {
        return new Volunteer();
    }
}
