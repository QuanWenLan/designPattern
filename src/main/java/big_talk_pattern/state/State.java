package big_talk_pattern.state;

/**
 * 状态接口
 */
public interface State {
    /**
     * 扣钱50
     */
    void deduceMoney();

    /**
     * 是否抽中奖品
     */
    boolean raffle();

    /**
     * 颁发奖品
     */
    void dispensePrize();
}
