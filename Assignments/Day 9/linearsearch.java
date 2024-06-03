package assignments;
import java.util.Arrays;

public class linearsearch {
    public static void main(String[] args) {
        int[] arr = {21,8,5,66,9,0,44};
        int element = 66;
        System.out.println("Arr: " + Arrays.toString(arr));
        int i = LinearSearch(arr, element);
        if (i != -1) {
            System.out.println("Element " + element + " found at index " + i);
        } else {
            System.out.println("Element " + element + " not found in the array");
        }
    }

  
    public static int LinearSearch(int[] arr, int element) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                return i; 
            }
        }
        return -1;
    }
}
           