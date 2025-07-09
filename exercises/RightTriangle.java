import java.util.Scanner;
import java.util.InputMismatchException;

public class RightTriangle {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Boolean flag = true;
    int limit = 0;

    while (flag) {
      try {
        System.out.print("Input limit: ");
        limit = scanner.nextInt();
        flag = false;
      } catch (InputMismatchException err) {
        scanner.nextLine();
        System.out.println("Please input integer only.");
      }
    }

    for (int i = 0; i < limit; i++) {
      for (int j = 0; j <= i; j++) {
        if (j == 0 || j == i || i == (limit - 1)) {
          System.out.print(" +");
        } else {
          System.out.print(" -");
        }
      }
      System.out.println();
    }
  }
}