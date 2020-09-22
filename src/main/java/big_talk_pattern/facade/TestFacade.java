package big_talk_pattern.facade;

/**
 * @program: designPrinciple->TestFacade
 * @description:
 * @author: lanwenquan
 * @date: 2020-08-19 16:17
 */
public class TestFacade {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.methodA();
        facade.methodB();
    }
}
