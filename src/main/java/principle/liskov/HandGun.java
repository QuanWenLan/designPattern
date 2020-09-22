package principle.liskov;

/**
 * @ClassName HandGun
 * @Description TODO 手枪
 * @Author Administrator
 * @Date 2019/4/12  15:21
 * @Version 1.0
 */
public class HandGun extends AbstractGun{
    @Override
    public void shoot() {
        System.out.println("手枪射击。。。");
    }
}
