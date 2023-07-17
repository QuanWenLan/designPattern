package big_talk_pattern.agent;

/**
 * @program: designPrinciple->ProxyObject
 * @description: 代理对象
 * @author: lanwenquan
 * @date: 2022-11-30 21:30
 */
public class ProxyObject implements Subject {
    /**
     * 代理对象依赖真实对象
     */
    private RealObject realObject;

    public ProxyObject(RealObject realObject) {
        this.realObject = realObject;
    }

    public ProxyObject() {
    }

    @Override
    public void request() {
        System.out.println("代理对象执行请求");
        realObject.request();
    }

    public RealObject getRealObject() {
        return realObject;
    }

    public void setRealObject(RealObject realObject) {
        this.realObject = realObject;
    }
}
