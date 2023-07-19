package big_talk_pattern.bridge;

/**
 * @author Lan
 * 手机品牌
 * @createTime 2023-07-19  09:25
 **/
public abstract class HandsetBrand {
    /**
     * 品牌和软件是一个聚合关系，是一个弱的部分与整体关系。
     */
    protected HandsetSoft handsetSoft;

    public abstract void run();

    public HandsetSoft getHandsetSoft() {
        return handsetSoft;
    }

    public void setHandsetSoft(HandsetSoft handsetSoft) {
        this.handsetSoft = handsetSoft;
    }
}
