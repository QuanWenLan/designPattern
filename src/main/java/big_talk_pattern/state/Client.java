package big_talk_pattern.state;

/**
 * @program: designPrinciple->Client
 * @description: 客户
 * @author: lanwenquan
 * @date: 2022-12-04 14:55
 */
public class Client {
    public static void main(String[] args) {
        Activity activity = new Activity(1);
        for (int i = 0; i < 30; i++) {
            System.out.println("---------第 " + (i + 1) + " 次抽奖---------");
            activity.deduceMoney();
            activity.raffle();
        }
    }
}
