package principle.liskov;

/**
 * @ClassName ToyGun
 * @Description TODO 玩具枪
 * @Author Administrator
 * @Date 2019/4/12  15:36
 * @Version 1.0
 */
public class ToyGun extends AbstractToyGun{
    // 玩具枪射不出子弹
    @Override
    public void shoot() {
        System.out.println("我是玩具枪。。。");
    }
}
