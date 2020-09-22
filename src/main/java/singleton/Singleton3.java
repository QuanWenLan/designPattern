package singleton;

/**
 * @program: designPrinciple->Singleton1
 * @description: 饿汉式，枚举，不管是否需要对象
 * 使用静态代码块
 * @author: lanwenquan
 * @date: 2020-08-18 21:28
 */
public class Singleton3 {
    private static final Singleton3 INSTANCE;
    private Singleton3 () {

    }

    static {
        INSTANCE = new Singleton3();
    }
}