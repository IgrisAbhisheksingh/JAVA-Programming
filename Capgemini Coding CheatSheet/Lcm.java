import java.util.*;

public class Lcm {


    public static void main(String [] args)
    {
        System.out.print("Enter Two numbers :");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int m=Math.max(x,y);
        for(int i=m ; i<= x*y; i++)
        {
            if(i % x ==0 && i % y == 0 )
            {
                System.out.print("The Lcm of " + x + " and " +y + " is "+ i );
                break;
            }

        }
    }
}
