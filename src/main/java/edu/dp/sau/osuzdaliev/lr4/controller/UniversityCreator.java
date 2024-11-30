package edu.dp.sau.osuzdaliev.lr4.controller;
import edu.dp.sau.osuzdaliev.lr4.model.Human;
import edu.dp.sau.osuzdaliev.lr4.model.University;
public class UniversityCreator {
    public static University createUniversity(String name, Human rector) {
        return new University(name, rector);
    }
}
