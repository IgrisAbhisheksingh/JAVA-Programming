import java.util.Scanner;

public class SecondLargest {
    public static int SecondLarge(int x, int[] arr,int max,int som)
    {
        for(int i = 1; i < x; i++) {
            if(arr[i]>max)
            {
                som=max;
                max=arr[i];
            }

               else if (arr[i] > som && arr[i] < max) {
                som = arr[i];
            }
        }
        return som;

    }

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter A number: ");
        int x = sc.nextInt();
        int[] arr = new int[x];
        System.out.print("enter Arrays: ");
        for (int i = 0; i < x; i++) {
            arr[i] = sc.nextInt();
        }
            int max=arr[0];
            int som=0;
            int result=SecondLarge(x,arr,max,som);
        System.out.print("The second largest element is " + result);
        }


}
