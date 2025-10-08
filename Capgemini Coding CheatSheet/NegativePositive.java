import java.util.*;

public class NegativePositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int x = sc.nextInt();
        int[] arr = new int[x];

        int countNeg = 0, countPos = 0;


        for (int i = 0; i < x; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] < 0) {
                countNeg++;
            } else {
                countPos++;
            }
        }


        int[] pos = new int[countPos];
        int[] neg = new int[countNeg];

        int pi = 0, ni = 0; // index trackers

        for (int i = 0; i < x; i++) {
            if (arr[i] < 0) {
                neg[ni++] = arr[i];
            } else {
                pos[pi++] = arr[i];
            }
        }


        System.out.print("Negatives first then positives: [");
        for (int i = 0; i < neg.length; i++) {
            System.out.print(neg[i] + " ");
        }
        for (int i = 0; i < pos.length; i++) {
            System.out.print(pos[i] + " ");
        }
        System.out.print("]");
    }
}
