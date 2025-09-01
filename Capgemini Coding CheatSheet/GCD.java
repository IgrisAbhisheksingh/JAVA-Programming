import java.util.*;
public class GCD {
    public static void GcdHcf(int x,int y)
    {
        int great=Math.max(x,y);
        int c=0;
        int small=Math.min(x,y);
        while(small!=0)
        {
           c=small;
           small=great%small;
           great=c;
        }
        System.out.print("the Gcd is " +c);
    }



    public static void main(String [] args )

    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Two Numbers :");
        int x=sc.nextInt();
        int y=sc.nextInt();
        GcdHcf(x,y);

    }
}
