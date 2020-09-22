package principle.liskov;

/**
 * @ClassName Liskov
 * @Description TODO  里氏替换原则
 * @Author Administrator
 * @Date 2019/4/12  14:57
 * @Version 1.0
 * 里氏替换原则是用来解决子类父类继承的问题，其目的是保持父类方法不被覆盖
 * 所有引用基类的地方必须能透明地使用其子类的对象
 * 4层含义：
 * 1.子类必须完全实现父类的方法
 * 2.子类可以有自己的个性  ,子类可以出现的地方父类就未必可以出现
 * 3.覆盖或实现父类的方法时输入参数可以被放大
 * 4.覆写或实现父类的方法时输出结果可以被缩小
 */
public class Liskov {
    public static void main(String [] args){
        /**
         * 注意　在类中调用其他类时务必要使用父类或接口，如果不能使用父类或接口，则说明
         *       类的设计已经违背了LSP原则。
         */
        /*Solider sanMao = new Solider();
        sanMao.setGun(new HandGun());
        sanMao.killEnemy();*/ // 这个就已经违反了业务逻辑，士兵杀人但是子弹，只能等着被人杀

        Solider sanMao = new Solider();
        sanMao.setGun(new ToyGun());
        sanMao.killEnemy();
    }
}
