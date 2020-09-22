package big_talk_pattern.adapter;

/**
 * @ClassName AdapteeIm
 * @Description TODO 想使用接口的实现类（现有系统不满足情况下新增的客户端想使用的接口方法）
 * @Author lanwenquan
 * @Date 2020/1/10 17:13
 */
public class AdapteeIm implements Adaptee{
    @Override
    public void specialRequest() {
        System.out.println("特殊的请求");
    }
}