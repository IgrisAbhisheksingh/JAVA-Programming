import java.util.*;
import java.util.Scanner;

public class FrequencyCount {
    public static void Count( int x, int []arr)
    {
        for(int i =0 ; i< x-1; i ++)
        {
            int count=1;
            for(int j =i+1 ; j< x ; j++)
            {
                if(arr[i]==arr[j])
                {
                    count+=1;
                }

            }

            System.out.println(arr[i] + " occurs " + count + " time(s)");
        }
    }



    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a array: ");
        int x = sc.nextInt();
        int[] arr = new int[x];
        for (int i = 0; i < x; i++) {
            arr[i] = sc.nextInt();
        }

        Count(x,arr);
    }
}
