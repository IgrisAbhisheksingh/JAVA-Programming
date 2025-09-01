import java.util.*;
public class Fibonacci {
    public static void sys(int x )
    {
        int a=0,b=1,c=0;
        if (x == 1) {
            System.out.println("Fibonacci term " + x + " is: " + a);
            return;
        } else if (x == 2) {
            System.out.println("Fibonacci term " + x + " is: " + b);
            return;
        }

        for (int i = 3; i <= x; i++) {
            c = a + b;
            a = b;
            b = c;
        }

        System.out.println("Fibonacci term " + x + " is: " + c);
    }

    public static void main(String [] args )
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int a=0,b=1,c=0;
        sys(x);
    }

}
