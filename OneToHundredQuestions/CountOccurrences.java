import java.util.*;

public class CountOccurrences {


    public static void main (String [] args )
    {
        Scanner sc=new Scanner(System.in);


        System.out.println("Enter no of arrays u need :");
        int n=sc.nextInt();
        int [] arr=new int[n];
        for (int i = 0 ; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
        for (int i = 0 ; i<n; i++)
        {
            System.out.println(arr[i]);
        }

        for (int i = 0 ; i < n-1 ; i++)
        {
            int count=1;
            for (int j = i+1 ; i < n ; i++)
            {
                if(arr[i]==arr[j])
                {
                    count+=1;
                }
                System.out.println(arr[i] + "comes " + count);
            }
        }


    }
}
