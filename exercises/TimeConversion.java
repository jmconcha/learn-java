import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hr, min, time;

        while (true) {
            System.out.print("Enter time: ");
            time = scanner.nextInt();
            
            min = time % 100;
            hr = time / 100;

            
            if (hr > 12) {
              System.out.printf("%02d:%02d PM%n", hr - 12, min);
            } else {
              System.out.printf("%02d:%02d %s%n", hr, min, hr == 12 ? "PM" : "AM");
            }
        }
    }
}