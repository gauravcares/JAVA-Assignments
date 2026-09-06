import java.util.Scanner;

class Student {
    String name;
    int id;
    String course;

    Student(String name, int id, String course) {
        this.name = name;
        this.id = id;
        this.course = course;
    }

    void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + id);
        System.out.println("Course: " + course);
    }
}

class Faculty {
    String name;
    int id;
    String department;

    Faculty(String name, int id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }

    void display() {
        System.out.println("Faculty Name: " + name);
        System.out.println("Faculty ID: " + id);
        System.out.println("Department: " + department);
    }
}

public class CampusManagementApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Student");
            System.out.println("2. Add Faculty");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Enter student name: ");
                String name = sc.nextLine();

                System.out.print("Enter student ID: ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter course: ");
                String course = sc.nextLine();

                Student student = new Student(name, id, course);
                student.display();

            } else if (choice == 2) {
                System.out.print("Enter faculty name: ");
                String name = sc.nextLine();

                System.out.print("Enter faculty ID: ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter department: ");
                String department = sc.nextLine();

                Faculty faculty = new Faculty(name, id, department);
                faculty.display();

            } else if (choice == 3) {
                break;

            } else {
                System.out.println("Invalid choice");
            }
        }

        sc.close();
    }
}
