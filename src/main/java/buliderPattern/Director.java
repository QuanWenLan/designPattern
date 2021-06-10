package buliderPattern;

import buliderPattern.*;

import java.util.ArrayList;

/**
 * @author Vin lan
 * @className Director
 * @description
 * @createTime 2021-06-09  16:28
 **/
public class Director {
    private ArrayList<String> sequence = new ArrayList<>();
    private BenzBuilder benzBuilder = new BenzBuilder();
    private BMWBuilder bmwBuilder = new BMWBuilder();

    /**
     * A 类型的奔驰车模型，先start，然后stop，其他什么引擎、喇叭一概没有
     */
    public BenzModel getABenzModel() {
        // 清理场景
        this.sequence.clear();
        // ABenzModel 执行顺序
        this.sequence.add("start");
        this.sequence.add("stop");
        this.benzBuilder.setSequence(this.sequence);
        return (BenzModel) this.benzBuilder.getCarModel();
    }

    /**
     * B 类型的奔驰车模型，先发动引擎，然后启动，然后停止，没有喇叭
     */
    public BenzModel getBBenzModel() {
        // 清理场景
        this.sequence.clear();
        // ABenzModel 执行顺序
        this.sequence.add("engine boom");
        this.sequence.add("start");
        this.sequence.add("stop");
        this.benzBuilder.setSequence(this.sequence);
        return (BenzModel) this.benzBuilder.getCarModel();
    }

    /**
     * C 类型的宝马车模型，先按下喇叭，然后启动，然后停止
     */
    public BMWModel getCBmwModel() {
        // 清理场景
        this.sequence.clear();
        // ABenzModel 执行顺序
        this.sequence.add("alarm");
        this.sequence.add("start");
        this.sequence.add("stop");
        this.bmwBuilder.setSequence(this.sequence);
        return (BMWModel) this.benzBuilder.getCarModel();
    }

    /**
     * D 类型的宝马车模型，就是跑，启动起来就跑，永远不停止
     */
    public BMWModel getDBmwModel() {
        // 清理场景
        this.sequence.clear();
        // ABenzModel 执行顺序
        this.sequence.add("start");
        this.benzBuilder.setSequence(this.sequence);
        return (BMWModel) this.benzBuilder.getCarModel();
    }
}
