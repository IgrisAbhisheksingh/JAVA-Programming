 import java.util.*;
 
 class InputProduct
 {
    public static void main (String [] args)
    {
        Scanner pro=new Scanner(System.in);
        System.out.print("Enter A value :");
        int a=pro.nextInt();
        System.out.print("Enter B value :");
        int b=pro.nextInt();
        int sum=a*b;
        System.out.println("the multiplication is "+ sum);
        pro.close();

    }
 }
