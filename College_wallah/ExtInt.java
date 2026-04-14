import java.util.*;
public class ExtInt {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();

        int [][] arr =new int[x][y];
        int [][] sec =new int[x][y];


        for(int i=0 ; i<x; i++)
        {
            for(int j=0;j<y;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }

        for(int i=0 ; i<x; i++)
        {
            for(int j=0;j<y;j++)
            {
               System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }

        for(int i=0 ; i<x; i++)
        {
            for(int j=0;j<y;j++)
            {
                sec[i][j]=sc.nextInt();
            }
        }
        for(int i=0 ; i<x; i++)
        {
            for(int j=0;j<y;j++)
            {
                System.out.print(sec[i][j] +" ");
            }
            System.out.println();
        }

        System.out.print("Enter Numer to add");
        int ind1=sc.nextInt();
        int ind2=sc.nextInt();


        System.out.print(arr[ind1][ind2]+sec[ind1][ind2]);

    }
}
