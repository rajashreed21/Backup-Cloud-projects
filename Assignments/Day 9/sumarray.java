package assignments;

import java.util.Arrays;

public class sumarray {
    public static void main(String[] args) {
        int[] arr = {55,3,9,32,17,45};
        System.out.println("Arr: " + Arrays.toString(arr));
        int sum = Sum(arr);
        System.out.println("Sum of elements: " + sum);
    }

    public static int Sum(int[] arr) {
        return Sum(arr, 0);
    }

    private static int Sum(int[] arr, int i) {
        if (i >= arr.length) {
            return 0; 
        }
        return arr[i] + Sum(arr, i + 1); 
    }
}

        