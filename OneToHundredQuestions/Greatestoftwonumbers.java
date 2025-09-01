import java.util.*;
public class Greatestoftwonumbers {
    public static void Greatest(int a,int b, int c)
    {
        if(a>b && a>c)
        {
            System.out.print(a);
        }
         else if(b>c)
        {
            System.out.println(b);
        }
         else
        {
            System.out.print(c);
        }
    }



    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in );
        System.out.println("Enter three numbers :");
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        Greatest(x,y,z);

    }
}
