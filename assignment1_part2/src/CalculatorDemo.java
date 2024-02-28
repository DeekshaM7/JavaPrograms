import java.util.Scanner;

class CalculatorDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        while (true) {
            System.out.println("Calculator Menu:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Power");
            System.out.println("6. Square Root");
            System.out.println("7. Mean");
            System.out.println("8. Variance");
            System.out.println("9. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            if (choice == 9) {
                System.out.println("Exiting the calculator.");
                break;
            }

            double result;

            switch (choice) {
                case 1:
                    System.out.print("Enter first number: ");
                    double addA = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    double addB = scanner.nextDouble();
                    result = Calculator.add(addA, addB);
                    break;

                case 2:
                    System.out.print("Enter first number: ");
                    double subA = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    double subB = scanner.nextDouble();
                    result = Calculator.subtract(subA, subB);
                    break;

                case 3:
                    System.out.print("Enter first number: ");
                    double mulA = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    double mulB = scanner.nextDouble();
                    result = Calculator.multiply(mulA, mulB);
                    break;

                case 4:
                    System.out.print("Enter numerator: ");
                    double divA = scanner.nextDouble();
                    System.out.print("Enter denominator: ");
                    double divB = scanner.nextDouble();
                    result = Calculator.divide(divA, divB);
                    break;

                case 5:
                    System.out.print("Enter base: ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter exponent: ");
                    double exponent = scanner.nextDouble();
                    result = Calculator.power(base, exponent);
                    break;

                case 6:
                    System.out.print("Enter number: ");
                    double sqrtNum = scanner.nextDouble();
                    result = Calculator.sqrt(sqrtNum);
                    break;

                case 7:
                    System.out.print("Enter the count of numbers: ");
                    int count = scanner.nextInt();
                    double[] meanNumbers = new double[count];
                    System.out.println("Enter numbers:");
                    for (int i = 0; i < count; i++) {
                        meanNumbers[i] = scanner.nextDouble();
                    }
                    result = Calculator.mean(meanNumbers);
                    break;

                case 8:
                    System.out.print("Enter the count of numbers: ");
                    int varCount = scanner.nextInt();
                    double[] varNumbers = new double[varCount];
                    System.out.println("Enter numbers:");
                    for (int i = 0; i < varCount; i++) {
                        varNumbers[i] = scanner.nextDouble();
                    }
                    result = Calculator.variance(varNumbers);
                    break;

                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
                    continue;
            }

            System.out.println("Result: " + result);
        }

        scanner.close();
    }
}