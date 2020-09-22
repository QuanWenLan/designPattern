package big_talk_pattern.command.totaldesign;

/**
 * @author Vin lan
 * @className ConcreteCommand
 * @description TODO
 * @createTime 2020-09-22  14:01
 **/
public class Concrete2Command extends Command {

    public Concrete2Command(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void executeCommand() {
        receiver.action();
    }
}
