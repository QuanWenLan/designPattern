package big_talk_pattern.builder;

/**
 * @program: designPrinciple->HighBuildingHouse
 * @description:
 * @author: lanwenquan
 * @date: 2022-12-04 13:35
 */
public class HighBuildingHouse extends HouseBuilder{
    @Override
    public void buildBasic() {
        System.out.println("别墅打地基7m");
    }

    @Override
    public void buildWall() {
        System.out.println("别墅砌墙20m");
    }

    @Override
    public void buildRoof() {
        System.out.println("别墅盖屋顶，完工！");
    }
}
