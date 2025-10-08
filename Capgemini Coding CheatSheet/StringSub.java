import java.util.*;

public class StringSub {
    public static void Sub(String s) {
        int count = 0;
        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                if (count > max) {
                    max = count;
                }
                count = 0;
            } else {
                count++;
            }
        }

         
        if (count > max) {
            max = count;
        }

        System.out.print("Longest word length = " + max);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Sub(s);
    }
}
