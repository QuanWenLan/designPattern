package big_talk_pattern.agent;

/**
 * @program: designPrinciple->RealObject
 * @description: 真实对象
 * @author: lanwenquan
 * @date: 2022-11-30 21:29
 */
public class RealObject implements Subject {

    @Override
    public void request() {
        System.out.println("真实对象的请求！");
    }
}
