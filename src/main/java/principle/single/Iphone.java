package principle.single;

/**
 * 包含了两个职责：一个是协议管理，一个是数据传送
 *
 * 协议接通的改变会引起接口或者接口实现类的变化，
 * 数据传动的变化也会引起接口或者接口实现类的变化
 */
public interface Iphone {
    // 接通电话
    void dialPhone(String phoneNumber);

    // 通话
    void chat(Object o);

    //挂断
    void hangup();
}
