package big_talk_pattern.composite;

/**
 * @program: designPrinciple->Leaf
 * @description: 在组合中表示叶节点对象，叶节点没有子节点
 * @author: lanwenquan
 * @date: 2022-12-05 21:57
 */
public class Leaf extends Component {
    public Leaf() {
    }

    public Leaf(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        System.out.println("cannot add to a leaf");
    }

    @Override
    public void remove(Component component) {
        System.out.println("cannot not remove a leaf");
    }

    @Override
    public void display(int depth) {
        /*StringBuilder s = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            s.append("-");
        }
        System.out.println(s + name);*/
        String str = String.format("%0" + depth + "d", 0).replace("0", "-");
        System.out.println(str + name);
    }
}
