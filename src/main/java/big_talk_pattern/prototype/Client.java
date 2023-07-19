package big_talk_pattern.prototype;

/**
 * @author Lan
 * @createTime 2023-07-18  15:57
 **/
public class Client {
    public static void main(String[] args) {
        Prototype a = new ConcretePrototype1("a");
        Prototype aCopy = a.cloneObj();
        System.out.println(aCopy);

        Prototype b = new ConcretePrototype2("b");
        System.out.println(b);
        Prototype bCopy = b.cloneObj();
        System.out.println(bCopy);
    }
}
