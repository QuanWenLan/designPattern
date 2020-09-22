package singleton;

/**
 * @program: designPrinciple->Singleton1
 * @description: 懒汉式
 *  1. 构造器私有化
 *  2. 自行创建，并用静态变量保存
 *  3. 提供一个静态方法，获取这个实例对象
 *
 *  在内部类被加载和初始化时，才创建INSTANE实例对象
 *  静态内部类不会自动随着外部类的加载和初始化而初始化，它是需要单独去加载和初始化的。
 *  因为是在内部类加载和初始化时，创建的因此是线程安全的。
 * @author: lanwenquan
 * @date: 2020-08-18 21:28
 */
public class Singleton7 {
    private Singleton7() {

    }
    private static class Inner {
        private static final Singleton7 INSTANCE = new Singleton7();
    }

    public static Singleton7 getInstance() {
        return Inner.INSTANCE;
    }
}