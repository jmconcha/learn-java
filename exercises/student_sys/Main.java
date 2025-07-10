package exercises.student_sys;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

import exercises.student_sys.Student;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    HashMap<Integer, Student> studentList = new HashMap<Integer, Student>();

    public static void main(String[] args) {
        Main main = new Main();
        int userCmd;

        do {
            System.out.println("\n===== STUDENT RECORD SYSTEM =====");
            System.out.println("[1] Add Student");
            System.out.println("[2] View All Students");
            System.out.println("[3] Search Student by ID");
            System.out.println("[4] Update Student");
            System.out.println("[5] Delete Student");
            System.out.println("[6] Save to File");
            System.out.println("[7] Load from File");
            System.out.println("[8] Convert Grade to Binary");
            System.out.println("[9] Exit");
            System.out.print("Choose an option: ");
            userCmd = scanner.nextInt();
            scanner.nextLine();
            System.out.println();
            
            switch (userCmd) {
                case 1:
                    main.addStudent();
                    break;
                case 2:
                    main.viewStudents();
                    break;
                case 3:
                    main.searchStudent();
                    break;
                case 4:
                    main.updateStudent();
                    break;
                case 5:
                    main.deleteStudent();
                    break;
                case 9:
                    System.out.println("Exitting...");
                    break;
                default:
                    System.out.println("Selected option invalid.");
            }
        } while (userCmd != 9);
    }

    public boolean isExist(int studentId) {
        if (studentList.get(studentId) == null) {
            System.out.println("Student not found.");
            return false;
        }

        return true;
    }

    public int getStudentId() {
        System.out.print("Enter student id: ");
        int studentId = scanner.nextInt();
        scanner.nextLine();
        
        return studentId;
    }

    public void addStudent() {
        System.out.println("Adding student...");

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter course: ");
        String course = scanner.nextLine();

        System.out.print("Enter grade: ");
        double grade = scanner.nextDouble();

        System.out.print("Enter student ID: ");
        int id = scanner.nextInt();

        Student student = new Student(name, course, grade,id);
        studentList.put(id, student);

        System.out.println("Student saved...");
    }

    public void viewStudents() {
        System.out.println("ID \t Name \t Course \t Grade \t");
        for (Map.Entry<Integer, Student> entry : studentList.entrySet()) {
            Student student = entry.getValue();
            System.out.println(student.id + "\t" + student.name + "\t" + student.course + "\t" + student.grade);
        }
    }

    public void searchStudent() {
        int studentId = getStudentId();

        if (isExist((studentId))) {
            Student student = studentList.get(studentId);
            System.out.println("ID \t Name \t Course \t Grade \t");
            System.out.println(student.id + "\t" + student.name + "\t" + student.course + "\t" + student.grade);
        }
    }

    public void updateStudent() {
        int studentId = getStudentId();

        if (isExist((studentId))) {
            Student student = studentList.get(studentId);
            System.out.println("Updating student...");

            System.out.print("Enter name: ");
            String name = scanner.nextLine();

            System.out.print("Enter course: ");
            String course = scanner.nextLine();

            System.out.print("Enter grade: ");
            double grade = scanner.nextDouble();

            student.name = name;
            student.course = course;
            student.grade = grade;

            System.out.println("Changes saved...");
        }
    }

    public void deleteStudent() {
        int studentId = getStudentId();

        if (isExist((studentId))) {
            studentList.remove(studentId);
            System.out.println("Student removed.");
        }
    }
}