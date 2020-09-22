package singleton;

/**
 * @program: designPrinciple->Singleton1
 * @description: 饿汉式，枚举，不管是否需要对象
 * 表示该类型的对象是有限的几个，限定为1个就是单列了。
 * @author: lanwenquan
 * @date: 2020-08-18 21:28
 */
public enum  Singleton2 {
    INSTANCE;
}