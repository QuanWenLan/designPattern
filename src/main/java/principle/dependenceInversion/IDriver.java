package principle.dependenceInversion;

public interface IDriver {
    // 是司机就应该会驾驶汽车
    void driver(ICar car);  // 接口申明依赖方式 ，接口注入
}

class Driver implements IDriver{

    private ICar iCar;
    public Driver(){}

    public Driver(ICar car){
        this.iCar = car;  // 构造注入
    }


    @Override
    public void driver(ICar car) {
        car.run();
    }

    public void driver2() {
        iCar.run();
    }
}

