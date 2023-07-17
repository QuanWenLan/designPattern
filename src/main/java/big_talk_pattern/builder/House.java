package big_talk_pattern.builder;

/**
 * @program: designPrinciple->House
 * @description: 建造者模式的产品
 * @author: lanwenquan
 * @date: 2022-12-04 13:32
 */
public class House {
    private String basic;
    private String wall;
    private String roof;

    public String getBasic() {
        return basic;
    }

    public void setBasic(String basic) {
        this.basic = basic;
    }

    public String getWall() {
        return wall;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    public String getRoof() {
        return roof;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }

    @Override
    public String toString() {
        return "House{" +
                "basic='" + basic + '\'' +
                ", wall='" + wall + '\'' +
                ", roof='" + roof + '\'' +
                '}';
    }
}
