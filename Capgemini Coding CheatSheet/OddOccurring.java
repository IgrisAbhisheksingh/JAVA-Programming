import java.util.Scanner;

public class OddOccurring {

    public static void Occurring(int x, int[] arr) {
        boolean[] visited = new boolean[x];
        for (int i = 0; i < x; i++) {
            if (visited[i]) {
                continue;
            }

            int count = 1;
            for (int j = i + 1; j < x; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }

            if (count % 2 != 0) {
                System.out.println(arr[i] + " odd " + count + " time(s)");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a array size: ");
        int x = sc.nextInt();
        int[] arr = new int[x];
        System.out.println("Enter " + x + " elements:");
        for (int i = 0; i < x; i++) {
            arr[i] = sc.nextInt();
        }

        Occurring(x, arr);
    }
}
