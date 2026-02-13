import java.util.*;

public class SevenCount {

    public static void main(String[] args) {

        int[][] arr = {{4, 7, 8}, {8, 8, 7}};
        int target = 7;
        int row = arr.length, count = 0;
        int column = arr[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (arr[i][j] == target) {
                    count++;

                }
            }

        }
        System.out.print(count);
    }
}
