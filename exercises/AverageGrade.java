import java.util.Scanner;

public class AverageGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of grades (max 5): ");
        int n = scanner.nextInt();

        if (n < 1 || n > 5) {
            System.out.println("Must be between 1 and 5");
            return;
        }

        float[] grades = new float[n];;
        float sum = 0;

        System.out.println("===== STUDENT GRADES =====\n");
        for (int i = 0; i < grades.length; i++) {
            System.out.print("Input students grade " + (i + 1) + ": ");
            grades[i] = scanner.nextFloat();
            sum += grades[i];
        }

        System.out.println("Average: " + sum / grades.length);
    }
}