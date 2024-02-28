import java.util.ArrayList;
import java.util.Scanner;

public class StudentFunctions {
    ArrayList<Student> studentList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void addStudent() {
        System.out.println("Enter number of students you want to add");
        int numberOfStudents = scanner.nextInt();
        System.out.println("Enter Student/s");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter Student Id");
            int id = scanner.nextInt();
            System.out.println("Enter Student Name");
            String name = scanner.next();
            System.out.println("Enter Student Age");
            int age = scanner.nextInt();
            Student student = new Student(id, name, age);
            studentList.add(student);
        }
    }

    public void printStudentDetails() {
        System.out.println("--------- Student Information --------");
        for (int i = 0; i < studentList.size(); i++) {
            printStudent(i);
        }
    }

    public void printStudent(int i) {
        System.out.println("Student Id" + "\t" + "Student Name" + "\t" + "Student Age");
        System.out.println(studentList.get(i).getStudentId() + "   " +
                studentList.get(i).getStudentName() + "  " +
                studentList.get(i).getAge());
    }

    public void deleteStudent() {
        System.out.println("Enter Student Id to delete the student");
        int studentId = scanner.nextInt();
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getStudentId() == studentId) {
                System.out.println(studentList.get(i).getStudentName() + " deleted from ArrayList");
                studentList.remove(i);
            } else {
                System.out.println("Student not available");
            }
        }
    }
}