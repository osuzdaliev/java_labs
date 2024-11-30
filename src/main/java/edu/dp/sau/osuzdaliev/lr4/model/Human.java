package edu.dp.sau.osuzdaliev.lr4.model;
import java.util.Objects;
public class Human {
    private String firstName;
    private String lastName;
    private String middleName;
    private Sex gender;
    public Human(String firstName, String lastName, String middleName, Sex gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.gender = gender;
    }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return firstName.equals(human.firstName) &&
                lastName.equals(human.lastName) &&
                middleName.equals(human.middleName) &&
                gender == human.gender;
    }
    public int hashCode() {
        return Objects.hash(firstName, lastName, middleName, gender);
    }
    public String toString() {
        return firstName + " " + middleName + " " + lastName + " (" + gender + ")";
    }
}
