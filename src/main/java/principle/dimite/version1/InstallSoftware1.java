package principle.dimite.version1;

/**
 * @author Lan
 * @createTime 2024-03-15  11:45
 **/
public class InstallSoftware1 {
    public void installWizard(Wizard1 wizard) {
        int first = wizard.first();
        //根据first返回的结果，看是否需要执行second
        if (first > 50) {
            int second = wizard.second();
            if (second > 50) {
                int third = wizard.third();
                if (third > 50) {
                    wizard.first();
                }
            }
        }
    }
}
