import java.util.*;
public class OddEvenBit {
    public static void EvenOdd(int x , int bitMask)
    {
        if((x&bitMask)==0)
        {
            System.out.print("even Number ");

        }
        else
        {
            System.out.print("Odd Number");
        }
    }



    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int bitMask=1;
        System.out.print("Enter A Number :");
        int x=sc.nextInt();
        EvenOdd(x,bitMask);
    }
}
