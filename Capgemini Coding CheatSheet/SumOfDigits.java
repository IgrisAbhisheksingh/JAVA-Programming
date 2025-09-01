import java.util.*;
public class SumOfDigits {


    public static int Sum(int x) {
        int sum = 0;
        while (x != 0) {
            int rem = x % 10;   // get last digit
            sum += rem;         // add to sum
            x /= 10;            // remove last digit
        }
        return sum;
    }
    public static void main(String [] args )
    {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter  a Number : ");
                int x=sc.nextInt();
        int result=Sum(x);
        System.out.print(result);

    }


}
