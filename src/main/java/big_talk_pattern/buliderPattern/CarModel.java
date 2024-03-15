package big_talk_pattern.buliderPattern;

import java.util.ArrayList;

/**
 * @author Vin lan
 * @className CarModel
 * @description
 * @createTime 2021-06-08  17:25
 **/
public abstract class CarModel {
    /**
     * 这个参数是各个基本方法的执行顺序
     */
    private ArrayList<String> sequence = new ArrayList<String>();

    /**
     * 模型已启动开始跑了
     */
    public abstract void start();

    /**
     * 能发动，还要能停下来
     */
    public abstract void stop();

    /**
     * 喇叭会出声音，是滴滴叫，还是哔哔叫
     */
    public abstract void alarm();

    /**
     * 引擎声音
     */
    public abstract void engineBoom();

    /**
     * 总之模型要会跑才行（模板方法模式的模型）
     */
    final public void run() {
        for (int i = 0; i < sequence.size(); i++) {
            String actionName = this.sequence.get(i);
            if ("start".equalsIgnoreCase(actionName)) {
                start();
            } else if ("stop".equalsIgnoreCase(actionName)) {
                stop();
            } else if ("alarm".equalsIgnoreCase(actionName)) {
                alarm();
            } else if ("engine boom".equalsIgnoreCase(actionName)) {
                engineBoom();
            }
        }
    }

    /**
     * 在这其中定义车辆模型的动作顺序，然后run方法根据sequence定义的顺序完成指定的顺序动作，有点像 <p>模板方法模式</p>
     * @param sequence
     */
    public void setSequence(ArrayList<String> sequence) {
        this.sequence = sequence;
    }

}
