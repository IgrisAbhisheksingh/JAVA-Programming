import java.util.*;
public class PositiveorNegativenumber {
    public static  void  ajay(int j)
    {
        if(j<0)
        {
            System.out.print("The Given Number" + j +  "  is Negative");

        }
        else
        {
            System.out.println("Number "+ j +  "  is Positive ");
        }
    }


    public static void main(String [] args )
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter A Number :");
        int x=sc.nextInt();
          ajay(x);
    }

}
