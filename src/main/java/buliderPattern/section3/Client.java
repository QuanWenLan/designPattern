package buliderPattern.section3;

import buliderPattern.Director;

/**
 * @author Vin lan
 * @className Client
 * @description
 * @createTime 2021-06-09  16:41
 **/
public class Client {
    public static void main(String[] args) {
        Director director = new Director();
        // A 类型 1 万辆奔驰
        for (int i = 0; i < 10000; i++) {
            director.getABenzModel().run();
        }
        // B 类型 1 万辆奔驰
        for (int i = 0; i < 10000; i++) {
            director.getBBenzModel().run();
        }
        // C 类型 1 万辆宝马
        for (int i = 0; i < 10000; i++) {
            director.getCBmwModel().run();
        }

        // 清晰、简单吧，我们写程序重构的最终目的就是：简单、清晰
    }
}
