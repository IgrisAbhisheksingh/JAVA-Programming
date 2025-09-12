import java.util.Scanner;

public class MissingNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input n (the total numbers supposed to be from 1 to n)
        System.out.print("Enter n (total numbers from 1 to n): ");
        int n = sc.nextInt();

        int[] arr = new int[n - 1];
        System.out.println("Enter " + (n - 1) + " numbers (from 1 to " + n + ", one missing):");
        for (int i = 0; i < n - 1; i++) {
            arr[i] = sc.nextInt();
        }

        // XOR of all numbers from 1 to n
        int xorAll = 0;
        for (int i = 1; i <= n; i++) {
            xorAll ^= i;
        }

        // XOR of all entered array numbers
        int xorArr = 0;
        for (int num : arr) {
            xorArr ^= num;
        }

        // Missing number = xorAll ^ xorArr
        int missing = xorAll ^ xorArr;
        System.out.println("Missing number is: " + missing);

        sc.close();
    }
}
