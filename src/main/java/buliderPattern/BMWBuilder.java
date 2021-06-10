package buliderPattern;

import java.util.ArrayList;

/**
 * @author Vin lan
 * @className BMWBuilder
 * @description
 * @createTime 2021-06-09  16:10
 **/
public class BMWBuilder extends CarBuilder {
    BMWModel bmw = new BMWModel();

    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.bmw.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return this.bmw;
    }
}
