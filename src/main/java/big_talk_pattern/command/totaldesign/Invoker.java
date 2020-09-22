package big_talk_pattern.command.totaldesign;

/**
 * @author Vin lan
 * @className Invoker
 * @description TODO 要求该命令执行这个请求
 * @createTime 2020-09-22  14:09
 **/
public class Invoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand() {
        command.executeCommand();
    }
}
