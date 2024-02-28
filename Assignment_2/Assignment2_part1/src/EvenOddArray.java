//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class EvenOddArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];
        int[] even;
        int[] odd;
        int evenCount = 0;
        int oddCount = 0;

        //accepting numbers form the user
        for (int i = 0; i < size; i++) {
            System.out.print("Enter numbers "+ (i+1)+ ": ");
            numbers[i] = scanner.nextInt();
        }

        //count even and odd numbers
        for (int number : numbers) {
            if (number % 2 == 0) {
                evenCount++;
            }
            else {
                oddCount++;
            }
        }

        //intialize even and odd arrays with appropriate sizes
        even = new int[evenCount];
        odd = new int[oddCount];

        //move numbers to the respective arrays
        evenCount = 0;
        oddCount = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                even [evenCount++] = number;
            }
            else {
                odd[oddCount++] = number;
            }
        }

        //Display the even numbers
        System.out.print("Even numbers: ");
        for (int number : even) {
            System.out.print(number + " ");
        }
        System.out.println();

        //Display the odd numbers
        System.out.print("Odd numbers: ");
        for (int number : odd) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}