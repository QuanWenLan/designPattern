package big_talk_pattern.command;

/**
 * @author Vin lan
 * @className Waiter 服务员类，用来发布命令到 {@link Barbecuer},只管发布和通知烤肉师傅
 * @description TODO
 * @createTime 2020-09-07  16:58
 **/
public class Waiter {

    private BakeCommand command;

    // 设置命令
    public void setCommand(BakeCommand command) {
        this.command = command;
    }

    public void deliverCommand() {
        command.handCommand();
    }
}

/**
 * 客户端，这样客户再多也不会出乱子了，但是又有问题：
 * 1. 客户也许会点饮料，也就是不止（只有烤肉的命令了，有其他的命令）
 * 2. 客户也不是只点一个（也就是说有很多的命令）
 * 3. 如果鸡翅或者羊肉没有了，不应该客户判断是否存在，而是服务员来判断
 * 4. 客户想取消的预定，不想要了
 *  参考 {@link Waiter2}解决这个问题
 */
class Client2 {
    public static void main(String[] args) {
        // 直接指定烤肉师傅，也就是：请求实现者
        Barbecuer barbecuer = new Barbecuer("兰师傅");
        // 创建一个服务员类，用来记录和传递命令
        Waiter waiter = new Waiter();
        // 根据客户的需求创建命令（想要烤什么就烤什么,要哪个烤肉师傅）
        BakeCommand muttonCommand = new MuttonCommand(barbecuer);
        BakeCommand chickenWingsCommand = new ChickenWingsCommand(barbecuer);
        // 服务员记录命令
        waiter.setCommand(muttonCommand);
        // 服务员传递命令
        waiter.deliverCommand();

        // 服务员记录命令
        waiter.setCommand(chickenWingsCommand);
        // 服务员传递命令
        waiter.deliverCommand();
    }
}