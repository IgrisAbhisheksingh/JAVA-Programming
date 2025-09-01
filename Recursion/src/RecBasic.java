import java.util.*;
public class RecBasic {
    public static void printDec(int x)
    {
        if(x==0){
            return ;
        }
        System.out.println(x);
        printDec(x - 1);;
    }

    public static void main (String []args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number :");
        int x=sc.nextInt();
        printDec(x);

    }

}
