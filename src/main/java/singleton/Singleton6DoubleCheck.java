package singleton;

/**
 * @author Lan
 * @createTime 2024-03-06  14:34
 * 线程安全的双重检查版本
 **/
public class Singleton6DoubleCheck {
    // 防止重排序
    /**
     * INSTANCE = new Singleton6DoubleCheck(); 创建对象的过程
     * 1 分配内存空间
     * 2 初始化对象（也就是jvm中的 初始化零值）
     * 3 将引用指向创建的对象
     * 1、2 和 3 之间是没有依赖关系的，3可能会重排序到1或者2的前面，
     * 所以可能由于指令重排序的情况，在某些情况下，JVM 可能会先分配内存给 instance，然后再调用构造方法初始化对象。
     * 这样，其他线程在检查 instance 不为 null 时，可能会访问到一个尚未完全初始化的对象。
     */
    private static volatile Singleton6DoubleCheck INSTANCE;

    private Singleton6DoubleCheck() {

    }

    public static Singleton6DoubleCheck getInstance() {
        if (INSTANCE == null) {
            synchronized (Singleton6DoubleCheck.class) {
                // 可能存在多个线程通过了第一个 if (instance == null) 判断，然后只有一个线程获取到了锁，创建了实例，而其他线程在等待锁释放后也进入了同步块，
                // 这时如果没有第二个 if (instance == null) 判断，其他线程可能会再次创建实例，导致多个实例被创建，违背了单例模式的设计
                if (INSTANCE == null) {
                    INSTANCE = new Singleton6DoubleCheck();
                }
            }
        }
        return INSTANCE;
    }
}
