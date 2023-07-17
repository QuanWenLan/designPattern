package principle.liskov;

/**
 * @ClassName Rifle
 * @Description TODO 步枪
 * @Author Administrator
 * @Date 2019/4/12  15:22
 * @Version 1.0
 */
public class Rifle extends AbstractGun{
    @Override
    public void shoot() {
        System.out.println("步枪射击。。。");
        volume();
    }
    @Override
    void volume() {
        System.out.println("步枪声音。。。");
    }
}
