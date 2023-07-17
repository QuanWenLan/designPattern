package big_talk_pattern.state;

/**
 * @program: designPrinciple->Activity
 * @description: Activity 类含有的状态对象，各个子类也含有Activity对象
 * @author: lanwenquan
 * @date: 2022-12-04 14:54
 */
public class Activity {
    // 表示四种状态
    private NoRaffleState noRaffleState = new NoRaffleState(this);
    private CanRaffleState canRaffleState = new CanRaffleState(this);
    private DispensePrizeState dispensePrizeState = new DispensePrizeState(this);
    private DispenseOutState dispenseOutState = new DispenseOutState(this);
    // 表示当前活动的状态
    private State state;

    private int count = 3;

    public Activity(int count) {
        this.count = count;
        // 初始化状态
        this.state = getNoRaffleState();
    }

    public void deduceMoney() {
        state.deduceMoney();
    }

    public void raffle() {
        if (state.raffle()) {
            state.dispensePrize();
        }
    }

    public NoRaffleState getNoRaffleState() {
        return noRaffleState;
    }

    public void setNoRaffleState(NoRaffleState noRaffleState) {
        this.noRaffleState = noRaffleState;
    }

    public CanRaffleState getCanRaffleState() {
        return canRaffleState;
    }

    public void setCanRaffleState(CanRaffleState canRaffleState) {
        this.canRaffleState = canRaffleState;
    }

    public DispensePrizeState getDispensePrizeState() {
        return dispensePrizeState;
    }

    public void setDispensePrizeState(DispensePrizeState dispensePrizeState) {
        this.dispensePrizeState = dispensePrizeState;
    }

    public DispenseOutState getDispenseOutState() {
        return dispenseOutState;
    }

    public void setDispenseOutState(DispenseOutState dispenseOutState) {
        this.dispenseOutState = dispenseOutState;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getCount() {
        // 领取一次减少一次
        return count--;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
