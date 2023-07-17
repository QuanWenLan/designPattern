package big_talk_pattern.state;

/**
 * @program: designPrinciple->NoRaffleState
 * @description: 不能抽奖的状态
 * @author: lanwenquan
 * @date: 2022-12-04 14:52
 */
public class NoRaffleState implements State {

    private Activity activity;

    public NoRaffleState() {
    }

    public NoRaffleState(Activity activity) {
        this.activity = activity;
    }

    /**
     * 当前状态可以扣积分，但是不能抽奖
     */
    @Override
    public void deduceMoney() {
        System.out.println("扣除积分 50 成功，您可以抽奖了！");
        activity.setState(activity.getCanRaffleState());
    }

    /**
     * 当前状态不能抽奖
     *
     * @return
     */
    @Override
    public boolean raffle() {
        System.out.println("扣了积分才能抽奖哦！");
        return false;
    }

    /**
     * 当前状态不能发放奖品
     */
    @Override
    public void dispensePrize() {
        System.out.println("未扣积分，不能发放奖品！");
    }
}
