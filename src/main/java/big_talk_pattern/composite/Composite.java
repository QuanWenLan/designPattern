package big_talk_pattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: designPrinciple->Composite
 * @description: 定义有枝节点行为，用来存储子部件
 * @author: lanwenquan
 * @date: 2022-12-05 22:00
 */
public class Composite extends Component {
    private List<Component> children = new ArrayList<>();

    public Composite() {
    }

    public Composite(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        children.add(component);
    }

    @Override
    public void remove(Component component) {
        children.remove(component);
    }

    @Override
    public void display(int depth) {
        /*StringBuilder s = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            s.append("-");
        }*/
        String str = String.format("%0" + depth + "d", 0).replace("0", "-");
        System.out.println(str + name);
        for (Component component : children) {
            component.display(depth + 2);
        }
    }
}
