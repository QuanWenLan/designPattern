package big_talk_pattern.abstract_factory;

/**
 * @program: designPrinciple -->Red
 * @Description : <blue>实现color的子类</blue>
 * @author: lanwenquan
 * @creatTime: 2020-01-13 22 : 05
 **/

public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}
