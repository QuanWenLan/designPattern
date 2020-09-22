package big_talk_pattern.command;

/**
 * @author Vin lan
 * @className Barbecuer
 * @description TODO  烤肉的紧耦合设计
 * @createTime 2020-09-07  16:51
 **/
public class Barbecuer {
    private String name;

    public Barbecuer(String name) {
        this.name = name;
    }

    public void bakeMutton () {
        System.out.println(name + ", 烤羊肉");
    }

    public void bakeChickenWing () {
        System.out.println(name + ", 烤鸡翅");
    }
}

/**
 * 客户,客户端与实现者紧耦合，尽管简单，但是很僵硬，容易出现大问题
 */
class Client {
    public static void main(String[] args) {
        Barbecuer barbecuer = new Barbecuer("明师傅");
        barbecuer.bakeChickenWing();
        barbecuer.bakeMutton();
        // 再来一些烤翅和羊肉
        barbecuer.bakeChickenWing();
        barbecuer.bakeMutton();
    }
}
