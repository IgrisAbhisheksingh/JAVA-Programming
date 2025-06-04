import java.util.*;
public class Factorial {
    public static int factorial(int n)
    {
        int i,j=1;
        for(i=1 ; i<=n ; i++)
        {
            j*=i;
        }
        return j;
    }

    public static void main(String [] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int s=sc.nextInt();
        int fact=factorial(s);
         System.out.println("Factoriol is " + fact);
         sc.close();
    }
}
