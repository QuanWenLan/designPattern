package big_talk_pattern.command;

/**
 * @author Vin lan
 * @className MuttonCommand 烤羊肉命令, 创建命令的时候就指定命令执行对象
 * @description TODO
 * @createTime 2020-09-07  17:06
 **/
public class MuttonCommand extends BakeCommand {

    // 命令的执行者
    private Barbecuer barbecuer;

    public MuttonCommand(Barbecuer barbecuer) {
        this.barbecuer = barbecuer;
    }

    @Override
    public void handCommand() {
        barbecuer.bakeMutton();
    }

    @Override
    public String toString() {
        return "命令模式.羊肉烧烤";
    }
}
