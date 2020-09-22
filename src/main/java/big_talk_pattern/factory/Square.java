package big_talk_pattern.factory;

/**
 * @ClassName Square
 * @Description TODO
 * @Author lanwenquan
 * @Date 2020/1/13 16:13
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}