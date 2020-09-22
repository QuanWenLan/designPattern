package big_talk_pattern.abstract_factory;

/**
 * @program: designPrinciple -->ColorFactory
 * @Description : <blue>填充颜色的工厂</blue>
 * @author: lanwenquan
 * @creatTime: 2020-01-13 22 : 09
 **/

public class ColorFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType){
        return null;
    }

    @Override
    public Color getColor(String color) {
        if(color == null){
            return null;
        }
        if(color.equalsIgnoreCase("RED")){
            return new Red();
        } else if(color.equalsIgnoreCase("GREEN")){
            return new Green();
        } else if(color.equalsIgnoreCase("BLUE")){
            return new Blue();
        }
        return null;
    }
}
