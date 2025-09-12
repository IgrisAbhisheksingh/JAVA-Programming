import java.util.*;

public class SmallestArray {

    public static int Minimum(int [] arr ,int min,int x)
    {
        for(int i = 1 ; i <x ; i++ )
        {
            if (arr[i]<min)
            {
                min=arr[i];
            }
        }
        return min;

    }

    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter A number: ");
        int x=sc.nextInt();
        int [] arr=new int[x];
        System.out.print("enter Arrays: ");
        for(int i =0 ; i< x ; i++)
        {
            arr[i]=sc.nextInt();
        }
        int min=arr[0];
        int result=Minimum(arr,min,x);
        System.out.print("The Minimum array is " + result);
    }
}
