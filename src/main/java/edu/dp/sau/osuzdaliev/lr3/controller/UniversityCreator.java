package edu.dp.sau.osuzdaliev.lr3.controller;
import edu.dp.sau.osuzdaliev.lr3.model.University;
import edu.dp.sau.osuzdaliev.lr3.model.Human;
public class UniversityCreator {
    public static University createUniversity(String name, Human rector) {
        return new University(name, rector);
    }
}
