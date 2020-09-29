package big_talk_pattern.chainofresponsibility;

/**
 * @author Vin lan
 * @className ConcreteHandler1 具体的一个职责链
 * @description TODO
 * @createTime 2020-09-29  16:46
 **/
public class ConcreteHandler2 extends Handler {
    @Override
    public void handleRequest(int request) {
        if (request >= 11 && request <= 20) {
            System.out.println(this.getClass().getSimpleName() + "处理：" + request);
        } else if (successHandler != null) {
            successHandler.handleRequest(request);
        }
    }
}
