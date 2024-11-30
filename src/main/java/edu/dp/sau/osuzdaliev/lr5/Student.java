package edu.dp.sau.osuzdaliev.lr5;
public class Student {
    private int id;
    private String lastName;
    private String firstName;
    private String middleName;
    private String birthDate;
    private String gradeBookNumber;
    public Student(int id, String lastName, String firstName, String middleName, String birthDate, String gradeBookNumber) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.birthDate = birthDate;
        this.gradeBookNumber = gradeBookNumber;
    }
    public int getId() {
        return id;
    }
    public String getLastName() {
        return lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getMiddleName() {
        return middleName;
    }
    public String getBirthDate() {
        return birthDate;
    }
    public String getGradeBookNumber() {
        return gradeBookNumber;
    }
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", gradeBookNumber='" + gradeBookNumber + '\'' +
                '}';
    }
}
