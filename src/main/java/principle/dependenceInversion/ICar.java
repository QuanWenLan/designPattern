package principle.dependenceInversion;

public interface ICar {
    // 是车就应该能跑
    void run();
}

class BMW implements ICar {

    @Override
    public void run() {
        System.out.println("宝马汽车开始运行。。。");
    }
}

class BENZ implements ICar {

    @Override
    public void run() {
        System.out.println("奔驰汽车开始运行。。。");
    }
}