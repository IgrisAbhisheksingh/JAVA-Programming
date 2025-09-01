import java.util.*;

public class PerfectNumber {

    public static void Perfect(int x)
    {
        int f=0,i;

        for ( i =1 ;  i <= x/2  ; i++ )
        {
            if(x % 2==0  )
            {
                f+=i;
            }
        }
        if(x==f)
        {
            System.out.print(x +" is a Perfect Number ");
        }
        else
        {
            System.out.print(x +" is not a Perfect Number ");
        }
    }


    public static void main(String [] args )
    {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int x=sc.nextInt();
        Perfect(x);
    }

}
