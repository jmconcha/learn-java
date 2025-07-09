import java.util.Scanner;

public class Olympic {
    public static void main(String[] args) {
        final int OLYMPIC_STARTED = 1896;
        final int INTERVAL = 4;
        Scanner scanner = new Scanner(System.in);
        int year;

        System.out.print("Enter year: ");
        year = scanner.nextInt();

        if (year < OLYMPIC_STARTED) {
            System.out.println("Olympic not started yet.");
        } else if ((year % 4) == 0) {
            System.out.println("Olympic Year");
        } else {
            System.out.println("Not Olympic Year");
        }
    }
}