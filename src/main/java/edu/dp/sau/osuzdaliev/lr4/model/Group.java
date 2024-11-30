package edu.dp.sau.osuzdaliev.lr4.model;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
public class Group {
    private String name;
    private Human head;
    private List<Student> students = new ArrayList<>();
    public Group(String name, Human head) {
        this.name = name;
        this.head = head;
    }
    public void addStudent(Student student) {
        students.add(student);
    }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Group group = (Group) o;
        return name.equals(group.name) &&
                head.equals(group.head) &&
                students.equals(group.students);
    }
    public int hashCode() {
        return Objects.hash(name, head, students);
    }
    public String toString() {
        return "Group{" +
                "name='" + name + '\'' +
                ", head=" + head +
                ", students=" + students +
                '}';
    }
}
