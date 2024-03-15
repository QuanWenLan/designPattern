package big_talk_pattern.buliderPattern.section2;

import big_talk_pattern.buliderPattern.BMWBuilder;
import big_talk_pattern.buliderPattern.BenzBuilder;
import big_talk_pattern.buliderPattern.BMWModel;
import big_talk_pattern.buliderPattern.BenzModel;

import java.util.ArrayList;

/**
 * @author Vin lan
 * @className Client
 * @description
 * @createTime 2021-06-09  16:12
 **/
public class Client {
    public static void main(String[] args) {
        ArrayList<String> sequence = new ArrayList<>();
        sequence.add("engine boom");
        sequence.add("start");
        sequence.add("stop");

        BenzBuilder benzBuilder = new BenzBuilder();
        benzBuilder.setSequence(sequence);
        BenzModel benzModel = (BenzModel)benzBuilder.getCarModel();
        benzModel.run();

        // 想要一个 同样顺序的宝马车呢？
        BMWBuilder bmwBuilder = new BMWBuilder();
        bmwBuilder.setSequence(sequence);
        BMWModel bmwModel = (BMWModel)bmwBuilder.getCarModel();
        bmwModel.run();
    }
}
