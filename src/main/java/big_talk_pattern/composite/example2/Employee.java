package big_talk_pattern.composite.example2;

/**
 * @author Lan
 * @createTime 2024-03-15  15:29
 **/
public class Employee implements OrganizationalUnit {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("Employee: " + name);
    }
}
