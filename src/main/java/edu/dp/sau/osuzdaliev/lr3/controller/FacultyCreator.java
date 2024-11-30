package edu.dp.sau.osuzdaliev.lr3.controller;
import edu.dp.sau.osuzdaliev.lr3.model.Faculty;
import edu.dp.sau.osuzdaliev.lr3.model.Human;
public class FacultyCreator {
    public static Faculty createFaculty(String name, Human dean) {
        return new Faculty(name, dean);
    }
}
