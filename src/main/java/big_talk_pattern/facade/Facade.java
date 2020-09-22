package big_talk_pattern.facade;

/**
 * @program: designPrinciple->Facade
 * @description: 外观类，它需要了解所有子系统的方法和属性，进行组合，以备外界调用
 * @author: lanwenquan
 * @date: 2020-08-19 16:14
 */
/**
 * 外观类 负责对外提供一个接口
 */
public class Facade {
    private SubSystemOne subSystemOne;
    private SubSystemTwo subSystemTwo;
    private SubSystemThree subSystemThree;
    private SubSystemFour subSystemFour;

    public Facade() {
        subSystemOne = new SubSystemOne();
        subSystemTwo = new SubSystemTwo();
        subSystemThree = new SubSystemThree();
        subSystemFour = new SubSystemFour();
    }

    public void methodA() {
        System.out.println("方法组合A:");
        subSystemOne.method_1();
        subSystemTwo.method_2();
    }

    public void methodB() {
        System.out.println("方法组合B:");
        subSystemThree.method_3();
        subSystemFour.method_4();
    }
}

