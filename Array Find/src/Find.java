import java.util.Scanner;

public class Find {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a student's name: ");
        String input_line = scanner.nextLine();

        boolean ifExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(input_line)) {
                System.out.println("Position of the students in the list " + input_line + " is: " + (i + 1));
                ifExist = true;
                break;
            }
        }
        if (!ifExist)
            System.out.println("Not found " + input_line + " in the list.");
    }
}
