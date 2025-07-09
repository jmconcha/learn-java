import java.util.Arrays;

public class BubbleSort {
  public static void main(String[] args) {
    int[] numbers = {500, 3, 23, 4, 21, 100, 400};
    boolean flag = true;
    int aux = 0;

    while (flag) {
      flag = false;
      for (int i = 0; i < numbers.length - 1; i++) {
        if (numbers[i] > numbers[i + 1]) {
          aux = numbers[i];
          numbers[i] = numbers[i + 1];
          numbers[i + 1] = aux;
          flag = true;
        }
      }
    }

    System.out.println("Sorted Numbers: " + Arrays.toString(numbers));
  }
}