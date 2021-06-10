package principle.liskov;

/**
 * @ClassName AbstractGun
 * @Description TODO
 * @Author Administrator
 * @Date 2019/4/12  15:20
 * @Version 1.0
 */
public abstract class AbstractGun {
    public abstract void shoot();
    void volume() {
        System.out.println("开枪声音，嘣嘣嘣");
    }
}


