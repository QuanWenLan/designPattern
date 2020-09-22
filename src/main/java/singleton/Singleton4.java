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
public class Singleton4 {
    private static Singleton4 INSTANCE;
    private Singleton4() {

    }

    public static Singleton4 getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton4();
        }
        return INSTANCE;
    }
}