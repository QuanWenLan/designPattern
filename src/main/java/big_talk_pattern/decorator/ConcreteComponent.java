package big_talk_pattern.decorator;

/**
 * @program: designPrinciple->ConcreteComponent
 * @description: 具体对象操作
 * @author: lanwenquan
 * @date: 2022-11-28 22:11
 */
public class ConcreteComponent extends Component {
    @Override
    public void operation() {
        System.out.println("具体对象的操作！");
    }
}
