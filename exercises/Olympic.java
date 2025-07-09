// import java.time.Year;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Olympic {
  public static void main(String[] args) {
    final int olympicStarted = 1896;
    // int currentYear = Year.now().getValue();
    int currentYear = 0;
    Scanner scanner = new Scanner(System.in);
    Boolean flag = true;

    while (flag) {
      try {
        System.out.print("Input Year: ");
        currentYear = scanner.nextInt();
        flag = false;
      } catch (InputMismatchException err) {
        System.out.println("Please input the year in integer.");
        scanner.nextLine();
        flag = true;
      }
    }

    int difference = currentYear - olympicStarted;

    if (currentYear < 1896) {
      System.out.println("Olympic not started yet.");
    } else if (difference % 4 == 0) {
      System.out.println("Olympic Year");
    } else {
      System.out.println("Not Olympic Year");
    }
  }
}