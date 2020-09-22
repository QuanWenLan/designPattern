package big_talk_pattern.facade;

/**
 * @program: designPrinciple->Client
 * @description: 股民炒股代码
 * @author: lanwenquan
 * @date: 2020-08-19 15:51
 */
public class Client {
    public static void main(String[] args) {
        Stock stock = new Stock();
        Stock2 stock2 = new Stock2();
        Stock3 stock3 = new Stock3();

        NationDebt1 nationDebt1 = new NationDebt1();
        Realty realty = new Realty();

        // 卖卖股票
        stock.buy();
        stock.sell();

        stock2.buy();
        stock2.sell();

        stock3.buy();
        stock3.sell();

        nationDebt1.buy();
        nationDebt1.sell();

        realty.buy();
        realty.sell();
        /**
         * 存在问题，股民和这些股票的耦合性太高
         */
        System.out.println("=============");
        // 2 此时客户端代码
        Fund fund = new Fund();
        fund.buy();
        fund.sell();
        /**
         * 此时用户不再需要了解股票，甚至可以对股票一无所知，买了基金就回家睡觉。。。
         * 参与股票的代码都由基金公司完成
         */
    }
}
