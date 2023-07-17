package big_talk_pattern.adapter;

/**
 * @ClassName Adapter
 * @Description TODO 将客户想使用的接口适配（也就是说客户断调用相同的接口但是现有的系统所提供的接口方法不满足要求）
 * 适配器 聚合 要适配的新的接口
 * @Author lanwenquan
 * @Date 2020/1/10 17:09
 */
public class Adapter implements Target {

    // 这个是需要适配的接口或者类，Adaptee是一个接口
    private Adaptee adaptee = new AdapteeIm();

    @Override
    public void request() {
        adaptee.specialRequest();
    }
}