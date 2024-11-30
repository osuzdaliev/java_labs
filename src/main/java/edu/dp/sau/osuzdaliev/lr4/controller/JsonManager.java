package edu.dp.sau.osuzdaliev.lr4.controller;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import edu.dp.sau.osuzdaliev.lr4.model.University;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class JsonManager {
    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();
    public static void saveToJson(University university, String fileName) throws IOException {
        try (FileWriter writer = new FileWriter(fileName)) {
            gson.toJson(university, writer);
        }
    }
    public static University readFromJson(String fileName) throws IOException {
        try (FileReader reader = new FileReader(fileName)) {
            return gson.fromJson(reader, University.class);
        }
    }
}
