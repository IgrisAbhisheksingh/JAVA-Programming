import java.util.*;
public class SumofFirstNNaturalNumbers {
    public static void natural(int y,int add){
        for (int i = 1; i <= y; i++)
            add += i;
        System.out.println (add);
    }
    public static void main (String[]args)
    {
     Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int sum = 0;
        natural(n,sum);

    }

}
