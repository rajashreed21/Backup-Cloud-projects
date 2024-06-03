package maps;
import java.util.*;

public class phonebook {
    public static void main(String[] args) {
        Map<Integer, String> phoneBook = new HashMap<>();
        phoneBook.put(1, "123-456-7890");
        phoneBook.put(2, "987-654-3210");
        phoneBook.put(3, "555-555-5555");

        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (choice != 5) {
            System.out.println("\nPhone Number Program");
            System.out.println("1. Add a phone number");
            System.out.println("2. Remove a phone number");
            System.out.println("3. View all phone numbers");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the phone number to add: ");
                    String phoneNumber = scanner.next();
                    System.out.print("Enter the contact ID: ");
                    int id = scanner.nextInt();
                    phoneBook.put(id, phoneNumber);
                    System.out.println("Phone number added successfully!");
                    break;
                case 2:
                    System.out.print("Enter the contact ID to remove: ");
                    id = scanner.nextInt();
                    if (phoneBook.containsKey(id)) {
                        phoneBook.remove(id);
                        System.out.println("Phone number removed successfully!");
                    } else {
                        System.out.println("Contact ID not found!");
                    }
                    break;
                case 3:
                    System.out.println("Phone Book:");
                    for (Map.Entry<Integer, String> entry : phoneBook.entrySet()) {
                        System.out.println(entry.getKey() + ": " + entry.getValue());
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}

    
    
    