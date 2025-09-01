import java.util.*;

public class Factorial {
    public static int fact(int x)
    {

        if (x==1 || x==0)
        {
            return 1;
        }
      return x*fact(x-1);
    }



    public static void main(String [] args )
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a number ");
        int x=sc.nextInt();
       int result= fact(x);
       System.out.println(result);
    }
}
