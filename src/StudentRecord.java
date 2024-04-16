import java.util.Scanner;

public class StudentRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of student: ");
        int numStudent = scanner.nextInt();
        //numberStudent represent the number of rows
        // we need 3 column
        String[][] studentRecords = new String[numStudent][3];
        scanner.nextLine();
        for (int i = 0; i < numStudent; i++) {
            System.out.println("Enter details for student " + (i + 1 + ":"));
            System.out.print("Enter name");
            String name = scanner.nextLine();
            System.out.print("Enter Registration number");
            String RegistrationNumber = scanner.nextLine();
            System.out.print("Enter GPA");
            String GPA = scanner.nextLine();

            studentRecords[i][0] = name;
            studentRecords[i][1] = RegistrationNumber;
            studentRecords[i][2] = GPA;
        }
        //to display the student records in table format with serial number
        System.out.println("\n\t\t\t\t\t\tStudent Records");
        System.out.println("\t+------+----------------------------+--------------------------+-----------+");
        System.out.println("\t| S.No    |   Name    |   Registration Number |   GPA |");
        System.out.println("\t+------+----------------------------+--------------------------+-----------+");
        for (int i = 0; i < numStudent; i++) {
            System.out.printf("\t| %-3d |   %-25s   |   %-24s               |  %-5s |\n", (i + 1), studentRecords[i][0], studentRecords[i][1], studentRecords[i][2]);
            System.out.println("\t+------+----------------------------+--------------------------+-----------+");
        }
        scanner.close(); //Close the scanner
    }
}

