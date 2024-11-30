package edu.dp.sau.osuzdaliev.lr4.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
public class Department {
    private String name;
    private Human head;
    private List<Group> groups;
    public Department(String name, Human head) {
        this.name = name;
        this.head = head;
        this.groups = new ArrayList<>();
    }
    public void addGroup(Group group) {
        groups.add(group);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Human getHead() {
        return head;
    }
    public void setHead(Human head) {
        this.head = head;
    }
    public List<Group> getGroups() {
        return groups;
    }
    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return name.equals(that.name) &&
                head.equals(that.head) &&
                groups.equals(that.groups);
    }
    public int hashCode() {
        return Objects.hash(name, head, groups);
    }
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", head=" + head +
                ", groups=" + groups +
                '}';
    }
}
