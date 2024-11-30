package edu.dp.sau.osuzdaliev.lr3.model;
import java.util.ArrayList;
import java.util.List;
public class Faculty {
    private String name;
    private Human dean;
    private List<Department> departments = new ArrayList<>();
    public Faculty(String name, Human dean) {
        this.name = name;
        this.dean = dean;
    }
    public void addDepartment(Department department) {
        departments.add(department);
    }
    public String toString() {
        return "Faculty: " + name + "\nDean: " + dean + "\nDepartments: " + departments + "\n";
    }
}
