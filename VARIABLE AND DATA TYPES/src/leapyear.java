import java.util.*;
public class leapyear {
    public static int year(double  numbers)
    {
        if ( (numbers % 4== 0 && numbers % 100 != 0) || numbers % 400== 0)
        {

            return 1;
        }
        return -1;
    }
    public static void main (String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter the year : " );
        double n=sc.nextDouble();
        double result= year(n);
        if(result==1)
        {
            System.out.println("Leap Year");
        }
        else
            System.out.println(" Not Leap Year");

    }
}