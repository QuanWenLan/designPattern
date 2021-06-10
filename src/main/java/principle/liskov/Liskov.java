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
        sanMao.killEnemy();*/

        // （1）以下这个就已经违反了业务逻辑，士兵杀人但是没有子弹，只能等着被人杀
/*        Solider sanMao = new Solider();
        sanMao.setGun(new ToyGun1());
        sanMao.killEnemy();*/

        Solider sanMao2 = new Solider();
        ToyGun toyGun = new ToyGun();
        toyGun.setAbstractGun(new HandGun());
        sanMao2.setGun(toyGun.getAbstractGun());
        sanMao2.volume();
    }
}
/**
 * (1)中解决方法可以是
 * 1.在 在Soldier类中增加instanceof的判断，如果是玩具枪，就不用来杀敌人。但是，在程序中，每增加一个类，
 * 所有与这个父类有关系的类都必须修改，你觉得可行吗？如果你的产品出现了这个问题，因为修正了这样一个Bug，就要求所有与这个父类有关系的类都增加一个判断，客户非跳起来跟你干架不可。否决掉了，不可行
 * 2.ToyGun脱离继承，建立一个独立的父类，为了实现代码复用，可以与AbastractGun建立关联委托关系
 *
 */
