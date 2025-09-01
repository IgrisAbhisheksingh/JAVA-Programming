
import java.util.*;
public class Reverse {

    public static int reverseDigits(int num)
    {
        int rev_num = 0;
        while (num > 0) {
            rev_num = rev_num * 10 + num % 10;
            num = num / 10;
        }
        return rev_num;
    }

    public static void main(String [] args )
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number To reverse :");
        int num=sc.nextInt();
       int result= reverseDigits(num);
       System.out.print("the reverse of the number "+result);
    }

}
