import java.util.*;
public class Leapyearornot {

    public static void Leap(int b)
    {
        if ((b % 4 == 0 &&  b % 100 != 0) || (b % 400 == 0)) {
            System.out.println( b + " is a Leap Year");
        } else {
            System.out.println( b + "  is not a leap year ");
        }
    }
    public static void main(String [] args ) {

        Scanner a=new Scanner(System.in);
        System.out.print("Enter year :");
        int x=a.nextInt();

        System.out.println("Enter year :");
        Leap(x);

    }

}
