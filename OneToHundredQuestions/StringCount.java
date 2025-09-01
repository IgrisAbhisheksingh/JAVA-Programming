import java.util.*;

public class StringCount {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int count = 1;
        String result = "";

        for (int i = 1; i <= str.length(); i++) {  // start from 1
            if (i < str.length() && str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                result = result + str.charAt(i - 1) + count;
                count = 1;
            }
        }

        System.out.println("Compressed String: " + result);
    }
}
