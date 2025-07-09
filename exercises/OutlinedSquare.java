import java.util.Scanner;

public class OutlinedSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // System.out.print("Input size: ");
        // int size = scanner.nextInt();
        int size = 5;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == 0 || i == size - 1 || j == 0 || j == size - 1) {
                    System.out.print("+");
                } else {
                    System.out.print(" ");
                }
            }  
            System.out.println();
        }
    }
}