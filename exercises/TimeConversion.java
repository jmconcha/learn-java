import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int noon = 1200;
        int time;

        while (true) {
            System.out.print("Enter time: ");
            time = scanner.nextInt();


            if (time < noon) {
                if (time < 59) {
                    System.out.println("12:" + time + " AM");
                } else {
                    int hours = time / 100;
                    int minutes = time % 100;
                    System.out.println(hours + ":" + minutes + " AM");
                }
            } else {
                int diff = time - noon;
                if (diff < 59) {
                    System.out.println("12:" + diff + " PM");
                } else {
                    int temp = diff / 100;
                    int minutes = diff % 100;
                    System.out.println(temp / 100 + ":" + minutes + " PM");
                }
            }
        }
    }
}