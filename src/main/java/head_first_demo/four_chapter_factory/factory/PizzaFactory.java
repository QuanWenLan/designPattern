package head_first_demo.four_chapter_factory.factory;

/**
 * @program: designPrinciple->PizzaFactory
 * @description: 当前模式是只有一个“简单披萨制造工厂”，但是如果是别的地方也有预定情况会是咋样？
 * 问题：有别的地市的想加盟披萨店，披萨店老板（你）想让加盟店都利用你的代码，好让流程一致。
 * 其中一家加盟店希望能制造纽约风味的披萨，另一家则希望制造芝加哥风味的披萨
 * NYPizzaFactory 和 ChicagoPizzaFactory 和 CaliforniaPizzaFactory
 * @author: lanwenquan
 * @date: 2020-03-19 22:19
 */
public class PizzaFactory {
    public Pizza createPizza(String type) {
        if ("".equals(type)) {
            return  null;
        } else if ("cheese".equals(type)) {
            return new CheesePizza();
        } else {
            return  new PepperoniPizza();
        }
    }
}
