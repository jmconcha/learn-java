import java.util.Scanner;

public class RightTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input limit: ");
        int limit = scanner.nextInt();

        for (int i = 0; i < limit; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i || i == limit - 1) {
                    System.out.print("+ ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
    }
}