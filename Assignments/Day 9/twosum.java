package assignments;
import java.util.HashMap;
import java.util.Map;

public class twosum {
    public static void main(String[] args) {
        int[] arr = {13, 21, 16, 7,50};
        int target = 28;
        int[] res = Sum(arr, target);
        if (res != null) {
            System.out.println("Index: " + res[0] + ", " + res[1]);
        } else {
            System.out.println("No element found.");
        }
    }

    public static int[] Sum(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int ele = target - arr[i];
            if (map.containsKey(ele)) {
                return new int[]{map.get(ele), i};
            }
            map.put(arr[i], i);
        }
        return null;
    }
}

        