package principle.liskov;

/**
 * @ClassName Solider
 * @Description TODO
 * @Author Administrator
 * @Date 2019/4/12  15:24
 * @Version 1.0
 */
public class Solider {
    private AbstractGun abstractGun;
    public void setGun(AbstractGun gun){
        this.abstractGun = gun;
    }

    public void killEnemy(){
        System.out.println("士兵开始击杀敌人。。。");
        abstractGun.shoot();
    }
}
