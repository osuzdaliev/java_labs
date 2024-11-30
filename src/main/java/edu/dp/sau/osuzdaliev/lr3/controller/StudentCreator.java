package edu.dp.sau.osuzdaliev.lr3.controller;
import edu.dp.sau.osuzdaliev.lr3.model.Sex;
import edu.dp.sau.osuzdaliev.lr3.model.Student;
public class StudentCreator {
    public static Student createStudent(String firstName, String lastName, String middleName, Sex gender) {
        return new Student(firstName, lastName, middleName, gender);
    }
}
