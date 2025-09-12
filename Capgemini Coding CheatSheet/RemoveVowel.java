import java.util.*;

public class RemoveVowel {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        String lo = str.toLowerCase();
        String result = "";

        for (int i = 0; i < lo.length(); i++) {
            char ch = lo.charAt(i);

            if (ch >= 'a' && ch <= 'z') { // if it's a letter
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    continue;
                }
            }

            result = result + ch;
        }

        System.out.print(result);
    }
}
