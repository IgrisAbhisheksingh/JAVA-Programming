import java.util.*;
public class LargestArray {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter A number: ");
        int x=sc.nextInt();
        int [] arr=new int[x];
        System.out.print("Enter array ");
        for(int i =0 ; i< x ; i++)
        {
            arr[i]=sc.nextInt();
        }
        int max=arr[0];

        for(int i=1 ; i< x ; i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.print("The Largest Array is " + max);

    }
}
