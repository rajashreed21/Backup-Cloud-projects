package assignments;
import java.util.Arrays;

public class slicedarray {
    public static void main(String[] args) {
        int[] arr = {30,5,16,20,9,66,54,8};
        int start = 3;
        int end = 6;
        int[] sliced =sliced(arr, start, end);
        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("Sliced Array: " + Arrays.toString(sliced));
    }

    public static int[] sliced(int[] arr, int start, int end) {

        int[] sliced = new int[end - start + 1];
        for (int i = start; i <= end; i++) {
            sliced[i - start] = arr[i];
        }
        return sliced;
    }
}

        