package big_talk_pattern.state;

import java.util.Random;

/**
 * @program: designPrinciple->CanRaffleState
 * @description: 能领奖的状态
 * @author: lanwenquan
 * @date: 2022-12-04 14:53
 */
public class CanRaffleState implements State {
    private Activity activity;

    public CanRaffleState() {
    }

    public CanRaffleState(Activity activity) {
        this.activity = activity;
    }

    @Override
    public void deduceMoney() {
        System.out.println("已经扣取了积分！");
    }

    @Override
    public boolean raffle() {
        System.out.println("正在抽奖，请稍等！");
        Random random = new Random();
        int num = random.nextInt(10);
        if (num == 0) {
            // 改变活动状态为发放奖品，context即为activity
            activity.setState(activity.getDispensePrizeState());
            return true;
        } else {
            System.out.println("很遗憾，没有抽中奖品！");
            return false;
        }
    }

    @Override
    public void dispensePrize() {
        System.out.println("没中奖，不能发放奖品！");
    }
}
