package edu.dp.sau.osuzdaliev.lr4.model;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
public class University {
    private String name;
    private Human rector;
    private List<Faculty> faculties = new ArrayList<>();
    public University(String name, Human rector) {
        this.name = name;
        this.rector = rector;
    }
    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        University that = (University) o;
        return name.equals(that.name) &&
                rector.equals(that.rector) &&
                faculties.equals(that.faculties);
    }
    public int hashCode() {
        return Objects.hash(name, rector, faculties);
    }
    public String toString() {
        return "University{" +
                "name='" + name + '\'' +
                ", rector=" + rector +
                ", faculties=" + faculties +
                '}';
    }
}
