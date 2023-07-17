package principle.liskov;

/**
 * @author Vin lan
 * @className ToyGun1
 * @description
 * @createTime 2021-06-02  17:03
 **/
public class ToyGun1 extends AbstractGun {
    // 玩具枪射不出子弹
    @Override
    public void shoot() {
        System.out.println("我是玩具枪。。。没有子弹");
        System.out.println("玩具枪声音。。。");
    }

    @Override
    void volume() {
        System.out.println("玩具枪声音。。。");
    }
}
