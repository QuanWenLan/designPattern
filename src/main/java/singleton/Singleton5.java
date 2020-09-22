package singleton;

/**
 * @program: designPrinciple->Singleton1
 * @description: 懒汉式
 *  1. 构造器私有化
 *  2. 自行创建，并用静态变量保存
 *  3. 提供一个静态方法，获取这个实例对象
 *
 *  存在线程安全问题
 * @author: lanwenquan
 * @date: 2020-08-18 21:28
 */
public class Singleton5 {
    private static Singleton5 INSTANCE;
    private Singleton5() {

    }

    public static Singleton5 getInstance() {
        synchronized (Singleton5.class) {
            if (INSTANCE == null) {
                INSTANCE = new Singleton5();
            }
        }
        return INSTANCE;
    }
}