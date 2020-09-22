package principle.single;

/**
 * @ClassName Phone
 * @Description TODO SingleResponsibilityPrinciple 单一设计原则
 * 定义：不要存在多于一个导致类变更的原因。通俗的说，即一个类只负责一项职责
 * @Author Administrator
 * @Date 2019/4/12  9:24
 * @Version 1.0
 * 问题由来：类T负责两个不同的职责：职责P1，职责P2。当由于职责P1需求发生改变而需要修改类T时，
 * 有可能会导致原本运行正常的职责P2功能发生故障。
 * 解决方案：遵循单一职责原则。分别建立两个类T1、T2，使T1完成职责P1功能，T2完成职责P2功能。
 * 这样，当修改类T1时，不会使职责P2发生故障风险；同理，当修改T2时，也不会使职责P1发生故障风险。
 */
public class Phone implements IConnectionManager,IDataTransfer{

    @Override
    public void dialPhone(String phoneNumber) {
        System.out.println("电话拨通"+phoneNumber);
    }

    @Override
    public void hangup() {
        System.out.println("电话挂断");
    }

    @Override
    public void chat(IConnectionManager iConnectionManager) {
        System.out.println("通话中。。。");
    }
    /**
     * 同样适用于方法上
     */
    // TODO 不可取
    public void changeUser(String...options){
        System.out.println(options); // 这样是多个操作集合在了一个方法里，
    }
    // TODO 应该设计为独立的方法，单一职责，尽可能做到单一职责原则
    public void changeUserName(String userName){}

    public void changeUserAddress(String userAddress){}

    public void changeUserOffice(String userOffice){}
}

