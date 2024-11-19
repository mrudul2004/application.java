public class Calculator {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Usage: java Calculator <num1> <operation> <num2>");
            System.exit(1);
        }

        try {
            double num1 = Double.parseDouble(args[0]);
            char operation = args[1].charAt(0);
            double num2 = Double.parseDouble(args[2]);

            double result;
            switch (operation) {
                case '+':
                    result = num1 + num2;
                    System.out.println("Result: " + result);
                    break;
                case '-':
                    result = num1 - num2;
                    System.out.println("Result: " + result);
                    break;
                case '*':
                    result = num1 * num2;
                    System.out.println("Result: " + result);
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("Result: " + result);
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;
                default:
                    System.out.println("Invalid operation. Use +, -, *, or /.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format.");
        }
    }
}
