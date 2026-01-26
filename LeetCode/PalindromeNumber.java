import java.util.*;

public class PalindromeNumber {

    public static void Number(int x) {
        int y = x;         
        int rev = 0;

        if (x < 0) {
            System.out.println("This number is not a palindrome");
            return;
        }

        while (y > 0) {
            int digit = y % 10;
            rev = rev * 10 + digit;
            y = y / 10;
        }

        if (rev == x) {
            System.out.println("This number is a palindrome");
        } else {
            System.out.println("This number is not a palindrome");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int x = sc.nextInt();
        Number(x);
    }
}
