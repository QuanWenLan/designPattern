package buliderPattern;

import java.util.ArrayList;

/**
 * @author Vin lan
 * @className Client
 * @description
 * @createTime 2021-06-08  17:45
 **/
public class Client {
    /**
     *生产一个奔驰模型，要求跑的时候，先发动引擎，然后再挂挡启动，然后停下来，不需要喇叭
     */
    public static void main(String[] args) {
        BenzModel benzModel = new BenzModel();
        ArrayList<String> sequence = new ArrayList<>();
        sequence.add("engine boom");
        sequence.add("start");
        sequence.add("stop");
//        sequence.add("alarm");  不需要这个
        benzModel.setSequence(sequence);
        benzModel.run();
    }
}
