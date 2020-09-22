package big_talk_pattern.command.totaldesign;

/**
 * @author Vin lan
 * @className ConcreteCommand
 * @description TODO 将一个接收者对象绑定于一个动作，调用接收者相应的操作，以实现execute
 * @createTime 2020-09-22  14:01
 **/
public class Concrete1Command extends Command {

    public Concrete1Command(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void executeCommand() {
        receiver.action();
    }
}
