package principle.dimite.version1;

/**
 * @author Lan
 * @createTime 2024-03-15  11:46
 **/
public class Client1 {
    public static void main(String[] args) {
        InstallSoftware1 invoker = new InstallSoftware1();
        invoker.installWizard(new Wizard1());
        /*
         * 程序虽然简单，但是隐藏的问题可不简单，思考一下程序有什么问题。Wizard类把太多的方法暴露给InstallSoftware类，两者的朋友关系太亲密了，
         * 耦合关系变得异常牢固。如果要将Wizard类中的first方法返回值的类型由int改为boolean，就需要修改InstallSoftware类，从而把修改变更的风险扩散开了。因此，这样的耦合是极度不合适的，
         */
    }
}
