package singleton;

import java.util.concurrent.*;

/**
 * @program: designPrinciple->TestSingleton
 * @description: 测试单例
 * @author: lanwenquan
 * @date: 2020-08-18 21:35
 */
public class TestSingleton {
    public static void main(String[] args) {
        // 1，第一种
        Singleton1 singleton1 = Singleton1.INSTANCE;
        System.out.println("singleton1 = " + singleton1);
        // 2 第二种
        Singleton2 singleton2 = Singleton2.INSTANCE;
        System.out.println("singleton2 = " + singleton2);
        singleton2.setName("小明");
        singleton2.setValue(20);
        singleton2.setStudent(new Singleton2.Student("小红"));
        singleton2.doSomething();

        // 懒汉式测试 singleton4
//        test4();
    }

     static void test4() {
         Callable<Singleton4> callable = Singleton4::getInstance;

         ExecutorService es = Executors.newFixedThreadPool(2);
         Future<Singleton4> f1 = es.submit(callable);
         Future<Singleton4> f2 = es.submit(callable);
         try {
             final Singleton4 singleton4 = f1.get();
             final Singleton4 singleton41 = f2.get();
             System.out.println(singleton4 + " === " + singleton41);
             System.out.println(singleton4 == singleton41);
         } catch (InterruptedException e) {
             e.printStackTrace();
         } catch (ExecutionException e) {
             e.printStackTrace();
         }
         es.shutdown();
     }

}
