package big_talk_pattern.bridge;

/**
 * @author Lan
 * 手机品牌M
 * @createTime 2023-07-19  09:29
 **/
public class HandsetNBrand extends HandsetBrand {
    @Override
    public void run() {
        System.out.println("N 品牌运行软件");
        handsetSoft.run();
    }
}
