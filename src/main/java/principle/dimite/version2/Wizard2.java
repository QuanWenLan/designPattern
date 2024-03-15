package principle.dimite.version2;

import java.util.Random;

/**
 * @author Lan
 * @createTime 2024-03-15  11:45
 **/
public class Wizard2 {
    private Random rand = new Random(System.currentTimeMillis());

    //第一步
    private int first() {
        System.out.println("执行第一个方法...");
        return rand.nextInt(100);
    }

    //第二步
    private int second() {
        System.out.println("执行第二个方法...");
        return rand.nextInt(100);
    }

    //第三个方法
    private int third() {
        System.out.println("执行第三个方法...");
        return rand.nextInt(100);
    }

    public void installWizard() {
        int first = first();
        //根据first返回的结果，看是否需要执行second
        if (first > 50) {
            int second = second();
            if (second > 50) {
                int third = third();
                if (third > 50) {
                    first();
                }
            }
        }
    }
}
