package buliderPattern;

import java.util.ArrayList;

/**
 * @author Vin lan
 * @className CarBuilder
 * @description
 * @createTime 2021-06-09  16:06
 **/
public abstract class CarBuilder {
    public abstract void setSequence(ArrayList<String> sequence);
    /**
     * 设置完毕顺序后，就可以直接拿到这个车辆模型
      */
    public abstract CarModel getCarModel();
}
