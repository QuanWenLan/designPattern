package big_talk_pattern.agent;

/**
 * @program: designPrinciple->Client
 * @description:
 * @author: lanwenquan
 * @date: 2022-11-30 21:29
 */
public class Client {
    public static void main(String[] args) {
        RealObject realObject = new RealObject();
        ProxyObject proxyObject = new ProxyObject();
        proxyObject.setRealObject(realObject);
        proxyObject.request();
    }
}
