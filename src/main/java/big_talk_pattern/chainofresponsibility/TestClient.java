package big_talk_pattern.chainofresponsibility;

/**
 * @author Vin lan
 * @className Client
 * @description TODO
 * @createTime 2020-09-29  16:53
 **/
public class TestClient {
    public static void main(String[] args) {
        ConcreteHandler1 concreteHandler1 = new ConcreteHandler1();
        ConcreteHandler2 concreteHandler2 = new ConcreteHandler2();
        ConcreteHandler3 concreteHandler3 = new ConcreteHandler3();
        // 将这些处理对象的单个职责串为一个链
        concreteHandler1.setSuccessHandler(concreteHandler2);
        concreteHandler2.setSuccessHandler(concreteHandler3);

        int[] request = new int[]{8, 10, 12, 23};
        for (int r : request) {
            concreteHandler1.handleRequest(r);
        }
    }
}
