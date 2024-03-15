package principle.interfaceisolation.version2;

/**
 * @author Lan
 * @createTime 2024-03-13  11:18
 **/
public class Client2 {
    public static void main(String[] args) {
        // 2
        IGoodBodyGirl yanYan = new PettyGirl2("嫣嫣");
        AbstractSearcher2 searcher = new Searcher2(yanYan);
        searcher.show();

        IGreatTemperamentGirl yanYan2 = new PettyGirl2("嫣嫣2");
        AbstractSearcher2 searcher2 = new Searcher2(yanYan2);
        searcher2.show();
    }
}
