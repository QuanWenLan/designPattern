package principle.dependenceInversion;

/**
 * @ClassName DependenceInversion
 * @Description TODO  依赖倒置，即面向接口编程
 * @Author Administrator
 * @Date 2019/4/12  16:41
 * @Version 1.0
 * 1.高层模块不应该依赖低层模块，两者都应该依赖其抽象；
 * 2.抽象不应该依赖细节；
 * 3.细节应该依赖抽象。
 */
public class DependenceInversion {
    public static void main(String [] args){
        IDriver zhangSan = new Driver();
        ICar iCar = new BENZ();
        zhangSan.driver(iCar);
    }
}
