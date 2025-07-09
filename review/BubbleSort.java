import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {-10, 10, 100, 1, 50, -2, 40, 3, 2, 143};
        boolean flag = true;
        int aux;

        while (flag) {
            flag = false;

            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] > nums[i + 1]) {
                    aux = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = aux;
                    flag = true;
                }
            }
        }

        // System.out.print("Sorted Array: ");
        // for (int j = 0; j < nums.length; j++) {
        //     System.out.print(nums[j] + ", ");
        // }
        // System.out.println();

        System.out.println(Arrays.toString(nums));
    }
}