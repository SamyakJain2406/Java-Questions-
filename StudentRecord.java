import java.util.Scanner;

/**
 * StudentsRecords
 */
public class StudentRecord {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        InnerStudentsRecords[] students = new InnerStudentsRecords[100];
        int studentCount = 0;
        boolean exit = false;


        do {
            System.out.println("\nStudent Record Management System");
            System.out.println("1. Add Student");
            System.out.println("2. View Student Records");
            System.out.println("3. Update Student Grade");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Add Student 
                    System.out.print("Enter student ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();  
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter student grade: ");
                    String grade = scanner.next();

                    students[studentCount] = new InnerStudentsRecords(id, name, grade);
                    studentCount++;
                    break;
                    

                case 2:
                    // View Student Records 
                    System.out.println("Student Records:");
                    for (int i = 0; i < studentCount; i++) {
                        System.out.println(students[i]);
                    }
                    break;

                case 3:
                    // Update Student Grade 
                    System.out.print("Enter student ID to update grade: ");
                    int updateId = scanner.nextInt();
                    System.out.print("Enter new grade: ");
                    String newGrade = scanner.next();

                    for (int i = 0; i < studentCount; i++) {
                        if (students[i].getId() == updateId) {
                            students[i].setGrade(newGrade);
                            System.out.println("Grade updated successfully.");
                            break;
                        }
                    }
                    break;

                case 4:
                    System.out.println("Exiting the program.");
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (!exit);

        scanner.close();
    }
}

/**
 * InnerStudentsRecords
 */
class InnerStudentsRecords {

    private int id;
    private String name;
    private String grade;

    public InnerStudentsRecords(int id, String name, String grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Grade: " + grade;
    }
    
}