import java.util.*;
public class NeonNumber {
    public static void Neon(int x )
    {

        int count=0;
        int mul=x*x;
        int rem;
        while (mul!=0)
        {
            rem=mul%10;
            count+=rem;
            mul=mul/10;
        }
        if (x==count)
        {
          System.out.print("the Number is neon");
        }
        else
        {
            System.out.print("the Number is not neon");
        }

    }


    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number");
        int x= sc.nextInt();
        Neon(x);
    }

}
