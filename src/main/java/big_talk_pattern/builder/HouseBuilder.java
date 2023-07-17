package big_talk_pattern.builder;

/**
 * @program: designPrinciple->HouseBulider
 * @description: 产品构建者的抽象类
 * @author: lanwenquan
 * @date: 2022-12-04 13:32
 */
public abstract class HouseBuilder {
    protected House house = new House();

    // 建造的流程
    public abstract void buildBasic();
    public abstract void buildWall();
    public abstract void buildRoof();

    // 将产品返回
    public House buildHouse() {
        return house;
    }
}
