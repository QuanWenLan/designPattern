package big_talk_pattern.bridge;

/**
 * @author Lan
 * @createTime 2023-07-19  09:31
 **/
public class Client {
    public static void main(String[] args) {
        HandsetBrand ab;
        ab = new HandsetNBrand();
        ab.setHandsetSoft(new HandsetGame());
        ab.run();

        ab.setHandsetSoft(new HandsetAddressList());
        ab.run();

        ab = new HandsetMBrand();
        ab.setHandsetSoft(new HandsetGame());
        ab.run();

        ab.setHandsetSoft(new HandsetAddressList());
        ab.run();

        ab.setHandsetSoft(new HandsetMP3());
        ab.run();
    }
}
