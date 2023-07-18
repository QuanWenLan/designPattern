package big_talk_pattern.builder;

/**
 * @program: designPrinciple->Client
 * @description: 客户端
 * @author: lanwenquan
 * @date: 2022-12-04 13:54
 */
public class Client {
    public static void main(String[] args) {
        // 具体的建造者
        CommonHouse commonHouse = new CommonHouse();
        // 指挥者
        HouseDirector director = new HouseDirector();
        director.setHouseBuilder(commonHouse);
        // 返回产品
        House house = director.constructHouse();
        System.out.println(house);

        HighBuildingHouse highBuildingHouse = new HighBuildingHouse();
        director.setHouseBuilder(highBuildingHouse);
        // 返回产品
        House highHouse = director.constructHouse();
        System.out.println(highHouse);
    }
}
