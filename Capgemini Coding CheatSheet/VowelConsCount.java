import java.util.*;

public class VowelConsCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String st = sc.nextLine();
        String lo = st.toLowerCase();

        int vowel = 0, cons = 0;

        for (int i = 0; i < lo.length(); i++) {
            char ch = lo.charAt(i);

            // count only letters
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowel++;
                } else {
                    cons++;
                }
            }
        }

        System.out.println("Vowels: " + vowel + "  Consonants: " + cons);
    }
}