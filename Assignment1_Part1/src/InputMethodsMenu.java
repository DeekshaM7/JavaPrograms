import java.io.BufferedReader;
import java.io.Console;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputMethodsMenu {
    public void getDataBufferedReader() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a number: ");
        String str = bf.readLine();
        int data = Integer.parseInt(str);
        Factorial factorial = new Factorial();
        System.out.println("Factorial is " + factorial.calculateFactorial(data));
    }

    public void getDataScanner() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int data = sc.nextInt();
        Factorial factorial = new Factorial();
        System.out.println("Factorial is " + factorial.calculateFactorial(data));
    }

    public void getDataDataInputStream() throws IOException {
        DataInputStream dis = new DataInputStream(System.in);
        System.out.print("Enter a number: ");
        int data = Integer.parseInt(dis.readLine());
        Factorial factorial = new Factorial();
        System.out.println("Factorial is " + factorial.calculateFactorial(data));
    }

    public void getDataConsole() {
        Console console = System.console();
        if (console == null) {
            System.out.println("No console available");
            return;
        }
        String str = console.readLine("Enter a number: ");
        int data = Integer.parseInt(str);
        Factorial factorial = new Factorial();
        System.out.println("Factorial is " + factorial.calculateFactorial(data));
    }

    public static void main(String[] args) throws IOException {
        Assignment1Part1 a = new Assignment1Part1();
        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. BufferedReader");
            System.out.println("2. Scanner");
            System.out.println("3. DataInputStream");
            System.out.println("4. Console");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    a.getDataBufferedReader();
                    break;
                case 2:
                    a.getDataScanner();
                    break;
                case 3:
                    a.getDataDataInputStream();
                    break;
                case 4:
                    a.getDataConsole();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);
    }
}