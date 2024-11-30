package edu.dp.sau.osuzdaliev.lr3;
import edu.dp.sau.osuzdaliev.lr3.controller.*;
import edu.dp.sau.osuzdaliev.lr3.model.*;
public class Run {
    public static void main(String[] args) {
        University university = createTypicalUniversity();
        System.out.println(university);
    }
    public static University createTypicalUniversity() {
        Human rector = new Human("John", "Doe", "Smith", Sex.MALE);
        University university = UniversityCreator.createUniversity("Example University", rector);
        Human dean = new Human("Alice", "Johnson", "M.", Sex.FEMALE);
        Faculty faculty = FacultyCreator.createFaculty("Faculty of Science", dean);
        Human departmentHead = new Human("Mark", "Brown", "L.", Sex.MALE);
        Department department = DepartmentCreator.createDepartment("Department of Physics", departmentHead);
        Human groupHead = new Human("Sarah", "Taylor", "E.", Sex.FEMALE);
        Group group1 = GroupCreator.createGroup("Physics Group 1", groupHead);
        group1.addStudent(StudentCreator.createStudent("Jake", "White", "P.", Sex.MALE));
        group1.addStudent(StudentCreator.createStudent("Emma", "Davis", "Q.", Sex.FEMALE));
        Group group2 = GroupCreator.createGroup("Physics Group 2", new Human("Tom", "Harris", "F.", Sex.MALE));
        group2.addStudent(StudentCreator.createStudent("Liam", "Moore", "R.", Sex.MALE));
        group2.addStudent(StudentCreator.createStudent("Sophia", "Clark", "S.", Sex.FEMALE));
        department.addGroup(group1);
        department.addGroup(group2);
        faculty.addDepartment(department);
        university.addFaculty(faculty);
        return university;
    }
}

