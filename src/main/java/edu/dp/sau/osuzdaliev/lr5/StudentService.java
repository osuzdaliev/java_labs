package edu.dp.sau.osuzdaliev.lr5;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class StudentService {
    public List<Student> getStudentsByMonth(int month) {
        List<Student> students = new ArrayList<>();
        String query = "SELECT * FROM Students WHERE MONTH(BirthDate) = ?";
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, month);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                students.add(new Student(
                        resultSet.getInt("ID"),
                        resultSet.getString("LastName"),
                        resultSet.getString("FirstName"),
                        resultSet.getString("MiddleName"),
                        resultSet.getDate("BirthDate").toString(),
                        resultSet.getString("GradeBookNumber")
                ));
            }
        } catch (SQLException e) {
            System.out.println("Error fetching students: " + e.getMessage());
        }
        return students;
    }
}
