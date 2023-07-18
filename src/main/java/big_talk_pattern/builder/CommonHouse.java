package big_talk_pattern.builder;

/**
 * @program: designPrinciple->CommonHose
 * @description:
 * @author: lanwenquan
 * @date: 2022-12-04 13:35
 */
public class CommonHouse extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println("普通房子打地基5m");
        house.setBasic("普通房子地基");
    }

    @Override
    public void buildWall() {
        System.out.println("普通房子砌墙10m");
        house.setWall("普通房子砌墙");
    }

    @Override
    public void buildRoof() {
        System.out.println("普通房子盖屋顶，完工！");
        house.setRoof("普通房子屋顶");
    }
}
