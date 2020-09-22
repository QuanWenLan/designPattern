package singleton;

/**
 * @program: designPrinciple->Singleton1
 * @description: 饿汉式，直接实例化，不管是否需要对象
 * 1. 构造器私有化
 * 2. 自行创建，并用静态变量保存
 * 3. 向外提供这个实例
 * @author: lanwenquan
 * @date: 2020-08-18 21:28
 */
public class Singleton1 {
    public static final Singleton1 INSTANCE = new Singleton1();
    private Singleton1 () {

    }
}
