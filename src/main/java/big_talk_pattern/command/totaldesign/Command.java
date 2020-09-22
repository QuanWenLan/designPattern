package big_talk_pattern.command.totaldesign;

/**
 * @author Vin lan
 * @className Command
 * @description TODO 用来声明执行操作的接口， 完整的类图代码设计
 * @createTime 2020-09-22  12:19
 **/
public abstract class Command {
    protected Receiver receiver;

    public Command(Receiver receiver) {
        this.receiver = receiver;
    }

    public abstract void executeCommand();
}
