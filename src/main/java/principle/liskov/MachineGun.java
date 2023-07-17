package principle.liskov;

/**
 * @ClassName MachineGun
 * @Description TODO  机枪
 * @Author Administrator
 * @Date 2019/4/12  15:23
 * @Version 1.0
 */
public class MachineGun extends AbstractGun{
    @Override
    public void shoot() {
        System.out.println("机枪射击。。。");
        volume();
    }
    @Override
    void volume() {
        System.out.println("机枪声音。。。");
    }
}
