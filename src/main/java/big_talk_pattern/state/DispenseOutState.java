package big_talk_pattern.state;

/**
 * @program: designPrinciple->DispenseOutState
 * @description: 奖品发放完的状态，活动停止
 * @author: lanwenquan
 * @date: 2022-12-04 14:53
 */
public class DispenseOutState implements State {
    private Activity activity;

    public DispenseOutState() {
    }

    public DispenseOutState(Activity activity) {
        this.activity = activity;
    }

    @Override
    public void deduceMoney() {
        System.out.println("奖品发送完了，请下次参加！");
    }

    @Override
    public boolean raffle() {
        System.out.println("奖品发送完了，请下次参加！");
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("奖品发送完了，请下次参加！");
    }
}
