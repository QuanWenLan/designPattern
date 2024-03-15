package big_talk_pattern.composite.example2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Lan
 * @createTime 2024-03-15  15:29
 **/
public class Department implements OrganizationalUnit {
    private String name;
    private List<OrganizationalUnit> units;

    public Department(String name) {
        this.name = name;
        this.units = new ArrayList<>();
    }

    public void add(OrganizationalUnit unit) {
        units.add(unit);
    }

    public void remove(OrganizationalUnit unit) {
        units.remove(unit);
    }

    @Override
    public void print() {
        System.out.println("Department: " + name);
        for (OrganizationalUnit unit : units) {
            unit.print();
        }
    }
}
