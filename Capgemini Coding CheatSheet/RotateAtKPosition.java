import java.util.*;

public class RotateAtKPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No of Arrays: ");
        int x = sc.nextInt();
        int[] arr = new int[x];

        System.out.print("Enter arrays: ");
        for (int i = 0; i < x; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter k to rotate: ");
        int k = sc.nextInt();

        k = k % x; // in case k > size

        // Step 1: Reverse whole array
        reverse(arr, 0, x - 1);
        // Step 2: Reverse first k elements
        reverse(arr, 0, k - 1);
        // Step 3: Reverse remaining elements
        reverse(arr, k, x - 1);

        System.out.println("Array after rotating by " + k + " positions:");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
    }

    // helper reverse (no inbuilt)
    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
