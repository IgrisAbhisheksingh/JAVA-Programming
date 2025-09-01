import java.util.*;

public class Prime {
    public static void fun(int x) {
        if (x == 0 || x == 1) {
            System.out.println("Number is not prime");
            return;
        }

        boolean isPrime = true;

        for (int i = 2; i <= x / 2; i++) {
            if (x % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(x + " is prime");
        } else {
            System.out.println(x + " is not prime");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = sc.nextInt();
        fun(x);
    }
}
