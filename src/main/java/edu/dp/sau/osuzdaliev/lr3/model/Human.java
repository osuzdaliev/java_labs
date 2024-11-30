package edu.dp.sau.osuzdaliev.lr3.model;
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
    public String toString() {
        return String.format("%s %s %s (%s)", lastName, firstName, middleName, gender);
    }
}
