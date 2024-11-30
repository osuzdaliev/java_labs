package edu.dp.sau.osuzdaliev.lr4;
import edu.dp.sau.osuzdaliev.lr4.controller.*;
import edu.dp.sau.osuzdaliev.lr4.model.*;
public class Run {
    public static void main(String[] args) {
        University university = createTypicalUniversity();
        System.out.println(university);
        String fileName = "university.json";
        try {
            JsonManager.saveToJson(university, fileName);
            System.out.println("University saved to file: " + fileName);
            University restoredUniversity = JsonManager.readFromJson(fileName);
            System.out.println("Restored university from a file: ");
            System.out.println(restoredUniversity);
            System.out.println("Universities are equivalent: " + university.equals(restoredUniversity));
        } catch (Exception e) {
            System.err.println("Error when working with JSON: " + e.getMessage());
        }
    }
    public static University createTypicalUniversity() {
        Human rector = new Human("John", "Doe", "Smith", Sex.MALE);
        University university = UniversityCreator.createUniversity("Example University", rector);
        Human dean1 = new Human("Alice", "Johnson", "M.", Sex.FEMALE);
        Faculty faculty1 = FacultyCreator.createFaculty("Faculty of Science", dean1);
        Human headDept1 = new Human("Mark", "Brown", "L.", Sex.MALE);
        Department department1 = DepartmentCreator.createDepartment("Department of Physics", headDept1);
        Human headGroup1 = new Human("Sarah", "Taylor", "E.", Sex.FEMALE);
        Group group1 = GroupCreator.createGroup("Physics Group 1", headGroup1);
        group1.addStudent(StudentCreator.createStudent("Jake", "White", "P.", Sex.MALE));
        group1.addStudent(StudentCreator.createStudent("Emma", "Davis", "Q.", Sex.FEMALE));
        Human headGroup2 = new Human("Tom", "Harris", "F.", Sex.MALE);
        Group group2 = GroupCreator.createGroup("Physics Group 2", headGroup2);
        group2.addStudent(StudentCreator.createStudent("Liam", "Moore", "R.", Sex.MALE));
        group2.addStudent(StudentCreator.createStudent("Sophia", "Clark", "S.", Sex.FEMALE));
        department1.addGroup(group1);
        department1.addGroup(group2);
        faculty1.addDepartment(department1);
        Human dean2 = new Human("Michael", "Smith", "G.", Sex.MALE);
        Faculty faculty2 = FacultyCreator.createFaculty("Faculty of Arts", dean2);
        Human headDept2 = new Human("Laura", "Wilson", "H.", Sex.FEMALE);
        Department department2 = DepartmentCreator.createDepartment("Department of History", headDept2);
        Human headGroup3 = new Human("James", "Anderson", "I.", Sex.MALE);
        Group group3 = GroupCreator.createGroup("History Group 1", headGroup3);
        group3.addStudent(StudentCreator.createStudent("Olivia", "Brown", "T.", Sex.FEMALE));
        group3.addStudent(StudentCreator.createStudent("Noah", "Williams", "U.", Sex.MALE));
        department2.addGroup(group3);
        faculty2.addDepartment(department2);
        university.addFaculty(faculty1);
        university.addFaculty(faculty2);
        return university;
    }
}
