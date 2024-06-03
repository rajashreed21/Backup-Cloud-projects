package assignments;
import java.util.Arrays;

public class sorting {
    public static void main(String[] args) {
        int[] array = InitializeArray(6);
        System.out.println("Original Array: " + Arrays.toString(array));
        BruteForceSort(array);
        System.out.println("Sorted Array: " + Arrays.toString(array));
    }

    public static int[] InitializeArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * 36);
        }
        return arr;
    }

    public static void BruteForceSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    // Swap elements
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}


        