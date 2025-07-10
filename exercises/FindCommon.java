// find common elements between two arrays

import java.util.HashSet;

public class FindCommon {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = {2, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        HashSet<Integer> common = new HashSet<Integer>();

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    common.add(arr1[i]);
                    break;
                }
            }   
        }

        System.out.print("Common elements: ");
        for (int num : common) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}