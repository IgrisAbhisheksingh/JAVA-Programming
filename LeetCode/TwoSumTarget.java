import java.util.*;

public class TwoSumTarget {

    public static void TwoSum(int []arr, int target) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] + arr[i] == target) {
                System.out.println("Target Found at indices: " + (i - 1) + " and " + i);

            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of arrays: ");
        int x = sc.nextInt();

        System.out.print("Enter the Target: ");
        int target = sc.nextInt();

        int[] arr = new int[x];

        for (int i = 0; i < x; i++) {
            arr[i] = sc.nextInt();
        }

        TwoSum(arr, target);
        sc.close();
    }
}
