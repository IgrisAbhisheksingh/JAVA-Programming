import java.util.*;

public class Armstrong {

    public static void checkArmstrong(int num) {
        int original = num;
        int result = 0, remainder;

        while (num != 0) {
            remainder = num % 10;
            result += remainder * remainder * remainder;
            num /= 10;
        }

        if (result == original)
            System.out.println(original + " is an Armstrong number.");
        else
            System.out.println(original + " is not an Armstrong number.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();
        checkArmstrong(num);
        sc.close();
    }
}
