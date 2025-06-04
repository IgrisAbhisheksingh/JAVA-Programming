import java.util.*;
public class POSITIVENEGATIVE {
    public static void main (String [] args )
    {
        Scanner sc= new Scanner(System.in);
        int x=sc.nextInt();
        if(x>0) {
            System.out.println("is a positive number " +  x);
        }
        else if(x<0){
            System.out.println(x + "is a negative number ");
        }
        else
        {
            System.out.println("the given number is zero ");
        }
    }
}
