import java.util.Scanner;

public class NearestNeighbors {

    public static int findNearest(int[] numbers) {
        if (numbers == null || numbers.length < 2) {
            throw new IllegalArgumentException("Input array must contain at least two elements");
        }

        int minDistance = Integer.MAX_VALUE;
        int indexOfFirstNumber = 0;

        for (int i = 0; i < numbers.length - 1; i++) {
            int distance = Math.abs(numbers[i] - numbers[i + 1]);
            if (distance < minDistance) {
                minDistance = distance;
                indexOfFirstNumber = i;
            }
        }

        return indexOfFirstNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        int index = findNearest(numbers);
        System.out.println("Index of the first number with the smallest distance to its neighbor: " + index);

        scanner.close();
    }
}


