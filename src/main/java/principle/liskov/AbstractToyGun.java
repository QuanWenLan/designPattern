package principle.liskov;

/**
 * @ClassName AbstractGun
 * @Description TODO 这个类依赖于 AbstractGun, 可以在AbstractToyGun中声明将声音、形状都委托给AbstractGun处理
 * @Author Administrator
 * @Date 2019/4/12  15:20
 * @Version 1.0
 */
public abstract class AbstractToyGun {
    AbstractGun abstractGun;

    public void setAbstractGun(AbstractGun abstractGun) {
        this.abstractGun = abstractGun;
    }

    public AbstractGun getAbstractGun() {
        return abstractGun;
    }

    public abstract void shoot();
}


