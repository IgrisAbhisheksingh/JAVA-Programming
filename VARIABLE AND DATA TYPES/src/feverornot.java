import java.util.*;
public class feverornot {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        float fev=sc.nextFloat();
        if (fev>100)
        {
            System.out.println("you have fever");
        }
        else
            System.out.println("you dont have fever");
    }
}
