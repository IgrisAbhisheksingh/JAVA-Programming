import java.util.*;
public class RemoveDuplicate {




    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a array: ");
        int x=sc.nextInt();
        int [] arr=new int[x];
        for(int i =0 ; i<x; i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.print("Array after removing duplicates: ");


        if (x > 0) {
            System.out.print(arr[0] + " ");
        }


        for (int i = 1; i < x; i++) {
            if (arr[i] != arr[i - 1]) {
                System.out.print(arr[i] + " ");
            }
        }

    }
}
