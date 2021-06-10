package buliderPattern;

/**
 * @author Vin lan
 * @className BenzModel
 * @description 奔驰实现类
 * @createTime 2021-06-08  17:27
 **/
public class BenzModel extends CarModel {

    @Override
    public void start() {
        System.out.println("奔驰车 跑起来 是这个样子的。。。。");
    }

    @Override
    public void stop() {
        System.out.println("奔驰车 停车 是这个样子的。。。");
    }

    @Override
    public void alarm() {
        System.out.println("奔驰车的 喇叭声音 是这个样子的。。。");
    }

    @Override
    public void engineBoom() {
        System.out.println("奔驰车的 引擎声音 是这个样子的。。。");
    }
}
