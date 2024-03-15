package big_talk_pattern.buliderPattern;

import java.util.ArrayList;

/**
 * @author Vin lan
 * @className BenzBuilder
 * @description
 * @createTime 2021-06-09  16:10
 **/
public class BenzBuilder extends CarBuilder {
    BenzModel benz = new BenzModel();

    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.benz.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return this.benz;
    }
}
