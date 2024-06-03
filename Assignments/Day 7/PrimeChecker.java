import java.util.Scanner;
public class PrimeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
            // Prompt the user to enter an integer
            System.out.print("Enter a number to check if it is prime: ");
            int number = scanner.nextInt();
    
            if (number < 2) {
                System.out.println(number + " is not a prime number.");
            } else {
                boolean isPrime = true;
    
                // Check for factors from 2 to sqrt(number)
                for (int i = 2; i <= Math.sqrt(number); i++) {
                    if (number % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
    
                if (isPrime) {
                    System.out.println(number + " is a prime number.");
                } else {
                    System.out.println(number + " is not a prime number.");
                }
            }
    
            scanner.close();
        }
    }

    
            