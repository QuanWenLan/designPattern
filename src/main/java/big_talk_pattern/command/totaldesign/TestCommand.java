package big_talk_pattern.command.totaldesign;

/**
 * @author Vin lan
 * @className TestCommand
 * @description TODO
 * @createTime 2020-09-22  14:17
 **/
public class TestCommand {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command con1 = new Concrete1Command(receiver);
        Invoker invoker = new Invoker();
        invoker.setCommand(con1);
        invoker.executeCommand();
    }
}
