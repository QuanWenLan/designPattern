package principle.dimite.version2;

/**
 * @author Lan
 * @createTime 2024-03-15  11:46
 **/
public class Client2 {
    public static void main(String[] args) {
        InstallSoftware2 invoker = new InstallSoftware2();
        invoker.installWizard(new Wizard2());
        /*
        将三个步骤的访问权限修改为private，同时把InstallSoftware中的方法installWizad移动到
        Wizard方法中。通过这样的重构后，Wizard类就只对外公布了一个public方法，即使要修改
        first方法的返回值，影响的也仅仅只是Wizard本身，其他类不受影响，这显示了类的高内聚特性
         */
    }
}
