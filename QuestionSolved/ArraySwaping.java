import java.util.*;

public class ArraySwaping {

    public static void Reverse(int[] arr) {
        int p = arr.length - 1;
        int i = 0;

        while (i < p) {
            int temp = arr[i];
            arr[i] = arr[p];
            arr[p] = temp;

            i++;
            p--;
        }

        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of Array: ");
        int x = sc.nextInt();

        int[] arr = new int[x];

        System.out.println("Enter Array elements:");
        for (int i = 0; i < x; i++) {
            arr[i] = sc.nextInt();
        }

        Reverse(arr);
    }
}