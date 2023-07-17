package proxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ClassName DynamicAgent
 * @Description TODO  JDK动态代理模式只能代理接口而不能代理类
 * @Author lanwenquan
 * @Date 2020/4/9 13:11
 */
public class DynamicAgent {

    // 1 首先要有实现处理代理的类的接口的 实现
    static class MyHandler implements InvocationHandler {
        private Object proxy; // 要代理的类（真实的类）

        public MyHandler(Object proxy) {
            this.proxy = proxy;
        }

        // 对于被代理的类的操作都会由该接口中的invoke方法
        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println(">>>>>before invoking method"); // 对其增强操作
            Object invoke = method.invoke(this.proxy, args);
            System.out.println(invoke);
            System.out.println(">>>>>after invoking method"); // 对其增强操作
            return invoke;
        }
    }

    // 2 再获取一个代理对象，传入要代理的类，返回一个代理类，代理类实现对真实类的操作接口（第一步）
    public static Object getAgent(Class interfaceClazz, Object proxy) {
//        自动生成 $Proxy0.class 源代码
        System.setProperty("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        return Proxy.newProxyInstance(interfaceClazz.getClassLoader(), new Class[]{interfaceClazz},
                new MyHandler(proxy));
    }
}
