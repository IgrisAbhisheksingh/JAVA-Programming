import java.util.Scanner;

public class Table {


    public static void printTable(int N) {
        System.out.println("Multiplication Table of " + N + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(N + " x " + i + " = " + (N * i));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Calling the function
        printTable(number);

        scanner.close();
    }
}
