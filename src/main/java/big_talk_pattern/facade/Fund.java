package big_talk_pattern.facade;

/**
 * @program: designPrinciple->Fund
 * @description: 基金代码
 * @author: lanwenquan
 * @date: 2020-08-19 15:55
 */
public class Fund {
    private Stock stock;
    private Stock2 stock2;
    private Stock3 stock3;
    private NationDebt1 nationDebt1;
    private Realty realty;

    public Fund() {
        stock = new Stock();
        stock2 = new Stock2();
        stock3 = new Stock3();
        nationDebt1 = new NationDebt1();
        realty = new Realty();
    }

    // 买基金
    public void buy() {
        stock.buy();
        stock2.buy();
        stock3.buy();
        nationDebt1.buy();
        realty.buy();
    }
    
    // 卖基金
    public void sell() {
        stock.sell();
        stock2.sell();
        stock3.sell();
        nationDebt1.sell();
        realty.sell();
    }
}
