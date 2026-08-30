import java.util.Scanner;

class Student {
    private String name;
    private String studentId;
    private int mark;

    public Student(String name, String studentId, int mark) {
        if (name == null || name.trim().isEmpty())
            throw new IllegalArgumentException("Invalid name");

        if (studentId == null || studentId.trim().isEmpty())
            throw new IllegalArgumentException("Invalid student ID");

        if (mark < 0 || mark > 100)
            throw new IllegalArgumentException("Mark must be 0 to 100");

        this.name = name;
        this.studentId = studentId;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public String getStudentId() {
        return studentId;
    }

    public int getMark() {
        return mark;
    }

    public boolean setMark(int newMark) {
        if (newMark < 0 || newMark > 100)
            return false;

        mark = newMark;
        return true;
    }

    public boolean hasPassed() {
        return mark >= 50;
    }

    public String getClassification() {
        if (mark >= 80)
            return "Distinction";
        else if (mark >= 50)
            return "Pass";
        else
            return "Fail";
    }

    public String toString() {
        return "Name: " + name +
               ", ID: " + studentId +
               ", Mark: " + mark +
               ", Classification: " + getClassification();
    }
}

public class StudentRecord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student[] students = new Student[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter student name: ");
            String name = sc.nextLine();

            System.out.print("Enter student ID: ");
            String id = sc.nextLine();

            System.out.print("Enter mark: ");
            int mark = sc.nextInt();
            sc.nextLine();

            students[i] = new Student(name, id, mark);
        }

        System.out.println("\nStudent Records:");

        for (Student student : students) {
            System.out.println(student);
        }

        System.out.print("\nEnter student number to update mark (1-3): ");
        int number = sc.nextInt();

        System.out.print("Enter new mark: ");
        int newMark = sc.nextInt();

        boolean result = students[number - 1].setMark(newMark);

        System.out.println("Update successful: " + result);
        System.out.println(students[number - 1]);

        sc.close();
    }
}
