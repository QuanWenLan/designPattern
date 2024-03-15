package big_talk_pattern.buliderPattern;

/**
 * @author Vin lan
 * @className BMWModel
 * @description
 * @createTime 2021-06-08  17:41
 **/
public class BMWModel extends CarModel {
    @Override
    public void start() {
        System.out.println("宝马车 跑起来 是这个样子的。。。。");
    }

    @Override
    public void stop() {
        System.out.println("宝马车 停车 是这个样子的。。。");
    }

    @Override
    public void alarm() {
        System.out.println("宝马车的 喇叭声音 是这个样子的。。。");
    }

    @Override
    public void engineBoom() {
        System.out.println("宝马车的 引擎声音 是这个样子的。。。");
    }
}
