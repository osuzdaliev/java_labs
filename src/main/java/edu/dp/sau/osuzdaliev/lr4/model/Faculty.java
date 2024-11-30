package edu.dp.sau.osuzdaliev.lr4.model;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Faculty faculty = (Faculty) o;
        return name.equals(faculty.name) &&
                dean.equals(faculty.dean) &&
                departments.equals(faculty.departments);
    }
    public int hashCode() {
        return Objects.hash(name, dean, departments);
    }
    public String toString() {
        return "Faculty{" +
                "name='" + name + '\'' +
                ", dean=" + dean +
                ", departments=" + departments +
                '}';
    }
}
