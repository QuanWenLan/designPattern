package principle.interfaceisolation.version2;


/**
 * @author Lan
 * @createTime 2024-03-13  11:13
 * 美女实现类
 **/
public class PettyGirl2 implements IGoodBodyGirl, IGreatTemperamentGirl {
    private String name;

    //美女都有名字
    public PettyGirl2(String _name) {
        this.name = _name;
    }

    //脸蛋漂亮
    @Override
    public void goodLooking() {
        System.out.println(this.name + "---脸蛋很漂亮!");
    }

    //气质要好
    @Override
    public void greatTemperament() {
        System.out.println(this.name + "---气质非常好!");
    }

    //身材要好
    @Override
    public void niceFigure() {
        System.out.println(this.name + "---身材非常棒!");
    }
}
