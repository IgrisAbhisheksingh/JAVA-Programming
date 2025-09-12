import java.util.*;
public class FreqCount {

    public static void repo(String s) {
        int count = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i - 1) == s.charAt(i)) {
                count++;
            } else {

                System.out.print(s.charAt(i - 1) + "" + count);
                count = 1;
            }
        }

        System.out.print(s.charAt(s.length() - 1) + "" + count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A String: ");
        String s = sc.nextLine();
        repo(s);
    }
}
