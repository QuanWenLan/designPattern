package big_talk_pattern.composite;

/**
 * @program: designPrinciple->Client
 * @description: 客户端代码
 * @author: lanwenquan
 * @date: 2022-12-05 22:03
 */
public class Client {
    public static void main(String[] args) {
        Composite root = new Composite("root");
        root.add(new Leaf("Leaf A"));
        root.add(new Leaf("Leaf B"));

        Composite compositeX = new Composite("composite x");
        compositeX.add(new Leaf("Leaf XA"));
        compositeX.add(new Leaf("Leaf XB"));

        root.add(compositeX);

        Composite compositeXY = new Composite("composite xy");
        compositeXY.add(new Leaf("Leaf XYA"));
        compositeXY.add(new Leaf("Leaf XYB"));

        compositeX.add(compositeXY);

        root.add(new Leaf("Leaf C"));

        Leaf leaf_d = new Leaf("Leaf D");
        root.add(leaf_d);
        root.remove(leaf_d);

        root.display(1);

    }
}
