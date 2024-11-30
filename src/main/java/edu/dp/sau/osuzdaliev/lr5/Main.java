package edu.dp.sau.osuzdaliev.lr5;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        StudentService studentService = new StudentService();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the month (1-12) to fetch students born in that month:");
        int month = scanner.nextInt();
        List<Student> students = studentService.getStudentsByMonth(month);
        if (students.isEmpty()) {
            System.out.println("No students found for the given month.");
        } else {
            students.forEach(System.out::println);
        }
    }
}
