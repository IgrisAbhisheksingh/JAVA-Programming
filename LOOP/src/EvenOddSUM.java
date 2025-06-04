import java.util.*;
public class EvenOddSUM {
    public static void result(int n, Scanner sc)
    {
    int Even=0, Odd=0;
    System.out.println("Enter " +n + " integers : " );
    for (int i=0 ; i<n ; i++ )
    {
        int num=sc.nextInt();
        if(num%2==0)
        {
            Even+=num;
        }
        else
        {
            Odd+=num;
        }
    }
        System.out.println("Sum of even numbers: " + Even);
        System.out.println("Sum of odd numbers: " + Odd);
    }
    public static void main (String [] args )
    {

        System.out.println("Enter numbers : ");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        result(x,sc);
        sc.close();
    }
}
