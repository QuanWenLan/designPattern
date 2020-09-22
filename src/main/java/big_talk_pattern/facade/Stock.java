package big_talk_pattern.facade;

/**
 * @program: designPrinciple->Stock
 * @description: 股民炒股代码， 一开始的代码
 *
 * @author: lanwenquan
 * @date: 2020-08-19 15:47
 */
public class Stock {
    public void sell() {
        System.out.println("stock 1股票 卖出");
    }

    public void buy() {
        System.out.println("stock 1股票 买入");
    }
}
class Stock2 {
    public void sell() {
        System.out.println("stock 2股票 卖出");
    }

    public void buy() {
        System.out.println("stock 2股票 买入");
    }
}
class Stock3 {
    public void sell() {
        System.out.println("stock 3股票 卖出");
    }

    public void buy() {
        System.out.println("stock 3股票 买入");
    }
}
// 国债
class NationDebt1 {
    public void sell() {
        System.out.println("国债1 卖出");
    }

    public void buy() {
        System.out.println("国债2 买入");
    }
}
// 房地产
class Realty {
    public void sell() {
        System.out.println("房地产股票 卖出");
    }

    public void buy() {
        System.out.println("房地产股票 买入");
    }
}
