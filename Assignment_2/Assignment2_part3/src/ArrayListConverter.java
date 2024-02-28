import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from the user: number of elements in the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Take input from the user: elements of the array
        int[] array = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Convert array to ArrayList
        ArrayList<Integer> arrayList = convertArrayToArrayList(array);
        System.out.println("Array converted to ArrayList: " + arrayList);

        // Convert ArrayList to array
        int[] newArray = convertArrayListToArray(arrayList);
        System.out.println("ArrayList converted to array: " + Arrays.toString(newArray));
    }

    // Method to convert array to ArrayList
    public static ArrayList<Integer> convertArrayToArrayList(int[] array) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int value : array) {
            arrayList.add(value);
        }
        return arrayList;
    }

    // Method to convert ArrayList to array
    public static int[] convertArrayListToArray(ArrayList<Integer> arrayList) {
        int[] array = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            array[i] = arrayList.get(i);
        }
        return array;
    }
}
