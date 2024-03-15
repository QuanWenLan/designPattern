package singleton;

/**
 * @program: designPrinciple->Singleton1
 * @description: 饿汉式，枚举，不管是否需要对象
 * 表示该类型的对象是有限的几个，限定为1个就是单列了。
 * @author: lanwenquan
 * @date: 2020-08-18 21:28
 */
public enum  Singleton2 {
    INSTANCE;

    // 其他成员属性
    private String name;
    private int value;

    private Student student;

    // 构造方法（在枚举中，构造方法是私有的，只能在枚举内部使用）

    // 其他成员方法
    public void doSomething() {
        System.out.println("Doing something..." + student.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    static class Student {
        private String name;

        public Student(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
}