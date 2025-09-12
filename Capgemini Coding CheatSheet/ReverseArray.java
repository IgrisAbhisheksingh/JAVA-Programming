import java.util.*;
public class ReverseArray {

    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter how many arrays do u want to create: ");
        int x=sc.nextInt();
        int [] arr=new int[x];
        for(int i =0 ; i<x; i++)
        {
            arr[i]=sc.nextInt();
        }
        int i=0 , j=x-1;
        while(i<j)
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        System.out.print("Array after Reversing ");
        for(i =0 ; i < x; i++)
        {
            System.out.print(" "+arr[i]);
        }
    }
}
