package big_talk_pattern.state;

/**
 * @program: designPrinciple->DispensePrize
 * @description: 发放奖品的状态
 * @author: lanwenquan
 * @date: 2022-12-04 14:53
 */
public class DispensePrizeState implements State {

    private Activity activity;

    public DispensePrizeState() {
    }

    public DispensePrizeState(Activity activity) {
        this.activity = activity;
    }

    @Override
    public void deduceMoney() {
        System.out.println("不能发放奖品！");
    }

    @Override
    public boolean raffle() {
        System.out.println("不能抽奖！");
        return false;
    }

    @Override
    public void dispensePrize() {
        if (activity.getCount() > 0) {
            System.out.println("恭喜中奖！");
            // 改为不能抽奖的状态
            activity.setState(activity.getNoRaffleState());
        } else {
            System.out.println("奖品发放完了！");
            // 改为发放完的状态
            activity.setState(activity.getDispenseOutState());
        }
    }
}
