package big_talk_pattern.command;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Vin lan
 * @className Waiter2
 * @description TODO 解决第一个 {@link Waiter} 的问题
 * @createTime 2020-09-18  17:19
 **/
public class Waiter2 {
    private List<BakeCommand> commandList = new ArrayList<>();

    // 设置命令
    public void setCommand(BakeCommand command) {
        if (command instanceof ChickenWingsCommand) {
            // chickenWing is not
            System.out.println("服务员：鸡翅没有，请点别的烧烤。");
        } else {
            commandList.add(command);
            System.out.println("增加订单：" + command + ",时间：" + LocalDate.now());
        }
    }

    public void cancelCommand(BakeCommand command) {
        commandList.remove(command);
        System.out.println("取消订单：" + command + ",时间：" + LocalDate.now());
    }

    public void deliverCommand() {
        for (BakeCommand command:commandList
             ) {
            command.handCommand();
        }
    }
}
class Client3 {
    public static void main(String[] args) {
        Barbecuer barbecuer = new Barbecuer("明师傅");
        Waiter2 waiter2 = new Waiter2();

        // 开始点餐
        MuttonCommand muttonCommand = new MuttonCommand(barbecuer);
        MuttonCommand muttonCommand2 = new MuttonCommand(barbecuer);
        ChickenWingsCommand chickenWingsCommand = new ChickenWingsCommand(new Barbecuer("兰师傅"));

        // 服务员开始统计点餐
        waiter2.setCommand(muttonCommand);
        waiter2.setCommand(muttonCommand2);
        waiter2.setCommand(chickenWingsCommand);

        // 开始通知
        waiter2.deliverCommand();
    }
}
