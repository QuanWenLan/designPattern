package big_talk_pattern.bridge;

/**
 * @author Lan
 * 手机品牌M
 * @createTime 2023-07-19  09:29
 **/
public class HandsetMBrand extends HandsetBrand {
    @Override
    public void run() {
        System.out.println("M 品牌运行软件");
        handsetSoft.run();
    }
}
