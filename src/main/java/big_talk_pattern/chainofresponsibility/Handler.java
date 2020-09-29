package big_talk_pattern.chainofresponsibility;

/**
 * @author Vin lan
 * @className Handler
 * @description TODO
 * @createTime 2020-09-29  16:31
 **/
public abstract class Handler {
    protected Handler successHandler;

    public void setSuccessHandler(Handler successHandler) {
        this.successHandler = successHandler;
    }

    public abstract void handleRequest(int request);
}
