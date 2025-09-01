import java.util.*;
public class EvenorOddNumber {
    public static void even (int o){
        if(o%2==0)
        {
            System.out.print("The given Number" + o + " is a Even Number ");
        }
        else
        {
            System.out.print("The given Number" + o + " is a Odd Number ");
        }

    }
    public static void main(String [] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter A Number :");
        int x=sc.nextInt();
        even(x);
    }
}
