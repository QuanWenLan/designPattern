package big_talk_pattern.composite.example2;

/**
 * @author Lan
 * @createTime 2024-03-15  15:30
 **/
public class OrganizationExample {
    public static void main(String[] args) {
        // 创建部门和员工
        Department engineering = new Department("Engineering");
        Department sales = new Department("Sales");

        Employee engineer1 = new Employee("Alice");
        Employee engineer2 = new Employee("Bob");
        Employee salesPerson1 = new Employee("Charlie");

        // 将员工添加到部门中
        engineering.add(engineer1);
        engineering.add(engineer2);
        sales.add(salesPerson1);

        // 将部门添加到组织架构中
        Department organization = new Department("Organization");
        organization.add(engineering);
        organization.add(sales);

        // 打印整个组织架构
        organization.print();
    }
}
