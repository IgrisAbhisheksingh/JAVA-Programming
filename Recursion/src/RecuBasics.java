import java.util.*;
public class RecuBasics {
    public static void prob(int x)
    {
        if(x==0 )
            return;
       prob(x-1);
       System.out.println(x);
    }
    public static void main (String [] args )
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int x=sc.nextInt();
      prob(x);
    }

}
