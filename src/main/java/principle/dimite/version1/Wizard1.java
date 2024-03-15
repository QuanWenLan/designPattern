package principle.dimite.version1;

import java.util.Random;

/**
 * @author Lan
 * @createTime 2024-03-15  11:45
 **/
public class Wizard1 {
    private Random rand = new Random(System.currentTimeMillis());

    //第一步
    public int first() {
        System.out.println("执行第一个方法...");
        return rand.nextInt(100);
    }

    //第二步
    public int second() {
        System.out.println("执行第二个方法...");
        return rand.nextInt(100);
    }

    //第三个方法
    public int third() {
        System.out.println("执行第三个方法...");
        return rand.nextInt(100);
    }
}
