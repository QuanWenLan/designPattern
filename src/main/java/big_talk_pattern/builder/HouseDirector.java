package big_talk_pattern.builder;

/**
 * @program: designPrinciple->DirectorHouse
 * @description: 指挥者
 * @author: lanwenquan
 * @date: 2022-12-04 13:38
 */
public class HouseDirector {
    /**
     * 聚合了 HouseBuilder
     */
    private HouseBuilder houseBuilder;

    public HouseBuilder getHouseBuilder() {
        return houseBuilder;
    }

    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    /**
     * 如何处理建造房子的流程，交给指挥者
     */
    public House constructHouse() {
        houseBuilder.buildBasic();
        houseBuilder.buildWall();
        houseBuilder.buildRoof();
        return houseBuilder.buildHouse();
    }
}
