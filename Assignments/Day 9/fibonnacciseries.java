package assignments;

public class fibonnacciseries {
    public static void main(String[] args) {
        int n = 18;
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Recursive(i);
            }
            System.out.println("Fibonacci Series:");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            
            int nthFibonacci = Recursive(n - 1);
            System.out.println("The " + n + "th Fibonacci number is: " + nthFibonacci);

        }
        public static int Recursive(int n) {
            if (n <= 1) {
                return n;
            } else {
                return Recursive(n - 1) + Recursive(n - 2);
            }
        }
    }

        

            
        
    