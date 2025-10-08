import java.util.Scanner;

public class MaxMin {





    public static void main(String[] args)
    {

        Scanner input =new Scanner(System.in);
        System.out.print("Enter the Array Limit: ");
        int l =input.nextInt();


        int [] a =new int[l];


        int max, min;


        for(int i=0; i<l; i++)
        {
            System.out.printf("Element of a[%d]: ", i);
            a[i]=input.nextInt();
        }


        input.close();


        if (l == 0) {
            System.out.println("Array is empty. Cannot determine max/min.");
            return;
        }


        max=a[0];
        min=a[0];


        for(int i=1; i<l; i++)
        {

            if(max < a[i])
                max=a[i];


            if(min > a[i])
                min=a[i];
        }

        // 6. Output Results
        System.out.println("\n--- Results ---");
        System.out.println("Maximum Element of Array: " + max);
        System.out.println("Minimum Element of Array: " + min);
    }
}