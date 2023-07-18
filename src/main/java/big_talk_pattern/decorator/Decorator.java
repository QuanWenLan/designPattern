package big_talk_pattern.decorator;

/**
 * @program: designPrinciple->Decorator
 * @description: 装饰类，从外类扩展 Component 的功能
 * @author: lanwenquan
 * @date: 2022-11-28 22:11
 */
public class Decorator extends Component {
    protected Component component;

    @Override
    public void operation() {
        if (component != null) {
            component.operation();
        }
    }

    public Component getComponent() {
        return component;
    }

    public void setComponent(Component component) {
        this.component = component;
    }
}
