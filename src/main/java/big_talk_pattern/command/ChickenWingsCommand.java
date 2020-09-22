package big_talk_pattern.command;

/**
 * @author Vin lan
 * @className ChickenWingsCommand 烤鸡翅命令
 * @description TODO
 * @createTime 2020-09-07  17:07
 **/
public class ChickenWingsCommand extends BakeCommand {

    private Barbecuer barbecuer;

    public ChickenWingsCommand(Barbecuer barbecuer) {
        this.barbecuer = barbecuer;
    }

    @Override
    public void handCommand() {
        barbecuer.bakeChickenWing();
    }

    @Override
    public String toString() {
        return "命令模式.鸡翅烧烤";
    }
}
