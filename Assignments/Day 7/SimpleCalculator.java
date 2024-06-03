public class SimpleCalculator {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Usage: java SimpleCalculator [add|subtract|multiply|divide] number1 number2");
            return;
        }

        // Parsing command-line arguments
        String operation = args[0];
        double number1 = Double.parseDouble(args[1]);
        double number2 = Double.parseDouble(args[2]);

        // Performing the operation
        switch (operation.toLowerCase()) {
            case "add":
                System.out.printf("Result: %.2f\n", (number1 + number2));
                break;
            case "subtract":
                System.out.printf("Result: %.2f\n", (number1 - number2));
                break;
            case "multiply":
                System.out.printf("Result: %.2f\n", (number1 * number2));
                break;
            case "divide":
                if (number2 == 0) {
                    System.out.println("Error: Division by zero");
                } else {
                    System.out.printf("Result: %.2f\n", (number1 / number2));
                }
                break;
            default:
                System.out.println("Invalid operation. Please use add, subtract, multiply, or divide.");
        }
    }
}
