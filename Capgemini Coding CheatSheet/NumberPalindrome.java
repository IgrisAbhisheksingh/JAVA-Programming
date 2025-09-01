import java.util.*;
public class NumberPalindrome {
    public static void NumPali(int num)
    {
        int rev=0;
        int num2=num;
        while(num>0)
        {
            rev=rev *10 +num%10;
            num=num/10;
        }
        if (num2==rev)
        {
            System.out.print("the given number " + num2 + " is Palindrome");
        }
        else
        {
            System.out.print("the given number" + num2 +" is not palindrome");
        }

    }



    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in );
        System.out.print("Enter a number  :");
        int num=sc.nextInt();
        NumPali(num);
    }
}
