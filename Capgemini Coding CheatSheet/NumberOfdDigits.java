import java.util.Scanner;

public class NumberOfdDigits {

    public static int Sum(int x)
    {
        int rem;
        int count=0;
        while(x!=0)
        {
            rem=x/10;
            x=rem;
            count++;

        }
        return count;
    }


    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int x=sc.nextInt();
        int result= Sum(x);
        System.out.print(result);

    }
}
