package edu.dp.sau.osuzdaliev.lr3.model;
import java.util.ArrayList;
import java.util.List;
public class Department {
    private String name;
    private Human head;
    private List<Group> groups = new ArrayList<>();
    public Department(String name, Human head) {
        this.name = name;
        this.head = head;
    }
    public void addGroup(Group group) {
        groups.add(group);
    }
    public String toString() {
        return "Department: " + name + "\nHead: " + head + "\nGroups: " + groups + "\n";
    }
}
