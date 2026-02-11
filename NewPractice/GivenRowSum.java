import java.util.*;

public class GivenRowSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        System.out.print("Enter the number of Rows and columns: ");
        int row = sc.nextInt();
        int column = sc.nextInt();

        int[][] arr = new int[row][column];

        System.out.println("Enter Rows and Columns elements:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter the row that you want to sum (0-based index): ");
        int t = sc.nextInt();

        // Safety check
        if (t < 0 || t >= row) {
            System.out.println("Invalid row index!");
            return;
        }

        for (int j = 0; j < column; j++) {
            sum += arr[t][j];
        }

        System.out.println("Sum of row " + t + " = " + sum);

        sc.close();
    }
}
