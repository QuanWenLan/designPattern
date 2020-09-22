package proxy.jdkproxy;

import java.lang.reflect.InvocationTargetException;

/**
 * @ClassName ReflectTest
 * @Description TODO
 * @Author lanwenquan
 * @Date 2020/4/9 13:21
 */
public class ReflectTest {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        //注意一定要返回接口，不能返回实现类否则会报错
        Fruit fruit = (Fruit) DynamicAgent.getAgent(Fruit.class, new Apple());
        fruit.show();
    }
}